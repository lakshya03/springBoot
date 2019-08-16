package com.training;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		GenericApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		// if u don't call the bean even though it will be created 
	//	Doctor ram =ctx.getBean(Doctor.class); //when two same class bean is created this show error
		Doctor ram =(Doctor)ctx.getBean("doctor");
		
		
		
		System.out.println(ram); // through id calling to remove error
		System.out.println(ram.getAddress());
		
		ctx.close();

	}

}
