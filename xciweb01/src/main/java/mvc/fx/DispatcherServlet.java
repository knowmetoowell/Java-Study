package mvc.fx;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pilot.controller.FormController;
import pilot.controller.ProcessController;

//import mvc.controllers.ArticleInsert;
//import mvc.controllers.ArticleInsertAction;

@WebServlet(
        urlPatterns = {
                "/pilot/*",
                "/game/*",
                "/article/*"
        },
        loadOnStartup = 10)
public class DispatcherServlet extends HttpServlet {

    private Map<String, AbstractController> controllerMap = new HashMap<>();
    @Override
    public void init() throws ServletException {
        System.out.println("DispatcherServlet.init");
        Properties prop = new Properties();

        try {
            prop.load(new FileInputStream("C:\\dev\\edu\\xciweb01\\src\\main\\java\\dispatcher-servlet.properties"));
            for(Object oKey : prop.keySet()) {
                String key = ((String)oKey).trim();
                Class<?> className = null;
                try {
                    className = Class.forName(prop.getProperty(key).trim());
                    controllerMap.put(key, (AbstractController) className.getConstructor().newInstance());
                    System.out.println("🧡 loaded : " + className + " 🧡");
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("💔 error : " + className + " 💔");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String requestURI = request.getRequestURI();
        String contextPath = request.getContextPath();
        String action = requestURI.substring(contextPath.length());
//        AbstractController controller = null;
//        ModelAndView mav = null;
//        if (action.equals("/pilot/form")) {
//            controller = new FormController();
//            mav = controller.handleRequestInternal(request, response);
//        } else if (action.equals("/pilot/process")){
//            controller = new ProcessController();
//            mav = controller.handleRequestInternal(request, response);
//        }  -> init에서 처리함

        try {
            AbstractController controller = controllerMap.get(action);
            if (controller==null) throw new RuntimeException("controller를 찾지 못함");
            ModelAndView mav = controller.handleRequestInternal(request, response);

            if (mav != null) {

                String viewName = mav.getViewName();
                if (viewName.startsWith("redirect:")) {
                    response.sendRedirect(viewName.substring(9));
                } else {
                    Map<String, Object> model = mav.getModel();
                    for (String key : model.keySet()) {
                        request.setAttribute(key, model.get(key));
                    }
                    RequestDispatcher dispatcher = request.getRequestDispatcher(viewName);
                    dispatcher.forward(request, response);
                }
            } else {
                throw new RuntimeException("mav가 null입니당");
            }
        } catch (Exception e) {
            System.out.println("RequestDispatcher에서 길을 잃었다네~");
            throw new RuntimeException(e);
        }
    }
}