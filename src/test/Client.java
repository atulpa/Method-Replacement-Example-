package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bank;

public class Client  {
	public static void main(String[] args) {
		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("resources/engine.xml");
		 Bank b=(Bank)context.getBean("b");
		 System.out.println(b.getClass().getCanonicalName());
		 //beans.Bank$$EnhancerBySpringCGLIB$$ee8e2502 proxy class
		 
		 b.deposit();
		 b.deposit();
		 b.calIntrest();// without affecting application we can make new changes 
	}

}
