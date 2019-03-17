package com.jaceksysiak.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		  
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/jaceksysiak/spring/aop/beans.xml");
 
		Camera camera = (Camera) context.getBean("camera");
		camera.snap();
		
		//System.out.println(camera);
		
		((ClassPathXmlApplicationContext)context).close();
		  
		  
	}

}
