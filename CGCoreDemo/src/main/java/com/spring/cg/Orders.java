package com.spring.cg;

import java.util.List;

public class Orders {
	private int orderId;
	private List<Items> item;
	
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orders(int orderId, List<Items> item) {
		super();
		this.orderId = orderId;
		this.item = item;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public List<Items> getItem() {
		return item;
	}

	public void setItem(List<Items> item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", item=" + item + "]";
	}
	

}
