package com.sample.pck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCamel {
	
	public static void main(String[] args) {
		 ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("contextbean-ed.xml");
		 try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 applicationContext.close();
		 }

}
