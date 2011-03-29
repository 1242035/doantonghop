<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b>Trang dang ki</b>

<form action="dangki">
	<div>
		<font color="#FF0000"><%= request.getAttribute("err") %></font>
	</div>
	<table>
		<tr>
			<td>Ten : </td>
			<td><input type="text" name="tenkh"></input><b> (*) </b></td>
		</tr>
		<tr>
			<td>Pass : </td>
			<td><input type="password" name="pass"></input><b> (*) </b></td>
		</tr>
		<tr>
			<td>Phone : </td>
			<td><input type="text" name="phone"></input></td>
		</tr>
		<tr>
			<td>Email : </td>
			<td><input type="text" name="email"></input></td>
		</tr>
		<tr>
			<td>Dia chi : </td>
			<td><input type="text" name="dchi"></input></td>
		</tr>
		<tr>
			<td><input type="submit" value="Dang ki"></input></td>
		</tr>
	</table>
</form>

</body>
</html>