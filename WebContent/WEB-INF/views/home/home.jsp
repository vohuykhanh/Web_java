
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html lang="en">

<meta http-equiv="content-type" content="text/html;charset=UTF-8" />
<head>
<title>OneTech</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="OneTech shop project">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="resources/styles/bootstrap4/bootstrap.min.css">
<link href="resources/plugins/fontawesome-free-5.0.1/css/fontawesome-all.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="resources/plugins/OwlCarousel2-2.2.1/owl.carousel.css">
<link rel="stylesheet" type="text/css" href="resources/plugins/OwlCarousel2-2.2.1/owl.theme.default.css">
<link rel="stylesheet" type="text/css" href="resources/plugins/OwlCarousel2-2.2.1/animate.css">
<link rel="stylesheet" type="text/css" href="resources/plugins/slick-1.8.0/slick.css">
<link rel="stylesheet" type="text/css" href="resources/styles/main_styles.css">
<link rel="stylesheet" type="text/css" href="resources/styles/responsive.css">

</head>

<body>

<div class="super_container">
	
	<!-- Header -->
	<jsp:include page="../share/header.jsp"/>

	<!-- Banner -->
	<jsp:include page="banner.jsp"/>
	
	<!-- Characteristics -->
	<jsp:include page="characteristics.jsp"/>

	<!-- Deals of the week -->
	<jsp:include page="deals_featured.jsp"/>
	
	<!-- Popular Categories -->
	<jsp:include page="popular_categories.jsp"/>
	
	<!-- Banner -->
	<jsp:include page="banner_2.jsp"/>
	
	<!-- Hot New Arrivals -->
	<jsp:include page="new_arrivals.jsp"/>
	
	<!-- Best Sellers -->
	<jsp:include page="best_sellers.jsp"/>
	
	<!-- Adverts -->
	<jsp:include page="adverts.jsp"/>
	
	<!-- Trends -->
	<jsp:include page="trends.jsp"/>
	
	<!-- Reviews -->
	<jsp:include page="reviews.jsp"/>
	
	<!-- Recently Viewed -->
	<jsp:include page="viewed.jsp"/>
	
	<!-- Brands -->
	<jsp:include page="brands.jsp"/>
	
	<!-- Newsletter -->
	<jsp:include page="newsletter.jsp"/>
	
	<!-- Footer -->
	<jsp:include page="../share/footer.jsp"/>

</div>

<script src="resources/js/jquery-3.3.1.min.js"></script>
<script src="resources/styles/bootstrap4/popper.js"></script>
<script src="resources/styles/bootstrap4/bootstrap.min.js"></script>
<script src="resources/plugins/greensock/TweenMax.min.js"></script>
<script src="resources/plugins/greensock/TimelineMax.min.js"></script>
<script src="resources/plugins/scrollmagic/ScrollMagic.min.js"></script>
<script src="resources/plugins/greensock/animation.gsap.min.js"></script>
<script src="resources/plugins/greensock/ScrollToPlugin.min.js"></script>
<script src="resources/plugins/OwlCarousel2-2.2.1/owl.carousel.js"></script>
<script src="resources/plugins/slick-1.8.0/slick.js"></script>
<script src="resources/plugins/easing/easing.js"></script>
<script src="resources/js/custom.js"></script>

<!-- Global site tag (gtag.js) - Google Analytics -->
<script async src="https://www.googletagmanager.com/gtag/js?id=UA-23581568-13"></script>
<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());

  gtag('config', 'UA-23581568-13');
</script>

</body>