<%--
  Created by IntelliJ IDEA.
  User: TYDHG
  Date: 2021/6/11
  Time: 21:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>New List</title>
    <link rel="stylesheet" type="text/css" href="css/style.css"/>
</head>
<body id="frmain">
<div id="main">
    <div id="newslist">
        <div class="layout">
            <ul>
                <c:forEach var="news" items="${news}">
                <li>
                    <div class="left-photo">
                        <img src="/Cass_MVC/uploads/${news.nimg1}" width="200px" height="130px"/>
                    </div>
                    <div class="right-news">
                        <a href="news?nid=${news.nid}"><h3>${news.ntitle}</h3></a>
                        <h4>Date：<f:formatDate value="${news.ndate}" pattern="dd.MM.yyyy"></f:formatDate></h4>
                        <p>${news.ndesc}</p>
                    </div>
                    <div class="features">
                        <p><a href="newsModify?nid=${news.nid}">Modify</a></p>
                        <p><a href="#">Delete</a></p>
                    </div>
                </li>
                </c:forEach>
            </ul>
            <div class="pagenav">
                ${pnav}
            </div>
        </div>
    </div>
</div>
</body>
</html>
