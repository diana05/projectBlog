package facade;

import model.Article;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Raluca
 * Date: 11.09.2015
 * Time: 14:36
 * To change this template use File | Settings | File Templates.
 */
public interface IArticleFacade {
    List<Article> getAll();
    Article get(Long id) ;
    void saveMyArticle(Article myArticle);
    void updateMyArticle(Article myArticle);
    void deleteArticle(Long id);


}
