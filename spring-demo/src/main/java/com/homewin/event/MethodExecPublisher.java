package com.homewin.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * @author homewin
 * @Description 事件发布者
 * @createTime 2020.11.08 21:11:25
 */
@Component
public class MethodExecPublisher implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher eventPublisher;

	public void methodExecution() {
		MethodExecEvent execEvent = new MethodExecEvent(this, "methodExecution");
		System.out.println("hello myEvent");
		MethodExecEvent endEvent = new MethodExecEvent(this, "methodExecution");
		this.eventPublisher.publishEvent(endEvent);

	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.eventPublisher = applicationEventPublisher;
	}
}
