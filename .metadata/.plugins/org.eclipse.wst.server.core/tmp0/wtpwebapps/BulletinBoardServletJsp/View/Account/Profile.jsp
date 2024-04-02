<%@include file="/View/Shared/Header.jsp"%>
<div class="container h-100 mt-5">
	<div class="row justify-content-center align-items-center h-100">
		<div class="col col-sm-12 col-md-12 col-lg-12 col-xl-12">
			<div class="card">
				<div class="card-body">
					<h4 class="mb-3">Edit User</h4>
					<%
					String id = (String) session.getAttribute("userId");
					UserDAO dao = new UserDAO(DBConnect.getConn());
					User st = dao.getUserProfileById(id);
					%>

					<form method="post" action="<%=request.getContextPath() + "/Account/Profile"%>"
						enctype="multipart/form-data" onsubmit="return confirmSubmit();">
						<div class="row">
							<input type="hidden" name="id" value="<%=st.getId()%>"> <input
								type="hidden" name="oldPhoto" value="<%=st.getProfile()%>">
							<div class="col-xl-4 text-center">
								<input type="hidden" id="originalImagePath"
									value="<%=request.getContextPath()%>/assets/profileImage/default.jpg">
								<img id="previewImage"
									src="<%=request.getContextPath()%>/assets/profileImage/<%=st.getProfile()%>"
									class="profileUserImage mb-5" alt="ProfileName" /> <input
									type="file" name="image"
									class="form-control-file text-center w-50 mx-5 mb-5"
									onchange="previewFile()" accept=".png, .jpg, .jpeg">
							</div>
							<div class="col-xl-8">
								<input type="hidden" />
								<div class="row">
									<div class="col">
										<div class="form-floating mb-4">
											<input name="FirstName" id="firstName"
												value="<%=st.getFristName()%>" class="form-control"
												placeholder="john" maxlength="100" /> <label
												for="FirstName">FirstName</label> <span id="firstNameError"
												class="text-danger"></span>
										</div>
									</div>
									<div class="col">
										<div class="form-floating mb-4">
											<input name="LastName" id="lastName"
												value="<%=st.getLastName()%>" class="form-control"
												placeholder="doe" maxlength="100" /> <label for="LastName">LastName</label>
											<span id="lastNameError" class="text-danger"></span>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col">
										<div class="form-floating mb-4">
											<input name="Email" id="email" value="<%=st.getEmail()%>"
												class="form-control" placeholder="xxx@example.com" /> <label
												for="Email">Email</label> <span id="emailError"
												class="text-danger"></span>
										</div>
									</div>
									<div class="col">
										<div class="form-floating mb-4">
											<input name="PhoneNumber" id="phoneNumber"
												value="<%=st.getPhoneNumber()%>" class="form-control"
												placeholder="xxxxxx" /> <label for="PhoneNumber">PhoneNumber</label>
											<span id="phoneNumberError" class="text-danger"></span>
										</div>
									</div>
								</div>
								<div class="row">

									<div class="col">
										<div class="form-floating mb-4">
											<input type="date" id="dob" name="DOB"
												value="<%=st.getDob()%>" class="form-control" /> <label
												for="DOB">Date Of Birth</label> <span id="dobError"
												class="text-danger"></span>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col">
										<div class="form-floating mb-4">
											<textarea name="Address" id="address" class="form-control"
												placeholder="xxxxxx"><%=st.getAddress()%></textarea>
											<label for="Address">Address</label> <span id="addressError"
												class="text-danger"></span>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col text-center">
										<button type="submit" onClick="return validateForm()"
											class="btn btn-outline-dark ">Update Profile</button>
									</div>
								</div>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>
<script src="<%=request.getContextPath() + "/js/profile.js"%>"></script>
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
		<c:if test="${not empty requestScope.succMg}">
		swal.fire({
	        title: 'Success!',
	        text: '<%=(request.getAttribute("succMg"))%>',
	        icon : 'success',
	        showConfirmButton : true
	    }).then((result) => {
	        if (result.isConfirmed) {
	            document.getElementById('viewProfile').click();
	        }
	    });
		</c:if>
	</script>
</body>
</html>