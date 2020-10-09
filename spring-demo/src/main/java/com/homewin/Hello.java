package com.homewin;

import org.springframework.stereotype.Component;

/**
 * @author homewin
 * @Description hello spring
 * @createTime 2020.10.09 21:14:20
 */
@Component("Hello")
public class Hello {
	public void hello() {
		System.out.println("hello spring,here I come❤");
	}
}
