<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="springform" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Store Home page</title>
<script src="<c:url value="/assets/js/jquery-1.11.1.js" />"></script>

</head>
<body>
<p>Store home page</p>

<ul>
	<c:forEach items="${myProductList}" var="myProduct">
		<li><a href="${pageContext.request.contextPath}/store/view/${myProduct.productId}">
			<c:out value="${myProduct.productId}" /> - 
			<c:out value="${myProduct.productName}" /></a>
		</li>
	</c:forEach>

</ul>

<a href="${pageContext.request.contextPath}/store/checkout">checkout</a> 
</body>
</html>