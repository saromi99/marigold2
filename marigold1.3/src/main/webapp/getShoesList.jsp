<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="com.marigold.shoes.domain.ShoesVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제품 검색 목록</title>
<style>
	#container{
		margin: 0 auto;
	}
</style>
</head>
<body>

<h1>${ checkShoes } 오니.....</h1>
	<div id="container">
	
	</div>
</body>
</html>