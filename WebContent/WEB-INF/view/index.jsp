<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Ihealth</title>
	<!--Bootstrap-->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>        

</head>
<body>
 
	<!--NavBar-->
    <%@ include file="/assets/html_components/NavBar_1.html" %>

    <!--titulo principal-->
    <br>
    <h2 class="text-info">Bienvenido al portal para pacientes Ihealth</h2>
    <br>



    <!--Carrusel-->
    <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
          <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
          <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
          <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner">
          <div class="carousel-item active">
            <img class="d-block w-100" src="${pageContext.request.contextPath}/assets/images/ABC1.jpg" alt="First slide">
            <div class="carousel-caption d-none d-md-block">
                <h5>Centro Santa Fe</h5>
                <p>Hospitales de alta especialidad en CDMX</p>
            </div>
          </div>
          <div class="carousel-item">
            <img class="d-block w-100" src="${pageContext.request.contextPath}/assets/images/ABC2.jpg" alt="Second slide">
            <div class="carousel-caption d-none d-md-block">
                <h5>Centro Interlomas</h5>
                <p>Hospitales de alta especialidad en CDMX</p>
            </div>
          </div>
          <div class="carousel-item">
            <img class="d-block w-100" src="${pageContext.request.contextPath}/assets/images/ABC3.jpg" alt="Third slide">
            <div class="carousel-caption d-none d-md-block">
                <h5>Centro del alta especialidad</h5>
                <p>Hospitales de alta especialidad en CDMX</p>
            </div>
          </div>
        </div>
        <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
    <br>


    <!--Texto informativo-->
    <div class="container" style="text-align: center;">
        <h1 class = "text-info">¿Qué es coronavirus?</h1>
        <p class="text-secondary">Los coronavirus son una familia de virus que se descubrió en la década de los 60 pero cuyo
            origen es todavía desconocido. Sus diferentes tipos provocan distintas enfermedades, desde un resfriado hasta 
            un síndrome respiratorio grave (una forma grave de neumonía).
        </p>
    </div>
    <br>
    

    <!--Cards-->
    <div class="container">
        <div class="row">
           <div class="card" style="width: 18rem;">
                <img class="card-img-top" src="${pageContext.request.contextPath}/assets/images/eventos.jpg" alt="Card image cap">
                <div class="card-body">
                    <h5 class="card-title">Eventos</h5>
                    <p class="card-text">Consulta los eventos que prepatamos preparados para ti.</p>
                    <a href="/ihealth_v2/servletPaginaEventos" class="btn btn-info">Consultar!</a>
                </div>
            </div>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <div class="card" style="width: 18rem;">
                <img class="card-img-top" src="${pageContext.request.contextPath}/assets/images/hospital.jpg" alt="Card image cap">
                <div class="card-body">
                    <h5 class="card-title">Instalaciones</h5>
                    <p class="card-text">Conoce nuestras instalaciones.</p>
                    <a href="/ihealth_v2/servletInstalaciones" class="btn btn-info">Consultar!</a>
                </div>
          </div>
        </div>
    </div>
    <br>
    <br>
    <br>
    <br>
    
    <!--Footer-->
    <%@ include file="/assets/html_components/Footer.html" %>
        
</body>
</html>