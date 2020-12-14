package com.spring.cg;

public class Items {

	private String name;
	private long price;
	
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Items(String name, long price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Items [name=" + name + ", price=" + price + "]";
	}
	
	
}
