package com.example.form;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@GetMapping("/formView")
	public String formView(Model theModel) {
		Student st = new Student();
		theModel.addAttribute("student",st);
		return "form";
	}
	
	@PostMapping("/processView")
	public String processView(@ModelAttribute("student") Student theStudent,Model theModel) 
	{	
//		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("mvc-form.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		StudentDao dao = context.getBean("sDao", StudentDao.class); 
		String s=Arrays.toString(theStudent.getOp());
		String[] str= {"no","no","no"};
		if(s.indexOf("Windows") != -1)
			str[0]="yes";
		if(s.indexOf("Linux") != -1)
			str[1]="yes";
		if(s.indexOf("Unix") != -1)
			str[2]="yes";
		dao.createStudent(theStudent,str);
		List<Map<String,Object>> list = dao.getAllStudents();
		theModel.addAttribute("list",list);
//		//dao.getStudent(1);
		return "display";
	}
	
	@RequestMapping(name="/delete",method = RequestMethod.POST)
	public String deleteStudent(@RequestParam("id") int id ) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		StudentDao dao = context.getBean("sDao", StudentDao.class); 
		dao.deleteStudent(id);
		return "display";
	}

}
