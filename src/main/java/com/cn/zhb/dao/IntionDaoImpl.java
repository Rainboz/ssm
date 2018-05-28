package com.cn.zhb.dao;

import org.springframework.stereotype.Repository;

@Repository
public class IntionDaoImpl implements IntionDao{

	public void save(String arg) {
		//模拟数据库操作
		System.out.println("保存数据："+arg);
		
	}

}
