<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="springform" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Store Item detail page</title>
<script src="<c:url value="/assets/js/jquery-1.11.1.js" />"></script>

</head>
<body>
<p>Store item detail page</p>

<ul>
		<li><c:out value="${product.productId}" /> - <c:out value="${product.productName}" /></li>

</ul>



<c:out value="${empty cart}" /> <br />
<c:out value="${!empty cart}" />
  <form method="post" action="${pageContext.request.contextPath}/store/addProduct">
	
    <input type="hidden" name="productId" value="${product.productId}" />
    <input type="hidden" name="productName" value="${product.productName}" />
	<c:if test="${!empty cart}"> 
    	<c:forEach items="${cart}" var="cartItem">
    	<c:if test="${cartItem.productId != product.productId}">    
    		<button>Add Product</button>
		</c:if>
	
	</c:forEach>
	</c:if>
	<c:if test="${empty cart}"> 
	<button>Add Product</button>
	</c:if>
	
  </form>
  

<a href="${pageContext.request.contextPath}/">Main page</a> 
</body>
</html>

<!-- http://gerrydevstory.com/2014/03/04/using-sessionattribute-in-spring-mvc-to-implement-a-shopping-cart/  -->