package com.ibm.fsd.StudentCRUD;

import java.util.Scanner;

import com.ibm.fsd.StudentCRUD.model.Student;
import com.ibm.fsd.StudentCRUD.service.StudentServiceImpl;

public class Main {

	public static void main(String[] args) {
		StudentServiceImpl serv = new StudentServiceImpl();

      int choice,a=1;
      Scanner sc = new Scanner(System.in);
      while(a>0)
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
    	  serv.getAllStudents();
    	  break;
      }
      case 4:{
    	  System.out.println("Enter id of the student:");
    	  int id = sc.nextInt();
    	  System.out.println("Which data do you want to update?\n");
    	  System.out.println("1.Name\n2.Email\n3.Grade\n");
    	  int i=sc.nextInt();
		  Student st = serv.getById(id);
    	  switch(i)
    	  {
    	  case 1:{
    		  System.out.println(st);
    		  System.out.println("\nEnter new name:");
    		  String name=sc.next();
    		  serv.updateStudentName(st,name);
    		  break;
    	  }
    	  case 2:{
    		  System.out.println(st);
    		  System.out.println("\nEnter new email:");
    		  String email=sc.next();
    		  serv.updateStudentEmail(st,email);
    		  break;}
    	  case 3:{
    		  System.out.println(st);
    		  System.out.println("\nEnter new grade:");
    		  String grade=sc.next();
    		  serv.updateStudentGrade(st,grade);
    		  break;}
    	  default:{System.out.println("\n Invalid choice!");
    	  break;}
    	  }
      }
      case 5:{
    	  a=-1;
      	  System.out.println("Bye!");
    	  break;
    	  
      }
      default:{
    	  System.out.println("\nInvalid choice!");
    	  break;
      }
      }
      }
      
	}

}
