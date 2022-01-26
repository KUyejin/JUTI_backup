package edu.bit.juti.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class) 
//해당 클래스에 있는 코드가 스프링을 실행하는 역할이라는 것을 표시
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//지정된 클래스나 문자열을 이용해서 필요한 객체들을 스프링 내에 객체(Bean)로 등룍합니다
@Log4j
//Lombok을 이용해서 로그를 기록하는 Logger를 변수로 생성
public class SampleTests {
	
	@Autowired
	private Restaurant restaurant;
	
	@Test //테스트 대상 표시
	public void textExit() {
		
		assertNotNull(restaurant);
		
		log.info(restaurant);
		log.info("-----------------------");
		log.info(restaurant.getChef());
	}
	
	
	// INFO : edu.bit.juti.sample.SampleTests - Chef()
	// Restaurant 클래스 내에서 Chef클래스를 호출하는 메시드(Chef())를 추가하지 않았음에도
	// Chef 인스턴스변수(private Chef chef)에 붙여진 @Autowired를 통해서 해당 객체가
	// 주입 되었다는 것을 알 수 있다.
	

}
