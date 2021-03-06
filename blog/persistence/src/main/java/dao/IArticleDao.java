package dao;

import model.Article;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Raluca
 * Date: 11.09.2015
 * Time: 14:35
 * To change this template use File | Settings | File Templates.
 */
public interface IArticleDao {

    List<Article> getAll();
    Article get(Long id);
    void saveArticle(Article  myArticle);
    void updateArticle(Article  myArticle);
    void deleteArticle(Long id);


}
