package basic;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet("/abc")
public class JstlServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Member> list = new ArrayList<>();
        list.add(new Member(4, "채치수", "센터"));
        list.add(new Member(14, "정대만", "슈팅가드"));
        list.add(new Member(7, "송태섭", "포인터가드"));
        list.add(new Member(10, "강백호", "파워포워드"));
        list.add(new Member(11, "서태웅", "스몰포워드"));


        request.setAttribute("list", list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/jstl/view.jsp");
        dispatcher.forward(request,response);



    }
}
