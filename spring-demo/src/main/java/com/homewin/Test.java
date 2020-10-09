package com.homewin;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Administrator
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(TestConfig.class);
		Hello hello = (Hello) context.getBean("Hello");
		hello.hello();
	}
}
