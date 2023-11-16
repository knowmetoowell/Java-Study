package article.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mvc.fx.AbstractController;
import mvc.fx.ModelAndView;

public class ArticleInsert extends AbstractController {
    @Override
    public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("/WEB-INF/article/insert.jsp");
    }
}
