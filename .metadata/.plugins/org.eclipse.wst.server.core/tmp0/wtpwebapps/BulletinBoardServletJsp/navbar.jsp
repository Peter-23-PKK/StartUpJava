
<nav class="navbar navbar-expand-lg bg-body-tertiary">
	<div class="container">
		<a class="navbar-brand" href="#">BulletinBoard</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav ms-auto">
				<%
				Integer roleInteger = (Integer) session.getAttribute("role");
				int role = (roleInteger != null) ? roleInteger.intValue() : -1;

				if (role == 1) {
				%>
				<li class="nav-item mx-0 mx-lg-1"><a
					class="nav-link py-3 px-0 px-lg-3 rounded"
					href="<%=request.getContextPath() + "/View/User/Index.jsp"%>">User</a>
				</li>
				<%
				}
				%>

				<li class="nav-item mx-0 mx-lg-1"><a
					class="nav-link py-3 px-0 px-lg-3 rounded"
					href="<%=request.getContextPath() + "/View/Post/Index.jsp"%>">Post</a></li>
				<li class="nav-item mx-0 mx-lg-1"><a
					class="nav-link py-3 px-0 px-lg-3 rounded"><%=session.getAttribute("userName")%></a></li>
				<li class="nav-item dropdown"><a
					class="nav-link mx-2 dropdown-toggle" href="#"
					id="navbarDropdownMenuLink" role="button" data-bs-toggle="dropdown"
					aria-expanded="false"> <span id="EmailName"></span>
					<img src="<%=request.getContextPath()%>/images/signin-image.jpg"
							id="ProfileName" class="navProfile"> 
				</a>
					<ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
						<li><a class="dropdown-item"
							href="<%=request.getContextPath() + "/View/Account/Profile.jsp"%>"
							id="viewProfile">Profile</a></li>
						<li><a class="dropdown-item"
							href="<%=request.getContextPath() + "/View/Account/ChangePassword.jsp"%>"
							id="viewChangePass">Change Password</a></li>
						<li><a class="dropdown-item"
							href="<%=request.getContextPath() + "/Account/Logout"%>">Logout</a></li>
					</ul></li>
			</ul>
		</div>
	</div>
</nav>