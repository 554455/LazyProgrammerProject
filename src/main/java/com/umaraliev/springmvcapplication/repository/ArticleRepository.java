package com.umaraliev.springmvcapplication.repository;

import com.umaraliev.springmvcapplication.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
    Article getById(Id id);
}
