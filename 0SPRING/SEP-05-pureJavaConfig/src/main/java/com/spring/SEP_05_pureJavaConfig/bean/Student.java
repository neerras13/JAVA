package com.spring.SEP_05_pureJavaConfig.bean;

import org.springframework.stereotype.Component;

@Component(value="student")
public class Student {
public void printGrade() {
	System.out.println("Student has secured A grade!");
}
}

