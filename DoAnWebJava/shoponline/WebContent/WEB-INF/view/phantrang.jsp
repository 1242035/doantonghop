<%@page import="java.sql.*"%>
<%
Connection con=null;
PreparedStatement pstatement = null;
String line = null;
String value=null;
	String url = "jdbc:mysql://localhost:3306/";
	String dbName = "dienthoai";
	String driver = "com.mysql.jdbc.Driver";
	String userName = "root"; 
	String password = "";
	Class.forName("com.mysql.jdbc.Driver");

	con = DriverManager.getConnection(url+dbName,userName,password);

	String queryString = "select * from sanpham";
	
	//out.println(queryString);
	
	pstatement=con.prepareStatement(queryString);
	 
	
   
	ResultSet rs=pstatement.executeQuery(queryString);
rs.last();
int tong=rs.getRow();
rs.beforeFirst();
int n=9,pn=1;
String ps=request.getParameter("p");
if (ps!=null) {
pn=Integer.parseInt(ps);
if (pn!=1)
rs.absolute((pn-1)*2);
}
%>
<head>
<meta http-equiv="Content-Language" content="en-us">
<meta name="GENERATOR" content="Microsoft FrontPage 6.0">
<meta name="ProgId" content="FrontPage.Editor.Document">
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>Phan trang</title>
</head>

<% if (pn*n<tong){%>

<a href=<%out.print("phantrang?p=");%><%=pn+1%>>Next </a>&nbsp;&nbsp;
<% }else {%>
Next
<%}%>
<% if (pn>1){%>
<a href=<%out.print("phantrang?p=");%><%=pn-1%>>Previous</a>
<% } else {%>
Previous
<%}%>


</p>
<table border="1" cellpadding="0" cellspacing="0" style="border-collapse: collapse" bordercolor="#111111" width="96%" id="AutoNumber1">
<tr>
<td width="20%" align="center">Hinh anh</td>
<td width="20%" align="center">Ten hang</td>
<td width="20%" align="center">Mo ta</td>
<td width="23%" align="center">Don gia</td>

</tr>
<%
int i=0;
while (rs.next() && (i<n)){
String mahang=rs.getString("masp");
String tenhang=rs.getString("tensp");
String mota=rs.getString("mota");
int dongia=rs.getInt("gia");
String hinh=rs.getString("hinhanh");
i++;
%>
<tr>
<td><img src="upload/<%=hinh%>">&nbsp;</td>
<td width="20%"><%=tenhang%>&nbsp;</td>
<td width="20%"><%=mota%>&nbsp;</td>
<td width="23%"><%=dongia%>&nbsp;</td>
</tr>
<%}

con.close();
%>
</table>
<p align="center">&nbsp;</p>
</form>
<p>&nbsp;</p>
<p>&nbsp;</p>
</body>
</html> 