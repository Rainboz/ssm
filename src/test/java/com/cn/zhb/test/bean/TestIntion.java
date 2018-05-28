package com.cn.zhb.test.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.cn.zhb.service.impl.IntionService;
import com.cn.zhb.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestIntion extends UnitTestBase {
	public TestIntion(){
		super("classpath:com/cn/zhb/mapping/spring-annotation.xml");
	}
//	@Test
//	public void testSetter() {
//		IntionService service = super.getBean("intionService");
//		service.save("这是要保存的数据");
//	}
//	@Test
//	public void testCons() {
//		IntionService service = super.getBean("intionService");
//		service.save("这是要保存的数据");
//	}
	@Test
	public void testAutowired(){
		IntionService service = super.getBean("intionServiceImpl");
		service.save("This is a Autowired!");
	}
}
