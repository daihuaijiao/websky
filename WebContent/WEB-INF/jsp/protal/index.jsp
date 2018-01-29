<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();   
String basePath = request.getScheme()+"://" +request.getServerName()+":" +request.getServerPort()+path+"/" ;   
%>
<!DOCTYPE html>
<html>
	<head>
		<!-- 为了让 Bootstrap 开发的网站对移动设备友好，确保适当的绘制和触屏缩放，需要在网页的 head 之中添加 viewport meta 标签，如下所示 -->
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<!-- IE=1表示强制使用最新IE内核，chrome=1表示如果安装了针对IE6/7/8插件（浏览器外观是IE实际上使用的是CHROME内核 -->
		<meta http-equiv="X-UA-Compatible" content="IE=edge"/>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="description" content="杨岐山，杨岐禅寺，杨岐普通寺，上栗县杨岐寺，慧通老和尚，佛教，yangqisi，宗教" />
		<title>杨岐普通禅寺</title>
		<link rel="stylesheet" type="text/css" href="<%=path%>/js/bootstarp3.3.7/css/bootstrap.css">
		<link rel="stylesheet" type="text/css" href="<%=path%>/css/yangqisi.css" />
		<!-- HTML5 Shiv 和 Respond.js 用于让 IE8 支持 HTML5元素和媒体查询 -->
		<!-- 注意： 如果通过 file://  引入 Respond.js 文件，则该文件无法起效果 -->
		<!--[if lt IE 9] -->
		<script type="text/javascript" src="<%=path%>/js/bootstarp3.3.7/js/html5shiv.js"></script>
		<script type="text/javascript" src="<%=path%>/js/bootstarp3.3.7/js/respond.min.js"></script>
		<script type="text/javascript" src="<%=path%>/js/jquery-easyui-1.5/jquery.min.js"></script>
		<script type="text/javascript" src="<%=path%>/js/bootstarp3.3.7/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="<%=path%>/js/common.js"></script>
	</head>
	<body>
		<div class="container">
			<div class="row clearfix">
				<div class="col-md-11 column">
					<div class="row clearfix">
						<div id="marquee" style="float: left; height: 17px ">
						
						</div>
						<div id="linkweb" style="float: left; padding-left: 100px;">
							<a id="str_date"></a>
							<a id="fo_year" style="padding-left: 100px;"></a>
						</div>
						<div style="float: right;padding-right: 10px">
							<a href="javascript:void(0);" onclick="addFavorite('杨岐普通禅寺','http://www.yangqiputongsi.com')">加入收藏</a>&nbsp;|&nbsp;<a href="javascript:void(0);" onclick="setHome(this,'http://www.yangqiputongsi.com')">设为首页</a>&nbsp;&nbsp;|&nbsp;&nbsp;<script src="<%=path%>/js/language.js"></script>
						</div>
					</div>
				</div>
			</div>
			
			<div class="row clearfix">
				<div class="col-md-11 column">
					<div class="row clearfix">
						<div class="wzbj">
							<img style="width:100%" alt="wzbj" src="<%=path%>/images/wzbj.jpg" />
						</div>
					</div>
				</div>
			</div>
			<div class="row clearfix">
				<div class="col-md-11 column">
					<div class="row clearfix">
						<ul class="banner text-center">
							<li class="active">
								 <a href="showProtalPage.action">首  页</a>
							</li>
							<li class="disabled">
								 <a href="javascript:void(0)" onclick="showProtalNewsPage(0,1,1)">最新动态</a>
							</li>
							<li class="disabled">
								 <a href="javascript:void(0)" onclick="showProtalNewsPage(0,41,1)">杨岐重兴</a>
							</li>
							<li class="disabled">
								 <a href="javascript:void(0)" onclick="showProtalNewsPage(0,15,1)">高僧大德</a>
							</li>
							<li class="disabled">
								 <a href="javascript:void(0)" onclick="showProtalNewsPage(0,10,1)">拈花悟旨</a>
							</li>
							<li class="disabled">
								 <a href="javascript:void(0)" onclick="showProtalNewsPage(0,13,1)">禅茶一味</a>
							</li>
							<li class="disabled">
								 <a href="javascript:void(0)" onclick="showProtalNewsPage(0,2,1)">佛教知识</a>
							</li>
							<li class="disabled">
								 <a href="javascript:void(0)" onclick="showProtalNewsPage(0,12,1)">修学园地</a>
							</li>
							<li class="disabled">
								 <a href="javascript:void(0)" onclick="showProtalNewsPage(0,11,1)">随喜功德</a>
							</li>
							<li class="disabled">
								 <a href="javascript:void(0)" onclick="showProtalNewsPage(0,9,1)">寺院巡礼</a>
							</li>
							<li class="disabled">
								 <a href="javascript:void(0)" onclick="showProtalNewsPage(0,72,1)">杨岐心灯</a>
							</li>
							<li class="disabled">
								 <a href="javascript:void(0)" onclick="showProtalNewsPage(0,42,1)">老和尚言行录</a>
							</li>
						</ul>
					</div>
				</div>
			</div>
			
			<div class="row clearfix">
				<div class="col-md-11 column">
					<div class="row clearfix">
						<div class="col-md-3 column">
							<div class="list-group">
								<a class="list-group-item active list_group_title_left">慧通老和尚&nbsp;Venerable Hui Tong</a>
								<!-- <p>慧通老和尚&nbsp;Venerable Hui Tong</p> -->
								<img alt="慧通老和尚" src="<%=path%>/images/huitong.jpg" style="max-width:100%;align:center;"/>
							</div>
							<div class="list-group">
								<a class="list-group-item active list_group_title_left">重大事件&nbsp;Important event</a>
								<!-- <h1>重大事件&nbsp;Important event</h1> -->
								<div class="list-group-item" style="background: #E1CFBB;">
									<ul id="zhongda" class="list-group-item-left">
									 	<li><a>暂无信息！</a></li>
									</ul>
								</div>
							</div>
							<div class="list-group">
								<a class="list-group-item active list_group_title_left">高僧大德&nbsp;Senior monks</a>
								<div class="list-group-item" style="background: #E1CFBB;">
									<ul id="dade" class="list-group-item-left">
										<li><a>暂无信息！</a></li>
									</ul>
								</div>
							</div>
							<div class="list-group">
								 <a class="list-group-item active list_group_title_left">佛教知识&nbsp;Common sense</a>
								<div class="list-group-item" style="background: #E1CFBB url(<%=path%>/images/fobg.jpg) no-repeat; height: 310px;">
									<ul id="zhishi" class="list-group-item-left">
										<li><a>暂无信息！</a></li>
									</ul>
								</div>
							</div>
						</div>
						
						<div class="col-md-6 column">
							<div class="list-group">
								<a class="list-group-item active list_group_title_middle">最新动态&nbsp;News</a>
								<div id="news" class="list-group-item middle_column ">
									<!-- <img id="top-img" alt="新闻图片" style="width:230px;height:140px;" src="./images/255x200.jpg" />
									<h2><a>2017年度杨岐心灯帮扶计划...</a></h2>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/news/show.asp?artid=901">“心灯帮扶计划”是杨岐普通寺在萍乡市民宗局、上栗县民宗局的指导下，香港中华总商会会长、旭日集团董事香港中华总商团......</a>
									<ul id="news" class="double_list protal_list">
									 	<li><a>暂无信息！</a></li>
									</ul> -->
								</div>
							</div>
							<div class="list-group">
								 <a class="list-group-item active list_group_title_middle">老和尚言行录&nbsp;Hadith</a>
								<div style="height: 60px" class="list-group-item">
									<ul id="yxl" class="protal_list">
										<li></li>
									</ul>
								</div>
							</div>
							<div class="list-group">
								 <a class="list-group-item active list_group_title_middle">拈花悟旨&nbsp;Wu aims Nianhua</a>
								<div class="list-group-item">
									<ul id="wuzhi" class="double_list protal_list">
										<li><a>暂无信息！</a></li>
									</ul>
								</div>
							</div>
							<div class="list-group">
								 <a class="list-group-item active list_group_title_middle">视频&nbsp;Video</a>
								<dl style="margin-bottom: 5px;">
									<table width="480" border="0" cellpadding="0" cellspacing="0">
										<tr><td width="240" align="center"><a href="showVideoPage.action"><img src="<%=path%>/images/20110704slxw.png"  border="0"/></a></td>
										<td width="240" height="98" align="center"><a href="showVideoPage.action"><img src="<%=path%>/images/20110705pxxw.png" border="0" /></a></td></tr>
										<tr><td align="center"><p><a href="showVideoPage.action">上栗县四大班子领导来杨岐普通寺调研</a></p></td>
										<td align="center"><p><a href="showVideoPage.action">江西省人民政府朱虹副省长来杨岐普通寺调研</a></p></td></tr>
									</table>
								</dl>
							</div>
							<div class="list-group">
								 <a class="list-group-item active list_group_title_middle">修学园地&nbsp;Garden</a>
								<div class="list-group-item">
									<div style="float: left; width: 50%;">
										<img alt="修学园地-忆伄悟心" style="width:225px;height:50px;" src="<%=path%>/images/yifowuxin.jpg" />
										<ul id="yuandi1" class="list_group_title_yuandi_ul">
											<li><a>暂无信息！</a></li>
										</ul>
									</div>
									<div >
										<img alt="修学园地-心和则谐" style="width:225px;height:50px;" src="<%=path%>/images/xinhezexie.jpg" />
										<ul id="yuandi2" class="list_group_title_yuandi_ul">
											<li><a>暂无信息！</a></li>
										</ul>
									</div>
								</div>
							</div>
						</div>
						
						<div class="col-md-3 column">
							<div class="list-group">
								 <a class="list-group-item active list_group_title_right">禅门公案&nbsp;Walking</a>
								<div class="list-group-item">
									<ul id="gongan" class="list_group_title_right_ul">
										<li><a>暂无信息！</a></li>
									</ul>
								</div>
							</div>
							<div class="list-group">
								 <a class="list-group-item active list_group_title_right">禅茶一味&nbsp;Zen tea blindly</a>
								<div class="list-group-item">
									<ul id="yiwei" class="list_group_title_right_ul">
										<li><a>暂无信息！</a></li>
									</ul>
								</div>
							</div>
							<div class="list-group">
								 <a class="list-group-item active list_group_title_right">寺院巡礼&nbsp;Temple Tour</a>
								<div class="list-group-item">
									<ul id="xunli" class="list_group_title_right_ul">
										<li><a>暂无信息！</a></li>
									</ul>
								</div>
							</div>
							<div class="list-group">
								<a class="list-group-item active list_group_title_right">萍乡风光&nbsp;Pingxiang scenery</a>
								<div id="myCarousel" class="carousel slide ">
								    <!-- 轮播（Carousel）指标 -->
								    <ol class="carousel-indicators">
								        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
								        <li data-target="#myCarousel" data-slide-to="1"></li>
								        <li data-target="#myCarousel" data-slide-to="2"></li>
								        <li data-target="#myCarousel" data-slide-to="3"></li>
								        <li data-target="#myCarousel" data-slide-to="4"></li>
								        <li data-target="#myCarousel" data-slide-to="5"></li>
								        <li data-target="#myCarousel" data-slide-to="6"></li>
								    </ol>   
								    <!-- 轮播（Carousel）项目 -->
								    <div data-ride="carousel" class="carousel-inner">
								        <div class="item">
								            <img src="<%=path%>/images/250x200-2.jpg">
								            <div class="carousel-caption"></div>
								        </div>
								        <div class="item">
								            <img src="<%=path%>/images/250x200-3.jpg">
								            <div class="carousel-caption"></div>
								        </div>
								        <div class="item">
								            <img src="<%=path%>/images/250x200-4.jpg">
								            <div class="carousel-caption"></div>
								        </div>
								        <div class="item">
								            <img src="<%=path%>/images/250x200-5.jpg">
								            <div class="carousel-caption"></div>
								        </div>
								        <div class="item">
								            <img src="<%=path%>/images/250x200-6.jpg">
								            <div class="carousel-caption"></div>
								        </div>
								        <div class="item">
								            <img src="<%=path%>/images/250x200-7.jpg">
								            <div class="carousel-caption"></div>
								        </div>
								        <div class="item active">
								            <img src="<%=path%>/images/250x200.jpg">
							            	<div class="carousel-caption"></div>
								        </div>
								    </div>
								    <!-- 轮播（Carousel）导航 -->
								   <!--  <a class="carousel-control left" href="#myCarousel" 
								        data-slide="prev">&lsaquo;
								    </a>
								    <a class="carousel-control right" href="#myCarousel" 
								        data-slide="next">&rsaquo;
								    </a> -->
								</div>
							</div>
							<div class="list-group">
								<a class="list-group-item active list_group_title_right">随喜功德&nbsp;Merit</a>
								<div class="list-group-item">
									<ul id="gongde" class="list_group_title_right_ul">
										<li><a>暂无信息！</a></li>
									</ul>
								</div>
							</div>
							<div class="list-group">
								<a class="list-group-item active list_group_title_right">友情链接</a>
								<div style="height: 67px;" class="list-group-item">
									<ul id="lianjie" class="list_group_title_right_ul">
										<li><a>暂无信息！</a></li>
									</ul>
								</div>
							</div>
						</div>
						
					</div>
				</div>
			</div>
			
			<div class="row clearfix">
				<div class="col-md-11 column text-center">
					<div class="row clearfix">
						<div style="background:#FAF1EC; width:99%;">
							<div class="width:100%"><span style="color:#772200"><strong>名寺介绍</strong></span></div>
							<span style="white-space: nowrap;">
							<span style="color:#7F5324">·</span>
							<a href="http://www.shaolin.org.cn/" target="_blank">少林寺</a>&nbsp;</span>
							<span style="white-space: nowrap;">
							<span style="color:#7F5324">·</span>
							<a href="http://www.jingjuchansi.com/" target="_blank">慈化禅寺</a>&nbsp;</span> 
							<span style="white-space: nowrap;">
							<span style="color:#7F5324">·</span>
							<a href="http://www.hongfasi.net" target="_blank">深圳弘法寺</a>&nbsp;</span> 
							<span style="white-space: nowrap;">
							<span style="color:#7F5324">·</span>
							<a href="http://baoensi.fjnet.com/" target="_blank">兰州报恩寺</a>&nbsp;</span>
							<span style="white-space: nowrap;">
							</span>
						</div>
					</div>
				</div>
			</div>
			
			<div class="row clearfix">
				<div class="col-md-11 column text-center">
					<div class="row clearfix">
						<div class="bottom">
							<ul class="breadcrumb">
								<li>
									 <a href="showAboutPage.action?linkSource=1">关于我们</a>
								</li>
								<li>
									 <a href="showAboutPage.action?linkSource=2">友情链接</a>
								</li>
								<li>
									 <a href="showAboutPage.action?linkSource=3">免责声明</a>
								</li>
								<li>
									 <a href="showAboutPage.action?linkSource=4">联系我们</a>
								</li>
								<li>
									 <a href="showAboutPage.action?linkSource=5">留言反馈</a>
								</li>
								<li>
									 <a href="javascript:void(0)">心灯论坛</a>
								</li>
								<br><p style="margin:5px 0px">联系电话：86-0799-3890097 传真：86-0799-3890097 Email：yangqiputongsi@163.com</p>
								<p style="margin-bottom:0px">版权所有 (C) 2010-2017<a href="http://www.yangqiputongsi.com">杨岐普通禅寺</a> 技术支持：<a href="tencent://message/?uin=263566265&Site=http://uwin.ws&Menu=yes" target="_blank" class="sb12">仁理</a><script src="http://s19.cnzz.com/stat.php?id=3156700&web_id=3156700&show=pic" language="JavaScript"></script>
							</ul>
						</div>
					</div>
				</div>
			</div>
			
		</div>
	</body>
		<script type="text/javascript">
			$(function() {
				
				var str_date = new Date().toLocaleString()+' 星期'+'日一二三四五六'.charAt(new Date().getDay());
				document.getElementById("str_date").innerHTML = str_date;
				marquee1(28);
				var year = new Date().getFullYear();
				year = year + 544;
				document.getElementById("fo_year").innerHTML ='伄历' + year + '年';
				document.getElementById("zhongda").innerHTML ='${obj.zhongda}';
				
				document.getElementById("dade").innerHTML ='${obj.dade}';
				document.getElementById("zhishi").innerHTML ='${obj.zhishi}';
				document.getElementById("gongan").innerHTML ='${obj.gongan}';
				document.getElementById("news").innerHTML ='${obj.news}';
				document.getElementById("yxl").innerHTML ='${obj.yxl}';
				document.getElementById("wuzhi").innerHTML ='${obj.wuzhi}';
				document.getElementById("yuandi1").innerHTML ='${obj.yuandi1}';
				document.getElementById("yuandi2").innerHTML ='${obj.yuandi2}';
				document.getElementById("yiwei").innerHTML ='${obj.yiwei}';
				document.getElementById("xunli").innerHTML ='${obj.xunli}';
				document.getElementById("gongde").innerHTML ='${obj.gongde}';
				document.getElementById("lianjie").innerHTML ='${obj.lianjie}';
			});
		
			function showProtalNewsPage(id,classID,flg) {
				window.open("showNewsPage.action?id=" + id + "&classID=" + classID + "&flg=" + flg);
				return false;
			}
			
			function marquee1(classID) { 
				var start = "<marquee behavior=scroll direction=left width=300 scrollamount=1 scrolldelay=10 onmouseover=\'this.stop()\' onmouseout=\'this.start()\'><a>";
				var end = "</a></marquee>";
				$.ajax({
					url : 'getGongGao.action',
					type : 'post',
					data : {classID:classID},
					success : function(data) {
						if(data.status == 200) {
							var obj = data.data;
							document.getElementById("marquee").innerHTML = start + obj.dTitle + end;
						}
					}
				})
				return false;
			} 
			
			//设为首页
			function setHome(obj,url){
			    try{
			        obj.style.behavior='url(#default#homepage)';
			        obj.setHomePage(url);
			    }catch(e){
			        if(window.netscape){
			            try{
			                netscape.security.PrivilegeManager.enablePrivilege("UniversalXPConnect");
			            }catch(e){
			                alert("抱歉，此操作被浏览器拒绝！\n\n请在浏览器地址栏输入“about:config”并回车然后将[signed.applets.codebase_principal_support]设置为'true'");
			            }
			        }else{
			            alert("抱歉，您所使用的浏览器无法完成此操作。\n\n您需要手动将【"+url+"】设置为首页。");
			        }
			    }
			}
			//收藏本站
			function addFavorite(title, url) {
			    try {
			        window.external.addFavorite(url, title);
			    }
			    catch (e) {
			        try {
			            window.sidebar.addPanel(title, url, "");
			        }
			        catch (e) {
			            alert("抱歉，您所使用的浏览器无法完成此操作。\n\n加入收藏失败，请使用Ctrl+D进行添加");
			        }
			    }
			}
			
		</script>
</html>