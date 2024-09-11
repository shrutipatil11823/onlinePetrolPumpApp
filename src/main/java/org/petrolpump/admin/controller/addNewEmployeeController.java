package org.petrolpump.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.petrolpump.admin.service.*;
import org.petrolpump.admin.model.employeeModel;

/**
 * Servlet implementation class addNewEmployeeController
 */
@WebServlet("/addNewEmployee")
public class addNewEmployeeController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String contact=request.getParameter("contact");
		String address=request.getParameter("address");
		int salary=Integer.parseInt(request.getParameter("salary"));
		
		employeeModel model=new employeeModel();
		model.setName(name);
		model.setEmail(email);
		model.setContact(contact);
		model.setAddress(address);
		model.setSalary(salary);
		
		employeeService empSer=new employeeServiceImpl();
		
		boolean b=empSer.isAddNewEmployee(model);
		
		if(b)
		{
			RequestDispatcher r=request.getRequestDispatcher("admindashboards.jsp");
			r.include(request, response);
			out.println("Data added");
		}else
		{
			RequestDispatcher r=request.getRequestDispatcher("admindashboards.jsp");
			r.forward(request, response);
			out.println("Data adding failed");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
