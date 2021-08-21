<%--
  Created by IntelliJ IDEA.
  User: TYDHG
  Date: 2021/6/17
  Time: 15:29
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
    <script src="js/jquery-3.5.1.js"></script>
    <script>
        window.onload=function () {
            var code=0;
            $(".code").val(0);
            var pwd1="";
            var pwd2="";
            $(".errorinfo").eq(0).hide();
            $(".errorinfo").eq(1).hide();

            $(".sign-pw").blur(function () {
                pwd1=$(".sign-pw").val()
                if (pwd1==""){
                    $(".errorinfo").eq(0).text("密码不能为空").show();
                    $(".code").val(0)
                }else {
                    $(".errorinfo").eq(0).hide();
                }
            })
            $(".sign-conpw").blur(function () {
                pwd2=$(".sign-conpw").val()
                if (pwd2==""){
                    $(".errorinfo").eq(1).text("密码不能为空").show();
                    $(".code").val(0)
                }else {
                    $(".errorinfo").eq(1).hide();
                }
            })

            $(".sign-conpw").keyup(function () {
                pwd1=$(".sign-pw").val()
                pwd2=$(".sign-conpw").val()
                if (pwd2!=pwd1){
                    $(".errorinfo").eq(1).text("密码不一致").show();
                    $(".code").val(0)
                }else {
                    $(".errorinfo").eq(1).hide();
                    $(".code").val(1)
                    console.log("ok")
                }

            })

        }
    </script>
</head>
<body>
<c:import url="header"></c:import>
<div class="user">
    <img src="img/登录左.jpg" class="lg-bg1">
    <div class="layout">
        <div id="lg2"><img src="img/登录2.jpg" class="lg-bg2"></div>
        <div class="userlogin">
            <h2>Sign Up</h2>
            <form action="" method="post">
                <input class="code" type="hidden" name="code">
                <p class="sign-text2">Now set your password.</p>
                <p><input type="password" class="sign-pw" name="" placeholder="Password" /><span class="errorinfo" id="">请上传图片</span></p>
                <p><input type="password" class="sign-conpw" name="upwd2" placeholder="Confirm password" /><span class="errorinfo" id="">请上传图片</span></p>
                <p class="sign-text3"><span>NOTE：</span>Password must be at least 6 characters long and have 1 lowercase,1 uppercase,1 number!</p>
                <p class="bt"><input type="submit" class="bt-continue" name="" id="" value="Finish" /></p>
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
