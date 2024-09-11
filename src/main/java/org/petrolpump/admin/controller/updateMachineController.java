package org.petrolpump.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/updatemachine")
public class updateMachineController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int mid=Integer.parseInt(request.getParameter("mid"));
		String machinecode=request.getParameter("machinecode");
		
		RequestDispatcher r=request.getRequestDispatcher("admindashboard.jsp");
		r.include(request, response);
		
		out.println("<div class='col py-3'>");
		out.println("<form class='formarea border border-dark border-1 rounded shadow-lg' name='frm' action='finalupdate' method='POST'>");
		out.println("<label for='machinetype' class='h4'>Update Machine</label><br></br>");
		out.println("<input type='hidden' name='mid' value='"+mid+"' class='control'/><br></br>");
		out.println("<input type='text' name='machinecode' value='"+machinecode+"' class='control'/><br></br>");
		out.println("<input type='submit' name='s' value='Update' class='control'/>");
		out.println("</div></div></div>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

