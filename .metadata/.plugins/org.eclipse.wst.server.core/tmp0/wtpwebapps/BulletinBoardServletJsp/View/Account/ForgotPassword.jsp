<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="/common_css.jsp"%>
<style>
.container {
	padding-top: 100px;
}
</style>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card">
					<div class="card-body">
						<form action="<%=request.getContextPath() + "/Account/SendPassword"%>" method="post" class="forgotForm" onsubmit="return validateForm()">
							<h4 class="mb">Forgot Password</h4>
							<p class="mb-3">Please enter your email address to reset your
								password.</p>
							<c:if test="${not empty requestScope.sucessMailSent}">
								<p class="text-success"  style="color: red; margin-bottom: 30px">
									<span class="zmdi-alert-circle" id="successMail"> ${sucessMailSent}</span>
								</p>
								<c:remove var="sucessMailSent" />
							</c:if>
							<c:if test="${not empty requestScope.emailCheckError}">
								<p class="text-danger" style="color: red">
									<span class="mt-2" id="errorMail"> ${emailCheckError}</span>
								</p>
								<c:remove var="emailCheckError" />
							</c:if>
							<div class="form-group">
								<label for="email" class="mb-2">Email : <i
									class="fa fa-envelope icon" aria-hidden="true"></i></label> <input
									name="email" id="email" class="form-control" /> <span id="emailError" class="mt-2"
									style="color: red;"></span>
							</div>
							<div class="form-group pt-3 text-center">
								<button type="submit"
									class="btn btn-outline-primary btn-block" onClick="return validateForm()">Send Mail</button>
							<a href="<%=request.getContextPath() + "/View/Account/Login.jsp"%>" class="btn btn-outline-secondary mx-2 signup-image-link">Back to Login</a>
							</div>
							<div class="text-center mt-3">
								
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script>
		document.getElementById("email").addEventListener("input", function() {
			document.getElementById("emailError").innerHTML = "";
			document.getElementById("errorMail").innerHTML = "";
			document.getElementById("successMail").innerHTML = "";
		});

		function validateForm() {
			var email = document.getElementById("email").value;
			var emailError = document.getElementById("emailError");

			var emailRegex = /^\S+@\S+\.\S+$/;
            console.log("email" + email);
			if (email === "") {
				emailError.innerHTML = "Email is required.";
				return false;
			} 
			else if (!emailRegex.test(email)) {
				emailError.innerHTML = "Invalid Email Format";
				return false;
			} else {
				emailError.innerHTML = "";
			}
		}
	</script>
</body>
</html>