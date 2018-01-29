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
								<hr>
								<div id="time" class="show_news_content_time">
									<!-- <p>添加时间：2011-7-19 8:52:01  添加人：杨岐普通禅寺&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a>文档下载</a></p> -->
								</div>
								<hr style="margin-bottom:20px;">
								<div id="content" style="none;">
									<!-- &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<p>&nbsp;&nbsp;&nbsp;为给广大佛教信众提供一个学习了解佛教文化、历史、传统的平台，我寺特发布此微信公众号。……</p>
									<CENTER><P><IMG style="FILTER: ; WIDTH: 690px; HEIGHT: 431px" border=0 hspace=0 alt="" align=absMiddle src="http://www.yangqiputongsi.com/admin/eWebEditor/UploadFile/2017726205143799.jpg" width=690 height=431></P></CENTER><DIV><A name=OLE_LINK1></A>&nbsp;&nbsp;<A name=OLE_LINK3>“心灯帮扶计划”是杨岐普通寺在萍乡市民宗局、上栗县民宗局的指导下，香港中华总商会会长、旭日集团董事局主席杨钊先生出资支持，以及</A>萍乡微爱公益的协助下，在萍乡市开展的一项旨在帮扶困难儿童（主要为无双亲儿童）的社会公益活动。</DIV><DIV>&nbsp;&nbsp;社会公益慈善是佛教弘法的体现，历代的高僧大德都秉承着大乘菩萨精神，积极的实践参与着利他的事业。无论是从我寺的乘广禅师开山建寺命名广利寺时，寺名的含义既是“以最广大的佛法利益有情的众生”，还是至杨岐方会禅师将广利寺改名为普通寺时的“普渡众生，通达无碍”的内在含义来讲，无不包含着佛教济世的思想。2012年，中央统战部等六部门联合出台《关于鼓励和规范宗教界从事公益慈善活动的意见》，充分肯定了宗教界从事公益慈善活动的积极意义。</DIV><DIV>&nbsp;&nbsp;“心灯”其意取“杨岐灯盏明千古”之意，寓意将佛法这盏智慧明灯，灯灯相续，永远传承。又蕴含了做一盏明灯，点亮自己，为暗夜中的路人照亮前进的道路；燃烧自己，为寒冷中的人们带去温暖，从而点燃他们心中的那盏心灯，让这盏心灯，灯灯相续，永传不绝。</DIV><DIV>&nbsp;&nbsp;相信只要我们大家齐心协力，一定会将杨岐这盏明灯点的更亮，让他焕发出太阳般的光辉，去照亮世界上的每个角落，去温暖每一个需要他温暖的人以及众生。</DIV><DIV>&nbsp; 现我寺正式启动2017年度“心灯帮扶”申请工作，对于符合条件的学生，填报申请表格后，直接来我寺客堂进行申请，我寺将以往年心灯走访核准帮扶名单作为参考，并由我寺派出法师和义工进行走访核实后，最终确定名单。</DIV><DIV>注意事项如下：</DIV><DIV>一、申请条件、资助标准</DIV><DIV>&nbsp;&nbsp;（1）资助标准：600元每学期/人。</DIV><DIV>&nbsp;&nbsp;（2）积极进取，学习良好，有上进心的在校学生。</DIV><DIV>&nbsp;&nbsp;（3）年龄12周岁以下的无双亲儿童。</DIV><DIV>&nbsp;&nbsp;（4）单亲（重病）家庭。</DIV><DIV>&nbsp;&nbsp;（5）父母离异不符合本次帮扶范围。</DIV><DIV>二、时间阶段</DIV><DIV>&nbsp;&nbsp;（1）申请时间：2017年8月1日至9月30日。</DIV><DIV>&nbsp;&nbsp;（2）审核时间：2017年8月1日至9月30日。</DIV><DIV>&nbsp;&nbsp;（3）发放时间：2017年8月1日至9月30日。</DIV><DIV>三、需提供的材料及信息</DIV><DIV>&nbsp;&nbsp;如实填报申请表，申请表在我寺官方网站（<A href="http://www.yangqiputongsi.com">www.yangqiputongsi.com</A>）下载，或来我寺领取。并在申请表“学校”“村（居）民委员会”意见栏请相关人员签署意见并加盖公章确认。</DIV><DIV>&nbsp; 单亲重病家庭申请，需提供县级以上医院诊断证明，并加盖公章。</DIV><DIV>四、申请地址</DIV><DIV>&nbsp; 将按要求填写完成的申请表，直接交至我寺客堂。</DIV><DIV>&nbsp; 若有疑问可致电杨岐普通寺客堂，电话：136879987140799-3890097。</DIV><DIV><A name=_GoBack></A>&nbsp;</DIV><DIV>重要提示：</DIV><DIV>&nbsp;&nbsp;本次资助发放，地点为杨岐普通寺客堂。</DIV><DIV>&nbsp;</DIV><DIV>&nbsp;</DIV><DIV>&nbsp;</DIV><DIV align=right>杨岐普通寺“心灯帮扶计划”工作组</DIV><DIV align=right>&nbsp;2017年7月</DIV><P>&nbsp;</P><P>&nbsp;</P><P>&nbsp;</P>
								 --></div>
								<div id="prev" style="padding-top:10px;">
									<!-- <p>上一篇：没有了<p> -->
								</div>
								<div  id="next">
									<!-- <p>下一篇： <a href='Show.asp?ArtID=900'>2016年度心灯帮扶计划申请通告（附申请表）</a><p> -->
								</div>
							</div>
							
							<div id="show_news_list" style="display:none;" class="show_news_content show_news_list">
								 <!--<ul>
									<li><a href="Show.asp?ArtID=839" title="文章标题：禅茶真境 无一物中物尽藏    点击次数：766次">禅茶真境 无一物中物尽藏</a><span>[2011-07-19]</span></li>
									<li><a href="Show.asp?ArtID=838" title="文章标题：一杯浓茶，八味人生    点击次数：732次">一杯浓茶，八味人生</a><span>[2011-07-19]</span></li>
									<li class="special">共<font color='#FF0000'>29</font>篇文章 
										[<a href='?searchkey=&ArtClassID=13&page=1'>首页</a>] 
										[<a href='?searchkey=&ArtClassID=13&page=1'>上一页</a>] 
										[<a href='?searchkey=&ArtClassID=13&page=3'>下一页</a>] 
										[<a href='?searchkey=&ArtClassID=13&page=3'>尾页</a>]  
										页次：<font color='#ff0000'>2</font>/3页 10篇文章/页 转到：
						              <select name="select4" onChange="changePage(this.selectedIndex.value)">
						                <option>跳转</option>
						                
						                <option value="1">第1页</option>
						                
						                <option value="2">第2页</option>
						                
						                <option value="3">第3页</option>
						                
						              </select>        
									</li>
								</ul> -->
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
			$("#show_news_content").hide();
			
			var autoGetList = '${autoGetList}';
			if(autoGetList) {
				$("#show_news_list").show();
				document.getElementById("classList").innerHTML = '${newsContentData.classList}';
				getNewsList('${classID}');
			} else {
				$("#show_news_content").show();
				document.getElementById("classList").innerHTML = '${newsContentData.classList}';
				document.getElementById("banner").innerHTML = '${newsContentData.banner}';
				document.getElementById("title").innerHTML = '${newsContentData.title}';
				document.getElementById("time").innerHTML = '${newsContentData.time}';
				document.getElementById("content").innerHTML = '${newsContentData.content}';
				document.getElementById("prev").innerHTML = '${newsContentData.prev}';
				document.getElementById("next").innerHTML = '${newsContentData.next}';
				document.title = '${newsContentData.title}' + ' - 杨岐普通禅寺';
			}
			
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
