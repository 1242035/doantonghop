<div class="gio_hang">
        	<div class="cart_title">Shopping cart</div>
            <div class="cart_details">
            <c:set var="i" value="${card.cound}"/>
            ${i} items <br />
            <span class="border_cart"></span>
            <c:set var="total" value="${card.total}"/>
            Total: <span class="price">${total}</span>
            </div>         
            <div class="cart_icon"><a href="quanlycard" title="header=[Checkout] body=[&nbsp;] fade=[on]"><img src="images/shoppingcart.png" alt="" title="" width="48" height="48" border="0" /></a></div>
        	
</div>