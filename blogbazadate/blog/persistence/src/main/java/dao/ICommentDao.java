package dao;

import java.util.List;
import model.Comment;
/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 15.09.2015
 * Time: 17:44
 * To change this template use File | Settings | File Templates.
 */
public interface ICommentDao {
    public List<Comment> getAllComment(Long articleId)  ;
    public Comment getComment(Long articleId, Long commentId);
    void saveComment(Comment comment);
    public void updateComment(Comment comment);
    public void deleteComment(Long articleId,Long commentId);


}
