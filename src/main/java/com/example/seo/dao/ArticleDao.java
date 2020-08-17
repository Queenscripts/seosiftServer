// package com.example.seo.dao;

// import com.example.seo.model.Article;
// import java.util.UUID;

// import java.util.List;
// import java.util.Optional;

// public interface ArticleDao {
//     int insertArticle(UUID id, Article Article);
//     default int insertArticle(Article Article){
//         UUID id = UUID.randomUUID();
//         return insertArticle(id, Article);

//     }
//     List<Article> selectAllArticles();

//     Optional<Article> selectArticleById(UUID id);

    // int deleteArticleById(UUID id);

    // int updateArticleById(UUID id, Article Article);


// }
