package com.cn.zhb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.zhb.dao.IntionDao;
@Service
public class IntionServiceImpl implements IntionService {
	
//	@Autowired
	private IntionDao intionDao;
//	//构造器注入
//	public IIntionServiceImpl(IntionDao intionDao){
//		this.intionDao = intionDao;
//	}
//	//设值注入
//	public void setIntionDao(IntionDao intionDao) {
//		this.intionDao = intionDao;
//	}
	@Autowired
	public IntionServiceImpl(IntionDao intionDao){
		this.intionDao = intionDao;
	}
//	@Autowired
//	public void setIntionDao(IntionDao intionDao) {
//		System.out.println("setIntionDao");
//		this.intionDao = intionDao;
//	}

	public void save(String arg) {
		// 模拟业务操作
		System.out.println("Service接受参数：" + arg);
		arg = arg + ":" + this.hashCode();
		intionDao.save(arg);
	}

}
