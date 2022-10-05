package com.leslie.database;

import java.util.ArrayList;

import com.leslie.entity.Book;
import com.leslie.entity.User;

public class Database {
	public static ArrayList<User> users=new ArrayList<User>();
	public static ArrayList<Book> books=new ArrayList<Book>();
	static {
		users.add(new User("lsy","123"));
		books.add(new Book());
	}
}
