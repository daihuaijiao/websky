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
		<script type="text/javascript" src="<%=path%>/js/AC_RunActiveContent.js"></script>
		<script type="text/javascript" src="<%=path%>/js/common.js"></script>
	</head>
	<body>
		<div class="container">
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
								 <a href="javascript:void(0)" onclick="getNewsList(1)">最新动态</a>
							</li>
							<li class="disabled">
								 <a href="javascript:void(0)" onclick="getNewsList(41)">杨岐重兴</a>
							</li>
							<li class="disabled">
								 <a href="javascript:void(0)" onclick="getNewsList(15)">高僧大德</a>
							</li>
							<li class="disabled">
								 <a href="javascript:void(0)" onclick="getNewsList(10)">拈花悟旨</a>
							</li>
							<li class="disabled">
								 <a href="javascript:void(0)" onclick="getNewsList(13)">禅茶一味</a>
							</li>
							<li class="disabled">
								 <a href="javascript:void(0)" onclick="getNewsList(2)">佛教知识</a>
							</li>
							<li class="disabled">
								 <a href="javascript:void(0)" onclick="getNewsList(12)">修学园地</a>
							</li>
							<li class="disabled">
								 <a href="javascript:void(0)" onclick="getNewsList(11)">随喜功德</a>
							</li>
							<li class="disabled">
								 <a href="javascript:void(0)" onclick="getNewsList(9)">寺院巡礼</a>
							</li>
							<li class="disabled">
								 <a href="javascript:void(0)" onclick="getNewsList(72)">杨岐心灯</a>
							</li>
							<li class="disabled">
								 <a href="javascript:void(0)" onclick="getNewsList(42)">老和尚言行录</a>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<div class="row clearfix">
				<div class="col-md-11 column">
					<div class="row clearfix">
						<div class="col-md-3 column ">
							<div class="list-group" style="background: #E1CFBB">
								<a href="#" class="list-group-item active list_group_title_news">栏目导航&nbsp;Navigation</a>
								<div class="list-group-item text-center show_news_left_ul">
									<ul id="classList">
									 	<li><a>暂无信息！</a></li>
									 	<!-- <li><a href="javascript:void(0)" onclick="getNewsList(535)">杨岐导师—</a></li> -->
									</ul>
								</div>
								<div style="background: #E1CFBB url(<%=path%>/images/fobg.jpg) no-repeat; height: 310px;">
								</div>
							</div>
						</div>
						
						<div class="col-md-9 column">
							<div id="banner" class="show_news_auto_nav">
								<!-- <p>当前位置：<a href="showProtalPage.action">首页</a> > 禅茶一味</p> -->
							</div>
							<div id="show_news_content" style="display:none;" class="show_news_content">
								<h3 id="title"></h3>
								<!-- <h3 id="title">2017年度杨岐心灯帮扶计划申请通告</h3> -->
								<hr id="time_hr">
								<div id="time" class="show_news_content_time">
									<!-- <p>添加时间：2011-7-19 8:52:01  添加人：杨岐普通禅寺&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a>文档下载</a></p> -->
								</div>
								<hr style="margin-bottom:20px;">
								<div id="content" style="none;">
									<object id="MediaPlayer" height="350" width="430" classid="CLSID:6BF52A52-394A-11d3-B153-00C04F79FAA6" VIEWASTEXT>
									　　　<param name="URL" value="http://www.yangqiputongsi.com/20110705pxxw.wmv">
									　　　<param name="rate" value="1">
									　　　<param name="balance" value="0">
									　　　<param name="currentPosition" value="0">
									　　　<param name="playCount" value="1">
									　　　<param name="autoStart" value="1">
									　　　<param name="currentMarker" value="0">
									　　　<param name="invokeURLs" value="-1">
									　　　<param name="volume" value="80">
									　　　<param name="mute" value="0">
									　　　<param name="uiMode" value="Full">
									　　　<param name="stretchToFit" value="0">
									　　　<param name="windowlessVideo" value="0">
									　　　<param name="enabled" value="-1">
									　　　<param name="enableContextMenu" value="0">
									　　　<param name="fullScreen" value="0">
									</object>
								</div>
								<div id="prev" style="padding-top:10px;">
									<!-- <p>上一篇：没有了<p> -->
								</div>
								<div  id="next">
									<!-- <p>下一篇： <a href='Show.asp?ArtID=900'>2016年度心灯帮扶计划申请通告（附申请表）</a><p> -->
								</div>
							</div>
							
							<div id="show_news_list" style="display:none;" class="show_news_content show_news_list">
							</div>
							
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
	
	$(function(){
		
		$("#show_news_list").hide();
		$("#time_hr").hide();
		$("#show_news_content").show();
		
		document.getElementById("banner").innerHTML = '<p>当前位置：<a">首页</a>&nbsp;&nbsp;>&nbsp;&nbsp;视频';
		document.getElementById("classList").innerHTML = '<li><a>视频</a></li>';
		document.getElementById("title").innerHTML = '江西省人民政府朱虹副省长来杨岐普通寺调研';
	});

	function changePage(classID,page) {
		$.ajax({
			url : 'getNewsList.action',
			data : {classID:classID,page:page},
			type : 'post',
			success : function(data){
				var obj = data.data;
				if(data.status == 200) {
					document.getElementById("banner").innerHTML = obj.banner;
					document.getElementById("show_news_list").innerHTML = obj.content;
				} else {
					document.getElementById("banner").innerHTML = obj.banner;
					document.getElementById("show_news_list").innerHTML = obj.content;
				}
			},
			error : function(data) {
				var obj = data.data;
				document.getElementById("banner").innerHTML = obj.banner;
				document.getElementById("show_news_list").innerHTML = obj.content;
			}
		});
		
		return false;
	}
	
	function getNewsList(classID) {
		$("#show_news_content").hide();
		$("#show_news_list").show();
		$.ajax({
			url : 'getNewsList.action',
			data : {classID:classID,page:1},
			type : 'post',
			success : function(data){
				var obj = data.data;
				if(data.status == 200) {
					if(obj.leftList) {
						document.getElementById("classList").innerHTML = obj.leftList;
					}
					document.getElementById("banner").innerHTML = obj.banner;
					document.getElementById("show_news_list").innerHTML = obj.content;
				} else {
					if(obj.leftList) {
						document.getElementById("classList").innerHTML = obj.leftList;
					}
					document.getElementById("banner").innerHTML = obj.banner;
					document.getElementById("show_news_list").innerHTML = obj.content;
				}
			},
			error : function(data) {
				var obj = data.data;
				document.getElementById("banner").innerHTML = obj.banner;
				document.getElementById("show_news_list").innerHTML = obj.content;
			}
		});
		
		return false;
	}

	function showProtalNewsPage(id,classID,flg) {
		if(flg ==0) {
			$("#show_news_content").show();
			$("#show_news_list").hide();
			$("#time_hr").show();
			$.ajax({
				url : 'getNewsPageContent.action',
				data : {id:id,classID:classID,flg:flg},
				type : 'post',
				success : function(data) {
					if(data.status == 200) {
						var obj = data.data;
						document.getElementById("classList").innerHTML = obj.classList;
						document.getElementById("banner").innerHTML = obj.banner;
						document.getElementById("title").innerHTML = obj.title;
						document.getElementById("time").innerHTML = obj.time;
						document.getElementById("content").innerHTML = obj.content;
						document.getElementById("prev").innerHTML = obj.prev;
						document.getElementById("next").innerHTML = obj.next;
						document.title = obj.title + ' - 杨岐普通禅寺';
					}
				},
				error : function(data) {
					
				}
			});
		} else {
			
		}
		
		/*if(id) {
			window.open("showNewsPage.action?id=" + id + "&classID=" + classID + "&flg=" + flg);
		}*/
		return false;
	}
	</script>
	
</html>
