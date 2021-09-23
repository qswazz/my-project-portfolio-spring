<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>List View</h1>
	
	<table border="1">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>생성날짜</th>
			<th>조회수</th>
		</tr>
		
		<c:forEach var="item" items="${items }">
			<tr>
				<td>${item.id }</td>
				<td><a href="detail?id=${item.id}">${item.title }</a></td>
				<td>${item.writerId }</td>
				<td>${item.regDate }</td>
				<td>${item.hit }</td>
			</tr>
		</c:forEach>
		
	</table>
	
	<br>
	<br>
	
	<input type="button" value="글작성" onclick="location.href='/board/newList'">
	
</body>
</html>