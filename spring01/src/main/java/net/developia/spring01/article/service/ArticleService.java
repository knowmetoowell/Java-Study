package net.developia.spring01.article.service;


import lombok.extern.java.Log;
import net.developia.spring01.article.dao.ArticleDAO;
import net.developia.spring01.article.dto.ArticleDTO;

import java.sql.SQLException;
import java.util.List;

@Log
public class ArticleService {
    private static ArticleService service = new ArticleService();
    private ArticleDAO dao = ArticleDAO.getInstance();
    private ArticleService() {

    }
    public static ArticleService getInstance() {
        return service;
    }

    public void insertArticle(ArticleDTO articleDTO) throws SQLException {
        try {
            dao.insertArticle(articleDTO);
        } catch (SQLException e) {
            log.info("insertService insert"+e.getMessage());
        }

    }

    public List<ArticleDTO> getArticleList() {
        try {
            return dao.getArticleList();
        } catch (Exception e) {
            log.info(e.getMessage());
            throw e;
        }
    }

    public ArticleDTO getDetail(Long no) throws SQLException {
        try {
            ArticleDTO dto = dao.getDetail(no);
            if (dto == null){
                throw new RuntimeException(no + "번 게시물이 존재하지 않습니다.");
            }
            return dto;
        } catch (Exception e) {
            log.info(e.getMessage());
            throw e;
        }
    }
}
