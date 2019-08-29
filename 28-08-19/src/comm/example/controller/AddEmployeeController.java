package comm.example.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.model.Employee;
import comm.example.service.EmpServiceImpl;

/**
 * Servlet implementation class AddEmployeeController
 */
@WebServlet("/add.do")
public class AddEmployeeController extends HttpServlet {
	private String name;
	private String password;
	private String email;
	private String country;
	EmpServiceImpl ser = new EmpServiceImpl();

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		country = request.getParameter("country");
		name = request.getParameter("name");
		password = request.getParameter("password");
		email = request.getParameter("email");
		int a = ser.createEmployee(new Employee(0,name,password,email,country));
		if (a>0)
		{
			RequestDispatcher view=request.getRequestDispatcher("view_emp.view");
			view.forward(request, response);	
		}
		
	}

}
