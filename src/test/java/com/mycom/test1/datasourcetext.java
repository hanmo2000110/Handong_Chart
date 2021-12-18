package com.mycom.test1;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class datasourcetext {

	@Test
	public void testConnection() {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/root-context.xml");
		DataSource ds = (DataSource) ctx.getBean("dataSource");
		
		try {
			Connection con = ds.getConnection();
			System.out.print("DB연결 성공!!!");
		}
		catch (SQLException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			System.out.print("DB연결 실패!!!");
		}
	}
}