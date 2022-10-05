package com.leslie.entity;

public class Book {
	private int id;
	private String isbn;
	private String name;
	private String description;
	private String borrowBy;

	public Book() {
	};

	public Book(int id, String isbn, String name, String description, String borrowBy) {
		this.id = id;
		this.isbn = isbn;
		this.name = name;
		this.description = description;
		this.borrowBy = borrowBy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBorrowBy() {
		return borrowBy;
	}

	public void setBorrowBy(String borrowBy) {
		this.borrowBy = borrowBy;
	}
}
