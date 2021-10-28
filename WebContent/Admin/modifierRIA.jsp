<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="com.pfe.Models.*"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="au theme template">
<meta name="author" content="Hau Nguyen">
<meta name="keywords" content="au theme template">

<!-- Title Page-->
<title>Ajouter</title>

<!-- Fontfaces CSS-->
<link href="../Assets/css/font-face.css" rel="stylesheet" media="all">
<link href="../Assets/vendor/font-awesome-4.7/css/font-awesome.min.css"
	rel="stylesheet" media="all">
<link href="../Assets/vendor/font-awesome-5/css/fontawesome-all.min.css"
	rel="stylesheet" media="all">
<link href="../Assets/vendor/mdi-font/css/material-design-iconic-font.min.css"
	rel="stylesheet" media="all">

<!-- Bootstrap CSS-->
<link href="../Assets/vendor/bootstrap-4.1/bootstrap.min.css" rel="stylesheet"
	media="all">

<!-- Vendor CSS-->
<link href="../Assets/vendor/animsition/animsition.min.css" rel="stylesheet"
	media="all">
<link
	href="../Assets/vendor/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css"
	rel="stylesheet" media="all">
<link href="../Assets/vendor/wow/animate.css" rel="stylesheet" media="all">
<link href="../Assets/vendor/css-hamburgers/hamburgers.min.css" rel="stylesheet"
	media="all">
<link href="../Assets/vendor/slick/slick.css" rel="stylesheet" media="all">
<link href="../Assets/vendor/select2/select2.min.css" rel="stylesheet" media="all">
<link href="../Assets/vendor/perfect-scrollbar/perfect-scrollbar.css"
	rel="stylesheet" media="all">

<!-- Main CSS-->
<link href="../Assets/css/theme.css" rel="stylesheet" media="all">

</head>

<body>
<div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
		
		</div>
	</div>
	<div class="row">
		<div class="col-md-4">
		</div>
		<div class="col-md-4">
		<h3 class="text-center text-primary">
				Modifier RIA
			</h3>
			<%
			RIA ria = (RIA) request.getSession().getAttribute("RIA");
			%>
			<form role="form" action="../ModifierRIA" method="post">
			
			
				<div class="form-group">					 
					<label for="1234">
					Code de RIA: 
					</label>
					<input readonly type="text" class="form-control" id="codeRIA" name="codeRIA" value="<%out.print(ria.getCodeRIA());%>"/>
				</div>
				<div class="form-group">					 
					<label for="1234">
						Type de RIA: 
					</label>
					<input type="text" class="form-control" id="type" name="type" value="<%out.print(ria.getType());%>">
				</div>
<div class="form-group">					 
					<label for="1234">
						Localisation de RIA: 
					</label>
					<input type="text" class="form-control" id="localisation" name="localisation" value="<%out.print(ria.getLocalisation());%>">
				</div>
				<div class="form-group">					 
					<label for="1234">
						Longueur de RIA: 
					</label>
					<input type="text" class="form-control" id="longueur" name="longueur" value="<%out.print(ria.getLonguer());%>">
				</div>
				<button type="submit" class="btn btn-primary">
					Submit
				</button>
			</form>
		</div>
		<div class="col-md-4">
		</div>
	</div>
	<div class="row">
		<div class="col-md-12">
		</div>
	</div>
</div>


<script src="../Assets/vendor/jquery-3.2.1.min.js"></script>
	<!-- Bootstrap JS-->
	<script src="../Assets/vendor/bootstrap-4.1/popper.min.js"></script>
	<script src="../Assets/vendor/bootstrap-4.1/bootstrap.min.js"></script>
	<!-- Vendor JS       -->
	<script src="../Assets/vendor/slick/slick.min.js">
		
	</script>
	<script src="../Assets/vendor/wow/wow.min.js"></script>
	<script src="../Assets/vendor/animsition/animsition.min.js"></script>
	<script src="../Assets/vendor/bootstrap-progressbar/bootstrap-progressbar.min.js">
		
	</script>
	<script src="../Assets/vendor/counter-up/jquery.waypoints.min.js"></script>
	<script src="../Assets/vendor/counter-up/jquery.counterup.min.js">
		
	</script>
	<script src="../Assets/vendor/circle-progress/circle-progress.min.js"></script>
	<script src="../Assets/vendor/perfect-scrollbar/perfect-scrollbar.js"></script>
	<script src="../Assets/vendor/chartjs/Chart.bundle.min.js"></script>
	<script src="../Assets/vendor/select2/select2.min.js">
		
	</script>

	<!-- Main JS-->
	<script src="../Assets/js/main.js"></script>

	

</body>
</html>