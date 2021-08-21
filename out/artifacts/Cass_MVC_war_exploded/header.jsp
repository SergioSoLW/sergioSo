<%--
  Created by IntelliJ IDEA.
  User: TYDHG
  Date: 2021/6/16
  Time: 18:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<header>
    <div id="bar">
        <img src="img/logo.png" alt="logo" id="logo" />
        <nav>
            <li class="icon1"><a href="index">HOME</a></li>
            <li class="icon2"><a href="newsList">NEWS</a></li>
            <li class="icon3"><a href="productlist1.html">SHOP</a></li>
            <li class="cart1"><a href="cart.html">CART</a></li>
            <li class="icon4"><a href="service.html">SERVICE</a></li>
            <%
                Object uname= request.getSession().getAttribute("suname");
                if (uname==null){
                    out.println("<li class=\"login\"><a href=\"login\">LOGIN</a></li>");
                }else {
                    out.println("<li class=\"login\"><a href=\"logout\">"+uname+"LOGOUT</a></li>");
                }
            %>

            <form action="" method="post">
                <input type="text" name="" class="search-left" value="" placeholder="SEARCH" /><input type="submit" name="" class="search-right" value="搜索" />
            </form>
        </nav>
    </div>
</header>