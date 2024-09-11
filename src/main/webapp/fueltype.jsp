<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="admindashboards.jsp" %>
<div class="col py-3 ">
            <form  class='formarea border border-dark border-1 rounded shadow-lg ' name='frm' action="fueltype" method='POST'>
            	<label for='fuelType' class='h4'>Fuel type</label><br></br>
            	<input type='text' class='form-control control' name='fueltype' id='fuelType' placeholder='Enter fuel Type here e.g petrol'>
            	<br>
            	<div class='mb-4 text-center control'>
            		<button type='submit' class='btn btn-dark '>Add New Fuel Type</button>
            	</div>
            	
            </form>
        </div>
    </div>
</div>
</div>
</body>
</html>