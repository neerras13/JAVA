package comm.example.view;

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
 * Servlet implementation class EditEmpServlet
 */
@WebServlet("/edit.view")
public class EditEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmpServiceImpl serv =new EmpServiceImpl();

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditEmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws IOException {
	PrintWriter out =response.getWriter();	
	int id = Integer.parseInt(request.getParameter("id"));
	String name=request.getParameter("name");
	String pass=request.getParameter("pass");    
	String email=request.getParameter("email");
	String country=request.getParameter("country");
	int a = serv.updateEmployee(new Employee(id,name,pass,email,country));
	RequestDispatcher view=request.getRequestDispatcher("view_emp.view");
	  try {
		view.forward(request, response);
	} catch (ServletException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
