package com.spring.cg;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Channel {

	public static void main(String[] args) {
		AbstractApplicationContext iocContainer = new ClassPathXmlApplicationContext("Channel_beans.xml");
		restrictedroom log  = (restrictedroom)iocContainer.getBean("restricted_room_1");
		System.out.println(log);

	}

}
