<%@include file="/View/Shared/Header.jsp"%>
<div class="container h-100 mt-5">
	<div class="row justify-content-center align-items-center h-100">
		<div class="col col-sm-12 col-md-12 col-lg-12 col-xl-12">
			<div class="card">
				<div class="card-body">
					<h4 class="mb-3">Create User</h4>
					<form action="<%=request.getContextPath() + "/User/Create"%>"
						method="post" onsubmit="return confirmSubmit();"
						enctype="multipart/form-data">
						<input type="hidden" name="id">
						<div class="row">
							<div class="col">
								<div class="form-floating mb-4">
									<input name="FirstName" value="${param.FirstName}"
										id="firstName" class="form-control" placeholder="john"
										maxlength="100" /> <label for="FirstName">First Name</label>
									<span id="firstNameError" style="color: red;"></span>
								</div>
							</div>
							<div class="col">
								<div class="form-floating mb-4">
									<input name="LastName" value="${param.LastName}" id="lastName"
										class="form-control" placeholder="doe" maxlength="100" /> <label
										for="LastName">Last Name</label> <span id="lastNameError"
										style="color: red;"></span>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col">
								<div class="form-floating mb-4">
									<input type="password" value="${param.pass}" name="pass"
										id="pass" class="form-control" placeholder="xxxxxxxxx"
										maxlength="100" /> <label for="pass">Password </label> <span
										id="passwordError" style="color: red;"></span>
								</div>
							</div>
							<div class="col">
								<div class="form-floating mb-4">
									<input type="password" value="${param.re_pass}" name="re_pass"
										id="re_pass" class="form-control"
										placeholder="Repeat your password" /> <label for="re_pass">Repeat
										your password</label> <span id="re_pass" style="color: red;"></span>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col">
								<div class="form-floating mb-4">
									<input name="email" value="${param.email}" class="form-control"
										id="email" placeholder="xxx@example.com" /> <label
										for="email">Email</label> <span id="emailError"
										style="color: red;"></span>
								</div>
							</div>
							<div class="col">
								<div class="form-floating mb-4">
									<input name="phoneNumber" value="${param.phoneNumber}"
										id="phoneNumber" class="form-control" placeholder="xxxxxx" />
									<label for="phoneNumber">Phone Number</label> <span
										id="phoneNumberError" style="color: red;"></span>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col">
								<div class="form-floating mb-4">
									<select class="form-select" id="role" name="role">
										<option value="">Selected Role</option>
										<option value="1" ${param.role == '1' ? 'selected' : ''}>Admin</option>
										<option value="2" ${param.role == '2' ? 'selected' : ''}>User</option>
									</select> <label for="role">Role</label> <span id="roleError"
										style="color: red;"></span>
								</div>
							</div>
							<div class="col">
								<div class="form-floating mb-4">
									<input type="date" value="${param.dob}" name="dob" id="dob"
										class="form-control" /> <label for="dob">Date of
										Birth</label> <span id="dobError" style="color: red;"></span>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col">
								<div class="form-floating mb-4">
									<input type="hidden" id="originalImagePath"
										value="<%=request.getContextPath()%>/assets/profileImage/default.jpg">
									<img id="previewImage"
										src="<%=request.getContextPath()%>/assets/profileImage/default.jpg"
										class="profileImage mb-5" alt="ProfileName" /> <input
										type="file" name="image"
										class="form-control-file text-center w-50 mx-5 mb-5"
										onchange="previewFile()" accept=".png, .jpg, .jpeg"><br>
								</div>
							</div>
							<div class="col">
								<div class="form-floating mb-4">
									<textarea name="address" id="address" class="form-control"
										placeholder="xxxxxx">${param.address}</textarea>
									<label for="address">Address</label> <span id="addressError"
										style="color: red;"></span>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col">
								<button type="submit" class="btn btn-outline-success "
									onClick="return validateForm()">Create</button>
								<a class="btn btn-outline-primary mx-2"
									href="<%=request.getContextPath() + "/View/User/Index.jsp"%>">Cancel</a>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>
<script src="<%=request.getContextPath() + "/js/formValidation.js"%>"></script>
<%@include file="/View/Shared/Footer.jsp"%>
<script>
	<c:if test="${not empty requestScope.emailCheck}">
    swal.fire({
        title: 'Already Exist!',
        text: '<%=(request.getAttribute("emailCheck"))%>',
        icon : 'warning',
        showConfirmButton : true
});
</c:if>
function confirmSubmit() {
	event.preventDefault();
	swal.fire({
		title: 'Are you sure?',
		text: 'Do you really want to save the user data?',
		icon: 'warning',
		showCancelButton: true,
		confirmButtonColor: '#3085d6',
		cancelButtonColor: '#d33',
		confirmButtonText: 'Yes, Save it!'
	}).then((result) => {
		if (result.isConfirmed) {
			document.forms[0].submit();
		}
	});
}
    </script>
