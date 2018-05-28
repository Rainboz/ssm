package com.cn.zhb.test.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.cn.zhb.dao.BeanLifeCycle;
import com.cn.zhb.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestLifeCycle extends UnitTestBase {
	public TestLifeCycle() {
		super("classpath:com/cn/zhb/mapping/spring-life.xml");
	}

	@Test
	public void testLC() {
		BeanLifeCycle blc = super.getBean("lifecycle");
	}
}
