package comm.example.spring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	
	
	@RequestMapping(method = RequestMethod.GET,name = "/showView")
	public String showHelloWorldForm()
	{
		return "helloworld-form";
	}

	@RequestMapping("/processForm")
	public String processStudentForm()
	{
		return "hello-world";
	}
	
	@RequestMapping(name = "/processFormVersionTwo")
	public String processStudentFormVersionTwo(HttpServletRequest request,
			Model theModel)
	
	{
		String message="Yo!!"+(request.getParameter("studentName")).toUpperCase();
theModel.addAttribute("M", message);
		return "hello-world";
	}
	@RequestMapping(name = "/processFormVersionThree")
	public String processStudentFormVersionThree(@RequestParam("studentName") String studentName,
			Model theModel)
	
	{
		String message="Yo!!"+(studentName.toUpperCase());
theModel.addAttribute("M", message);
		return "hello-world";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
