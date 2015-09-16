package dao;

import model.Article;
import model.Comment;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 15.09.2015
 * Time: 17:44
 * To change this template use File | Settings | File Templates.
 */
public class CommentDao implements ICommentDao{
    private EntityManager entityManager;

    @PersistenceContext
    private void setEntityManager(EntityManager entityManager){
        this.entityManager= entityManager;
    }


    public List<Comment> getAllComment(Long articleId) {
            Query query =this.entityManager.createQuery("from Comment WHERE articleId=:articleId");
            query.setParameter("articleId",articleId);
            return query.getResultList();

        }



    public Comment getComment(Long articleId, Long commentId) {
        Query query=this.entityManager.createQuery("from Comment WHERE articleId=:articleId AND id=:commentId");
        query.setParameter("articleId",articleId);
        query.setParameter("commentId",commentId) ;
        return (Comment) query.getSingleResult();

    }

    @Transactional
    public void saveComment(Comment comment) {
        comment.setDate(new Date());
        this.entityManager.persist(comment);

    }

    @Transactional
    public void updateComment(Comment comment) {
       Comment commentFromDb= this.getComment(comment.getArticleId(), comment.getId());
        if (commentFromDb != null){
            commentFromDb.setContent(comment.getContent());
            commentFromDb.setlastDate(new Date());
            this.entityManager.persist(commentFromDb);
        }
    }

    @Transactional
    public void deleteComment(Long articleId, Long commentId) {
        Comment commentFromDb= this.getComment(articleId, commentId);
        if (commentFromDb != null){
            this.entityManager.remove(commentFromDb);
        }
    }
}
