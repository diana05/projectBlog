package model;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 15.09.2015
 * Time: 15:01
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="comment")
public class Comment {
    @Id()
    @GeneratedValue(generator="idIncrementor")
    @GenericGenerator(name="idIncrementor" , strategy="increment")
    private Long id;
    @Column(name="content")
    private String content;
    @Column(name="articleId")
    private Long articleId ;
    @Column(name="date")
    private Date date;
    @Column(name="lastDate")
    private Date lastDate;

    public Comment(){}

    public Comment(String content , Long articleId,Date date,Date lastDate){
        this.content=content;
        this.articleId=articleId;
        this.date=date;
        this.lastDate=lastDate;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getlastDate() {
        return lastDate;
    }

    public void setlastDate(Date lastDate) {
        this.lastDate = lastDate;
    }
}
