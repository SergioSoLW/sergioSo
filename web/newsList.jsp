<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2021/5/28
  Time: 9:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Cass</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<c:import url="header"></c:import>

<div id="newslist">
    <div class="layout">
        <h2>NEWS</h2>
        <ul><c:forEach items="${news}" var="news">
            <li>
                <div class="left-photo">
                    <img src="/Cass_MVC/uploads/${news.nimg1}" width="200px" height="130px"/>
                </div>
                <div class="right-news">
                    <a href="news?nid=${news.nid}"><h3>${news.ntitle}</h3></a>
                    <h4>Date：<fmt:formatDate value="${news.ndate}" pattern="dd.MM.yyyy"></fmt:formatDate> </h4>
                    <p>${news.ndesc}</p>
                </div>
            </li>
        </c:forEach>
        </ul>
        <div class="pagenav">
            ${pnav}
        </div>
    </div>
</div>

<footer>
    <div id="top-footer">
        <div class="layout">
            <h2>How It Works</h2>
            <ul>
                <li><span>Buy, Sell, Trade</span>
                    Browse thousands of rare kicks and steals in the Sneaker Con marketplace.
                </li>
                <li><span>Legitimize</span>
                    Get your sneakers authenticated using Sneaker Con's authenticity program and Legit Certified Tags.</li>
                <li><span>The Greatest Sneaker Show</span>
                    Join us at Sneaker Con to buy, sell or trade your sneaker collection with thousands of sneaker fans.</li>
            </ul>
            <div id="Subscribe">
                <h3>Subscribe to the Cass newsletter!</h3>
                <!-- <div id="email">
                    <input type="text" name="search" placeholder="Your email adress">
                    <div id="signup"><a href="#">Sign up</a></div>
                </div> -->
            </div>

        </div>
    </div>
    <div id="bottom-footer">
        <div class="layout">
            <ul>
                <li><a href="#">Contact</a></li>
                <li><a href="#">Terms</a></li>
                <li><a href="#">Privacy</a></li>
                <li><a href="#">Our Story</a></li>
                <li><a href="#">FAQ</a></li>
                <li><a href="#">Get Our App</a></li>
                <li><a href="#"></a></li>
                <li><a href="#">&copy;Cass2020</a></li>
            </ul>
        </div>
    </div>
</footer>
<ul class="sidelist">
    <li><a href="#">TOP</a></li>
</ul>
</body>
</html>
