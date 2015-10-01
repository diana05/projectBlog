package dao;

import model.Article;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
        this.entityManager = entityManager;
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
    public void saveArticle(Article myArticle) {
        entityManager.persist(myArticle);

    }

    @Transactional
    public void updateArticle(Article myArticle) {
        Article itemFromDbs = this.get(myArticle.getId());
        if (itemFromDbs != null) {

            itemFromDbs.setTitle(myArticle.getTitle());
            itemFromDbs.setDescription(myArticle.getDescription());
            itemFromDbs.setContent(myArticle.getContent());
            this.entityManager.persist(itemFromDbs);
        }

    }
    @Transactional
    public void deleteArticle(Long id) {
       Article articleFromDbs = this.get(id);
        if (articleFromDbs != null) {
            entityManager.remove(articleFromDbs);
        }
    }
}
