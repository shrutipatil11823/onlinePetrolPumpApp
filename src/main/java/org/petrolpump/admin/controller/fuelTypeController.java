package org.petrolpump.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.petrolpump.admin.model.*;
import org.petrolpump.admin.service.*;

@WebServlet("/fueltype")
public class fuelTypeController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String ftype=request.getParameter("fueltype");
		
		fuelModel model=new fuelModel();
		model.setFuelType(ftype);
		fuelService fServ=new fuelServiceImpl();
		boolean b=fServ.isAddFuelType(model);
		
		if(b)
		{
			RequestDispatcher r=request.getRequestDispatcher("admindashboard.jsp");
			r.include(request,response);
			out.println("<h1>Fuel type added succes</h1>");
		}else
		{
			RequestDispatcher r=request.getRequestDispatcher("admindashboard.jsp");
			r.include(request,response);
			out.println("<h1>Fuel type not added succes</h1>");
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
