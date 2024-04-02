<%@include file="/View/Shared/Header.jsp"%>
<div class="container h-100 import">
	<div class="row justify-content-center align-items-center ">
		<div class="col-xl-8 col-lg-7 col-md-8">
			<div
				class="card o-hidden border-0 shadow-lg my-5 h-75 w-75 importCard">
				<div class="card-body p-0">
					<div class="row">
						<div class="col-lg-5 d-none d-lg-block">
							<img
								src="<%=request.getContextPath()%>/assets/img/1fdbce52429088209094dd52a5e7fd3f.jpg"
								class="w-100 h-100" />
						</div>
						<div class="col-lg-7 p-5">
							<h3 class="mb-3">Import Post</h3>
							<c:if test="${not empty requestScope.errorMg }">
								<span id="errorMg" class="text-danger">${errorMg}</span>
							</c:if>
							<form method="post"
								action="<%=request.getContextPath() + "/Post/ImportExcel"%>"
								enctype="multipart/form-data">
								<div class="mb-3">
									<input type="file" id="file" class="form-control" name="file"
										accept=".xlsx, .xls"> <span id="fileError"
										class="text-danger"></span>
								</div>
								<div class="row mt-5">
									<div class="col">
										<button type="submit" onClick="return validateForm()"
											class="btn btn-outline-dark">Upload</button>
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
	</div>
</div>
<script src="<%=request.getContextPath() + "/js/importExcel.js"%>"></script>
<%@include file="/View/Shared/Footer.jsp"%>
</body>
</html>