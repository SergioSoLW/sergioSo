<%@ page import="com.sneaker.cass.utils.JsUtils" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2021/6/4
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>error</title>
    <link rel="stylesheet" type="text/css" href="css/warn.css"/>
    <script>
        window.onload=function(){
            var time=5;

            var e= document.getElementsByClassName("back")
            var ec=e[0].children
            var t = setInterval(function(){
                time--;
                ec[0].innerHTML="自动后退："+time+"秒";

                //console.log(ec)
                if(time==0){
                    clearInterval(t);
                    history.back()
                    //console.log("jieshu")
                }

                //e.geta(time+"点击返回上一页")
            },1000)

        }

    </script>
</head>


<body id="frmain">
<div id="main">
    <div class="alret">
        <img src="img/error.png" >
        <h1 class="err">${msg}</h1>
        <p class="back"><a href="javascript:history.back()">自动后退：5秒</a></p>
    </div>
</div>


</body>

</html>

