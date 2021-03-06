package comm.example.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.model.Employee;
import comm.example.service.EmpServiceImpl;

/**
 * Servlet implementation class EditServlet
 */
@WebServlet("/edit_emp.view")
public class EditServlet extends HttpServlet {
	private int id=0;
	EmpServiceImpl serv =new EmpServiceImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		PrintWriter out=response.getWriter();
		id=Integer.parseInt(request.getParameter("id"));
		Employee emp = serv.getEmployeeById(id);

		out.println("<h1>Edit employee details</h1>");
		out.println("<form id='form-1' action='edit.view?id="+id+"' method='post'>");
		out.println("<label for='input-1'>Name</label>");
		out.println("<input id='input-1' name='name' required='true' value='"+emp.getName()+"' type='text'/><br/>");
		out.println("<label for='input-2'>Password </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
		out.println("<input id='input-2' name='password' required='true' value='"+emp.getPassword()+"' type='text'/><br/>");
		out.println("<label for='input-3'>Email</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
		out.println("<input id='input-3' name='email' value='"+emp.getEmail()+"' required='true' type='text'/><br/>");
		out.println("<label for='input-4'>Country</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
		out.println("<select name='country'>");
		out.println("<option value='Unknown'>Select...</option>");
		out.println("<option value='India'>India</option>");
		out.println("<option value='US'>US</option>");
		out.println("<option value='UK'>UK</option>");
		out.println("<option value='Other'>Other</option>");
		out.println("</select><br/><br/><br/>");
		out.println("<input type='submit' value='Edit and Save' id='button-1'/> ");
		out.println("<input type='reset' value='Reset' id='button-2'/>");
		out.println("</form>");

	}
}

	

