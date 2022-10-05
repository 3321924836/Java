package com.shelley.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DailyRecord {

	private Integer id;
	private String title;
	private String content;
	private String time = getStringDate();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = getStringDate();
	}

	public DailyRecord() {
		// TODO Auto-generated constructor stub
	}

	public DailyRecord(Integer id, String title, String content, String time) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.time = time;
	}

	public static String getStringDate() {
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(currentTime);
		return dateString;
	}

}
