package comm.example.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.model.Employee;
import comm.example.service.EmpServiceImpl;

/**
 * Servlet implementation class ViewServlet
 */
@WebServlet("/view_emp.view")
public class ViewServlet extends HttpServlet {
	EmpServiceImpl serv =new EmpServiceImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewServlet() {
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
		doProcess(request,response);	
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		List<Employee> list = serv.getAllEmployees();
		out.println("<h1 align='center'>List of Employees</h1>");
		out.println("<table align='center' cellpadding='10px' border='3px' style='border-collapse: collapse;'><thead><tr><th>ID</th><th>Name</th><th>Password</th><th>Email</th><th>Country</th><th>Edit</th><th>Deletion</th></tr></thead>");
		out.println("<tbody>");
		for(Employee e:list) {
			out.println("<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td><td>"+e.getPassword()+"</td><td>"+e.getEmail()+"</td><td>"+e.getCountry()+"</td>");
			out.println("<td><a href='edit_emp.view?id="+e.getId()+"'>Edit</a></td><td><a href='delete_emp.view?id="+e.getId()+"'>Delete</a></td></tr>");
		}
		out.println("</tbody></table><br/><br/><a href='index.html'>Add new employee</a>");
	}

}
