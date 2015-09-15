package dao;

import model.Article;

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
    void save(Article article);
    void update(Article article);
    void remove(Long id);
}
