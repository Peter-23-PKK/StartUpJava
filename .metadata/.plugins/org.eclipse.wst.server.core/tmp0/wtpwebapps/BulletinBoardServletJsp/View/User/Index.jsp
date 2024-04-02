<%@include file="/View/Shared/Header.jsp"%>
	<div class="container" style="margin-top: 50px">
		<div class="row">
			<div class="col-md-12">
				<div class="card">
					<div class="card-body">
						<div class="row">
							<div class="col mb-3">
								<a class="btn btn-outline-success btn-sm float-end mx-2"
								href="<%=request.getContextPath() + "/View/User/Create.jsp"%>">Create New User</a>
							</div>
						</div>
						<div
							class="row justify-content-center align-items-center h-100 table-responsive-sm table-responsive-md table-responsive-lg">
							<table id="example" class="table table-striped table-border"
								style="width: 100%;">
								<thead>
									<tr>
										<th style="text-wrap: nowrap;">No</th>
										<th style="text-wrap: nowrap;">Full Name</th>
										<th style="text-wrap: nowrap;">Email</th>
										<th style="text-wrap: nowrap;">Role</th>
										<th style="text-wrap: nowrap;">Created Date</th>
										<th style="text-wrap: nowrap;">Created By</th>
										<th style="text-wrap: nowrap;">Action</th>
									</tr>
								</thead>
								<tbody>
									<%
									UserDAO dao = new UserDAO(DBConnect.getConn());
									String currentUserId = (String) session.getAttribute("userId");
									List<User> list = dao.getAllUser(currentUserId);
									int i = 0;
									for (User user : list) {
										i++;
									%>
									<tr>
										<td style="text-wrap: nowrap;"><%=i%></td>
										<td style="text-wrap: nowrap;"><%=user.getFristName()%><%=user.getLastName()%></td>
										<td style="text-wrap: nowrap;"><%=user.getEmail()%></td>
										<td style="text-wrap: nowrap;">
											<%
											int roleId = user.getRole();
											if (roleId == 1) {
												out.print("Admin");
											} else {
												out.print("User");
											}
											%>
										</td>
										<td style="text-wrap: nowrap;"><%=user.getCreatedDate()%></td>
										<td style="text-wrap: nowrap;"><%=user.getCreatedUserName()%></td>
										<td style="text-wrap: nowrap;">
											<div class="dropdown">
												<button class="btn btn-sm btn-primary dropdown-toggle"
													type="button" id="userActionDropdown<%=user.getId()%>"
													data-bs-toggle="dropdown" aria-expanded="false">
													Action</button>
												<ul class="dropdown-menu"
													aria-labelledby="userActionDropdown<%=user.getId()%>">
													<li><a class="dropdown-item" href="#"
														onclick="viewUser('<%=user.getId()%>', '<%=user.getFristName()%> <%=user.getLastName()%>', '<%=user.getEmail()%>', '<%=user.getRole()%>', '<%=user.getPhoneNumber()%>', '<%=user.getDob()%>', '<%=user.getProfile()%>', '<%=user.getAddress()%>', '<%=user.getCreatedDate()%>', '<%=user.getCreatedUserName()%>')"><i
															class="fa-solid fa-circle-info"></i> View</a></li>
													<li><a class="dropdown-item"
														href="<%=request.getContextPath()%>/View/User/Edit.jsp?id=<%=user.getId()%>"><i
															class="fa-solid fa-pen-to-square"></i> Edit</a></li>
													<li><a class="dropdown-item"
														href="javascript:void(0);"
														onclick="confirmDelete('<%=user.getId()%>')"><i
															class="fa-solid fa-trash"></i> Delete</a></li>
												</ul>
											</div>
										</td>
									</tr>
									<%
									}
									%>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Modal -->
	<div class="modal fade" id="viewModal" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">User Detail</h5>
					<button type="button" class="btn-close" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body">
					<div class="mb-3 row">
						<label class="col-sm-3 col-form-label fw-bold">Profile
							Photo</label>
						<div class="col-sm-9">
							<img src="" class="profileImage" id="modalProfile"
								alt="ProfileName" />
						</div>
					</div>
					<div class="mb-3 row">
						<label class="col-sm-3 col-form-label fw-bold">Full Name</label>
						<div class="col-sm-9">
							<input type="text" readonly class="form-control-plaintext"
								id="modalFullName">
						</div>
					</div>
					<div class="mb-3 row">
						<label class="col-sm-3 col-form-label fw-bold">Email</label>
						<div class="col-sm-9">
							<input type="text" readonly class="form-control-plaintext"
								id="modalEmail">
						</div>
					</div>

					<div class="mb-3 row">
						<label class="col-sm-3 col-form-label fw-bold">Role</label>
						<div class="col-sm-9" id="divRole"></div>
					</div>

					<div class="mb-3 row">
						<label class="col-sm-3 col-form-label fw-bold">Phone</label>
						<div class="col-sm-9">
							<input type="text" readonly class="form-control-plaintext"
								id="modalPhone">
						</div>
					</div>

					<div class="mb-3 row">
						<label class="col-sm-3 col-form-label fw-bold">Date of
							Birth</label>
						<div class="col-sm-9">
							<input type="text" readonly class="form-control-plaintext"
								id="modalDOB">
						</div>
					</div>
					<div class="mb-3 row">
						<label class="col-sm-3 col-form-label fw-bold">Address</label>
						<div class="col-sm-9">
							<input type="text" readonly class="form-control-plaintext"
								id="modalAddress">
						</div>
					</div>
					<div class="mb-3 row">
						<label class="col-sm-3 col-form-label fw-bold">Created
							Date</label>
						<div class="col-sm-9">
							<input type="text" readonly class="form-control-plaintext"
								id="modalCreatedDate">
						</div>
					</div>
					<div class="mb-3 row">
						<label class="col-sm-3 col-form-label fw-bold">Created By</label>
						<div class="col-sm-9">
							<input type="text" readonly class="form-control-plaintext"
								id="modalCreatedBy">
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-bs-dismiss="modal">Close</button>
				</div>
			</div>
		</div>
	</div>
    <%@include file="/View/Shared/Footer.jsp"%>
	<c:if test="${not empty requestScope.succMg}">
		<script>
                                swal.fire({
                                    title: 'Success!',
                                    text: '<%=(request.getAttribute("succMg"))%>',
                                    icon: 'success',
                                    showConfirmButton: true  
                                });
                            </script>
	</c:if>
	<c:if test="${not empty requestScope.errorMg}">
		<script>
                                swal.fire({
                                    title: 'Error!',
                                    text: '<%=(request.getAttribute("errorMg"))%>',
                                    icon: 'error',
                                    showConfirmButton: true  
                                });
                            </script>
	</c:if>
	<c:if test="${not empty requestScope.sucessSave }">
		<script>
							Swal.fire({
								  position: "top-end",
								  icon: "success",
								  title: '<%=(request.getAttribute("sucessSave"))%>',
								  showConfirmButton: true,
								});
                            </script>
	</c:if>
	<script>
	$(document).ready(function() {
	    $('#example').DataTable({
	        "scrollX": true,
	        "responsive": true,
	        "columnDefs": [
	            { 
	                "targets": [6],
	                "orderable": false
	            }
	        ]
	    });
	});
        function confirmDelete(userId) {
            swal.fire({
                title: 'Are you sure?',
                text: 'Do you really want to delete this user?',
                icon: 'warning',
                showCancelButton: true,
                confirmButtonColor: '#d33',
                cancelButtonColor: '#3085d6',
                confirmButtonText: 'Yes, delete it!'
            }).then((result) => {
                if (result.isConfirmed) {
                	window.location.href = '<%=request.getContextPath()%>/User/Delete?id=' + userId;
                }
            });
        }
        function viewUser(id, fullName, email, role, phone, dob,profile, address, createdDate, createdBy) {
        	document.getElementById('modalProfile').src = '<%=request.getContextPath()%>/assets/profileImage/' + profile;
        	document.getElementById('modalFullName').value = fullName;
            document.getElementById('modalEmail').value = email;
            document.getElementById('divRole').innerHTML = (role == 1) ? 'Admin' : 'User';
            document.getElementById('modalPhone').value = phone;
            document.getElementById('modalDOB').value = dob;
            document.getElementById('modalAddress').value = address;
            document.getElementById('modalCreatedDate').value = createdDate;
            document.getElementById('modalCreatedBy').value = createdBy;
            $('#viewModal').modal('show');
        }
    </script>

