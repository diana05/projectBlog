package facade;

import model.Comment;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 14.09.2015
 * Time: 14:49
 * To change this template use File | Settings | File Templates.
 */
public interface ICommentFacade {

    public List<Comment> getAllComment(Long articleId)  ;
    public Comment getComment(Long articleId, Long commentId);

    public void saveComment(Comment comment);
    public void updateComment(Comment comment);
    public void deleteComment(Long articleId,Long commentId);

}

