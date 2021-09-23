<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Detail View</h1>
	
	
	<img alt="No image" src="/cat2.jpg">

	<div>
		<div>
			<label>제목</label>
			<input type="text" value="${selectedItem.title }" style="width: 400px" readonly>
		</div>
		<br>
		<div>
			<label>내용</label>
			<textarea rows="10" cols="50" readonly>${selectedItem.content }</textarea>
		</div>
	</div>
	
	<br>
	
	<input type="button" value="목록으로" onclick="location.href='/board/list'">
	
</body>
</html>