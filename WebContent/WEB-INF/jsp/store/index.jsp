<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="springform" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Store Homepage</title>
<script src="<c:url value="/assets/js/jquery-1.11.1.js" />"></script>

</head>
<body>
<p>Store homepage</p>

<ul>
	<c:forEach items="${myProductList}" var="myProduct">
		<li><c:out value="${myProduct.productId}" /> - 
			<c:out value="${myProduct.productName}" />
		</li>
	</c:forEach>

</ul>

<form action="ajaxtestmethod" method="post">
<table>
<tbody><tr>
<td>To remember:</td>
<td><input name="thoughtParam" type="text"></td>
</tr>
<tr>
<td><input type="submit"></td>
<td></td>
</tr>
</tbody></table>
</form>
<a href="${pageContext.request.contextPath}/">Main page</a> 
</body>
</html>