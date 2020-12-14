package com.spring.cg;

public class Chat {
	private String chatId;
	private String text;
	
	public Chat() {
		super();
	}
	
	public Chat(String chatId, String text) {
		super();
		this.chatId = chatId;
		this.text = text;
	}
	
	public String getChatId() {
		return chatId;
	}
	
	public void setChatId(String chatId) {
		this.chatId = chatId;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Chat [chatId=" + chatId + ", text=" + text + "]";
	}
	
	
	
}
