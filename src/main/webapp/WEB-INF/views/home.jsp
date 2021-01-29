<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include  page="/WEB-INF/views/layout.jsp"></jsp:include>

<!DOCTYPE html>
<html lang="fr">
<head>
<link title="style" href="./css/style.css" type="text/css" rel="stylesheet"/>
<meta charset="UTF-8">
<title>hopital-jee</title>
</head>
<body class="bg-dark">

<div class="container col-md-3">	
<div class="card" style="width: 18rem;">
  <div class="card-header text-center">
    Options
  </div>
  <ul class="list-group list-group-flush text-center">
    <li class="list-group-item">  
    	<a href="<c:url value="/consulte"/>" class="btn btn-success col-sm-10">Liste des consulations</a>
    </li>
    <li class="list-group-item">
    	<a href="<c:url value="/medecin"/>" class="btn btn-danger col-sm-10">Liste des medecins</a>
    </li>
    <li class="list-group-item">
    	<a href="<c:url value="/patient"/>" class="btn btn-warning col-sm-10">Liste des patients</a>
    </li>
  </ul>
</div>
</div>
<div class="col-lg-12 mt-5">
<img src="https://picsum.photos/2000/540" class="img-fluid" alt="Responsive image">
</div>
</body>
</html>
	


