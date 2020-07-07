<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Ihealth</title>
	<!--login.css-->
    <LINK REL=StyleSheet HREF="${pageContext.request.contextPath}/assets/styles/login.css" TYPE="text/css" MEDIA=screen>
</head>

<body>
	<!--NavBar-->
    <%@ include file="/assets/html_components/NavBar_1.html" %>
    
	<br>
	<br>
	

	<form action="/ihealth_v2/servletLoginCliente" method="post">
        <div class="login-wrap">
	<div class="login-html">
		<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Ingresar</label>
		<input id="tab-2" type="radio" name="tab" class="for-pwd"><label for="tab-2" class="tab">Olvidé mi contraseña</label>
                
                
                
		<div class="login-form">
			<div class="sign-in-htm">
				<div class="group">
					<label for="user" class="label">Usuario</label>
					<input id="user" name="usuario" type="text" class="input">
				</div>
				<div class="group">
					<label for="pass" class="label">Contraseña</label>
					<input id="pass" name = "contraseña" type="password" class="input" data-type="password">
				</div>
                            
				<div class="group">
					<input type="submit" class="button" value="Ingresar">
				</div>
				<div class="hr"></div>
			</div>
			<div class="for-pwd-htm">
				<div class="group">
					<label for="user" class="label">Usuario o email</label>
					<input id="user" type="text" class="input">
				</div>
				<div class="group">
					<input type="submit" class="button" value="Enviar correo">
				</div>
				<div class="hr"></div>
			</div>
		</div>
                    
               
	</div>
        </div>
            <br><br>
             <br><br>
            
        </form>




	<!--Footer-->
    <%@ include file="/assets/html_components/Footer.html" %>
   
</body>
</html>