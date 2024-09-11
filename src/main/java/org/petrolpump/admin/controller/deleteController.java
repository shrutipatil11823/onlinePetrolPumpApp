package org.petrolpump.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;
import org.petrolpump.admin.service.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/del")
public class deleteController extends HttpServlet {
	machineService  mServ=new machineServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();

		int mid=Integer.parseInt(request.getParameter("machineid"));
	
		boolean b=mServ.isDeleteMachine(mid);
		
		if(b)
		{
			RequestDispatcher r=request.getRequestDispatcher("viewMachine.jsp");
			r.forward(request, response);
		}else
		{
			out.println("<h1>Some problem is there...</h1>");
		}
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
