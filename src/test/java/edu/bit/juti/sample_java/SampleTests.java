package edu.bit.juti.sample_java;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.bit.juti.config.RootConfig;
import edu.bit.juti.sample.Restaurant;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class) 
//해당 클래스에 있는 코드가 스프링을 실행하는 역할이라는 것을 표시
@ContextConfiguration(classes= {RootConfig.class})
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
	

}
