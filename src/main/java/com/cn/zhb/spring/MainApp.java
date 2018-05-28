package com.cn.zhb.spring;

import javax.faces.application.Application;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 第一步是我们使用框架 API ClassPathXmlApplicationContext() 来创建应用程序的上下文。 这个 API
		 * 加载 beans 的配置文件并最终基于所提供的 API，它处理创建并初始化所有的对象， 即在配置文件中提到的 beans。
		 * 第二步是使用已创建的上下文的 getBean() 方法来获得所需的 bean。这个方法使用 bean 的 ID
		 * 返回一个最终可以转换为实际对象的通用对象。一旦有了对象，你就可以使用这个对象调用任何类的方法。
		 Spring IoC 容器利用 Java 的 POJO 类和配置元数据来生成完全配置和可执行的系统或应用程序。
		 */
		// ApplicationContext context =
		// new ClassPathXmlApplicationContext("com/cn/zhb/mapping/Beans.xml");
		// HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		// obj.getMessage();
//		 XmlBeanFactory factory = new XmlBeanFactory(new
//		 ClassPathResource("com/cn/zhb/mapping/Beans.xml"));
//		 HelloWorld obj1 = (HelloWorld) factory.getBean("helloWorld");
//			obj1.setMessage("I'm object 1");
//			obj1.getMessage();
//		 HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
//		 obj.getMessage();
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/cn/zhb/mapping/Beans.xml");
//		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
//		objA.setMessage("I'm object A");
//		objA.getMessage();
//		HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
//		objB.getMessage();
//		 AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/cn/zhb/mapping/Beans.xml");
//	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//	      obj.getMessage();
//	      context.registerShutdownHook();
//		
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/cn/zhb/mapping/Beans.xml");
//		HelloWorld objA = (HelloWorld) context.getBean("helloWorld"); 
//		objA.getMessage1();
//		objA.getMessage2();
//		ApplicationContext context1 = new ClassPathXmlApplicationContext("com/cn/zhb/mapping/Beans.xml");
//		HelloIndia objB = (HelloIndia) context1.getBean("helloIndia"); 
//		objB.getMessage1();
//		objB.getMessage2();
//		objB.getMessage3();
		
		ApplicationContext context = 
	             new ClassPathXmlApplicationContext("com/cn/zhb/mapping/Beans.xml");
	      TextEditor te = (TextEditor) context.getBean("textEditor");
	      te.spellCheck();
	   }
	}


