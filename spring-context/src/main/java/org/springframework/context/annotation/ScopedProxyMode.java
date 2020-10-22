/*
 * Copyright 2002-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.context.annotation;

/**
 * Enumerates the various scoped-proxy options.
 *
 * <p>For a more complete discussion of exactly what a scoped proxy is, see the
 * section of the Spring reference documentation entitled '<em>Scoped beans as
 * dependencies</em>'.
 * <p>
 * ========官方文档解释如下：===============
 * The Spring IoC container manages not only the instantiation of your objects (beans),
 * but also the wiring up of collaborators (or dependencies)【IOC容器同时管理对象实例化和依赖项之间的连接】.
 * If you want to inject (for example)
 * an HTTP request-scoped bean into another bean of a longer-lived scope, you may choose to inject
 * an AOP proxy in place of the scoped bean. That is, you need to inject a proxy object that exposes
 * the same public interface as the scoped object but that can also retrieve【检索】 the real target object
 * from the relevant【相关】 scope (such as an HTTP request) and delegate method calls onto the real object.
 *
 * 在@Scope和@SessionScope中通过设置proxyMode的值来选择代理的模式
 * 关于代理模式的说明参考自：https://cloud.tencent.com/developer/article/1429932
 * INTERFACES：java动态代理
 * TARGET_CLASS：CGLIB实现的动态代理
 *
 * @author Mark Fisher
 * @see ScopeMetadata
 * @since 2.5
 */
public enum ScopedProxyMode {

	/**
	 * Default typically equals {@link #NO}, unless a different default
	 * has been configured at the component-scan instruction level.
	 */
	DEFAULT,

	/**
	 * Do not create a scoped proxy.
	 * <p>This proxy-mode is not typically useful when used with a
	 * non-singleton scoped instance, which should favor the use of the
	 * {@link #INTERFACES} or {@link #TARGET_CLASS} proxy-modes instead if it
	 * is to be used as a dependency.
	 */
	NO,

	/**
	 * Create a JDK dynamic proxy implementing <i>all</i> interfaces exposed by
	 * the class of the target object.
	 */
	INTERFACES,

	/**
	 * Create a class-based proxy (uses CGLIB).
	 */
	TARGET_CLASS

}
