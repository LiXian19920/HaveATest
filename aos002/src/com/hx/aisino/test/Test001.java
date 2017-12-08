package com.hx.aisino.test;

import org.junit.Test;

import com.aisino.platform.db.Crud;
import com.aisino.platform.db.DbSvr;
import com.aisino.platform.db.sql.annotation.Table;

/**
 * @Author LeeApri
 * @Date 2017年12月6日上午11:32:48
 * @Title Test001 
 * @Description 第一次测试链接数据库
 */
public class Test001 {
	@Test
	public void test() {
		DbSvr dbSvr = DbSvr.getDbService("mysql.test");
		int i = dbSvr.deleteRow("clazz", "id", "1");
		System.out.println(i);
		
		DbSvr service = DbSvr.getDbService("localjava");
		Number result = service.getNumberResult("select count(*) from clazz");
		System.out.println(result);
	}
	public void testInsert() {
		Crud crud = new Crud("clazz");
	}
	
	@Test
	public void test2(){
		String sql = "select * from clazz $between(t.)";
	}
}
