package com.example.seo.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

	private Long title;
	private String description;

	public Value() {
	}

	public Long getId() {
		return this.title;
	}

	public String getdescription() {
		return this.description;
	}

	public void setId(Long title) {
		this.title = title;
	}

	public void setdescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Value{" +
				"id=" + title +
				", description='" + description + '\'' +
				'}';
	}
}