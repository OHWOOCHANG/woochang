<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="shortcut icon" href="/favicon.ico"/>
</head>
<body>

컨텍스트 패스 : <%= request.getContextPath() %> <br>
요청방식      : <%= request.getMethod()  %> <br>
요청한 URL    : <%= request.getRequestURL() %> <br>
요청한 URI    : <%= request.getServerName() %> <br>
서버의 이름   : <%= request.getProtocol() %> <br>


</body>
</html>