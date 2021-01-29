<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link title="style"
	href="<c:url value='/resources/css/style-front.css' />" type="text/css"
	rel="stylesheet" />
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
<title>Hopital-JEE</title>
</head>
<body>

	<!-- Navbar -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top text-white">
		<div class="container">
			<h1>
				Hopital-JEE
			</h1>
			<a class="navbar-brand" href="<c:url value='/home' />"></a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarResponsive" aria-controls="navbarResponsive"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item active"><a class="nav-link"
						href="<c:url value='/login'/>">Accueil <span class="sr-only">(current)</span>
					</a></li>
					<li class="nav-item"><a class="nav-link"
						href="<c:url value='/patient'/>">Patient</a></li>
					<li class="nav-item"><a class="nav-link"
						href="<c:url value='/medecin'/>">Medecin</a></li>
					<li class="nav-item"><a class="nav-link"
						href="<c:url value='/consulte'/>">Consultations</a></li>
				</ul>
			</div>
		</div>
	</nav>
	
	<!-- Header -->
	<header class="py-5 bg-image-full">
		
	</header>
	
	