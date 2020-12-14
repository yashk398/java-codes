package com.spring.cg;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		AbstractApplicationContext iocContainer = new ClassPathXmlApplicationContext("Beans_simple.xml");
		MessagePrinterBean messagePrinterBean = (MessagePrinterBean)iocContainer.getBean("messagePrinter");
		System.out.println(messagePrinterBean);
		MessagePrinterBean messagePrinterBeanConstructor = (MessagePrinterBean)iocContainer.getBean("messagePrinterConstructor");
		System.out.println(messagePrinterBeanConstructor);
		
		MessagePrinterBean Proto1 = (MessagePrinterBean)iocContainer.getBean("messagePrinterProto");
		Proto1.setMessage("Proto1");
		MessagePrinterBean Proto2 = (MessagePrinterBean)iocContainer.getBean("messagePrinterProto");
		System.out.println(Proto1.getMessage());
		System.out.println(Proto2.getMessage());
		
		ProjectBean p1 = (ProjectBean)iocContainer.getBean("project_1");
		System.out.println(p1.getName());
		p1.setName("Teams");
		System.out.println(p1.getName());
		iocContainer.registerShutdownHook();
	}

}
