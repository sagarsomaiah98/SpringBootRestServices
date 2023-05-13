package com.springServices.Controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STORAGE")
public class Library {
	@Column(name="book_name")
	private String book_name;
	@Column(name="isbn")
	private String isbn;
	@Column(name="author")
	
	private String author;
	@Id
	@Column(name="id")
	private String id;
	@Column(name="aisle")
	private int aisle;
	
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAisle() {
		return aisle;
	}
	public void setAisle(int aisle) {
		this.aisle = aisle;
	}

	

}
