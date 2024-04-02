<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.Connection"%>
<%@ page import="java.util.List"%>
<%@page import="BulletinBoard.Connection.DBConnect"%>
<%@page import="BulletinBoard.DAO.UserDAO"%>
<%@page import="BulletinBoard.Entities.User"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reset Password || BulletinBoard</title>
<style>
.container {
	padding-top: 70px;
}
</style>
<%@include file="/common_css.jsp"%>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-5 offset-md-3">
				<div class="card">
					<div class="card-body">
						<h4 class="mb-2">Reset Password</h4>
						<form method="post" action="<%=request.getContextPath() + "/Account/ResetPassword"%>">
							<div class="form-floating mb-4">
								<input type="hidden" name="email"
									value="<%=request.getParameter("email")%>"> <input
									name="newPassword" type="password" id="newPassword" class="form-control"
									placeholder="xxxxxxx" /> <label for="NewPassword"
									class="form-label">New Password</label>
								<div>
									<span id="newPasswordError" class="text-danger"></span>
								</div>
							</div>

							<div class="form-floating mb-4">
								<input name="confirmPassword" type="password" id="confirmPassword"
									class="form-control" placeholder="xxxxxxx" /> <label
									for="confirmPassword" class="form-label">Confirm
									Password</label>
								<div>
									<span id="confirmPassword" class="text-danger"></span>
								</div>
							</div>
							<div class="form-group pt-3 text-center">
								<button type="submit" onClick="return validateForm()" class="btn btn-outline-primary">Reset
									Password</button>
									<a class="btn btn-outline-secondary mx-2" href="<%=request.getContextPath() + "/View/Account/Login.jsp"%>">Cancel</a>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/11.10.1/sweetalert2.all.min.js"></script>
	<script>
	<c:if test="${not empty requestScope.succMg}">
                                swal.fire({
                                    title: 'Success!',
                                    text: '<%=(request.getAttribute("succMg"))%>',
			                        icon : 'success',
			                        showConfirmButton : true
		}).then((result) => {
	        if (result.isConfirmed) {
	            window.location.href = '<%= request.getContextPath() %>/View/Account/Login.jsp';
	        }
	    });
		</c:if>
		
		<c:if test="${not empty requestScope.errorMg}">
        swal.fire({
            title: 'Success!',
            text: '<%=(request.getAttribute("errorMg"))%>',
			icon : 'success',
			showConfirmButton : true
		});
		</c:if>
		document.getElementById("newPassword").addEventListener("input",
				function() {
					document.getElementById("newPasswordError").innerHTML = "";
				});

		function validateForm() {
			var newPassword = document.getElementById("newPassword").value;
			var confirmPassword = document.getElementById("confirmPassword").value;
			var passwordError = document.getElementById("password-error");
			var passwordRegex = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!%*#?&]{8,}$/;

			if (newPassword === "" || repeatPassword === "") {
				if (newPassword === "") {
					newPasswordError.innerHTML = "Password is required.";
				}
				if (newPassword !== confirmPassword) {
					newPasswordError.innerHTML = "Passwords do not match.";
				}
				if (!passwordRegex.test(newPassword)) {
					newPasswordError.innerHTML = "Password must be at least 8 characters long, contain at least 1 alphabet, and 1 special character.";
				}
				
				return false;
			} else {
				newPasswordError.innerHTML = "";
			}
		}
	</script>
</body>
</html>