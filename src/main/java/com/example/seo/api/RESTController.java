package com.example.seo.api;

import java.util.Arrays;
import java.util.List;

import com.example.seo.SeoApplication;
import com.example.seo.api.Article.Articles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping(value = "/demo", method = RequestMethod.GET, produces = "application/json")
@ResponseBody
public class RESTController {
    private static final Logger log = LoggerFactory.getLogger(SeoApplication.class);

    @Autowired
    private RestTemplate restTemplate;
    private static String url = "https://newsapi.org/v2/everything?q=('+search%20+engine%20+optimization' OR '+SEO')&sortBy=publishedAt&language=en&apiKey=f5ae70fe95da4ca892c7027bd1ee6b10";

   @GetMapping("/api")
//    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//        return args -> {
//            Article articlesArticle = restTemplate.getForObject(
//                    "https://newsapi.org/v2/everything?q=('+search%20+engine%20+optimization' OR '+SEO')&sortBy=publishedAt&language=en&apiKey=f5ae70fe95da4ca892c7027bd1ee6b10", Article.class);
//            log.info(articlesArticle.toString());
//        };
//    }
   public List<Object> getAllArticles(){
       Object articles = restTemplate.getForObject(url, Object.class);
       return Arrays.asList(articles);
   }

//    public String getProductList() {
//       HttpHeaders headers = new HttpHeaders();
//       headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//       HttpEntity <String> entity = new HttpEntity<String>(headers);
      
//       return restTemplate.exchange("https://cors-anywhere.herokuapp.com/https://newsapi.org/v2/everything?q=('+search%20+engine%20+optimization' OR '+SEO')&sortBy=publishedAt&language=en&apiKey=f5ae70fe95da4ca892c7027bd1ee6b10", HttpMethod.GET, entity, String.class).getBody();
//    }


public static void main(String[] args) {
    SpringApplication.run(SeoApplication.class, args);
}

}


// @SpringBootApplication
// public class RESTController {
    // private final ArticleService ArticleService;

    // @Autowired
    // RestTemplate restTemplate;

    // @RequestMapping("/api")

    // @PostMapping
    // public void addArticle(@RequestBody Article Article){
    //     ArticleService.addArticle(Article);
    // }

    // private Object log;

	// @Bean
    // public RestTemplate restTemplate(RestTemplateBuilder builder) {
	// 	return builder.build();
	// }

    // @Bean
	// public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
	// 	return args -> {
	// 		Quote article = restTemplate.getForObject(
	// 				"https://cors-anywhere.herokuapp.com/https://newsapi.org/v2/everything?q=('+search%20+engine%20+optimization' OR '+SEO')&sortBy=publishedAt&language=en&apiKey=f5ae70fe95da4ca892c7027bd1ee6b10", Quote.class);
	// 		log.info(article.toString());
	// 	};
	// }
    // @RequestMapping(value = "/api")
    // public String getAllArticles() {
    //     HttpHeaders headers = new HttpHeaders();
    //     headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
    //     HttpEntity<String> entity = new HttpEntity<String>(headers);
    //     return restTemplate.exchange(
    //         "https://cors-anywhere.herokuapp.com/https://newsapi.org/v2/everything?q=('+search%20+engine%20+optimization' OR '+SEO')&sortBy=publishedAt&language=en&apiKey=f5ae70fe95da4ca892c7027bd1ee6b10", HttpMethod.GET, entity, String.class).getBody();
    //   };
        // final String uri = "";
        // RestTemplate restTemplate = new RestTemplate();
        // String result = restTemplate.getForObject(uri, String.class);
        // System.out.println(result);
    

    // return new Article();
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
    // }