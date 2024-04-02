
<%
if (session.getAttribute("userName") == null) {
	response.sendRedirect(request.getContextPath() + "/View/Account/Login.jsp");
}
%>
<%@page import="java.sql.Connection"%>
<%@ page import="java.util.List"%>
<%@ page import="com.google.gson.Gson"%>
<%@page import="BulletinBoard.Connection.DBConnect"%>
<%@page import="BulletinBoard.DAO.UserDAO"%>
<%@page import="BulletinBoard.Entities.User"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>BulletinBoard</title>
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.13.7/css/jquery.dataTables.min.css">
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.13.7/css/dataTables.bootstrap5.min.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath() + "/./css/commonStyle.css"%>">
</head>
<body id="page-top">
	<%@include file="/navbar.jsp"%>
	<script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
	<script type="text/javascript" charset="utf8"
		src="https://cdn.datatables.net/1.13.7/js/jquery.dataTables.min.js"></script>
	<script type="text/javascript" charset="utf8"
		src="https://cdn.datatables.net/1.11.5/js/dataTables.bootstrap5.min.js"></script>
</body>
</html>
