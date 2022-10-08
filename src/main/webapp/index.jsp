
<%
if (session.getAttribute("name") ==null){
	
	response.sendRedirect("login.jsp");
}

%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>Welcome</title>
<!-- Font Awesome icons (free version)-->
<script src="https://use.fontawesome.com/releases/v5.15.4/js/all.js"
	crossorigin="anonymous"></script>
<!-- Google fonts-->
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet" type="text/css" />
<link
	href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic"
	rel="stylesheet" type="text/css" />
<!-- Bootstrap)-->
<link href="css/index-styles.css" rel="stylesheet" />
</head>
<body id="page-top">
	<!-- Navigation-->
	<nav
		class="navbar navbar-expand-lg bg-black text-uppercase"
		id="mainNav">
		<div class="container">
			<a class="navbar-brand" href="#page-top">Java Developer</a>
			<button
				class="navbar-toggler text-uppercase font-weight-bold bg-primary text-white rounded"
				type="button" data-bs-toggle="collapse"
				data-bs-target="#navbarResponsive" aria-controls="navbarResponsive"
				aria-expanded="false" aria-label="Toggle navigation">
				Menu <i class="fas fa-bars"></i>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ms-auto">
					<li class="nav-item mx-0 mx-lg-1"><a
						class="nav-link py-3 px-0 px-lg-3 rounded" href="#about">Tutorial</a></li>
					<li class="nav-item mx-0 mx-lg-1"><a
						class="nav-link py-3 px-0 px-lg-3 rounded" href="#contact">contact</a></li>
					<li class="nav-item mx-0 mx-lg-1"><a
						class="nav-link py-3 px-0 px-lg-3 rounded" href="logout">Signout</a></li>
					<li class="nav-item mx-0 mx-lg-1 bg-warning rounded"><a
						class="nav-link py-3 px-0 px-lg-3 rounded" href="logout"><%=session.getAttribute("name")%></li>
					
				</ul>
			</div>
		</div>
	</nav>
	
	<header class="masthead bg-danger text-white text-center">
		<div class="container d-flex align-items-center flex-column">
			
			<h1 class="masthead-heading text-uppercase mb-0"> Welcome Here ..!</h1>
			<!-- Icon Divider-->
			<div class="divider-custom divider-light">
				<div class="divider-custom-line"></div>
				</div>
				
				<hr>
			</div>
			<h1 class="masthead-subheading font-weight-500 mb-0 text-black">
				Explore | JSP | JDBC | SERVLET | MySQL </h1>
		</div>
	</header>
	

	<!-- Footer-->
	<footer class="footer text-center bg-pink">
		<div class="container">
			<div class="row align-items-center">
				<!-- Footer About Text-->
				<div class=" align-items-center">
					<h1 class="text-uppercase mb-4 ">THANK YOU!</h1>
					<p class="lead mb-5 text-uppercase">
					For visiting this website !
					</p>
				</div>
			</div>
		</div>
	</footer>
	<!-- Copyright Section-->
	<div class="copyright py-4 text-center text-white bg-black">
		<div class="container">
			<small>Copyright &copy; All Right Reseved 2022 | Mazharul Shameem</small>
		</div>
	</div>
	
	
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Core theme JS-->
	<script src="js/scripts.js"></script>
	
	<script src="https://cdn.startbootstrap.com/sb-forms-latest.js"></script>
</body>
</html>
