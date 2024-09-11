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
            <form  class='formarea border border-dark border-1 rounded shadow-lg ' name='frm' action="newmachine" method='POST'>
            	<label for='machinetype' class='h4'>Machine Code</label><br></br>
            	<input type='text' class='form-control control' name='machinecode' id='machinetype' placeholder='Enter machine code e.g M001'>
            	<br>
            	
            	<table>
            		<%
            			fuelService fServ=new fuelServiceImpl();
            			List<fuelModel> lst=fServ.getAllFuelTypes();
            			for(fuelModel m:lst)
            			{
            			
            		%>
            		
            		<tr>
            			<td ><input type='checkbox' name='ftype' value='<%=m.getFuelId()%>' />&nbsp;&nbsp;<%=m.getFuelType()%></td>
            			<td ><input type='text' class='fuel-design border-black border-2 rounded-pill' name='capacity' value='' /></td>
            		</tr>
            		
            		<%
            			}
            		%>
            	
            	</table>
            	<br>
            	<div class='mb-4 text-center control'>
            		<button type='submit' class='btn btn-dark '>Add New Machine</button>
            	</div>
       
            	
            </form>
        </div>

</div>
        </div>
    </div>
</body>
</html>

