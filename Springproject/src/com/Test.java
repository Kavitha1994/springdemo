package com;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class Test {
	public static void main(String arg[])
	{
		Resource resource=new ClassPathResource("Springconfigure.xml");  
		BeanFactory factory=new XmlBeanFactory(resource);
		Student obj=(Student)factory.getBean("BeanObj");
		obj.display();
	}	
 	

}
