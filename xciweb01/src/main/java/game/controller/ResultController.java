package game.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mvc.fx.AbstractController;
import mvc.fx.ModelAndView;

import java.util.Random;

public class ResultController extends AbstractController {
    @Override
    public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
        String val = request.getParameter("you");
        String you = rsp(val);
        Random random = new Random();
        int ran = random.nextInt(3)+1;
        System.out.println("ran = " + ran);
        String com = rsp(String.valueOf(ran));
        String who = whowin(you, com);
        String[] youcomwho = {you, com, who};
        return new ModelAndView("/WEB-INF/game/result.jsp", "youcomwho", youcomwho);
    }

    private static String whowin(String you, String com) {
        String who = "";
        if (you.equals("가위")) {
            if ( com.equals("가위")){
                who = "비겼습니다.";
            } else if (com.equals("바위")) {
                who = "패배했습니당구";
            } else {
                who = "당신의 승리";
            }
        } else if (you.equals("바위")) {
            if ( com.equals("가위")){
                who = "당신의 승리";
            } else if (com.equals("바위")) {
                who = "비겼습니다.";
            } else {
                who = "패배임늬당";
            }
        } else if (you.equals("보")) {
            if ( com.equals("가위")){
                who = "패배했습니당구";
            } else if (com.equals("바위")) {
                who = "당신의 승리";
            } else {
                who = "비겼습니다.";
            }
        }
        return who;
    }

    public String rsp(String val) {
        if (val.equals("1")) {
            return "가위";
        } else if (val.equals("2")) {
            return "바위";
        } else {
            return "보";
        }
    }
}
