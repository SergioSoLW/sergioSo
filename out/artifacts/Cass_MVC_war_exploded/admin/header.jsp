<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2021/6/4
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>header</title>
    <link rel="stylesheet" type="text/css" href="./css/style.css"/>
</head>

<body>
<header><img src="../img/logo.png" id="logo" >
    <ul id="headernav">
        <li class="home"><a href="#" target="_blank">CASS</a></li>
        <li class="upwd"><a href="#" target="mainFrame">UpdatePassword</a></li>
        <%
            Object aname= request.getSession().getAttribute("saname");
            if (aname==null){
                out.println("<li class=\"sign-out\"><a href=\"login\">LOGIN</a></li>");
            }else {
                out.println("<li class=\"sign-out\"><a href=\"logout\">LOGOUT</a></li>");
            }
        %>

    </ul>
</header>

</body>
</html>
