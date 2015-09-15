package com.service;

import dao.IArticleDao;
import facade.IArticleFacade;
import model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import java.util.ArrayList;
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
    private IArticleFacade articleFacade;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public List<Article> getAllArticles(){
       return this.articleFacade.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Article getArticle(@PathVariable("id") Long id){
        return this.articleFacade.get(id);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public void saveArticle(@RequestBody Article article) {
        this.articleFacade.save(article);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public void updateArticle(@PathVariable("id") Long id, @RequestBody Article article) {
        article.setId(id);
        this.articleFacade.update(article);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteArticle(@PathVariable("id") Long id) {
        this.articleFacade.remove(id);
    }

    public void setArticleFacade(IArticleFacade articleFacade) {
        this.articleFacade = articleFacade;
    }

}
