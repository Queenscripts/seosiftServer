package com.example.seo.api;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Article {

	private List<Articles> articles;
	private Integer totalResults;

	public Integer gettotalResults() {
		return totalResults;
	}

	public List getArticle() {
		return this.articles;
	  }
	
	  public void setArticles(List articles) {
		this.articles = articles;
	  }

	public void setType(Integer totalResults) {
		this.totalResults = totalResults;
	}

	class Articles
	{
		@JsonProperty("author")
		String author;
		@JsonProperty("description")
		String description;
		@JsonProperty("title")
		String title;
		@JsonProperty("url")
		String url;
		@JsonProperty("urlToImage")
		String urlToImage;
	}

	@Override
	public String toString() {
		return "Article{" +
				"articles='" + articles + '\'' +
				", totalResults=" + totalResults +
				'}';
	}
}