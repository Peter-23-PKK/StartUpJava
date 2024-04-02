<%@include file="/View/Shared/Header.jsp"%>
<div class="container h-100 mt-5">
	<div class="row justify-content-center align-items-center h-100">
		<div class="col col-sm-12 col-md-12 col-lg-12 col-xl-12">
			<div class="card">
				<div class="card-body">
					<h4 class="mb-3">Edit User</h4>
					<%
					String id = request.getParameter("id");
					UserDAO dao = new UserDAO(DBConnect.getConn());
					User st = dao.getUserById(id);
					%>
					<form action="<%=request.getContextPath() + "/User/Edit"%>"
						method="post" onsubmit="return confirmSubmit()"
						enctype="multipart/form-data">
						<input type="hidden" name="id" value="<%=st.getId()%>"> <input
							type="hidden" name="oldPhoto" value="<%=st.getProfile()%>">
						<div class="row">
							<div class="col">
								<div class="form-floating mb-4">
									<input name="FirstName" id="firstName"
										value="<%=st.getFristName()%>" class="form-control"
										placeholder="john" maxlength="100" /> <label for="FirstName">First
										Name</label> <span id="firstNameError" style="color: red;"></span>
								</div>
							</div>
							<div class="col">
								<div class="form-floating mb-4">
									<input name="LastName" id="lastName"
										value="<%=st.getLastName()%>" class="form-control"
										placeholder="doe" maxlength="100" /> <label for="LastName">Last
										Name</label> <span id="lastNameError" style="color: red;"></span>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col">
								<div class="form-floating mb-4">
									<input name="Email" id="email" value="<%=st.getEmail()%>"
										class="form-control" id="email" placeholder="xxx@example.com" />
									<label for="Email">Email</label> <span id="emailError"
										style="color: red;"></span>
								</div>
							</div>
							<div class="col">
								<div class="form-floating mb-4">
									<input name="PhoneNumber" id="phoneNumber"
										value="<%=st.getPhoneNumber()%>" class="form-control"
										placeholder="xxxxxx" /> <label for="PhoneNumber">Phone
										Number</label> <span id="phoneNumberError" style="color: red;"></span>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col">
								<div class="form-floating mb-4">
									<select class="form-select" id="role" name="role">
										<option value="">Selected Role</option>
										<option value="1" <%=(st.getRole() == 1) ? "selected" : ""%>>Admin</option>
										<option value="2" <%=(st.getRole() == 2) ? "selected" : ""%>>User</option>
									</select> <label for="Role">Role</label> <span id="roleError"
										style="color: red;"></span>
								</div>
							</div>
							<div class="col">
								<div class="form-floating mb-4">
									<input type="date" name="DOB" id="dob" value="<%=st.getDob()%>"
										class="form-control" /> <label for="DOB">Date of
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
										src="<%=request.getContextPath()%>/assets/profileImage/<%=st.getProfile()%>"
										class="profileImage mb-5" alt="ProfileName" /> <input
										type="file" name="image"
										class="form-control-file text-center w-50 mx-5 mb-5"
										onchange="previewFile()" accept=".png, .jpg, .jpeg"><br>
								</div>
							</div>
							<div class="col">
								<div class="form-floating mb-4">
									<textarea name="Address" id="address" class="form-control"
										placeholder="xxxxxx"><%=st.getAddress()%></textarea>
									<label for="Address">Address</label> <span id="addressError"
										style="color: red;"></span>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col">
								<button type="submit" class="btn btn-outline-success "
									onClick="return validateForm()">Update</button>
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
<script
	src="<%=request.getContextPath() + "/js/updateFormValidation.js"%>"></script>
<%@include file="/View/Shared/Footer.jsp"%>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/11.10.1/sweetalert2.all.min.js"></script>
<script>
	<c:if test="${not empty requestScope.emailCheck}">
                            swal.fire({
                                title: 'Already Exist!',
                                text: '<%=(request.getAttribute("emailCheck"))%>',
		                        icon : 'warning',
		                        showConfirmButton : true
	});
	</c:if>
</script>
</body>
</html>