package article.service;

import article.dao.ArticleDAO;
import article.dto.ArticleDTO;
import lombok.extern.java.Log;

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
}
