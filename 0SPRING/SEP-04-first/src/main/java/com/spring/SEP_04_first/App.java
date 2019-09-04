package com.spring.SEP_04_first;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.SEP_04_first.bean.BasketballCoach;
import com.spring.SEP_04_first.bean.Coach;

public class App 
{
    public static void main( String[] args )
    {
    	try {
			@SuppressWarnings("resource")
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			//Dynamic method dispatching
			Coach ch = context.getBean("coach", BasketballCoach.class);
			System.out.println(ch.getWorkout());
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
    }
}
