<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2021/6/4
  Time: 8:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>CASS Manager-Login</title>
    <link rel="stylesheet" type="text/css" href="./css/style.css"/>
</head>

<body>
<header><img src="../img/logo.png" id="logo" ></header>

<div class="user">
    <div class="layout">
        <div class="userlogin">
            <h2>Hello manager</h2>
            <form action="login" method="post">
                <ul>
                    <li><input type="text" class="uname" name="aaccount" id="" value="" placeholder="Email adress or username" /></li>
                    <li><input type="password" class="upw" name="apwd" placeholder="Password" /></li>
                    <li class="login-text forgot"><a href="#">Forgot password?</a></li>
                    <li class="checknoli"><p><input type="text" name="checkno" value="" class="checkno-txt" placeholder="Verification code"/><img src="img/checkno.jpg" class="checkimg"/></p>
                    </li>
                    <li class="bt"><input type="submit" class="bt-continue" name="" id="" value="Log In" /></li>
                    <!-- <li class="login-text create"><a href="sign up1.html">New user?Create an account!</a></li> -->
                </ul>
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
