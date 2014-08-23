<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form"
    uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add product</title>
</head>
<body>
<h2>Add product</h2>
<form method="post" action="${pageContext.request.contextPath}/admin/product/saveProduct">
  Name: <input type="text" name="productName"/>
  Price: <input type="text" name="productPrice"/>
  <button>Add Product</button>
</form>


</body>
</html>