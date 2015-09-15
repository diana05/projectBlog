package dao;
import model.Comment;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 14.09.2015
 * Time: 14:30
 * To change this template use File | Settings | File Templates.
 */
public interface ICommentDao {
    List<Comment> findAll();
    List<Comment> getAll();
}
