<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.io.ObjectInputStream.GetField"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="uploadForm" action="" enctype="multipart/form-data" method="post">
  <input type="file" name="file"/>
  <input type=Button name='Upload' value='Upload' onclick="uploadForm.Upload.value='Uploading...';document.uploadForm.action='upload';document.uploadForm.submit()">
</form>

</body>
</html>
