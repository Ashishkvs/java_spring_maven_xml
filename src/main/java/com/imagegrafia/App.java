package com.imagegrafia;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.imagegrafia.model.User;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/imagegrafia/cfgs/spring-beans.xml");
		User user=(User)context.getBean("user"); //by bean id
		System.out.println(user);
	}
}
