package dao;

import model.Article;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Raluca
 * Date: 11.09.2015
 * Time: 14:05
 * To change this template use File | Settings | File Templates.
 */
public class ArticleDao implements IArticleDao{
    private EntityManager entityManager;
    @PersistenceContext
    private void setEntityManager(EntityManager entityManager){
        this.entityManager= entityManager;
    }
    public List<Article> getAll(){
         return this.entityManager.createQuery("from Article").getResultList();
    }

    public Article get(Long id) {
        if (id == null) {
            return null;
        } else {
            return entityManager.find(Article.class, id);
        }
    }
    @Transactional
    public void save(Article item) {
        entityManager.persist(item);
    }

    @Transactional
    public void update(Article article) {
        Article articleFromDbs = this.get(article.getId());
        if (articleFromDbs != null) {
            articleFromDbs.setTitle(article.getTitle());
            articleFromDbs.setDescription(article.getDescription());
            articleFromDbs.setContent(article.getContent());
            entityManager.persist(articleFromDbs);
        }
    }
    @Transactional
    public void remove(Long id) {
       Article articleFromDbs = this.get(id);
        if (articleFromDbs != null) {
            entityManager.remove(articleFromDbs);
        }
    }

}
