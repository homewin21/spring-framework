package com.homewin.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author homewin
 * @Description 方法事件
 * @createTime 2020.11.08 21:04:15
 */
public class MethodExecEvent extends ApplicationEvent {
	private static final long serialVersionUID = -7091037708183571937L;
	private String methodName;

	/**
	 * Create a new {@code ApplicationEvent}.
	 *
	 * @param source the object on which the event initially occurred or with
	 *               which the event is associated (never {@code null})
	 */
	public MethodExecEvent(Object source) {
		super(source);
	}

	public MethodExecEvent(Object source, String methodName) {
		super(source);
		this.methodName = methodName;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
}