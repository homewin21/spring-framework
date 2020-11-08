package com.homewin.processor.model;

import com.homewin.processor.PasswordDecode;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author homewin
 * @Description 无聊的bean
 * @createTime 2020.11.02 19:38:56
 */
@Component
public class PoJo implements PasswordDecode, DisposableBean, InitializingBean {
	private String password;

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy!!!!!!!!");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init");
	}
}
