package com.umaraliev.springmvcapplication.service;

import com.umaraliev.springmvcapplication.model.Article;
import com.umaraliev.springmvcapplication.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    public Article getById(Long id) {
        return articleRepository.getById(id);
    }

    public List<Article> getAll() {
        return articleRepository.findAll();
    }

    public Article save(Article article) {
        return articleRepository.save(article);
    }

    public void delete(Long id) {
        articleRepository.getById(id);
    }

}
