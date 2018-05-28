package com.cn.zhb.dao;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle implements InitializingBean, DisposableBean {
	public void defaultInit() {
		System.out.println("defaultInit bean!");
	}

	public void defaultDestroy() {
		System.out.println("defaultDestroy bean!");
	}

	public void start() {
		System.out.println("bean start!");
	}

	public void stop() {
		System.out.println("bean stop!");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Bean destroy");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean afterPropertiesSet");

	}

}
