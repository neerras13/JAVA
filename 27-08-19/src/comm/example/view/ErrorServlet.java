package comm.example.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.model.League;

public class ErrorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		@SuppressWarnings("unchecked")
		List<String> err=(List<String>)request.getAttribute("ERROR");
		out.println("<div style='color:red;'>");
		for(String s:err)
		{
			out.println(s+"<br/>");
		}

		out.println("<br/><br/><br/><br/>");
		out.println("<form action='javascript:history.back()'><input type=\"submit\" value=\"Go back\" id=\"button-1\"/></form>");
		
		
		
	}

}