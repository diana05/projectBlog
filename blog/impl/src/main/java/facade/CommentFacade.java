package facade;

import dao.ICommentDao;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import model.Comment;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 14.09.2015
 * Time: 14:49
 * To change this template use File | Settings | File Templates.
 */
public class CommentFacade implements ICommentFacade {
    @Autowired
    private ICommentDao commentDao;

    public List <Comment> getAll(){
        return this.commentDao.getAll();
    }

}
