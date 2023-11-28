package net.developia.spring01.article.controller;


import lombok.extern.java.Log;
import net.developia.spring01.article.dto.ArticleDTO;
import net.developia.spring01.article.service.ArticleService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@Log
public class ArticleList extends AbstractController {
    @Override
    public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
        ArticleService service = ArticleService.getInstance();


        try {
            List<ArticleDTO> list = service.getArticleList();
            return new ModelAndView("/WEB-INF/views/article/list.jsp", "list", list);
        } catch (Exception e) {
            ModelAndView mav = new ModelAndView("/WEB-INF/views/article/result.jsp");
            mav.addObject("msg", "게시물 리스트 출력 실패.");
            mav.addObject("url", "../");
            return mav;
        }
    }
}
