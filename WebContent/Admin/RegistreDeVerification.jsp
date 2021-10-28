<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.pfe.Models.*"%>
<%@ page import="java.text.DateFormat"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Date"%>
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
<title>Registre De verification des engins</title>

<!-- Fontfaces CSS-->
<link href="../Assets/css/font-face.css" rel="stylesheet" media="all">
<link href="../Assets/vendor/font-awesome-4.7/css/font-awesome.min.css"
	rel="stylesheet" media="all">
<link href="../Assets/vendor/font-awesome-5/css/fontawesome-all.min.css"
	rel="stylesheet" media="all">
<link
	href="../Assets/vendor/mdi-font/css/material-design-iconic-font.min.css"
	rel="stylesheet" media="all">

<!-- Bootstrap CSS-->
<link href="../Assets/vendor/bootstrap-4.1/bootstrap.min.css"
	rel="stylesheet" media="all">

<!-- Vendor CSS-->
<link href="../Assets/vendor/animsition/animsition.min.css"
	rel="stylesheet" media="all">
<link
	href="../Assets/vendor/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css"
	rel="stylesheet" media="all">
<link href="../Assets/vendor/wow/animate.css" rel="stylesheet"
	media="all">
<link href="../Assets/vendor/css-hamburgers/hamburgers.min.css"
	rel="stylesheet" media="all">
<link href="../Assets/vendor/slick/slick.css" rel="stylesheet"
	media="all">
<link href="../Assets/vendor/select2/select2.min.css" rel="stylesheet"
	media="all">
<link href="../Assets/vendor/perfect-scrollbar/perfect-scrollbar.css"
	rel="stylesheet" media="all">

<!-- Main CSS-->
<link href="../Assets/css/theme.css" rel="stylesheet" media="all">

