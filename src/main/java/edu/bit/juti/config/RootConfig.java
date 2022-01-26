package edu.bit.juti.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration 
//스프링 IOC Container에게 해다 ㅇ클래스를 Bean 구성 Class임을 알려주는 어노테이션
@ComponentScan(basePackages= {"edu.bit.juti.sample"})
//[root-context xml 설정 방식 "2)"] 에서 추가한 
//<context:component-scan base-package="패키지 경로"> 와 같을 역할을 수행
public class RootConfig {

}
