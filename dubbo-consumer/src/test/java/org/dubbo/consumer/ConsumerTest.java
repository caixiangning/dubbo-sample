package org.dubbo.consumer;

import java.io.IOException;

import org.dubbo.interfaces.service.CalculateService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * 使用Dubbo调用Dubbo服务测试类
 *
 * @author CaiXiangning 
 * @date Jun 12, 2017 
 * @email caixiangning@gmail.com
 */


public class ConsumerTest {
	
	@Test
	public void testConsumer(){
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring/spring-dubbo-consumer.xml");
		context.start();
		CalculateService calculateService2 = (CalculateService)context.getBean("calculateService");
		System.out.println("**************************"+calculateService2.add(8, 2));
		CalculateService calculateService = context.getBean(CalculateService.class);
		System.out.println(calculateService.add(8, 2));
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
