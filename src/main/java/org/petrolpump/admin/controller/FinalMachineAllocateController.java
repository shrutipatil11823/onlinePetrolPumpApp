package org.petrolpump.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.petrolpump.admin.service.*;

@WebServlet("/viewmachine")
public class FinalMachineAllocateController extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int empid=Integer.parseInt(request.getParameter("empid"));
		int mid=Integer.parseInt(request.getParameter("mid"));
		String stTime=request.getParameter("startTime");
		String eTime=request.getParameter("endTime");
		String date=request.getParameter("Date");
		
		out.println("Employee id "+empid);
		out.println("Machine id "+mid);
		out.println("Start time is "+stTime);
		out.println("EndTime is "+eTime);
		out.println("Dtae is "+date);
		
		employeeService empServ=new employeeServiceImpl();
		
		boolean b=empServ.getMachineDetails(empid,mid,stTime,eTime,date);
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
}
