package com.example.seo;

import com.example.seo.api.Article;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SeoApplication {
	private static final Logger log = LoggerFactory.getLogger(SeoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SeoApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate 
	restTemplate) throws Exception {
		return args -> {
			Article articles = restTemplate.getForObject(
					"https://newsapi.org/v2/everything?q=('+search%20+engine%20+optimization' OR '+SEO')&sortBy=publishedAt&language=en&apiKey=f5ae70fe95da4ca892c7027bd1ee6b10",
					Article.class);
			log.info(articles.toString());
		};
	}

	// @Bean
	// public RestTemplate restTemplate() {
	// final RestTemplate restTemplate = new RestTemplate();

	// List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
	// MappingJackson2HttpMessageConverter converter = new
	// MappingJackson2HttpMessageConverter();
	// converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
	// messageConverters.add(converter);
	// restTemplate.setMessageConverters(messageConverters);

	// return restTemplate;
	// }
	// public RestTemplate getRestTemplate(){
	// return new RestTemplate();
	// }

}
