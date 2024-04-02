<%@include file="/View/Shared/Header.jsp"%>
	<div class="container" style="margin-top: 50px">
		<div class="row">
			<div class="col-md-12">
				<div class="card">
					<div class="card-body">
						<div class="row">
							<div class="col mb-3">
								<a class="btn btn-outline-success btn-sm float-end mx-2"
									href="<%=request.getContextPath() + "/View/Post/Create.jsp"%>">Create
									New Post</a> <a
									href="<%=request.getContextPath() + "/Post/ExportExcel"%>"
									class="btn btn-outline-success btn-sm float-end mx-2">Export</a>
								<a
									href="<%=request.getContextPath() + "/View/Post/ImportExcel.jsp"%>"
									class="btn btn-outline-success btn-sm float-end mx-2">Import</a>
							</div>
						</div>
						<div
							class="row justify-content-center align-items-center h-100 table-responsive-sm table-responsive-md table-responsive-lg">
							<table id="example" class="table table-striped table-border"
								style="width: 100%;">
								<thead>
									<tr>
										<th style="text-wrap: nowrap;">No</th>
										<th style="text-wrap: nowrap;">Title</th>
										<th style="text-wrap: nowrap;">Description</th>
										<th style="text-wrap: nowrap;">Status</th>
										<th style="text-wrap: nowrap;">Created Date</th>
										<th style="text-wrap: nowrap;">Created By</th>
										<th style="text-wrap: nowrap;">Action</th>
									</tr>
								</thead>
								<tbody>
									<%
									PostDAO dao = new PostDAO(DBConnect.getConn());
									String currentUserId = (String) session.getAttribute("userId");
									User currentUser = dao.getRoleById(currentUserId);
									if (currentUser == null) {
										response.sendRedirect("login.jsp");
										return;
									}
									List<Post> list = dao.getAllPost(currentUserId, currentUser.getRole());
									int i = 0;
									for (Post post : list) {
										i++;
									%>
									<tr>
										<td style="text-wrap: nowrap;"><%=i%></td>
										<td style="text-wrap: nowrap;"><%=post.getTitle()%></td>
										<td style="text-wrap: nowrap;"><%=post.getDescription()%></td>
										<td style="text-wrap: nowrap;">
											<%
											Boolean roleId = post.getIsPublished();
											if (roleId == true) {
											%> <span class='badge rounded-pill bg-primary'>Published</span>
											<%
											} else {
											%> <span class='badge rounded-pill bg-danger'>Unpublished</span>
											<%
											}
											%>
										</td>
										<td style="text-wrap: nowrap;"><%=post.getCreatedDate()%></td>
										<td style="text-wrap: nowrap;"><%=post.getCreatedUserName()%></td>
										<td style="text-wrap: nowrap;">
										
										<div class="dropdown">
                                        <button class="btn btn-sm btn-primary dropdown-toggle" type="button" id="actionDropdown<%=post.getId()%>" data-bs-toggle="dropdown" aria-expanded="false">
                                            Action
                                        </button>
                                        <ul class="dropdown-menu" aria-labelledby="actionDropdown<%=post.getId()%>">
                                       <li><a class="dropdown-item" href="#" onclick="viewUser('<%=post.getId()%>', '<%=post.getTitle()%>', '<%=post.getDescription()%>', '<%=post.getIsPublished()%>','<%=post.getCreatedDate()%>','<%=post.getCreatedUserName()%>')"><i class="fa-solid fa-circle-info"></i> View</a></li>
                                       <li><a class="dropdown-item" href="<%=request.getContextPath()%>/View/Post/Edit.jsp?id=<%=post.getId()%>"><i class="fa-solid fa-pen-to-square"></i> Edit</a></li>
                                       <li><a class="dropdown-item" href="javascript:void(0);" onclick="confirmDelete('<%=post.getId()%>')"><i class="fa-solid fa-trash"></i> Delete</a></li>
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
					<h5 class="modal-title" id="exampleModalLabel">Post Detail</h5>
					<button type="button" class="btn-close" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body">
					<div class="mb-3 row">
						<label class="col-sm-3 col-form-label fw-bold">Title</label>
						<div class="col-sm-9">
							<input type="text" readonly class="form-control-plaintext"
								id="modalTitle">
						</div>
					</div>
					<div class="mb-3 row">
						<label class="col-sm-3 col-form-label fw-bold">Description</label>
						<div class="col-sm-9">
							<input type="text" readonly class="form-control-plaintext"
								id="modalDescription">
						</div>
					</div>

					<div class="mb-3 row">
						<label class="col-sm-3 col-form-label fw-bold">Status</label>
						<div class="col-sm-9" id="divStatus"></div>
					</div>

					<div class="mb-3 row">
						<label class="col-sm-3 col-form-label fw-bold">Created By</label>
						<div class="col-sm-9">
							<input type="text" readonly class="form-control-plaintext"
								id="modalCreatedBy">
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
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-bs-dismiss="modal">Close</button>
				</div>
			</div>
		</div>
	</div>
    <%@include file="/View/Shared/Footer.jsp"%>
	<script type="text/javascript">
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
	<c:if test="${not empty requestScope.successDeleteMsg}">
                            swal.fire({
                                title: 'Success!',
                                text: '<%=(request.getAttribute("successDeleteMsg"))%>',
                                icon: 'success',
                                showConfirmButton: true  
                            });
</c:if>

<c:if test="${not empty requestScope.errorDeleteMsg}">
swal.fire({
    title: 'Success!',
    text: '<%=(request.getAttribute("errorDeleteMsg"))%>',
    icon: 'delete',
    showConfirmButton: true  
});
</c:if>

	<c:if test="${not empty requestScope.sucessSave }">
	
	Swal.fire({
		  position: "top-end",
		  icon: "success",
		  title: '<%=(request.getAttribute("sucessSave"))%>',
		  showConfirmButton: true,
		});
</c:if>

function confirmDelete(postId) {
    swal.fire({
        title: 'Are you sure?',
        text: 'Do you really want to delete this post?',
        icon: 'warning',
        showCancelButton: true,
        confirmButtonColor: '#d33',
        cancelButtonColor: '#3085d6',
        confirmButtonText: 'Yes, delete it!'
    }).then((result) => {
        if (result.isConfirmed) {
            window.location.href = '<%=request.getContextPath()%>/Post/Delete?id=' + postId;
        }
    });
}
function viewUser(id, title, description, isPublished,createdDate,createdUserName) {
	document.getElementById('modalTitle').value = title;
    document.getElementById('modalDescription').value = description;
    document.getElementById('divStatus').innerHTML = isPublished ? 'Published' : 'UnPublished';
    document.getElementById('modalCreatedDate').value = createdDate;
    document.getElementById('modalCreatedBy').value = createdUserName;
    $('#viewModal').modal('show');
}
	</script>
</body>
</html>