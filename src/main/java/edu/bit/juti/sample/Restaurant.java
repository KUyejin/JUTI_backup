package edu.bit.juti.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component //해당 객체는 스프링에서 관리해야하는 객체로 인식
@Data //해당 객체의 Getter/Setter/ toString이 자동형성됨(lombok)
public class Restaurant {
	
	@Setter(onMethod_ = @Autowired)
	private Chef chef;

}
