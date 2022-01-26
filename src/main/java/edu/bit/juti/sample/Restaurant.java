package edu.bit.juti.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component //�ش� ��ü�� ���������� �����ؾ��ϴ� ��ü�� �ν�
@Data //�ش� ��ü�� Getter/Setter/ toString�� �ڵ�������(lombok)
public class Restaurant {
	
	@Setter(onMethod_ = @Autowired)
	private Chef chef;

}
