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

<%!machineService mServ=new machineServiceImpl(); %>

<%@include file='admindashboards.jsp'%>
<div class="col py-3 tablestyle border border-dark p-3 border-2 rounded shadow-lg">
	<h1 class="text-white bg-dark p-1 fs-4 text-center border border-white ">Machine Details</h1>
            <table class="table">
            
  <thead>
    <tr>
      <th scope="col">Sr.No</th>
      <th scope="col">Machine Code</th>
      <th scope="col">FuelType</th>
      <th scope="col">Capacity</th>
      <th scope="col">Delete</th>
      <th scope="col">Update</th>
    </tr>
  </thead>
  <tbody>
  <%  List<Object []> lst=mServ.getMachineDetails(); 
  
  int count=0;
  for(Object [] obj:lst)
  {
%> 
	  <tr>
      <th scope="row"><%=++count %></th>
      <td><%=obj[0]%></td>
      <td><%=obj[1] %></td>
      <td><%=obj[2] %></td>
      <td><a href='del?machineid=<%=(int)obj[3]%>'><i class="bi bi-trash text-dark"></i></a></td>
      <td><a href='updatemachine?mid=<%=(int)obj[3]%>&machinecode=<%=obj[0].toString()%>'><i class="bi bi-pencil-square text-dark"></i></a></td>
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