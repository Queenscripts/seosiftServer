package com.example.seo.service;

import com.example.seo.model.Article;
import com.example.seo.dao.ArticleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ArticleService {
    private final ArticleDao ArticleDao;

    @Autowired
    public ArticleService(@Qualifier("fakeDao") ArticleDao ArticleDao){
        this.ArticleDao = ArticleDao;
    }

    public int addArticle(Article Article){
        return articleDao.insertarticle(article);
    }

    public List<Article> getAllPeople(){
        return articleDao.selectAllPeople();
    }

    public Optional<Article> getarticleById(UUID id){
        return articleDao.selectarticleById(id);
    }

    public int deletearticle(UUID id){
        return articleDao.deletearticleById(id);
    }
    public int updatearticle(UUID id, Article newarticle){
        return articleDao.updatearticleById(id, newarticle);
    }
}
