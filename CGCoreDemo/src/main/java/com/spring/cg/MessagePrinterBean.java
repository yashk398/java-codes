package com.spring.cg;

public class MessagePrinterBean {

	private String message;
	
	public MessagePrinterBean() {
		super();
	}
	public MessagePrinterBean(String message) {
		super();
		this.message = message;
	}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	 public void init(){
	      System.out.println("Bean is going through init.");
	   }

	 public void destroy() {
	      System.out.println("Bean will destroy now.");
	   }

	@Override
	public String toString() {
		return "ProjectBean [message=" + message + "]";
	}
	

}
