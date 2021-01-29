<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include  page="/WEB-INF/views/layout.jsp"></jsp:include>

<!DOCTYPE html>
<html>
	<body>
	<div class="row justify-content-center">
	<div class="col-12 col-md-8 col-lg-6 pb-5 text-center">
		<h1>Liste des consultations</h1>
	</div>
	</div>
    <div class="container">
    <div class="row justify-content-center">
        <c:forEach var="consulte" items="${ consulte }" varStatus="consulteStatus">
			<div class="card mt-3 ml-3 text-center" style="width: 18rem;">
				${ consulte.numRPPS} <br/>
				<b>${ consulte.numSS }</b>  
				${consulte.dateConsult}<br/> 
				${consulte.diagnostic}<br/> 
				${consulte.ordonnance }
				
				<a href="consulte-supprimer?numRPPS=${ consulte.numRPPS}" class="btn btn-danger btn-sm active" role="button" title="supprimer-consulte">Supprimer</a>
			</div>
		</c:forEach>
    	</div>
    	 <div class="container">
    <div class="row justify-content-center mt-5">
    		<a href="consulte-ajout?numRPPS=${ consulteStatus.index}" class="btn btn-success btn-sm active" role="button" title="consulte-ajout">ajouter nouvelle consultation</a>
    </div>
    </div>
    </div>
  </body>
</html>