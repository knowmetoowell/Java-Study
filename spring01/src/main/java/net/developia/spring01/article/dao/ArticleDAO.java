package net.developia.spring01.article.dao;


import lombok.extern.java.Log;
import net.developia.spring01.article.dto.ArticleDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Log
public class ArticleDAO {
    private static ArticleDAO dao = new ArticleDAO();

    private ArticleDAO() {
        try {
//            Class.forName("oracle.jdbc.OracleDriver");
            Class.forName("net.sf.log4jdbc.DriverSpy");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static ArticleDAO getInstance() {
        return dao;
    }

    public void insertArticle(ArticleDTO articleDTO) throws SQLException {

        String sql ="insert into article(no, title, name, content, password) values (seq_article.nextval,?,?,?,?)";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, articleDTO.getTitle());
            pstmt.setString(2, articleDTO.getName());
            pstmt.setString(3,articleDTO.getContent());
            pstmt.setString(4, articleDTO. getPassword());
            pstmt.executeQuery();
            log.info("쿼리실행 됨");
        } catch (Exception e) {
            log.info(e.getMessage());
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                "jdbc:log4jdbc:oracle:thin:@localhost:1521/xepdb1", "ace", "ace");
    }

    public List<ArticleDTO> getArticleList() {

        String sql = "select no,title,name,regdate,readcount from article order by no desc";

        List<ArticleDTO> list = new ArrayList<>();
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                ArticleDTO dto = new ArticleDTO();
                dto.setNo(rs.getLong("no"));
                dto.setTitle(rs.getString("title"));
                dto.setName(rs.getString("name"));
                dto.setRegdate(rs.getDate("regdate"));
                dto.setReadcount(rs.getInt("readcount"));

                list.add(dto);
            }
            return list;
        } catch (Exception e) {
            log.info(e.getMessage());
        }
        return list;
    }
    public ArticleDTO getDetail(Long no) throws SQLException {

        String sql = "select no,title,name,regdate,content,readcount from article where no = ? order by no desc";
        ArticleDTO dto = null;

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ) {
            pstmt.setLong(1, no);
            try(ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    dto = new ArticleDTO();
                    dto.setNo(rs.getLong("no"));
                    dto.setTitle(rs.getString("title"));
                    dto.setName(rs.getString("name"));
                    dto.setRegdate(rs.getDate("regdate"));
                    dto.setContent(rs.getString("content"));
                    dto.setReadcount(rs.getInt("readcount"));
                }

            }
            return dto;
        } catch (Exception e) {
            log.info(e.getMessage());
            throw e;
        }

    }
}
