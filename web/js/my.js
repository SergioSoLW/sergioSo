// console.log(1)

$(function(){

//首页
	//banner轮播
	var bannerphoto=$("#banner .bannerphoto")//获取图片
	var imgCon =$("#banner .bannerphoto li");
	//除第一张其余的图片全部隐藏
	imgCon.not(imgCon.eq(0)).hide();
	//定义页码
	var num =$("#banner .bannav")
	//获取li标签的长度
	//find()方法返回备选元素的后代元素
	var len =bannerphoto.find("li").length;
	index=0;
	//显示索引对应的图片
	function showPic(index) {
		imgCon.eq(index).show().siblings("li").hide();
	    num.find("li").eq(index).addClass("home-now").siblings("li").removeClass("home-now")
	}
	//圆点点击事件
	$(".bannav li").click(function () {
	    index=$(this).index()
	    console.log("yuan"+index)
	    showPic(index)
	})
	//左按钮点击事件
	$(".leftbt").click(function () {
	    if(index<=0){
	    index= len -1
	    }else{
	    index--
		}
	    showPic(index)//显示
	})
	//右按钮点击事件
	$(".rightbt").click(function () {
		if(index+1>len-1){
	    index=0
	    }else{
	    index++
	    }
	    showPic(index)//显示
	})
	//图片轮播
	$("#banner").hover(function () {
	    clearInterval(window.timer)
	},function () {
		window.timer =setInterval(function () {
	    showPic(index);
	    index++;
	    if (index ==len){
	    index =0
	    }
		},3000)
	}).trigger("mouseleave")//触发备选元素的指定事件
		
		
	//TOP返回顶部
	var goBack = $(".goBack")
	var silder = $(".sidelist")
	goBack.onclick=function(){
		window.scrollTo(0,0)
	}
	//给页面绑定滚动条事件
	document.onscroll=function(){
		if(window.pageYOffset > 650){
			silder.css("display","block")
		}else{
			silder.css("display","none")
		}
	}
	

// 购物车
	// 全选
	$(".checkall,.j-checkbox").prop("checked",false)
	$(".checkall").change(function(){
		$(".j-checkbox,.checkall").prop("checked",$(this).prop("checked"))
		getSum()
	})
	$(".j-checkbox").change(function(){
		if($(".j-checkbox:checked").length == $(".j-checkbox").length){
			$(".checkall").prop("checked",true)
		}else{
			$(".checkall").prop("checked",false)
		}
		getSum()
	})
	
	
	
	// 控制商品数量加减
	// 加
	$(".numrbt").click(function(){
		var n = $(this).siblings(".num").val()
		n++
		$(this).siblings(".num").val(n)
		// 小计
		var p = $(this).parents("td").siblings(".c-price").find(".ptxt2").html()
		p = p.substr(1)	// 去掉价格中的$符号
		var price = (p * n).toFixed(2)
		$(this).parents("td").siblings(".c-price").find(".ptxt").html("$"+price)
		getSum()
	})
	
	// 减
	$(".numlbt").click(function(){
		var n = $(this).siblings(".num").val()
		if(n == 1){
			return false
		}
		n--
		$(this).siblings(".num").val(n)
		// 小计
		var p = $(this).parents("td").siblings(".c-price").find(".ptxt2").html()
		p = p.substr(1)	// 去掉价格中的$符号
		var price = (p * n).toFixed(2)
		$(this).parents("td").siblings(".c-price").find(".ptxt").html("$"+price)
		getSum()
	})
	
	
	//总金额
	function getSum(){
		// //计算总件数
		// var count = 0
		var item = $(".j-checkbox:checked").parents(".cart-item")
		// console.log(item)
		// item.find(".num").each(function(i,ele){
		// 	count += parseInt($(ele).val())
		// })
		//计算总额
		var money = 0
		item.find(".ptxt").each(function(i,ele){
			money += parseFloat($(ele).text().substr(1))
		})
		$(".price-sum").text("$" + money.toFixed(2))
	}
	getSum()
	
	
	//删除
	$(".c-table a").click(function(){
		$(this).parents("tr").remove()
		getSum()
	})
	$(".c-clear a").click(function(){
		$(".j-checkbox:checked").parents("tr").remove()
		$(".checkall").prop("checked",false)
		getSum()
	})
	
	
	
	
	
	
	
})