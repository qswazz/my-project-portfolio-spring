<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>New View</h1>
	
	
	<img alt="No image" src="/cat2.jpg">

	<div>
		<div>
			<label>제목</label>
			<input type="text" style="width: 400px" value="제목을 입력하세요.">
		</div>
		<br>
		<div>
			<label>내용</label>
			<textarea rows="10" cols="50">내용을 입력하세요.</textarea>
		</div>
	</div>
	
	<br>
	
	<input type="submit" value="저장">
	<input type="button" value="목록으로" onclick="location.href='/board/list'">
	
</body>
</html>