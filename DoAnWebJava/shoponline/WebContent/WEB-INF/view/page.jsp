<%@ page language="java" %>
<HTml>
<HEAD><TITLE>Display file upload form to the user</TITLE></HEAD>  

  <BODY> <FORM  ENCTYPE="multipart/form-data" ACTION=
<% out.print("\"upload\"");%> METHOD=POST>
		<br><br><br>
	  <center>
	  <table border="0" bgcolor=#ccFDDEE>
         <tr>
		   <center>
		   <td colspan="2" align="center"><B>UPLOAD THE FILE WITH CURRENT DATE AND TIME</B><center></td>
		  </tr>
		    <tr>
	     <td colspan="2" align="center">&nbsp;</td>
	   </tr>
           <tr>
		     <td><b>Choose the file To Upload:</b></td>
            <td><INPUT NAME="file" TYPE="file"></td>
		   </tr>
		    <tr>
	     <td colspan="2" align="center">&nbsp;</td>
	   </tr>
       <tr>
	     <td colspan="2" align="center"><INPUT TYPE="submit"  VALUE="Send File" name="submit"></td>
	   </tr>
             <table>
     </center>      
     </FORM>
</BODY>
</HTML>