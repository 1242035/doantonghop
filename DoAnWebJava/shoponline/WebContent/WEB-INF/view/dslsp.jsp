<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%! String name; %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@page import="model.Khachhang"%><html xmlns="http://www.w3.org/1999/xhtml">
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
   
     
   <div class="left_content">
    <div class="title_benphai" ><h3>S&#7843;n ph&#7849;m</h3></div>
    
<ul class="left_menu">
	<c:forEach var="ds" items="${dslsp}">
	<li class='even'>
	<a href="index.htm?id=${ds.maloai}">${ds.tenloai }</a>
	</li>
	</c:forEach>
</ul> 
        
        
     <div class="title_benphai">S&#7843;n ph&#7849;m &#273;&#7863;c bi&#7879;t</div>  
     <div class="border_box">
         <div class="product_title"><a href="details.html">Motorola 156 MX-VL</a></div>
         <div class="product_img"><a href="details.html"><img src="images/laptop.png" alt="" title="" border="0" /></a></div>
         <div class="prod_price"><span class="reduce">350$</span> <span class="price">270$</span></div>
     </div>  
     
     
     <div class="title_benphai">Newsletter</div>  
     <div class="border_box">
		<input type="text" name="newsletter" class="newsletter_input" value="your email"/>
        <a href="#" class="join">join</a>
     </div>  
     
     <div class="banner_adds">
     
     <a href="#"><img src="images/bann2.jpg" alt="" title="" border="0" /></a>
     </div>    
        
    
   </div><!-- end of left content -->
   <body ></body>
   
   <div class="center_content">
   	<div class="thanh_tieu_de_giua">S&#7843;n ph&#7849;m &#273;&#432;&#7907;c quan tâm nhi&#7873;u nh&#7845;t</div>
    	
    	
 		
 	<div class="thanh_tieu_de_giua">Phân trang</div>
 
 <div class="thanh_tieu_de_giua">Hot</div>
 
 
      	<div class="prod_box">
        	<div class="top_prod_box"></div>
            <div class="center_prod_box">            
                 <div class="product_title"><a href="details.html">Motorola 156 MX-VL</a></div>
                 <div class="product_img"><a href="details.html"><img src="images/laptop.gif" alt="" title="" border="0" /></a></div>
                 <div class="prod_price"><span class="reduce">350$</span> <span class="price">270$</span></div>                        
            </div>
            <div class="bottom_prod_box"></div>             
            <div class="prod_details_tab">
            
            <a href="#" title="header=[Add to cart] "><img src="images/cart.gif" alt="" title="" border="0" class="left_bt" /></a>
            <a href="#" title="header=[Specials] "><img src="images/favs.gif" alt="" title="" border="0" class="left_bt" /></a>
            <a href="#" title="header=[Gifts] "><img src="images/favorites.gif" alt="" title="" border="0" class="left_bt" /></a>           
            <a href="details.html" class="prod_details">details</a>            
            </div>                     
        </div>
    
    
 
     	<div class="prod_box">
        	<div class="top_prod_box"></div>
            <div class="center_prod_box">            
                 <div class="product_title"><a href="details.html">Iphone Apple</a></div>
                 <div class="product_img"><a href="details.html"><img src="images/p4.gif" alt="" title="" border="0" /></a></div>
                 <div class="prod_price"><span class="price">270$</span></div>                        
            </div>
            <div class="bottom_prod_box"></div>             
            <div class="prod_details_tab">
            <a href="#" title="header=[Add to cart] "><img src="images/cart.gif" alt="" title="" border="0" class="left_bt" /></a>
            <a href="#" title="header=[Specials] "><img src="images/favs.gif" alt="" title="" border="0" class="left_bt" /></a>
            <a href="#" title="header=[Gifts] "><img src="images/favorites.gif" alt="" title="" border="0" class="left_bt" /></a>           
            <a href="details.html" class="prod_details">details</a>             
            </div>                     
        </div>
 
     	<div class="prod_box">
        	<div class="top_prod_box"></div>
            <div class="center_prod_box">            
                 <div class="product_title"><a href="details.html">Samsung Webcam</a></div>
                 <div class="product_img"><a href="details.html"><img src="images/p5.gif" alt="" title="" border="0" /></a></div>
                 <div class="prod_price"><span class="reduce">350$</span> <span class="price">270$</span></div>                        
            </div>
            <div class="bottom_prod_box"></div>             
            <div class="prod_details_tab">
            <a href="#" title="header=[Add to cart] "><img src="images/cart.gif" alt="" title="" border="0" class="left_bt" /></a>
            <a href="#" title="header=[Specials] "><img src="images/favs.gif" alt="" title="" border="0" class="left_bt" /></a>
            <a href="#" title="header=[Gifts]"><img src="images/favorites.gif" alt="" title="" border="0" class="left_bt" /></a>           
            <a href="details.html" class="prod_details">details</a>            
            </div>                     
        </div> 
 
 
 
 
    
    
   
   </div><!-- end of center content -->
   
   <div class="right_content">
   		<div class="gio_hang">
        	<div class="cart_title">Shopping cart</div>
            
            <div class="cart_details">
            3 items <br />
            <span class="border_cart"></span>
            Total: <span class="price">350$</span>
            </div>
            
            <div class="cart_icon"><a href="#" title="header=[Checkout] body=[&nbsp;] fade=[on]"><img src="images/shoppingcart.png" alt="" title="" width="48" height="48" border="0" /></a></div>
        
        </div>
   
   
     <div class="title_box">What’s new</div>  
     <div class="border_box">
         <div class="product_title"><a href="details.html">Motorola 156 MX-VL</a></div>
         <div class="product_img"><a href="details.html"><img src="images/p2.gif" alt="" title="" border="0" /></a></div>
         <div class="prod_price"><span class="reduce">350$</span> <span class="price">270$</span></div>
     </div>  
     
     
     
    <div class="title_benphai">Máy tính xách tay</div>
    
    <ul class="left_menu">
	<c:forEach var="lspdt" items="${dslspdt}" >
		<li class='even'>
	<a href="index.htm?id=${lspdt.maloai}">${lspdt.tenloai }</a>
	</li>
	</c:forEach>
	</ul>      
     
     <div class="banner_adds">
     
     <a href="#"><img src="images/mages.gif" alt="" title="" border="0" /></a>
     </div>        
     
   </div><!-- end of right content -->   
   
            
   </div><!-- end of main content -->
   
   
   
   <div class="footer">
   

        <div class="left_footer">
        <img src="images/samsung.jpg" alt="" title="" width="170" height="80"/>
        </div>
        
        <div class="center_footer">
        Template name. All Rights Reserved 2008<br />
        <a href="http://csscreme.com"><img src="images/csscreme.jpg" alt="csscreme" title="csscreme" border="0" /></a><br />
        <img src="images/payment.gif" alt="" title="" />
        </div>
        
        <div class="right_footer">
        <a href="index.html">home</a>
        <a href="dangki">Ðang kí</a>
        <a href="details.html">Ðang nh?p</a>
        <a href="details.html">Tìm ki?m</a>
        <a href="contact.html">contact us</a>
        </div>   
   
   </div>                 


</div>
<!-- end of main_container -->
</body>
</html>