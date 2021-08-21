<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2021/5/28
  Time: 11:08
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
    <link href="./css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>

<div id="wrapper">
    <div class="layout">

        <h3>${news.ntitle}</h3>
            <img src="/Cass_MVC/uploads/${news.nimg1}" width="1000px" height="680px" />
            <div id="content">
<%--                <h2>About</h2>--%>
                <p>${news.ncontent}</p>
            </div>
<%--            <div id="sidebar">--%>
<%--                <h2>Details</h2>--%>
<%--                <dl>--%>
<%--                    <dt>Adress</dt>--%>
<%--                    <dd>Dallas Market Center,</dd>--%>
<%--                    <dd>Main Hall, 2200 N.</dd>--%>
<%--                    <dd>Stemmons FWY, Dallas, TX</dd>--%>
<%--                    <dd>75207</dd>--%>
<%--                    <div class="Date">--%>
<%--                        <dt>Date</dt>--%>
<%--                        <dd>May 30th + 31st</dd>--%>
<%--                    </div>--%>
<%--                    <dt>Hours</dt>--%>
<%--                    <dd>12:00 - 7:00 PM</dd>--%>
<%--                </dl>--%>
<%--            </div>--%>
<%--            <div id="other">--%>
<%--                <h3>For Sponsors and Vendors</h3>--%>
<%--                    <p>Interested in helping make Sneaker Con happen? Please click one of the options below and we will get back to you as soon as possible.</p>--%>
<%--                    <ul>--%>
<%--                        <li><a href="#">Become a Vendor</a></li>--%>
<%--                        <li><a href="#">Become a Sponsor</a></li>--%>
<%--                    </ul>--%>
<%--            </div>--%>
    </div>

</div>
<!-- 底部 -->

<ul class="sidelist">
    <li><a href="#">TOP</a></li>
</ul>
</body>
</html>
