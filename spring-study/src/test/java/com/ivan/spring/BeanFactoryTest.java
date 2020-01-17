package com.ivan.spring;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryTest {

	@Test
	public void testSimpleLoad(){
		BeanFactory bf=new XmlBeanFactory(new ClassPathResource("beanFactory.xml"));
		MyTestBean bean=(MyTestBean)bf.getBean("myTestBean");
		Assert.assertEquals("testStr",bean.getTestStr());
	}
}
