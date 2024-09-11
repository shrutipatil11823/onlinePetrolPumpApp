<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import='org.petrolpump.admin.service.*,java.util.*,org.petrolpump.admin.model.*' %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@include file='admindashboards.jsp'%>
<div class="col w-75 py-3 tablestyle border border-dark p-3 border-2 rounded shadow-lg">
	<h1 class="text-white bg-dark p-1 fs-4 text-center border border-white ">Machine Details</h1>
            <table class="table">
            
  <thead>
    <tr>
      <th scope="col">Sr.No</th>
      <th scope="col">Employee Name</th>
      <th scope="col">Contact</th>
      <th scope="col">Allocated Machines</th>
      <th scope="col">Delete</th>
      <th scope="col">Update</th>
    </tr>
  </thead>
  <tbody>

	<%
		employeeService empServ=new employeeServiceImpl();
	List<employeeModel> lst=empServ.getAllEmployee();
	
	int count=0;
	
	for(employeeModel model:lst){
		++count;
	%>
	
	<tr>
	<td><%=count%></td>
		<td><%=model.getName()%></td>
		<td><%=model.getContact() %></td>
		<td><a href='allocatemachine?empId=<%=model.getId()%>&empName=<%=model.getName()%>'>Allocated Machines</a></td>
		<td><a href="">DELETE</a></td>
		<td><a href="">UPDATE</a></td>
	</tr>
	
	<%
		}
	%>
  
  </tbody>
</table>
        </div>
        
   </div>
        </div>
    </div>
        
 <!--    </div>
 </div>-->
</body>
</html>

