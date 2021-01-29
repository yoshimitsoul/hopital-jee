<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include  page="/WEB-INF/views/layout.jsp"></jsp:include>

<!DOCTYPE html>
<html>
	<body>
	<div class="row justify-content-center">
	<div class="col-12 col-md-8 col-lg-6 pb-5 text-center">
		<h1>Liste des patients</h1>
	</div>
	</div>
    <div class="container">
    <div class="row justify-content-center">
        <c:forEach var="patient" items="${ patients }" varStatus="patientStatus">
			<div class="card mt-3 ml-3 text-center" style="width: 18rem;">
				N° SS: ${ patient.numSS} <br/>
				<b>Nom: ${ patient.nomPat }</b>  
				<b>Prenom: ${patient.prenomPat}</b> <br/> 
				Sexe: ${patient.sexe} <br/> 
				Sexe: ${patient.dateNaiss} <br/> 
				N° RPPS: ${patient.numRPPS}
				
				<a href="patient-supprimer?numSS=${ patient.numSS }" class="btn btn-danger btn-sm active" role="button" title="supprimer-patient">Supprimer patient</a>
				<a href="patient-modifier?numSS=${ patient.numSS }" class="btn btn-warning btn-sm active" role="button" title="modifier-patient">Modifier patient</a>
			</div>
		</c:forEach>
    	</div>
    	 <div class="container">
    <div class="row justify-content-center mt-5">
    		<a href="patient-ajout?numSS=${ patient.numSS }" class="btn btn-success btn-sm active" role="button" title="patient-ajout">ajouter un patient</a>
    </div>
    </div>
    </div>
  </body>
</html>