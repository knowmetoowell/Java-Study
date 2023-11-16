package pilot.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mvc.fx.AbstractController;
import mvc.fx.ModelAndView;

public class ProcessController extends AbstractController {
    @Override
    public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String iam = "그래, 난 " + name + ".";
        return new ModelAndView("/WEB-INF/pilot/process.jsp", "iam", iam);

    }
}
