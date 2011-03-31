<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%! String name; %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
<title>Electronix Store</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<!--[if IE 6]>
<link rel="stylesheet" type="text/css" href="iecss.css" />
<![endif]-->
<script type="text/javascript" src="js/boxOver.js"></script>
</head>
<body>

<div id="main_container">
	<div class="top_bar">
    	        
           
    </div>
	<div id="banner">
        
        <div id="logo">
            <a href="index.html"><img src="images/logo.png" alt="" title="" border="0" width="237" height="140" /></a>
	    </div>
        
        <div class="oferte_content">
        	<div class="top_divider"><img src="images/header_divider.png" alt="" title="" width="1" height="164" /></div>
        	<div class="oferta">
            
           		<div class="oferta_content">
                	<img src="images/laptop.png" width="94" height="92" border="0" class="oferta_img" />
                	
                    <div class="oferta_details" style="width: 405px; height: 99px">
                            <div class="oferta_title">Samsung GX 2004 LM</div>
                            <div class="oferta_text">
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco
                            </div>
                            <a href="details.html" class="details">details</a>
                    </div>
                </div>
                

            </div>
            <div class="top_divider"><img src="images/header_divider.png" alt="" title="" width="1" height="164" /></div>
        	
        </div> <!-- end of oferte_content-->
        

    </div>
    
    
   
            <div id="menu_tab">
            <div class="left_menu_corner"></div>
                    <ul class="menu">
                         <li><a href="index.htm" class="nav1">Trang ch&#7911;</a></li>
                         <li class="divider"></li>
                         
					     <%
					    	name = (String)session.getAttribute("user");
					    	if(name == null)out.print(
								"<li><a href=\"dangki\" class=\"nav2\">&#272;&#259;ng kí</a></li>"
                        		+"<li class=\"divider\"></li>"
                        		
                        		+"<li><a href=\"dangnhap\" class=\"nav4\">&#272;&#259;ng nh&#7853;p</a></li>"
                        		+"<li class=\"divider\"></li>"
							);
					    	else out.print(
								"<li><a href=\"dangxuat\" class=\"nav2\">Dang xuat</a></li>"
                         		+"<li class=\"divider\"></li>"
							);
					     %>
                          
                         <li><a href="#" class="nav3">&#272;i&#7879;n tho&#7841;i cao c&#7845;p</a></li>
                         <li class="divider"></li>
                         
                           <%
                         out.print(
								"<li><a href=\"timkiem\" class=\"nav2\">Tìm kiem</a></li>"
                         		+"<li class=\"divider\"></li>"
							);
					     %>
                                                 
                         <li><a href="#" class="nav5">My account </a></li>
                         <li class="divider"></li>
                        
                         <li class="currencies">Currencies
                         <select>
                         <option>US Dollar</option>
                         <option>Euro</option>
                         </select>
                         </li>
                    </ul>

             <div class="right_menu_corner"></div>
            </div><!-- end of menu tab -->
            
             
   <form action="dangki">
	<div>
		<font color="#FF0000"><%= request.getAttribute("err") %></font>
	</div>
	<table align="center">
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
     
                    


</div>
<!-- end of main_container -->
</body>
</html>