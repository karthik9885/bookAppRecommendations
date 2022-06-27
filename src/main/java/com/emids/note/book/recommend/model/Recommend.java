package com.emids.note.book.recommend.model;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="recommend")
public class Recommend{
	
	private int id;
	
	private int bookId;
	
	private String bookTitle;

	private String bookAuthors;

	private String bookPublisher;
	
	private String bookPublishedDate;

	private String bookDescription;
	private String bookCategory;
	
	private String bookImage;
	
	private int bookPrice;
	
	private String bookLanguage;
	
	private String bookCurrencytCode;
	private String username;
	
	
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthors() {
		return bookAuthors;
	}
	public void setBookAuthors(String bookAuthors) {
		this.bookAuthors = bookAuthors;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	public String getBookPublishedDate() {
		return bookPublishedDate;
	}
	public void setBookPublishedDate(String bookPublishedDate) {
		this.bookPublishedDate = bookPublishedDate;
	}
	public String getBookDescription() {
		return bookDescription;
	}
	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}
	public String getBookCategory() {
		return bookCategory;
	}
	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}
	public String getBookImage() {
		return bookImage;
	}
	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}
	public int getBookPrice() {
		return  bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookLanguage() {
		return bookLanguage;
	}
	public void setBookLanguage(String bookLanguage) {
		this.bookLanguage = bookLanguage;
	}
	public String getBookCurrencytCode() {
		return bookCurrencytCode;
	}
	public void setBookCurrencytCode(String bookCurrencytCode) {
		this.bookCurrencytCode = bookCurrencytCode;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public Recommend(String bookTitle, String bookAuthors, String bookPublisher,String bookPublishedDate, String bookDescription, String bookCategory, String bookImage, int bookPrice,
			String bookLanguage, String bookCurrencytCode, String username) {
		super();
		this.bookTitle = bookTitle;
		this.bookAuthors = bookAuthors;
		this.bookPublisher = bookPublisher;
		this.bookPublishedDate = bookPublishedDate;
		this.bookDescription = bookDescription;
		this.bookCategory = bookCategory;
		this.bookImage = bookImage;
		this.bookPrice = bookPrice;
		this.bookLanguage = bookLanguage;
		this.bookCurrencytCode = bookCurrencytCode;
		this.username = username;
	}
	public Recommend() {
		super();
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
