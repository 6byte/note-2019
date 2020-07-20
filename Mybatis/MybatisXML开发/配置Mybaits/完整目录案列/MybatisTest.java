package com.jym.mybatis.bean;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.jym.mybatis.test.Employee;


/**
 * @author Administrator
 *
 */
public class MybatisTest {

	@Test
	public void sessionGetted() throws IOException {
		String resource = "mybatis-conf.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory =
		 new SqlSessionFactoryBuilder().build(inputStream);
		
		SqlSession openSession = sqlSessionFactory.openSession();
		//第一个参数是递唯一标识符
		//第二个参数是执行sql要用的参数
		Employee employee = openSession.selectOne("selectEmp",10);
		System.out.println(employee.getEmail());
		openSession.close();
	}
	
}
