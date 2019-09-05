package com.spring.SEP_04_first;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.SEP_04_first.bean.BasketballCoach;
import com.spring.SEP_04_first.bean.CricketCoach;
import com.spring.SEP_04_first.bean.Cricketer;
import com.spring.SEP_04_first.bean.Coach;

public class App 
{
    public static void main( String[] args )
    {
    	try {
			@SuppressWarnings("resource")
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-1.xml");
			//Dynamic method dispatching
			CricketCoach ch = context.getBean("cricket", CricketCoach.class);
			//System.out.println(ch.toString());
			System.out.println(ch.getWorkout());
			
			ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext.xml");
			CricketCoach ch1 = context1.getBean("coach", CricketCoach.class);
            System.out.println(ch1.toString());

		} catch (Exception e) {
			// TODO: handle exception
		}
    	
    }
}
