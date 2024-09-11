package org.petrolpump.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.petrolpump.admin.service.machineService;
import org.petrolpump.admin.service.machineServiceImpl;
import java.util.*;
@WebServlet("/allocatemachine")
public class allocateMachineToEmployeeController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		RequestDispatcher r=request.getRequestDispatcher("admindashboards.jsp");
		r.include(request, response);
		
		machineService mServ=new machineServiceImpl();
		List<Object []> list=mServ.getMachineDetails();
		
		LinkedHashMap<Integer,String> hs=new LinkedHashMap<Integer,String>();
		
		for(Object obj[]:list)
		{
			hs.put((Integer)obj[3],obj[0].toString());
		}
		
		int id=Integer.parseInt(request.getParameter("empId"));
		String name=request.getParameter("empName");
		
		out.println("<h3 class='mt-4' >Hey, "+name+" we are going to allocate you a machine..</h3>");
		out.println("<div class='col py-3'>");
		out.println("<form style='width: 500px;' class=' formarea border border-dark border-1 rounded shadow-lg' name='frm' action='viewmachine' method='POST'>");
		
		out.println("<input type='hidden' name='empid' value='"+id+"'/>");
		out.println("<select name='mid' value='' class='control'/><br></br>");
		out.println("<option >Select Machine</option>");
		Set<Map.Entry<Integer, String>> s=hs.entrySet();
		for(Map.Entry<Integer,String> m:s)
		{
			out.println("<option value='"+m.getKey()+"'>");
			out.println(m.getValue());
			out.println("</option>");
		}
		
		out.println("</select>");
		out.println("<input type='time' name='startTime' class='mt-3 control'/><br></br>");
		out.println("<input type='time' name='endTime' class='control'/><br></br>");
		out.println("<input type='date' name='Date' class='control'/><br></br>");
		out.println("<input type='submit' name='s' value='Allocate Machine To Employee' class='control'/>");
		
		out.println("</div></div></div>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
