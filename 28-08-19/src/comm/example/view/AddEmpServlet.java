package comm.example.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddEmpServlet
 */
@WebServlet("/add_emp.view")
public class AddEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmpServlet() {
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
	
	protected void doProcess(HttpServletRequest request,HttpServletResponse response) throws IOException {
//		PrintWriter out = response.getWriter();
//		out.println("<h1>Add a new employee</h1><form id='form-1' action='add.do' method='post'><label for='input-1'>Name</label><input id='input-1' name='name' required='true' type='text'/><br/><label for='input-2'>Password </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id='input-2' name='password' required='true' type='password'/><br/><label for='input-3'>Mobile</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
//		out.println("<input id='input-3' name='mobile' required='true' type='password'/><br/>");
//		out.println("<label for='input-4'>Country</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
//		out.println("<select name='country'>");
//		out.println("<option value='Unknmown'>Select...</option>");
//		out.println("<option value='India'>India</option>");
//		out.println("<option value='US'>US</option>");
//		out.println("<option value='UK'>UK</option>");
//		out.println("<option value='Other'>Other</option>");
//		out.println("</select><br/><br/><br/>");
//		out.println("<input type='submit' value='Add' id='button-1'/>");
//		out.println("<input type='reset' value='Reset' id='button-2'/>");
//		out.println("</form>");
			}
		
		}
