package net.developia.spring01.article.controller;


import lombok.extern.java.Log;
import net.developia.spring01.article.dto.ArticleDTO;
import net.developia.spring01.article.service.ArticleService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
//        log.info("articleDTO = " + articleDTO);

        try {
            service.insertArticle(articleDTO);//성공 시 게시물 리스트로
            return new ModelAndView("redirect:list");
        } catch (Exception e) {
            ModelAndView mav = new ModelAndView("/WEB-INF/views/article/result.jsp");
            mav.addObject("msg", "게시물 입력 실패\\n입력 폼으로 되돌아갑니다.");
            mav.addObject("url", "javascript:history.back();");
            return mav;
        }
    }
}

