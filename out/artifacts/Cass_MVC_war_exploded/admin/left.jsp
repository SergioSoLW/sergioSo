<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2021/6/4
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>left</title>
    <link rel="stylesheet" type="text/css" href="./css/style.css"/>
    <script language="javascript" src="./js/jquery-3.5.1.js"></script>
</head>

<body>
<script>
    window.onload=function(){
        $("h2").click(function(){
            if($(this).hasClass("clicked")){
                $(this).removeClass("clicked");
                $(this).siblings("ul").stop().slideUp(400)
                flage=1
            }else{
                $("h2").removeClass("clicked")
                $("ul").stop().slideUp(400)
                $(this).addClass("clicked")
                $(this).siblings("ul").stop().slideDown(400)
            }
        })
        $("h3").click(function(){
            $(this).addClass("cilked").parent("li").siblings("li").children("h3").removeClass("cilked");
        })
    }
</script>
<div id="left">
    <div id="total-list"><!-- 总列表 -->
        <div class="item">
            <h2 ><a href="#">Basic</a></h2>
            <ul >
                <li><h3><a href="#" target="mainFrame">E-mail Configuration</a></h3></li>
                <li><h3><a href="adminUpdate" target="mainFrame">Update Password</a></h3></li>
                <li><h3><a href="#" target="mainFrame">Statement</a></h3></li>
                <li><h3><a href="#" target="mainFrame">Contact Information</a></h3></li>
            </ul>
        </div>
        <div class="item">
            <h2><a href="#">News</a></h2>
            <ul>
                <li><h3><a href="newsAdd" target="mainFrame">Add News</a></h3></li>
                <li><h3><a href="newsList" target="mainFrame">News List</a></h3></li>
            </ul>
        </div>
        <div class="item">
            <h2><a href="#">Product</a></h2>
            <ul>
                <li class="block">
                    <h3 class="level3"><a href="#">Brand Manage</a></h3>
                    <div class="Secondary-list">
                        <h4><a href="#" target="mainFrame">Add Brand</a></h4>
                        <h4><a href="#" target="mainFrame">Brand List</a></h4>
                    </div>
                </li>
                <li class="block">
                    <h3 class="level3"><a href="#">Sneakers Manage</a></h3>
                    <div class="Secondary-list">
                        <h4><a href="#" target="mainFrame">Add Sneakers</a></h4>
                        <h4><a href="#" target="mainFrame">Sneakers List</a></h4>
                    </div>
                </li>
            </ul>
        </div>
        <div class="item">
            <h2><a href="#" target="mainFrame">Order</a></h2>
        </div>
        <div class="item">
            <h2><a href="#">User</a></h2>
            <ul>
                <li><h3><a href="#" target="mainFrame">User Comments</a></h3></li>
                <li><h3><a href="#" target="mainFrame">User List</a></h3></li>
            </ul>
        </div>
        <div class="item">
            <h2><a href="#">Administrator</a></h2>
            <ul>
                <li><h3><a href="#" target="mainFrame">Add Manager</a></h3></li>
                <li><h3><a href="#" target="mainFrame">Manager List</a></h3></li>
            </ul>
        </div>
    </div>
    <div class="rightcopy">&copy;Cass2020</div>
</div>
</body>
</html>
