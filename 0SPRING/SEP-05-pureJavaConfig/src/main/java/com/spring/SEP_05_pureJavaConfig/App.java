package com.spring.SEP_05_pureJavaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.SEP_05_pureJavaConfig.bean.Student;
import com.spring.SEP_05_pureJavaConfig.bean.StudentConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
    	
    	Student st = context.getBean("student",Student.class);
    	st.printGrade();
    	
    }
}
