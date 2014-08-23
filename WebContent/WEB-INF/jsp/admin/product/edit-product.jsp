<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form"
    uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit product</title>
</head>
<body>
<h2>Edit product</h2>
<form method="post" action="${pageContext.request.contextPath}/admin/product/updateProduct">
<!-- do i have to put id? -->
  Name: <input type="text" name="productName" value="${product.productName}"/>
  Price: <input type="text" name="productPrice" value="${product.productPrice}"/>
  <input type="hidden" name="productId" value="${product.productId}" />
  <button>Edit Product</button>
</form>

</body>
</html>