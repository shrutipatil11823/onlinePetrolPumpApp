<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href='CSS/adminstyle.css'>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">


</head>
<body>
<div class="container-fluid">
    <div class="row flex-nowrap border border-secondary border-3 ">
        <div class="col-auto col-md-3 col-xl-2 px-sm-2 px-0 bg-secondary border border-dark border-2 shadow-sm ">
            <div class=' abc d-flex flex-column align-items-center align-items-sm-start px-3 pt-2 text-white min-vh-100 '  >
                <a href="/" class="d-flex align-items-center pb-3 mb-md-0 me-md-auto text-white text-decoration-none">
                    <span class="fs-5 d-none text-white fw-bold  d-sm-inline" >Menu</span>
                </a>
                <ul class="nav nav-pills  flex-column mb-sm-auto mb-0 align-items-center align-items-sm-start" id="menu">
                    <li class="nav-item ">
                        <a href="#submenu1" data-bs-toggle="collapse" class="nav-link text-white px-0 align-middle">
                            <span class="ms-1 d-none d-sm-inline">Machine Master</span> </a>
                        <ul class="collapse show nav flex-column ms-1" id="submenu1" data-bs-parent="#menu">
                            <li class="w-100">
                                <a href="addmachine.jsp" class="nav-link text-white px-0"> <span class="d-none d-sm-inline">New Machine</span> </a>
                            </li>
                            <li>
                                <a href="viewMachine.jsp" class="nav-link text-white px-0"> <span class="d-none d-sm-inline">View Machine</span> </a>
                            </li>       
                        </ul>
                    </li>
                    <li>
                        <a href="#submenu1" data-bs-toggle="collapse" class="nav-link text-white px-0 align-middle">
                           <span class="ms-1 d-none d-sm-inline">Type Master</span> </a>
                        <ul class="collapse show nav flex-column ms-1" id="submenu1" data-bs-parent="#menu">
                            <li class="w-100">
                                <a href="fueltype.jsp" class="nav-link text-white px-0"> <span class="d-none d-sm-inline">New Machine</span></a>
                            </li>
                            <li>
                                <a href="#" class="nav-link text-white px-0"> <span class="d-none d-sm-inline">View Machine</span></a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="#" class="nav-link px-0 align-middle">
                            <i class="fs-4 bi-table"></i> <span class="ms-1 text-white d-none d-sm-inline">Orders</span></a>
                    </li>
                    <li>
                        <a href="#submenu2" data-bs-toggle="collapse" class="nav-link px-0 align-middle ">
                            <i class="fs-4 bi-bootstrap"></i> <span class="ms-1 text-white d-none d-sm-inline">Bootstrap</span></a>
                        <ul class="collapse nav text-white flex-column ms-1" id="submenu2" data-bs-parent="#menu">
                            <li class="w-100">
                                <a href="#" class="nav-link text-white px-0"> <span class="d-none d-sm-inline">Item</span> 1</a>
                            </li>
                            <li>
                                <a href="#" class="nav-link text-white px-0"> <span class="d-none d-sm-inline">Item</span> 2</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="#submenu3" data-bs-toggle="collapse" class="nav-link px-0 align-middle">
                            <i class="fs-4 bi-grid"></i> <span class="ms-1 d-none text-white d-sm-inline">Products</span> </a>
                            <ul class="collapse nav flex-column ms-1" id="submenu3" data-bs-parent="#menu">
                            <li class="w-100">
                                <a href="#" class="nav-link text-white px-0"> <span class="d-none d-sm-inline">Product</span> 1</a>
                            </li>
                            <li>
                                <a href="#" class="nav-link text-white px-0"> <span class="d-none d-sm-inline">Product</span> 2</a>
                            </li>
                            <li>
                                <a href="#" class="nav-link text-white px-0"> <span class="d-none d-sm-inline">Product</span> 3</a>
                            </li>
                            <li>
                                <a href="#" class="nav-link text-white px-0"> <span class="d-none d-sm-inline">Product</span> 4</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="#" class="nav-link px-0 align-middle">
                            <i class="fs-4 bi-people"></i> <span class="ms-1 text-white d-none d-sm-inline">Customers</span> </a>
                    </li>
                </ul>
                <hr>
                <div class="dropdown pb-4">
                    <a href="#" class="d-flex align-items-center text-white text-decoration-none dropdown-toggle" id="dropdownUser1" data-bs-toggle="dropdown" aria-expanded="false">
                        <img src="https://github.com/mdo.png" alt="hugenerd" width="30" height="30" class="rounded-circle">
                        <span class="d-none d-sm-inline mx-1">loser</span>
                    </a>
                    <ul class="dropdown-menu dropdown-menu-dark text-small shadow">
                        <li><a class="dropdown-item" href="#">New project...</a></li>
                        <li><a class="dropdown-item" href="#">Settings</a></li>
                        <li><a class="dropdown-item" href="#">Profile</a></li>
                        <li>
                            <hr class="dropdown-divider">
                        </li>
                        <li><a class="dropdown-item" href="#">Sign out</a></li>
                    </ul>
                </div>
            </div>
        </div>

</body>
</html>


