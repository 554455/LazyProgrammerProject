package com.umaraliev.springmvcapplication.controllers;

import com.umaraliev.springmvcapplication.model.Article;
import com.umaraliev.springmvcapplication.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/")
    public String getAll(Model model) {
        List<Article> articleList = articleService.getAll();
        model.addAttribute("listArticle", articleList);
        return "home";
    }

    @GetMapping("/article/{id}")
    public String getById(@PathVariable("id") Long id, Model model) {
        Article article = articleService.getById(id);
        model.addAttribute("article", article);
        return "article";
    }

    @GetMapping("/createArticle")
    public String createFormArticle(Article article) {
        return "create";
    }

    @PostMapping("createArticle")
    public String createArticle(Article article) {
        articleService.save(article);
        return "redirect:/";
    }
}
