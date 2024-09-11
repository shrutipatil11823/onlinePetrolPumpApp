<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

    <link href="CSS/admin.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
</head>
<body>
	 <div class="container-fluid">
    <div class="row p-2">
        <div class="col-12 nav justify-content-center align-items-center">
            <h3 class="fs-md-3 text-white">OnlinePetrolPumpManagement</h3>
        </div>
    </div>
    <div class="row">
        <div class="col-sm-3 menu border border-5 border-light">
            <h3 class="m-4 fw-bold fs-5 text-center text-white bg-dark fs-sm-6 shadow-lg p-2 border rounded">Menu</h3>
            <ul class="list-unstyled">
                <li>
                    <a class="text-decoration-none fs-6 text-white bg-secondary fw-bold shadow-sm text-md-white border border-2 border-dark p-1" href="#machineMaster" data-bs-toggle="collapse" data-bs-target="#collapseExample">Machine Master</a>
                    <ul class="collapse text-decoration-none list-unstyled mt-2" id="collapseExample">
                        <li>
                            <a class="text-decoration-none text-white fs-6 lh-lg fw-normal" href="addmachine.jsp">New Machine</a>
                        </li>
                        <li>
                            <a class="text-decoration-none text-white fs-6 lh-lg fw-normal" href="viewMachine.jsp">View Machine</a>
                        </li>
                    </ul>
                </li>
                <li class="mt-3">
                    <a class="text-decoration-none fs-6 fw-bold shadow-sm text-white bg-secondary lh-lg border border-2 border-dark p-1" href="" data-bs-toggle="collapse" data-bs-target="#collapsetype">Type Master</a>
                    <ul class=" collapse list-unstyled mt-2" id="collapsetype">
                        <li>
                            <a class="text-decoration-none fs-6 fw-normal lh-lg text-white" href="fueltype.jsp">New Machine</a>
                        </li>
                        <li>
                            <a class="text-decoration-none fs-6 fw-normal lh=lg text-white" href="#">View Machine</a>
                        </li>
                    </ul>
                </li>
                <li class="mt-3">
                    <a class="text-decoration-none fs-6 fw-bold shadow-sm text-white bg-secondary lh-lg border border-2 border-dark p-1" href="" data-bs-toggle="collapse" data-bs-target="#collapseemployee">Employee</a>
                    <ul class=" collapse list-unstyled mt-2" id="collapseemployee">
                        <li>
                            <a class="text-decoration-none fs-6 fw-normal lh-lg text-white" href="addnewemployee.jsp">New Employee</a>
                        </li>
                        <li>
                            <a class="text-decoration-none fs-6 fw-normal lh=lg text-white" href="viewEmployee.jsp">View Employee</a>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
        <div class="col-sm-9 content border border-5 border-white">
            <!-- Content here -->

            
    
</body>
</html>