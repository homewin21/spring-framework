package com.homewin.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author homewin
 * @Description 事件监听器
 * @createTime 2020.11.08 21:09:48
 */
@Component
public class MethodExecListener implements ApplicationListener<MethodExecEvent> {

	@Override
	public void onApplicationEvent(MethodExecEvent event) {
		System.out.println("is time to go");
	}
}
