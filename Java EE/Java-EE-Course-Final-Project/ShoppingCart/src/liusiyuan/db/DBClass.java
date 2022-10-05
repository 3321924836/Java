package liusiyuan.db;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import liusiyuan.entity.Book;

public class DBClass {
	private static Map<String, Book> books = new LinkedHashMap<String, Book>();

	static {
		books.put("1", new Book("1", "C primer plus"));
		books.put("2", new Book("2", "C++ primer plus"));
		books.put("3", new Book("3", "C# primer plus"));
		books.put("4", new Book("4", "Java SE primer"));
		books.put("5", new Book("5", "Java EE primer"));
	}

	public static Collection<Book> getAll() {
		return books.values();
	}

	public static Book getBook(String ID) {
		return books.get(ID);
	}
}