</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-8">
				<h3 class="text-center text-primary">remplir le registre de
					verification des engins</h3>
				<form role="form" action="../AddRapportVerification" method="post">

					<%
						RegistreDeVerificationDesEngins rda = (RegistreDeVerificationDesEngins) request
								.getAttribute("RegistreDeVerificationDesEngins");
					%>
					<%
						Date lyoum = new Date();
						DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
						String dte = dateFormat.format(lyoum);
					%>
					<div class="form-group">
						<table class="table">
							<tr>
								<td><label for="nomAction"> Id Engin: </label> <input
									type="text" class="form-control" id="Id_Engin" name="Id_Engin"
									required></td>
								<td><label for="nomAction"> Numero: </label> <input
									type="text" class="form-control" id="idEmployer" name="numero"
									required></td>
							</tr>
							<tr>
								<td><label for="zone"> Matricule: </label> <input
									type="text" class="form-control" id="causeAccident"
									name="matricule"></td>
								<td><label for="zone"> Marque: </label> <input type="text"
									class="form-control" id="causeAccident" name="marque">
								</td>
							</tr>
							<tr>
								<td><label for="zone"> Model: </label> <input type="text"
									class="form-control" id="causeAccident" name="model"></td>
								<td><label for="zone"> Nom Chauffeur: </label> <input
									type="text" class="form-control" id="causeAccident"
									name="chauffeur"></td>
							</tr>
							<tr>
								<td><label for="zone"> Lieu Intervention: </label> <input
									type="text" class="form-control" id="causeAccident"
									name="lieuInter"></td>
								<td><label for="1234"> Date Entrée: </label> <input
									type="date" class="form-control" id="date" name="dateEntre"
									value="<%out.print(dte);%>"></td>
							</tr>
							<tr>
								<td><label for="1234"> Date sortie: </label> <input
									type="date" class="form-control" id="date" name="dateSortie"
									value="<%out.print(dte);%>"></td>
								<td><label for="zone"> Entreprise Propritaire: </label> <input
									type="text" class="form-control" id="causeAccident"
									name="EntrProp"></td>
							</tr>
						</table>
					</div>
					<div class="container-fluid form-group">
						<table class="table">
							<tr>
								<th>Vérification jour d’entrée</th>
								<th>OK</th>
								<th>NOK</th>
								<th>NAP</th>
								<th>Observation</th>
							</tr>
							<tr>
								<td>Certificat de contrôle par organisme agréé par l’état
									tunisien</td>
								<td><input class="form-control" type="radio" name="1E" value="ok"></td>
								<td><input class="form-control" type="radio" name="1E" value="nok"></td>
								<td><input class="form-control" type="radio" name="1E" value="nap" checked="checked"></td>
								<td><input class="form-control" type="text" name="1O"></td>
							</tr>
							<tr>
								<td>Visite technique et registre d’entretien de l’engin</td>
								<td><input class="form-control" type="radio" name="2E" value="ok"></td>
								<td><input class="form-control" type="radio" name="2E" value="nok"></td>
								<td><input class="form-control" type="radio" name="2E" value="nap" checked="checked"></td>
								<td><input class="form-control" type="text" name="2O"></td>
							</tr>
							<tr>
								<td>Assurance</td>
								<td><input class="form-control" type="radio" name="3E" value="ok"></td>
								<td><input class="form-control" type="radio" name="3E" value="nok"></td>
								<td><input class="form-control" type="radio" name="3E" value="nap" checked="checked"></td>
								<td><input class="form-control" type="text" name="3O"></td>
							</tr>
							<tr>
								<td>Etat de la cabine et son accès</td>
								<td><input class="form-control" type="radio" name="4E" value="ok"></td>
								<td><input class="form-control" type="radio" name="4E" value="nok"></td>
								<td><input class="form-control" type="radio" name="4E" value="nap" checked="checked"></td>
								<td><input class="form-control" type="text" name="4O"></td>
							</tr>
							<tr>
								<td>Climatisation de la cabine</td>
								<td><input class="form-control" type="radio" name="5E" value="ok"></td>
								<td><input class="form-control" type="radio" name="5E" value="nok"></td>
								<td><input class="form-control" type="radio" name="5E" value="nap" checked="checked"></td>
								<td><input class="form-control" type="text" name="5O"></td>
							</tr>
							<tr>
								<td>Protection de la cabine Renforçage de la structure
									(FOPS)</td>
								<td><input class="form-control" type="radio" name="6E" value="ok"></td>
								<td><input class="form-control" type="radio" name="6E" value="nok"></td>
								<td><input class="form-control" type="radio" name="6E" value="nap" checked="checked"></td>
								<td><input class="form-control" type="text" name="6O"></td>
							</tr>
							<tr>
								<td>Protection de la cabine Protection avec des grillages
									(ROPS)</td>
								<td><input class="form-control" type="radio" name="7E" value="ok"></td>
								<td><input class="form-control" type="radio" name="7E" value="nok"></td>
								<td><input class="form-control" type="radio" name="7E" value="nap" checked="checked"></td>
								<td><input class="form-control" type="text" name="7O"></td>
							</tr>
							<tr>
								<td>Ceinture de sécurité pour chauffeur</td>
								<td><input class="form-control" type="radio" name="8E" value="ok"></td>
								<td><input class="form-control" type="radio" name="8E" value="nok"></td>
								<td><input class="form-control" type="radio" name="8E" value="nap" checked="checked"></td>
								<td><input class="form-control" type="text" name="8O"></td>
							</tr>
							<tr>
								<td>Pour les engins sans cabine présence des renforcements
									contre les renversements</td>
								<td><input class="form-control" type="radio" name="9E" value="ok"></td>
								<td><input class="form-control" type="radio" name="9E" value="nok"></td>
								<td><input class="form-control" type="radio" name="9E" value="nap" checked="checked"></td>
								<td><input class="form-control" type="text" name="9O"></td>
							</tr>
							<tr>
								<td>Avertisseur sonore audible pour marche arrière</td>
								<td><input class="form-control" type="radio" name="10E" value="ok"></td>
								<td><input class="form-control" type="radio" name="10E" value="nok"></td>
								<td><input class="form-control" type="radio" name="10E" value="nap" checked="checked"></td>
								<td><input class="form-control" type="text" name="10O"></td>
							</tr>
							<tr>
								<td>Gyrophares visible et en bon état de marche</td>
								<td><input class="form-control" type="radio" name="11E" value="ok"></td>
								<td><input class="form-control" type="radio" name="11E" value="nok"></td>
								<td><input class="form-control" type="radio" name="11E" value="nap" checked="checked"></td>
								<td><input class="form-control" type="text" name="11O"></td>
							</tr>
							<tr>
								<td>Les feux de route de l'engin en très bon état</td>
								<td><input class="form-control" type="radio" name="12E" value="ok"></td>
								<td><input class="form-control" type="radio" name="12E" value="nok"></td>
								<td><input class="form-control" type="radio" name="12E" value="nap" checked="checked"></td>
								<td><input class="form-control" type="text" name="12O"></td>
							</tr>
							<tr>
								<td>Etat des gente et des pneus</td>
								<td><input class="form-control" type="radio" name="13E" value="ok"></td>
								<td><input class="form-control" type="radio" name="13E" value="nok"></td>
								<td><input class="form-control" type="radio" name="13E" value="nap" checked="checked"></td>
								<td><input class="form-control" type="text" name="13O"></td>
							</tr>
							<tr>
								<td>Les boutons de tableau de bord sont visibles et lisible</td>
								<td><input class="form-control" type="radio" name="14E" value="ok"></td>
								<td><input class="form-control" type="radio" name="14E" value="nok"></td>
								<td><input class="form-control" type="radio" name="14E" value="nap" checked="checked"></td>
								<td><input class="form-control" type="text" name="14O"></td>
							</tr>
							<tr>
								<td>Présence des protections pour les pièces mobiles de
									l’engin</td>
								<td><input class="form-control" type="radio" name="14E" value="ok"></td>
								<td><input class="form-control" type="radio" name="15E" value="nok"></td>
								<td><input class="form-control" type="radio" name="15E" value="nap" checked="checked"></td>
								<td><input class="form-control" type="text" name="15O"></td>
							</tr>
							<tr>
								<td>Etat visuelle des éléments de levage (câble, chaîne,
									crochets de sécurité, etc.)</td>
								<td><input class="form-control" type="radio" name="16E" value="ok"></td>
								<td><input class="form-control" type="radio" name="16E" value="nok"></td>
								<td><input class="form-control" type="radio" name="16E" value="nap" checked="checked"></td>
								<td><input class="form-control" type="text" name="16O"></td>
							</tr>
							<tr>
								<td>Stabilisateurs en bon état de fonctionnement.
									(Information de chauffeur)</td>
								<td><input class="form-control" type="radio" name="17E" value="ok"></td>
								<td><input class="form-control" type="radio" name="17E" value="nok"></td>
								<td><input class="form-control" type="radio" name="17E" value="nap" checked="checked"></td>
								<td><input class="form-control" type="text" name="17O"></td>
							</tr>
							<tr>
								<td>Freins en bon état de fonctionnement. (Information de
									chauffeur)</td>
								<td><input class="form-control" type="radio" name="18E" value="ok"></td>
								<td><input class="form-control" type="radio" name="18E" value="nok"></td>
								<td><input class="form-control" type="radio" name="18E" value="nap" checked="checked"></td>
								<td><input class="form-control" type="text" name="18O"></td>
							</tr>
							<tr>
								<td>Présence des extincteurs</td>
								<td><input class="form-control" type="radio" name="19E" value="ok"></td>
								<td><input class="form-control" type="radio" name="19E" value="nok"></td>
								<td><input class="form-control" type="radio" name="19E" value="nap" checked="checked"></td>
								<td><input class="form-control" type="text" name="19O"></td>
							</tr>
							<tr>
								<td>Fuite des huiles</td>
								<td><input class="form-control" type="radio" name="20E" value="ok"></td>
								<td><input class="form-control" type="radio" name="20E" value="nok"></td>
								<td><input class="form-control" type="radio" name="20E" value="nap" checked="checked"></td>
								<td><input class="form-control" type="text" name="20O"></td>
							</tr>
							<tr>
								<td>Clackson en bon état de fonctionnement</td>
								<td><input class="form-control" type="radio" name="21E" value="ok"></td>
								<td><input class="form-control" type="radio" name="21E" value="nok"></td>
								<td><input class="form-control" type="radio" name="21E" value="nap" checked="checked"></td>
								<td><input class="form-control" type="text" name="21O"></td>
							</tr>
						</table>
					</div>
					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
			</div>
			<div class="col-md-2"></div>
		</div>
	</div>
</body>
</html>