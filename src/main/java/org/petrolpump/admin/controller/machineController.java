package org.petrolpump.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.petrolpump.admin.model.machineModel;
import org.petrolpump.admin.service.machineService;
import org.petrolpump.admin.service.machineServiceImpl;

@WebServlet("/newmachine")
public class machineController extends HttpServlet {
	
	machineService mServ=new machineServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String machinecode=request.getParameter("machinecode");
		String ftype[]=request.getParameterValues("ftype");
		String capArray[]=request.getParameterValues("capacity");
		
		machineModel model=new machineModel();
		model.setMachinecode(machinecode);
		boolean b=mServ.isAddNewMachine(model, ftype, capArray);
		
		System.out.println(b);
		if(b)
		{
			RequestDispatcher r=request.getRequestDispatcher("viewMachine.jsp");
			r.forward(request, response);
			out.println("<h1>fuel added....</h1>");
		}else
		{
			out.println("<h1>Some Problem is there....</h1>");
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		doGet(request, response);
	}

}
