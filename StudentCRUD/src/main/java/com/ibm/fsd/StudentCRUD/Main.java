package com.ibm.fsd.StudentCRUD;

import java.util.Scanner;

import com.ibm.fsd.StudentCRUD.model.Student;
import com.ibm.fsd.StudentCRUD.service.StudentServiceImpl;

public class Main {

	public static void main(String[] args) {
		StudentServiceImpl serv = new StudentServiceImpl();

      int choice,a=0;
      Scanner sc = new Scanner(System.in);
      while(a!=2)
      {
        System.out.println("Enter your choice:\n1. Create a new student\n2. Delete a student\n3.View all Students\n4.Update student details\n5. Exit\n");
        choice=sc.nextInt();
      switch(choice)
      {
      case 1:{
    	  System.out.println("Enter name:\n");
    	  String name=sc.next();
    	  System.out.println("Enter email:\n");
    	  String email=sc.next();
    	  System.out.println("Enter grade:\n");
    	  String grade=sc.next();
    	  serv.createStudent(name,email,grade);
    	  break;
      }
      case 2:{
    	  System.out.println("Enter id of student:\n");
    	  Student st = serv.getById(sc.nextInt());
    	  serv.deleteStudent(st);
    	  break;
    	  
      }
      case 3:{
    	  
      }
      case 4:{
    	  
      }
      case 5:{
    	  
      }
      default:{
    	  
      }
      }
      a++;
      }
      
	}

}
