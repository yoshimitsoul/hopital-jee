<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include  page="/WEB-INF/views/layout.jsp"></jsp:include>

<!DOCTYPE html>
<html>
	<head>
		<title>Modifier un medecin</title>
	</head>
	
	<body>
		<form class="form-group" method="post">
			<div class="form-group col-md-6">
				<div class="form-group col-md-6">
					<input type="text" placeholder="Num RPPS" name="numRPPS">
				</div>
				<div class="form-group col-md-6">
					<input type="text" placeholder="nom Medecin" name="nomMed">
				</div>
				<div class="form-group col-md-6">
					<input type="text" placeholder="Prenom" name="prenomMed">
				</div>
				<div class="form-group col-md-6">
					<input type="text" placeholder="Specialite" name="specialite">
				</div>
				<div class="form-group col-md-6">
					<input type="text" placeholder="Ville" name="ville">
				</div>
				<div class="form-group col-md-6">
					<input type="text" placeholder="Adresse" name="adresse">
				</div>
					<input class="btn btn-primary" type="submit" value="Modifier">
			</div>
		</form>
	</body>
</html>