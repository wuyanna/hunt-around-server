package com.chocobean.ha.common;

/**
 * 
 * @author chris.liu
 * 
 */
public class Message {
	private String title;
	private String content;

	public Message(String title, String content) {
		this.title = title;
		this.content = content;
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

	@Override
	public String toString() {
		return String.format("{\"title\":\"%s\",\"content\":\"%s\"}", title,
				content);
	}
}
