package edu.bit.juti.persistence;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class) 
//해당 클래스에 있는 코드가 스프링을 실행하는 역할이라는 것을 표시
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//지정된 클래스나 문자열을 이용해서 필요한 객체들을 스프링 내에 객체(Bean)로 등룍합니다
public class DataSourceTest {
	
	@Autowired
	private DataSource dataSource;
	
	@Test
	public void testConnection() {
		try(
				Connection con = dataSource.getConnection();
		){
			System.out.println("con="+con);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
