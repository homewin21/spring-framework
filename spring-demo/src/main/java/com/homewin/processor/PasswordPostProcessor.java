package com.homewin.processor;

import com.homewin.processor.model.PoJo;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author homewin
 * @Description 后置器demo
 * @createTime 2020.11.02 19:42:06
 */
@Component
public class PasswordPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("post before:");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("post after:");
		if (bean instanceof PoJo) {
			((PoJo) bean).setPassword("123");
		}
//		System.out.println(bean);
		return bean;
	}
}
