package com.service;

import dao.IArticleDao;
import facade.IArticleFacade;
import model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Created with IntelliJ IDEA.
 * User: Raluca
 * Date: 10.09.2015
 * Time: 14:51
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/article")
public class ArticleService {


    @Autowired
    IArticleFacade articleFacade;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public List<Article> getAllArticles(){
       return this.articleFacade.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Article getArticle(@PathVariable("id") Long articleId){
        return this.articleFacade.get(articleId);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public void saveArticle(@RequestBody Article myArticle) {
        this.articleFacade.saveMyArticle(myArticle);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public void updateArticle(@PathVariable("id") Long id, @RequestBody Article myArticle) {
        myArticle.setId(id);
        this.articleFacade.updateMyArticle( myArticle);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteArticle(@PathVariable("id") Long Id) {
        this.articleFacade.deleteArticle(Id);
    }

    public IArticleFacade getArticleFacade() {
        return articleFacade;
    }

    public void setArticleFacade(IArticleFacade articleFacade) {
        this.articleFacade = articleFacade;
    }


}
