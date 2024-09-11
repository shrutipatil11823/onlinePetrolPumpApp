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

import org.petrolpump.admin.model.machineModel;


@WebServlet("/finalupdate")
public class finalController extends HttpServlet {
	
	machineService mServ=new machineServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int mid=Integer.parseInt(request.getParameter("mid"));
		String machinecode=request.getParameter("machinecode");
		
		machineModel model=new machineModel();
		
		model.setId(mid);
		model.setMachinecode(machinecode);
		
		boolean b=mServ.isUpdateMachine(model);
		
		if(b)
		{
			RequestDispatcher r=request.getRequestDispatcher("viewMachine.jsp");
			r.forward(request,response);
		}else
		{
			out.println("<h1>Some problem is there....</h1>");
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

