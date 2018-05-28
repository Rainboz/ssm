package ssm;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.cn.zhb.pojo.User;
import com.cn.zhb.pojo.User_Life;

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
//	private ApplicationContext ac = null;

//	@Before
//	public void before() {
//		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		userService = (IUserService) ac.getBean("userService");
//	}
//
//	@Test
//	public void test1() {
//		User user = userService.getUserById(7);
//		 //System.out.println(user.getUsername());
//		// logger.info("值："+user.getUsername());
//		logger.info(JSON.toJSONString(user));
//		
//	}
//	@Test
//	public void test2() {
//		User_Life user2 = user_lifeService.getUserById(1);
//		 System.out.println(user2.getId());
//		// logger.info("值："+user.getUsername());
//		logger.info(JSON.toJSONString(user2));
//		
//	}
}
