<%--
  Created by IntelliJ IDEA.
  User: TYDHG
  Date: 2021/6/16
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Cass</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<c:import url="header"></c:import>

<div class="user">
    <img src="img/登录左.jpg" class="lg-bg1">
    <div class="layout">
        <div id="lg2"><img src="img/登录2.jpg" class="lg-bg2"></div>
        <div class="userlogin">
            <h2>Log In</h2>
            <form action="" method="post">
                <p><input type="text" class="uname" name="uemail" id="" value="" placeholder="Email adress or username" /></p>
                <p><input type="password" class="upw" name="upwd" placeholder="Password" /></p>
                <p class="login-text forgot"><a href="#">Forgot password?</a></p>
                <p class="bt"><input type="submit" class="bt-continue" name="" id="" value="Continue" /></p>
                <p class="bt"><input type="submit" class="bt-facebook" name="" id="" value="Facebook Login" /></p>
                <p class="login-text create"><a href="registerEmail">New user?Create an account!</a></p>
            </form>
        </div>
    </div>
</div>

<footer>
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

</body>
</html>
