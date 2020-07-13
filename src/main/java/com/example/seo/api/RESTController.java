package com.example.seo.api;

import com.example.seo.model.*;
import com.example.seo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/api")
public class RESTController {
    // private final ArticleService ArticleService;

    @Autowired
    private RestTemplate restTemplate;
    // @PostMapping
    // public void addArticle(@RequestBody Article Article){
    //     ArticleService.addArticle(Article);
    // }

    @RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE,  method = RequestMethod.GET)
    public String Article getAllArticles(Model model) {
        final String uri = "https://cors-anywhere.herokuapp.com/https://newsapi.org/v2/everything?q=('+search%20+engine%20+optimization' OR '+SEO')&sortBy=publishedAt&language=en&apiKey=f5ae70fe95da4ca892c7027bd1ee6b10";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        System.out.println(result);
    }

    return new Article();
    // @GetMapping(path = "{id}")
    // public Article getArticleById(@PathVariable("id") UUID id){
    //     return ArticleService.getArticleById(id)
    //             .orElse(null);
    // }

    // @DeleteMapping(path ="{id}")
    // public void deleteArticleById(@PathVariable("id") UUID id){
    //     ArticleService.deleteArticle(id);
    // }

    // @PutMapping
    // public void updateArticle(@PathVariable("id") UUID id, @RequestBody Article ArticleToUpdate){
    //     ArticleService.updateArticle(id, ArticleToUpdate);
    // }
}
