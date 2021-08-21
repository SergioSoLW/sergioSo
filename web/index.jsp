<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2021/5/28
  Time: 8:45
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Cass</title>
  <link href="css/style.css" rel="stylesheet" type="text/css" />
  <script src="js/jquery-3.5.1.js"></script>
  <script src="js/my.js"></script>

</head>
<body>
<c:import url="header"></c:import>

<div id="index">
  <div id="banner">
    <ul class="bannerphoto">
      <li><a href="#"><img src="img/index1.jpg" ></a></li>
      <li><a href="#"><img src="img/index2.jpg" ></a></li>
      <li><a href="#"><img src="img/index3.jpg" ></a></li>
      <li><a href="#"><img src="img/index4.jpg" ></a></li>
    </ul>
    <a href="#" class="leftbt">&lt;</a>
    <a href="#" class="rightbt">&gt;</a>
    <ul class="bannav">
      <li class="home-now"></li>
      <li></li>
      <li></li>
      <li></li>
    </ul>
  </div>
  <div class="popular">
    <div class="layout-popular">
      <h2>Popular Product</h2>
      <div class="product">
        <ul>
          <li>
            <a href="#"><img src="img/p1.jpg" ></a>
            <h4>Jordan</h4>
            <h3><a href="#">Air Jordan 1 Retro High Pine Green</a></h3>
            <p><a href="#">$260</a></p>
          </li>
          <li>
            <a href="#"><img src="img/p2.jpg" ></a>
            <h4>Jordan</h4>
            <h3><a href="#">Air Jordan 1 Retro High Bred Toe</a></h3>
            <p><a href="#">$380</a></p>
          </li>
          <li>
            <a href="#"><img src="img/p3.jpg" ></a>
            <h4>Jordan</h4>
            <h3><a href="#">Air Jordan 1 Retro High Court Purple</a></h3>
            <p><a href="#">$310</a></p>
          </li>
          <li>
            <a href="#"><img src="img/p4.jpg" ></a>
            <h4>Jordan</h4>
            <h3><a href="#">Travis Scott x Air Jordan 1 High OG TS SP</a></h3>
            <p><a href="#">$957</a></p>
          </li>
        </ul>
      </div>
    </div>

  </div>


</div>

<footer>
  <div id="top-footer">
    <div class="layout">
      <h2>How It Works</h2>
      <ul>
        <li><span>Buy, Sell, Trade</span>
          Browse thousands of rare kicks and steals in the Sneaker Con marketplace.
        </li>
        <li><span>Legitimize</span>
          Get your sneakers authenticated using Sneaker Con's authenticity program and Legit Certified Tags.</li>
        <li><span>The Greatest Sneaker Show</span>
          Join us at Sneaker Con to buy, sell or trade your sneaker collection with thousands of sneaker fans.</li>
      </ul>
      <div id="Subscribe">
        <h3>Subscribe to the Cass newsletter!</h3>
      </div>

    </div>
  </div>
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
        <li>&copy;Cass2020</li>
      </ul>
    </div>
  </div>
</footer>
<ul class="sidelist">
  <li class="goBack"><a href="#">TOP</a></li>
</ul>
</body>
</html>
