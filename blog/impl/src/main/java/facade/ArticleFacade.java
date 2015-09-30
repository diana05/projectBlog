package facade;

import dao.IArticleDao;
import model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Diana
 * Date: 11.09.2015
 * Time: 14:21
 * To change this template use File | Settings | File Templates.
 */
public class ArticleFacade implements IArticleFacade {
    @Autowired
    private IArticleDao articleDao;

    public List<Article> getAll(){
     return this.articleDao.getAll();
    }

    public Article get(Long id){
        return  this.articleDao.get(id);
    }

    public void saveArticle(Article article) {
        this.articleDao.saveArticle(article);
    }

    public void update(Article article) {
        this.articleDao.update(article);
    }

    public void deleteArticle(Long id) {
        this.articleDao.deleteArticle(id);
    }



    public IArticleDao getArticleDao() {
        return articleDao;
    }

    public void setArticleDao(IArticleDao articleDao) {
        this.articleDao = articleDao;
    }
}
