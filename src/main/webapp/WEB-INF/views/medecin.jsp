<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include  page="/WEB-INF/views/layout.jsp"></jsp:include>

<!DOCTYPE html>
<html>
	<body>
	<div class="row justify-content-center">
	<div class="col-12 col-md-8 col-lg-6 pb-5 text-center">
		<h1>Liste des medecins</h1>
	</div>
	</div>
    <div class="container">
    <div class="row justify-content-center">
        <c:forEach var="medecin" items="${ medecins }" varStatus="medecinStatus">
			<div class="card mt-3 ml-3 text-center" style="width: 18rem;">
				N° RPPS: ${ medecin.numRPPS} <br/>
				<b>Nom: ${ medecin.nomMED }</b>  
				<b>Prenom: ${medecin.prenomMED}</b> <br/> 
				Specialité: ${medecin.specialite} <br/> 
				Ville: ${medecin.ville} <br/> 
				Adresse: ${medecin.adresse}
				
				<a href="medecin-supprimer?numRPPS=${ medecin.numRPPS }" class="btn btn-danger btn-sm active" role="button" title="supprimer-medecin">Supprimer medecin</a>
				<a href="medecin-modifier?numRPPS=${ medecin.numRPPS }" class="btn btn-warning btn-sm active" role="button" title="modifier-medecin">Modifier medecin</a>
			</div>
		</c:forEach>
    	</div>
    	 <div class="container">
    <div class="row justify-content-center mt-5">
    		<a href="medecin-ajout?numRPPS=${ medecin.numRPPS }" class="btn btn-success btn-sm active" role="button" title="medecin-ajout">ajouter un medecin</a>
    </div>
    </div>
    </div>
  </body>
</html>