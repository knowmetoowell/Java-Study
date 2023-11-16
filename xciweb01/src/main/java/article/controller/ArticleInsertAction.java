package article.controller;

import article.dto.ArticleDTO;
import article.service.ArticleService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import mvc.fx.AbstractController;
import mvc.fx.ModelAndView;


@Log
public class ArticleInsertAction extends AbstractController {
    @Override
    public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {

        ArticleService service = ArticleService.getInstance();

        String name = request.getParameter("name");
        String title = request.getParameter("title");
        String password = request.getParameter("password");
        String content = request.getParameter("content");

        ArticleDTO articleDTO = new ArticleDTO();
        articleDTO.setName(name);
        articleDTO.setTitle(title);
        articleDTO.setPassword(password);
        articleDTO.setContent(content);

//        System.out.println("articleDTO = " + articleDTO);
        log.info("articleDTO = " + articleDTO);

        try {
            service.insertArticle(articleDTO);//성공 시 게시물 리스트로
            return new ModelAndView("redirect:list");
        } catch (Exception e) {
            ModelAndView mav = new ModelAndView("/WEB-INF/article/result.jsp");
            mav.addObject("msg", "게시물 입력 실패\\n입력 폼으로 되돌아갑니다.");
            mav.addObject("url", "javascript:history.back();");
            return mav;
        }
    }
}
