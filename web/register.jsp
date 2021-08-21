<%--
  Created by IntelliJ IDEA.
  User: TYDHG
  Date: 2021/6/17
  Time: 15:27
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
            $(".errorinfo").hide()
        var code1=0;
        var email="";
        $(".code").val(0)

        $(".sign-email").keyup(function () {
            email=$(".sign-email").val();
            if (email!=""){
                $.post("checkEmailUtils",{email:email},function (data) {
                    if (data.code==0){
                        $(".errorinfo").text(data.msg).show()
                        $(".code").val(0)
                         code1=0;
                        console.log(data)
                    }else {
                        $(".code").val(1)
                        code1=1;
                        $(".errorinfo").hide()
                        console.log("正常",data)
                    }
                },"json")
            }else {
                $(".errorinfo").text("邮箱不能为空").show()
                $(".code").val(0)
                code1=0;
                console.log("空")
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
                <p class="sign-text1">Enter your email below, and we’ll email <span>you a passcode to verify it.</span></p>
                <p><input type="text" class="sign-email" name="uemail" id="" value="" placeholder="Email adress" /><span class="errorinfo" id="">请上传图片</span></p>
<%--                <p><span class="errorinfo" id="">请上传图片</span></p>--%>
                <p class="bt"><input type="submit" class="bt-continue" name="" id="" value="Continue" /></p>
                <p class="bt"><input type="submit" class="bt-facebook" name="" id="" value="Facebook Login" /></p>
                <p class="login-text create"><a href="login">Already have an account?</a></p>
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
