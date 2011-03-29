<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b>Trang dang nhap</b>
<form action="dangnhap">
	<div>
		<font color="#FF0000"><%= request.getAttribute("s_err") %></font>
	</div>
	<table>
		<tr>
			<td>Ten : </td>
			<td><input type="text" name="tenkh"></input></td>
		</tr>
		<tr>
			<td>Pass : </td>
			<td><input type="password" name="pass"></input></td>
		</tr>
		<tr>
			<td><input type="submit" value="Dang nhap"></input></td>
		</tr>
	</table>
</form>
</body>
</html>