<%@include file="/View/Shared/Header.jsp"%>
<div class="container h-100 mt-5">
	<div class="row justify-content-center align-items-center h-100">
		<div class="col col-sm-12 col-md-12 col-lg-6 col-xl-6">
			<div class="card">
				<div class="card-body">
					<h5 class="mb-3 text-center">Change Password</h5>
					<c:if test="${not empty requestScope.incorrectPassword}">
						<p class="text-center" style="color: red;">${incorrectPassword}</p>
					</c:if>
					<form method="post"
						action="<%=request.getContextPath() + "/Account/ChangePassword"%>"
						onSubmit="return validateForm()">
						<div class="form-floating mb-4">
							<input type="password" ${param.oldPassword} class="form-control"
								placeholder="xxxxxxx" id="oldPassword" name="oldPassword" /> <label
								for="OldPassword" class="form-label">Old Password</label>
							<div>
								<span id="oldPasswordError" class="text-danger"></span>
							</div>
						</div>
						<div class="form-floating mb-4">
							<input type="password" ${param.newPassword} class="form-control"
								placeholder="xxxxxxx" id="newPassword" name="newPassword" /> <label
								for="Password" class="form-label">Password</label>
							<div>
								<span id="newPasswordError" class="text-danger"></span>
							</div>
						</div>
						<div class="form-floating mb-4">
							<input type="password" ${param.confirmPassword}
								id="confirmPassword" class="form-control" placeholder="xxxxxxx"
								name="confirmPassword" /> <label for="ConfirmPassword"
								class="form-label">Confirm Password</label>
							<div>
								<span id="confirmPasswordError" class="text-danger"></span>
							</div>
						</div>
						<div>
							<button onClick="return validateForm()" type="submit"
								class="btn btn-outline-dark">Change Password</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>
<script src="<%=request.getContextPath() + "/js/changePassword.js"%>"></script>
<%@include file="/View/Shared/Footer.jsp"%>
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
			        title: 'Successfully Change Password!',
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