package com.mayur.binding;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;


@Data
public class Book {
	
	@JsonProperty(value="bookid")
	private Integer id;
	private String name;
	private Double price;
	private Author author;
}
