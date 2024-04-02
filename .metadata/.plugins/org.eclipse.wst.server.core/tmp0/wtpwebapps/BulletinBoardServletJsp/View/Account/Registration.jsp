<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Register Page || BulletinBoard</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">
<link rel="stylesheet"
	href="fonts/material-icon/css/material-design-iconic-font.min.css">

<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath() + "/./css/style.css"%>">
</head>
<body>
	<div class="main">
		<section class="signup">
			<div class="container">
				<div class="row" style="display: flex">
					<div class="col-3 signup-form">
						<h2 class="form-title">Sign up</h2>
						<c:if test="${not empty requestScope.emailCheck }">
							<p class="text-center text-success"
								style="color: red; margin-bottom: 20px">
								<span class="zmdi-alert-circle"> ${emailCheck}</span>
							</p>
						</c:if>
						<form method="post"
							action="<%=request.getContextPath() + "/Account/Registration"%>"
							class="register-form" id="register-form">

							<div class="form-group">
								<label for="name"><i class="fa-solid fa-user"></i></label> <input
									type="text" value="${param.firstName}" name="firstName"
									id="firstName" placeholder="Your First Name" /> <span
									class="invalid-feedback" id="firstName-error"
									style="color: red;"></span>
							</div>
							<div class="form-group">
								<label for="name"><i class="fa-regulaer fa-user"></i></label> <input
									type="text" value="${param.lastName}" name="lastName"
									id="lastName" placeholder="Your Last Name" /> <span
									id="lastName-error" style="color: red;"></span>
							</div>

							<div class="form-group">
								<label for="address"><i class="fa-solid fa-address-book"></i></label>
								<input type="text" value="${param.address}" name=address
									id="address" placeholder="Your Address" /> <span
									id="address-error" style="color: red;"></span>
							</div>

							<div class="form-group">
								<label for="email"><i class="fa-solid fa-envelope"></i></label>
								<input type="email" value="${param.email}" name="email"
									id="email" placeholder="Your Email" /> <span id="email-error"
									style="color: red;"></span>
							</div>
							<div class="form-group">
								<label class="form-label"><i
									class="fa-regular fa-calendar-days"></i></label> <input type="date"
									value="${param.dob}" name="dob" id="dob" class="form-control"
									placeholder="Your Dath of Birth" /> <span id="dob-error"
									style="color: red;"></span>
							</div>
							<div class="form-group">
								<label for="pass"><i class="fa-solid fa-lock"></i></label> <input
									type="password" value="${param.pass}" name="pass"
									class="form-control" id="pass" placeholder="Password" /> <span
									id="password-error" style="color: red;"></span>
							</div>
							<div class="form-group">
								<label for="re-pass"><i class="fa-regular fa-lock"></i></label>
								<input type="password" value="${param.re_pass}" name="re_pass"
									id="re_pass" placeholder="Repeat your password" /> <span
									id="repassword-error" style="color: red;"></span>
							</div>
							<div class="form-group">
								<label for="contact"><i class="fa-solid fa-mobile"></i></label>
								<input type="text" value="${param.contact}" name="contact"
									id="contact" placeholder="Contact no" /> <span
									id="contact-error" style="color: red;"></span>
							</div>
							<div class="form-group form-button">
								<input type="submit" name="signup" id="signup"
									class="form-submit" onClick="return validateForm()"
									value="Register" />
							</div>
						</form>
					</div>
					<div class="col-9 signup-image">
						<figure>
							<img src="<%=request.getContextPath()%>/images/signup-image.jpg"
								alt="sing up image">
						</figure>
						<a
							href="<%=request.getContextPath() + "/View/Account/Login.jsp"%>"
							class="signup-image-link">I am already member</a>
					</div>
				</div>
			</div>
		</section>
	</div>

	<script src="<%=request.getContextPath() + "/js/registerAccount.js"%>"></script>
	<script src="vendor/jquery/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/js/all.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/11.10.1/sweetalert2.all.min.js"></script>
	<script src="<%=request.getContextPath() + "/./js/main.js"%>"></script>
	<script>
	
	<c:if test="${not empty requestScope.errorMg}">
    swal.fire({
        title: 'Error has occur!',
        text: '<%=(request.getAttribute("errorMg"))%>',
		icon : 'error',
		showConfirmButton : true
		});
		</c:if>
	
		<c:if test="${not empty requestScope.succMg}">
	    swal.fire({
	        title: 'Your Account is Successfully registered!',
	        text: '<%=(request.getAttribute("succMg"))%>',
	        icon: 'success',
	        showConfirmButton: true
	    }).then((result) => {
	        if (result.isConfirmed) {
	            window.location.href = '<%=request.getContextPath()%>/View/Account/Login.jsp';
	        }
	    });
	</c:if>
	</script>
</body>
</html>