<%@include file="/View/Shared/Header.jsp"%>
	<div class="container-fluid h-100 mt-5">
		<div class="row justify-content-center align-items-center h-100">
			<div class="col col-sm-10 col-md-10 col-lg-8 col-xl-8">
				<div class="card">
					<div class="card-body">
						<h3 class="mb-3">Update New Post</h3>
						<%
						String id = request.getParameter("id");
						if (id == null) {
							response.sendRedirect(request.getContextPath() + "/View/Account/Login.jsp");
							return;
						}
						PostDAO dao = new PostDAO(DBConnect.getConn());
						Post post = dao.getPostById(id);
						%>
						<form method="post"
							action="<%=request.getContextPath() + "/Post/Edit"%>"
							onsubmit="return confirmSubmit();">
							<input type="hidden" value="<%=post.getId()%>" name="id"
								id="postId" />
							<div class="form-floating mb-4">
								<input name="title" value="<%=post.getTitle()%>" id="title"
									class="form-control" id="inputValidate" placeholder="john"
									maxlength="100" /> <label for="title">Title</label> <span
									id="titleError" class="text-danger"></span>
							</div>
							<div class="form-floating mb-4">
								<textarea name="description" id="description"
									class="form-control" placeholder="john" maxlength="100"><%=post.getDescription()%></textarea>
								<label for="description">Description</label> <span
									id="descriptionError" class="text-danger"></span>
							</div>

							<div class="form-check form-switch mb-4">
								<input <%if (post.getIsPublished()) {%> checked <%}%>
									class="form-check-input" type="checkbox" name="isPublished">
								<label class="form-check-label" for="isPublished">Publish?</label>
							</div>

							<div class="row">
								<div class="col">
									<button type="submit" class="btn btn-outline-success "
										onClick="return validateForm()">Create</button>
									<a
										href="<%=request.getContextPath() + "/View/Post/Index.jsp"%>"
										class="btn btn-outline-danger">Cancel</a>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="<%=request.getContextPath() + "/js/post.js"%>"></script>
  <%@include file="/View/Shared/Footer.jsp"%>
	<script>
    <c:if test="${not empty requestScope.succMg}">
                            swal.fire({
                                title: 'Success!',
                                text: '<%=(request.getAttribute("succMg"))%>',
                                icon: 'success',
                                showConfirmButton: true  
                            });
   </c:if>
	
	<c:if test="${not empty requestScope.titleCheck}">
    swal.fire({
        title: 'Already Exist!',
        text: '<%=(request.getAttribute("titleCheck"))%>',
        icon : 'warning',
        showConfirmButton : true
});
</c:if>
		function confirmSubmit() {
            event.preventDefault();
            swal.fire({
                title: 'Are you sure?',
                text: 'Do you really want to update the post data?',
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
</body>
</html>