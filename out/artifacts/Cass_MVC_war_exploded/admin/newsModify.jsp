<%--
  Created by IntelliJ IDEA.
  User: TYDHG
  Date: 2021/6/17
  Time: 19:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>main area</title>
    <link rel="stylesheet" type="text/css" href="./css/style.css"/>
    <script src="js/jquery-3.5.1.js" type="text/javascript" charset="utf-8"></script>
    <script>
        window.onload=function () {
            var code1=0;
            var code2=0;
            var code3=0;
            var code4=0;
            $(".code1").val("1");
            $(".code2").val("1");
            $(".code3").val("1");
            $(".code4").val("1");

            var date="";
            var title="";
            var desc="";
            var content="";
            //日期
            $(".txtDate").keyup(function () {
                date=$(".txtDate").val();
                console.log(date)
                if (date!=null){
                    $.post("../Utils/CheckDate",{date:date},function (data) {
                        console.log("post")
                        if (data.code==0){
                            $(".errorinfo").eq(1).text(data.msg).show();
                            console.log(data.msg)
                            code1=0;
                            $(".code1").val("0");
                            console.log(code1)
                        }else {
                            code1=1;
                            $(".code1").val("1");
                            $(".errorinfo").eq(1).hide();
                        }
                    },"json")
                }else {
                    $(".errorinfo").eq(1).text("日期不能为空").show();
                }
            })

            //标题
            $(".longtxt").blur(function () {
                title=$(".longtxt").val()
                if (title==""){
                    $(".errorinfo").eq(0).text("标题不能为空").show();
                    code2=0;
                    $(".code2").val("0");
                }else {
                    $(".errorinfo").eq(0).hide();
                    code2=1
                    $(".code2").val("1");
                }
            })

            //简介
            $(".contxt").blur(function () {
                desc=$(".contxt").val()
                if (desc==""){
                    $(".errorinfo").eq(2).text("简介不能为空").show();
                    code3=0;
                    $(".code3").val("0");
                }else {
                    $(".errorinfo").eq(2).hide();
                    code3=1
                    $(".code3").val("1");
                }

            })
            //内容
            $(".acontent").blur(function () {
                content=$(".acontent").val()
                if (content==""){
                    $(".errorinfo").eq(3).text("内容不能为空").show();
                    code4=0;
                    $(".code4").val("0");
                }else {
                    $(".errorinfo").eq(3).hide();
                    code4=1
                    $(".code4").val("1");
                }

            })
        }
    </script>
</head>


<body id="frmain">
<div id="main">
    <div id="amain">
        <div class="opttips">
            <h3><label>Operating instructions：</label>Need to upload cover image (250 * 160).</h3>
        </div>
        <form action="newsModify" method="post" enctype="multipart/form-data">
            <input class="code1" type="hidden" name="code1" value="">
            <input class="code2" type="hidden" name="code2" value="">
            <input class="code3" type="hidden" name="code3" value="">
            <input class="code4" type="hidden" name="code4" value="">
            <table border="0" cellspacing="0" class="tbedit">
                <tr>
                    <th width="280" align="right" scope="row">*The title：</th>
                    <td align="left">
                        <input type="text" name="ntitle" id="" class="longtxt" value="${news.ntitle}" /><span class="errorinfo" id="">请输入名称</span>
                    </td>
                </tr>
                <tr>
                    <th width="280" align="right" scope="row">*Release time：</th>
                    <td align="left">
                        <input type="text" name="ndate2" id="" class="txtDate" value="${news.ndate}"/><span class="errorinfo" id="">不能为空或格式不对</span>
                    </td>
                </tr>
                <tr>
                    <th width="280" align="right" scope="row">*Upload pictures：</th>
                    <td align="left">
                        <img src="/Cass_MVC/uploads/${news.nimg1}">

                        <input type="file" name="nimg1" id="" mode="require"/>

                    </td>
                </tr>

                <tr>
                    <th width="280" align="right" scope="row">Abstract：</th>
                    <td align="left">
                        <textarea name="ndesc" class="contxt">${news.ndesc}</textarea><span class="errorinfo" id="">请上传图片</span></td>
                </tr>

                <tr>
                    <th width="280" align="right" scope="row">*Content：</th>
                    <td align="left">
                        <textarea  name="ncontent" id="" class="acontent">${news.ncontent}</textarea><span class="errorinfo" id="">请上传图片</span>
                    </td>
                </tr>
                <tr>
                    <th scope="row">&nbsp;</th>
                    <td align="left">
                        <input name="" type="submit" value="Modify"  class="savebt"/></td>
                </tr>
            </table>
        </form>
    </div>
</div>
</body>

</html>
