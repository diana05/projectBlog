package facade;

import dao.ICommentDao;
import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 14.09.2015
 * Time: 14:49
 * To change this template use File | Settings | File Templates.
 */
public class CommentFacade implements ICommentFacade {
    @Autowired
     public ICommentDao commentDao;



    public List<Comment> getAllComment(Long articleId) {
        return this.commentDao.getAllComment(articleId)  ;
    }


    public Comment getComment(Long articleId, Long commentId) {
        return this.commentDao.getComment(Long articleId, Long commentDao);
    }


    public void saveComment(Comment comment) {
        this.saveComment(Comment comment);
    }


    public void updateComment(Comment comment) {
      this.updateComment(Comment comment);
    }


    public void deleteComment(Long articleId, Long commentId) {
        this.deleteComment(Long articleId,Long commentId);
    }
    public ICommentDao getCommentDao() {
        return commentDao;
    }

    public void setCommentDao(ICommentDao commentDao) {
        this.commentDao = commentDao;
    }
}
