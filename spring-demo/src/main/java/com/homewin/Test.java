package com.homewin;

import com.homewin.processor.model.PoJo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Administrator
 */
public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(TestConfig.class);
		Hello hello = (Hello) context.getBean("Hello");
		PoJo poJo = (PoJo) context.getBean("poJo");
		context.getBeanFactory().destroySingletons();
		hello.hello();

	}
}
