<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <%@ page language="java" contentType="text/html; charset=UTF-8"
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
    
   <div id="main_content"> 
   
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
                          
                          <%
                         out.print(
								"<li><a href=\"upload\" class=\"nav2\">Upload</a></li>"
                         		+"<li class=\"divider\"></li>"
							);
					     %>
                         
                           <%
                         out.print(
								"<li><a href=\"timkiem\" class=\"nav2\">Tìm kiem</a></li>"
                         		+"<li class=\"divider\"></li>"
							);
					     %>
                                                 
                         <%
                         out.print(
								"<li><a href=\"phantrang\" class=\"nav2\">Phan trang</a></li>"
                         		+"<li class=\"divider\"></li>"
							);
					     %>
                        
                         <li class="currencies">Currencies
                         <select>
                         <option>US Dollar</option>
                         <option>Euro</option>
                         </select>
                         </li>
                    </ul>

             <div class="right_menu_corner"></div>
            </div><!-- end of menu tab -->
            
     <div class="class_doannho">
    <span class="mauchu">
    
    <%
    	name = (String)session.getAttribute("user");
    	if(name == null)out.print("Vui long dang nhap !!");
    	else out.print("Xin chao ban : " + name );
     %>
    
    </span>
    </div>                   
    
   <form action="CardController">
   <input name="cmd" value="update" style="display: none"></input>
    <div>
    	<a href="index.htm"><H2>Quay lai trang chu</H2> </a>
		<table border=1 cellspacing="0" align="center">
		<tr>
			<th>No.</th>
			<th>Ten san pham</th>
			<th>So luong</th>
			<th>Don gia</th>
			<th>Tien phai tra</th>
			<th>-</th>
		</tr>
		<c:set var="i" value="0"/>
		<c:forEach var="item" items="${card.items}">
				<c:set var="sanpham" value="${item.value.sanpham}" />
				<c:set var="qty" value="${item.value.qty}" />
				<c:set var="i" value="${i+1}"/>
		<tr>
				<td>${i }</td>
				<td>${sanpham.tensp }</td>
				<td><input type="text" name = "soluong${sanpham.masp}" value="${qty }"/></td>
				<td>${sanpham.gia }</td>
				<td>${sanpham.gia * qty }</td>
				<td><a href="CardController?cmd=remove&id=${sanpham.masp}">Remove</a></td>
		</tr>
		</c:forEach>
		<tr >
			<td colspan="4" align="right">Tong so tien phai tra :</td>
			<td colspan="2">${card.total }</td>
		</tr>
		<tr>
		<td colspan="6"><a href="CardController?cmd=checkout">Mua hang</a> - <a href="CardController?cmd=removeall">Xoa het gio hang</a></td>
		</tr>
		<tr><input type="submit" value="update"></input></tr>
		</table>
    </div>
    
</div>
</form>
<!-- end of main_container -->
</body>
</html>