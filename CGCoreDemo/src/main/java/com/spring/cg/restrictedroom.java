package com.spring.cg;

import java.util.Set;

public class restrictedroom {

	private int roomId;
	private Set<User> users;
	private Set<Chat> chat; 
	
	public restrictedroom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public restrictedroom(int roomId, Set<User> users, Set<Chat> chat) {
		super();
		this.roomId = roomId;
		this.users = users;
		this.chat = chat;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public Set<Chat> getChat() {
		return chat;
	}

	public void setChat(Set<Chat> chat) {
		this.chat = chat;
	}

	@Override
	public String toString() {
		return "restrictedroom [roomId=" + roomId + ", users=" + users + ", chat=" + chat + "]";
	}
	
	
}
