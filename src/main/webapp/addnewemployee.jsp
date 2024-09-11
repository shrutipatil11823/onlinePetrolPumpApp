<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@page import='org.petrolpump.admin.service.*,org.petrolpump.admin.model.*,java.util.*' %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file='admindashboards.jsp'%>
<div class="col py-3 ">
            <form  class='formarea mb-5 border border-dark border-1 rounded shadow-lg ' name='frm' action="addNewEmployee" method='POST'>
            	<label for='machinetype' class='h4 fs-5'>Employee name</label><br>
            	<input type='text' class='form-control control' name='name' id='machinetype' placeholder='Ramesh'>
            	
            	
            	<label for='machinetype' class='h4 fs-5'>Employee email</label><br>
            	<input type='text' class='form-control control' name='email' id='machinetype' placeholder='ramesh@gmail.com'>
            	
            	<label for='machinetype' class='h4 fs-5'>Employee contact</label><br>
            	<input type='text' class='form-control control' name='contact' id='machinetype' placeholder='9090877655'>
            	
            	
            	<label for='machinetype' class='h4 fs-5'>Employee address</label><br>
            	<input type='text' class='form-control control' name='address' id='machinetype' placeholder='pune'>
            	
            	
            	<label for='machinetype' class='h4 fs-5'>Employee Salary</label><br>
            	<input type='text' class='form-control control' name='salary' id='machinetype' placeholder='50,000'>
            	

            	<div class=' text-center control'>
            		<button type='submit' class='btn btn-dark fs-5'>Add New Machine</button>
            	</div>
       
            	
            </form>
        </div>

</div>
        </div>
    </div>
</body>
</html>

