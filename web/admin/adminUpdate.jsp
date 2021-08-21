<%--
  Created by IntelliJ IDEA.
  User: TYDHG
  Date: 2021/6/17
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>main area</title>
    <link rel="stylesheet" type="text/css" href="css/style.css"/>
    <script src="js/jquery-3.5.1.js" type="text/javascript" charset="utf-8"></script>
    <script>
        window.onload=function () {
            var opwd="";
            var npwd1="";
            var npwd2="";
            var code=0;
            var code1=0;
            var code2=0;
            var code3=0;
            var code4=0;
            $(".code1").val("0");
            //旧密码
            $("#oldpwd").blur(function () {
                opwd=$("#oldpwd").val();
                if (opwd!=""){
                    $.post("../Utils/CheckPwdUtils",{opwd:opwd},function (data) {
                        console.log("post")
                        if (data.code==0){
                            $(".errorinfo").eq(0).text(data.msg).show();
                            console.log(data.msg)
                            code1=0;

                            console.log(code1)
                        }else {
                            code1=1;
                            $(".errorinfo").eq(0).hide();
                        }
                    },"json")
                }else {
                    $(".errorinfo").eq(0).text("旧密码不能为空").show();
                    code1=0;
                }
            })
            //新密码
            $("#newpwd1").blur(function () {
                npwd1=$("#newpwd1").val()
                if (npwd1==""){
                    $(".errorinfo").eq(1).text("密码不能为空").show();
                    code2=0;
                }else {
                    $(".errorinfo").eq(1).hide();
                    code2=1;
                }
            })
            $("#newpwd2").blur(function () {
                npwd2=$("#newpwd2").val()
                if (npwd2==""){
                    $(".errorinfo").eq(2).text("密码不能为空").show();
                    code3=0;
                }else {
                    $(".errorinfo").eq(2).hide();
                    code3=1;
                }
            })

            $("#newpwd2").keyup(function () {
                npwd1=$("#newpwd1").val()
                npwd2=$("#newpwd2").val()
                if (npwd2!=npwd1){
                    $(".errorinfo").eq(1).text("密码不一致").show();
                    code4=0;
                }else {
                    $(".errorinfo").eq(1).hide();
                   code4=1;
                    console.log("ok")
                }

            })
            $(".savebt").click(function () {
                if (code1==0||code2==0||code3==0||code4==0){
                    $(".code1").val("0");
                }else {
                    $(".code1").val("1");
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
        <form action="" method="post">
            <input class="code1" type="hidden" name="code1">
            <table border="0" cellspacing="0" class="tbedit">
                <tr>
                    <th width="280" align="right" scope="row">*Old Password：</th>
                    <td align="left">
                        <input type="password" name="opwd" id="oldpwd" class="longtxt" value="" /><span class="errorinfo" id="">请输入名称</span>
                    </td>
                </tr>
                <tr>
                    <th width="280" align="right" scope="row">*New Password：</th>
                    <td align="left">
                        <input type="password" name="" id="newpwd1" class="longtxt" value=""/><span class="errorinfo" id="">不能为空或格式不对</span>
                    </td>
                </tr>

                <tr>
                    <th width="280" align="right" scope="row">Config your Password：</th>
                    <td align="left">
                        <input type="password" name="npwd2" id="newpwd2" class="longtxt" value="" />
                    </td>
                </tr>


                <tr>
                    <th scope="row">&nbsp;</th>
                    <td align="left">
                        <input name="" type="submit" value="Add"  class="savebt"/></td>
                </tr>
            </table>
        </form>
    </div>
</div>
</body>

</html>
