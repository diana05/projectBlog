package model;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.Date;


/**
 * Created with IntelliJ IDEA.
 * User: Raluca
 * Date: 11.09.2015
 * Time: 11:27
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="article")
public class Article  {
    @Id()
    @GeneratedValue(generator="idIncrementor")
    @GenericGenerator(name="idIncrementor" , strategy="increment")
    private Long id;
    @Column(name="title")
    private String title;
    @Column(name="description")
    private String description;
    @Column(name="content")
    private String content;
    @Column(name="date")
    private Date date;
    @Column(name="lastDate")
    private Date lastDate;


    public Article(){};
    public Article(Long id, String title, String description, String content,Date date,Date lastDate){
        this.id=id;
        this.title=title;
        this.description=description;
        this.content = content;
        this.date=date;
        this.lastDate=lastDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
