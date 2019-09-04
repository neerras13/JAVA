package com.myapp.controller;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;

import com.myapp.dao.InstructorDAO;
import com.myapp.dao.InstructorDAOImpl;
import com.myapp.entity.Instructor;
import com.myapp.entity.InstructorDetail;

@WebServlet("controller.do")
public class MyServlet extends HttpServlet {
private InstructorDAO dao;
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		dao=new InstructorDAOImpl();
		
		
		
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doProcess(req, resp);
	
	}

	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		out.println("I am at controller.do");
		String yc=req.getParameter("yc");
		String hobby=req.getParameter("hobby");
		HttpSession session=req.getSession();
		Instructor tempInstructor=(Instructor)session.getAttribute("I");
		tempInstructor.setDetail(new InstructorDetail(yc, hobby));
		dao.createInstructor(tempInstructor);
		RequestDispatcher view=req.getRequestDispatcher("success.jsp");
		view.include(req, resp);
		
		
	}

}