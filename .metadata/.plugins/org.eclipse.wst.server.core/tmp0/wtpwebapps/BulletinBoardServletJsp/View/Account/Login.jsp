<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Login || BulletinBoard</title>
<style>

</style>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath() + "/./css/style.css"%>">
</head>
<body>
	<div class="main">
		<section class="sign-in">
			<div class="container">
				<div class="row cardRow" style="display: flex">
					<div class="col-2 signin-image">
						<img src="<%=request.getContextPath()%>/images/signin-image.jpg"
							alt="sing up image"> <a
							href="<%=request.getContextPath() + "/View/Account/Registration.jsp"%>"
							class="signup-image-link">You don't have any account?</a> <a
							href="<%=request.getContextPath() + "/View/Account/ForgotPassword.jsp"%>"
							class="signup-image-link">Forgot Password</a>
					</div>

					<div class="col-8 signin-form">
						<h2 class="form-title">Sign in</h2>
						<c:if test="${not empty errorMg }">
							<p class="text-center text-danger mb-5"
								style="color: red; margin-bottom: 30px">
								<span class="zmdi-alert-circle"> ${errorMg}</span>
							</p>
							<c:remove var="errorMg" />
						</c:if>
						<form method="post"
							action="<%=request.getContextPath() + "/Account/Login"%>"
							class="register-form" id="login-form">
							<div class="form-group">
								<label for="username"><i class="fa-solid fa-user"></i></label> <input
									type="text" name="username" id="username"
									placeholder="Your Name" /> <span id="username-error"
									style="color: red;"></span>
							</div>
							<div class="form-group">
								<label for="password"><i class="fa-solid fa-lock"></i></label> <input
									type="password" name="password" id="password"
									placeholder="Password" /> <span id="password-error"
									style="color: red;"></span>
							</div>
							<div class="form-group form-button">
								<input type="submit" name="signin" id="signin"
									class="form-submit" onClick="return validateForm()"
									value="Log in" />
							</div>
						</form>
					</div>
				</div>
			</div>
		</section>
	</div>
	<script src="<%=request.getContextPath() + "/js/login.js"%>"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/js/all.min.js"></script>
</body>
</html>