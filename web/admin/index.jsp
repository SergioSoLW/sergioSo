<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2021/6/4
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Cass Backstage</title>
    <link rel="stylesheet" type="text/css" href="./css/style.css"/>
</head>


<frameset rows="100,*" cols="*" frameborder="NO" border="0" framespacing="0">
    <frame src="header.jsp" name="topFrame" scrolling="no" noresize >
    <frameset cols="260,*" frameborder="NO" border="0" framespacing="0" id="frame-body">
        <frame src="left.jsp" name="leftFrame" scrolling="yes" noresize frameborder="no">
        <frame src="main.jsp" name="mainFrame" scrolling="yes" frameborder="no">
    </frameset>

</frameset>
<noframes><body>
</body></noframes>

</html>