<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="springform" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Checkout page</title>
<script src="<c:url value="/assets/js/jquery-1.11.1.js" />"></script>

</head>
<body>
<p>Checkout page</p>
<form>
<table cellpadding="5" border="1">
<tr><td>Product Name</td><td>Product Price</td><td>Quantity</td></tr>
<c:forEach items="${cart}" var="product">
<tr><td>${product.productName}</td><td>${product.productPrice}</td><td><input type="text" name="productQuantity" id="_productQuantity" maxlength="5"></input></td></tr>
</c:forEach>
</table>
</form>
</body>
</html>