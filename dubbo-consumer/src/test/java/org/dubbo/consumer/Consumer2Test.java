package org.dubbo.consumer;

import org.dubbo.interfaces.service.CalculateService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * 使用Dubbo调用Dubbo服务测试类
 *
 * @author CaiXiangning 
 * @date Jun 12, 2017 
 * @email caixiangning@gmail.com
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring-dubbo-consumer.xml"})
public class Consumer2Test {
	
	@Autowired
	private CalculateService calculateService;
	
	@Test
	public void testConsumer(){
		System.out.println(calculateService.add(8, 2));
		calculateService.add(8, 2);
	}
}
