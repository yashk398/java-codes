package com.spring.cg;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Total {

	public static int total;
	public static void main(String[] args) {
		AbstractApplicationContext iocContainer = new ClassPathXmlApplicationContext("calculate.xml");
		Orders orders1 = (Orders)iocContainer.getBean("order1");
		List<Items> itemlist = orders1.getItem();
		for(Items i : itemlist) {
			total+=i.getPrice();
		}
		Orders orders2 = (Orders)iocContainer.getBean("order2");
		itemlist = (orders2.getItem());
		for(Items i : itemlist) {
			total+=i.getPrice();
		}
		Orders orders3 = (Orders)iocContainer.getBean("order3");
		itemlist = (orders3.getItem());
		for(Items i : itemlist) {
			total+=i.getPrice();
		}

		System.out.println("Total Order Price is : "+total);

	}

}
