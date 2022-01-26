package edu.bit.juti.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration 
//������ IOC Container���� �ش� ��Ŭ������ Bean ���� Class���� �˷��ִ� ������̼�
@ComponentScan(basePackages= {"edu.bit.juti.sample"})
//[root-context xml ���� ��� "2)"] ���� �߰��� 
//<context:component-scan base-package="��Ű�� ���"> �� ���� ������ ����
public class RootConfig {

}
