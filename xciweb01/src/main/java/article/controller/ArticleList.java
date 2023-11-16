package article.controller;

import article.dto.ArticleDTO;
import article.service.ArticleService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.java.Log;
import mvc.fx.AbstractController;
import mvc.fx.ModelAndView;

import java.util.List;


@Log
public class ArticleList extends AbstractController {
    @Override
    public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
        ArticleService service = ArticleService.getInstance();


        try {
            List<ArticleDTO> list = service.getArticleList();
            return new ModelAndView("/WEB-INF/article/list.jsp", "list", list);
        } catch (Exception e) {
            ModelAndView mav = new ModelAndView("/WEB-INF/article/result.jsp");
            mav.addObject("msg", "게시물 리스트 출력 실패.");
            mav.addObject("url", "../");
            return mav;
        }
    }
}
