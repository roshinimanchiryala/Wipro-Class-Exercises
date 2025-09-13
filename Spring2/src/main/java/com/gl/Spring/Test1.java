package com.gl.Spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
	public static void main(String [] args) {
		AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(Container.class);
		
		Counter c1 = context1.getBean("getCounter", Counter.class);
		c1.increaseCount();
		c1.increaseCount();
		
		Counter c2 = context1.getBean("getCounter", Counter.class);
		c2.increaseCount();
		c2.increaseCount();
	}

}
