<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include  page="/WEB-INF/views/layout.jsp"></jsp:include>

<!DOCTYPE html>
<html>
	<head>
		<title>Modifier un patient</title>
	</head>
	
	<body>
		<form class="form-group" method="post">
			<div class="form-group col-md-6">
				<div class="form-group col-md-6">
					<input type="text" placeholder="Num secu" name="nnumSS">
				</div>
				<div class="form-group col-md-6">
					<input type="text" placeholder="Nom" name="nomPat">
				</div>
				<div class="form-group col-md-6">
					<input type="text" placeholder="Prenom" name="prenomPat">
				</div>
				<div class="form-group col-md-6">
					<input type="text" placeholder="Sexe" name="sexe">
				</div>
				<div class="form-group col-md-6">
					<input type="date" placeholder="Date" name="dateNaiss">
				</div>
				<div class="form-group col-md-6">
					<input type="text" placeholder="Numéro RPPS" name="numRPPS">
				</div>
					<input class="btn btn-primary" type="submit" value="Modifier">
			</div>
		</form>
	</body>
</html>