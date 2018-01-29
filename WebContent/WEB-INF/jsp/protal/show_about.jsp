<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%  
    String ip = request.getHeader("x-forwarded-for");  
    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
        ip = request.getHeader("Proxy-Client-IP");  
    }  
    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
        ip = request.getHeader("WL-Proxy-Client-IP");  
    }  
    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
        ip = request.getRemoteAddr();  
    }   
    
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
		<script type="text/javascript" src="<%=path%>/js/jquery-easyui-1.5/jquery.easyui.min.js"></script>
		<link rel="stylesheet" type="text/css" href="<%=path%>/js/jquery-easyui-1.5/themes/default/easyui.css">
		<link rel="stylesheet" type="text/css" href="<%=path%>/js/jquery-easyui-1.5/themes/icon.css">
		<script type="text/javascript" src="<%=path%>/js/jquery-easyui-1.5/locale/easyui-lang-zh_CN.js"></script>
		<script type="text/javascript" src="<%=path%>/js/common.js"></script>
		<script type="text/javascript" src="http://api.map.baidu.com/api?key=&v=1.1&services=true"></script>
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
						<div class="col-md-3 column ">
							<div class="list-group" style="background: #E1CFBB">
								<a href="#" class="list-group-item active list_group_title_news">栏目导航&nbsp;Navigation</a>
								<div class="list-group-item text-center show_news_left_ul">
									<ul id="classList">
									 	<li><a href="javascript:void(0)" onclick="jump_div('1')">关于我们</a></li>
									 	<li><a href="javascript:void(0)" onclick="jump_div('2')">友情链接</a></li>
									 	<li><a href="javascript:void(0)" onclick="jump_div('3')">免责声明</a></li>
									 	<li><a href="javascript:void(0)" onclick="jump_div('4')">联系我们</a></li>
									 	<li><a href="javascript:void(0)" onclick="jump_div('5')">留言反馈</a></li>
									 	<!-- <li><a href="javascript:void(0)" onclick="getNewsList(535)">杨岐导师—</a></li> -->
									</ul>
								</div>
								<div style="background: #E1CFBB url(<%=path%>/images/fobg.jpg) no-repeat; height: 310px;">
								</div>
							</div>
						</div>
						
						<div class="col-md-9 column">
							<div id="banner" class="show_news_auto_nav">
								<p id="about_b" style="display:none;">当前位置：<a href="showProtalPage.action">首页</a> > 关于我们</p>
								<p id="friendLink_b" style="display:none;">当前位置：<a href="showProtalPage.action">首页</a> > 友情链接</p>
								<p id="mzsm_b" style="display:none;">当前位置：<a href="showProtalPage.action">首页</a> > 免责声明</p>
								<p id="lianXi_b" style="display:none;">当前位置：<a href="showProtalPage.action">首页</a> > 联系我们</p>
								<p id="liuYan_b" style="display:none;">当前位置：<a href="showProtalPage.action">首页</a> > 留言反馈</p>
							</div>
							<div id="show_news_content" class="show_news_content">
								<h3 id="title"></h3>
								<hr style="margin-bottom:20px;">
								<div id="about" style="display:none;">
									<FONT size=3>
									<P class=text>　　杨岐普通寺，始建于盛唐时期，迄今已有1200余年的历史，是我国佛教禅宗五家七宗临济宗下一大支派——杨岐宗的祖庭，坐落在杨岐山寿桃峰下，距县城约10公里，占地面积7000平方米，建筑面积3000平方米。杨岐普通寺初名广利禅寺，乘广禅师于唐天宝十二年(753)所创，后甄叔禅师得嗣其法，于唐大历年间新建法堂、僧舍，规模扩大。宋庆历年间，方会禅师在此创杨岐宗，将广利禅寺改名为普通寺，兴旺时有和尚上百人。寺内有山门院落，内有大雄宝殿、观音堂、关圣殿、藏经楼等，现有如来佛、观音、关帝等大型塑像，还有护法韦陀、十八罗汉、二十四诸天等木雕神像，杨岐寺肃穆庄严，金碧辉煌，富有我国南方古刹的独有风格，寺周围青山环列，古塔巍巍，古柏参天。自唐至明清，香火鼎盛不衰，每岁之春或佛诞时节，善男信女前往顶礼膜拜者络绎不绝。 
									<DIV class=spctrl></DIV>
									<P>　　杨岐寺作为佛教杨歧宗的发祥地，在国内外具有重大影响，尤其在日本影响更大。据1987年7月， 日本爱知大学教授、日本禅宗研究所副所长铃木招雄介绍，杨岐宗在日本影响很大，其信徒发展到100多万人。1987年，全国政协副主席、中国佛教协会会长赵朴初亲笔题写了“杨岐普通寺”匾额。</FONT></P>
									<DIV><FONT size=4></FONT>&nbsp;</DIV>
									<DIV align=center><FONT size=4>地址：江西省萍乡市上栗县杨岐普通寺</FONT></DIV>
									<DIV align=center><FONT size=4>电话：86-0799-3890097&nbsp;&nbsp;&nbsp; </FONT><FONT size=4>传&nbsp;&nbsp;&nbsp;&nbsp;真：86-0799-3890097</FONT></DIV>
									<DIV align=center><FONT size=4>邮编：337000&nbsp;</FONT><FONT size=4>&nbsp; 邮箱：<A href="mailto:yangqiputongsi@163.com">yangqiputongsi@163.com</A></FONT></DIV>
									<DIV align=center><FONT size=4>博客：blog.sina.com.cn/shizidaoyuan</FONT></DIV>
									<DIV align=center><FONT size=4>账户：上栗县杨岐普通寺&nbsp;&nbsp;&nbsp; 账号：1504240109000004967</FONT></DIV>
									<DIV align=center><FONT size=4>开户行：江西省萍乡市工商银行上栗县分行</FONT></DIV>
								</div>
								
								<div id="friendLink" style="display:none;">
									<!-- <img onclick="openFriendLink('http://www.zgfj.cn/')" alt="中国佛教导航网" src="<%=path%>/images/2008111711360130.jpg"/><br/><br/> -->
								</div>
								
								<div id="mzsm" style="display:none;">
									<P align=center><STRONG><FONT size=3></FONT></STRONG>&nbsp;</P>
									<P>&nbsp;&nbsp;&nbsp; 杨岐普通禅寺网站上刊载的所有内容，包括文字、照片、影像、插图、录音片、影音片或其他任何形式的材料等，均受到中华人民共和国著作权法及国际著作权法律的保障。网站内容的著作权为杨岐普通禅寺网站所有，未经杨岐普通禅寺网书面同意，不得转载。<BR>&nbsp;&nbsp;&nbsp; 任何人对于杨岐普通禅寺网站提供的内容与服务，仅能使用于个人、非商业用途，使用人利用时必须遵守著作权法的所有相关规定，否则将侵犯有关著作权，并且须依法承担民事及刑事责任。<BR>&nbsp;&nbsp;&nbsp; 非经取得著作权人书面同意或授权，使用者不得变更、发行、播送、转卖、重制、改作、散布、表演、展示或利用杨岐普通禅寺网站的局部或全部的内容或服务，以获取利益。<BR>&nbsp;&nbsp;&nbsp; 用户下载或拷贝网站的内容或服务仅可供个人、非商业用途之使用。个人使用以外之其他用途，在未取得杨岐普通禅寺网站或其他内容提供商著作人书面许可之前，禁止使用。</P>
								</div>
								
								<div id="lianXi" style="display:none;">
									<FONT face=Verdana><FONT size=4>
									<div><FONT size=4>地址：江西省萍乡市上栗县杨岐普通寺</FONT></div>
									<div><FONT size=4>电话：86-0799-3890097&nbsp;&nbsp;&nbsp; </FONT><FONT size=4>传&nbsp;&nbsp;&nbsp;&nbsp;真：86-0799-3890097</FONT></div>
									<div><FONT size=4>邮编：337000&nbsp;</FONT><FONT size=4>&nbsp; 邮箱：<A href="mailto:yangqiputongsi@163.com">yangqiputongsi@163.com</A></FONT></div>
									<div><FONT size=4>博客：blog.sina.com.cn/shizidaoyuan</FONT></div>
									<div><FONT size=4>账户：上栗县杨岐普通寺&nbsp;&nbsp;&nbsp; 账号：1504240109000004967</FONT></div>
									<div><FONT size=4>开户行：江西省萍乡市工商银行上栗县分行</FONT></div></FONT></FONT><BR><BR>
									
									<!--百度地图容器-->
									<div style="width:400px;height:400px;border:#ccc solid 1px;" id="dituContent"></div>
								</div>
								
								<div id="liuYan" style="display:none;">
									<form id = "liuYanForm" >
			                      		<input type="hidden" name="shenhe" value="0"/> 
			                      		<input type="hidden" name="ip" value="<%=ip%>"/> 
			                      		<input type="hidden" name="" value=""/>
			                      		<input type="hidden" name="" value=""/> 
				                      <table cellspacing="15" height="400px">
								            <tr>
												<td></td>
								              <td>注：带*为必填项
								                  <a href="javascript:void(0)" onclick="getLiuYanList()"><font color="#FF0000">【查看留言】</font></a><br></td>
								            </tr>
								            <tr>
								              <td>您的姓名:</td>
								              <td><input name="username" type="text" class="easyui-textbox" data-options="required:true" style="width: 250px;"></input>
								                  <font color="#FF0000"> *</font></td>
								            </tr>
								            <tr>
								              <td>联系方式:</td>
								              <td><input name="qq" type="text" class="easyui-textbox" style="width: 250px;"></input>电话、QQ、微信</td>
								            </tr>
								            <tr>
								              <td>Email:</td>
								              <td><input name="email" type="text" class="easyui-validatebox easyui-textbox" data-options="validType:'email'" style="width: 250px;"></input></td>
								            </tr>
								            <tr>
								              <td>留言标题:</td>
								              <td><input name="title" type="text" class="easyui-textbox" data-options="required:true" style="width: 250px;"></input>
								                  <font color="#FF0000"> *</font></td>
								            </tr>
								            <tr>
								              <td>验证码:</td>
								              <td><input id="code" type="text" class="easyui-textbox" data-options="required:true" style="width: 250px;"></input>
								                  <img id="checkCode"/><a href="javascript:void(0)" onclick="reloadCheckCode()">换一个</a>
								                </td>
								            </tr>
								            <tr>
							              		<td>留言内容:</td>
								             	<td><textarea name="content" id="content" style="width:300px; height:100px;"></textarea>
								                  <font color="#FF0000"> *</font></td>
								            </tr>
								            <tr>
								              <td>&nbsp;</td>
								              <td>
								              	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="addLiuYan()">&nbsp;提交&nbsp;</a>&nbsp;&nbsp;
									            <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">&nbsp;重置&nbsp;</a>
									          </td>
								            </tr>
								          </table>

									</form>
								</div>
								
								<!-- 查看留言 -->
								<div id="showLiuYan" style="display:none;">
									<table width="595" border="0" cellspacing="0" cellpadding="0" style="margin: 10px 10px 10px 10px;">
										<tr>
											<td width="100%" height="20"><br> 
												<table width="100%" border="0" cellpadding="5" cellspacing="1" bgcolor="#CCCCCC">
													<tr>
														<td bgcolor="#FFFFFF"><div align="center">暂时还没有任何反馈信息！</div></td>
													</tr>
												</table>
												<div id="liuYanList">
												<table width="93%" border="0" align="center" cellpadding="0" cellspacing="0" class="bg6">
													<tr>
														<td width="14%" height="23" align="center" valign="bottom"	bgcolor="#F9F9F9" class="bg4">留言人</td>
														<td width="381" bgcolor="#F9F9F9" class="bg4"><font color="#5B87C8">'${liuYanList[i].username}'</font></td>
														<td width="26" bgcolor="#F9F9F9" class="bg4"><img src="<%=path%>/image/gbook_time.gif" width="14" height="13"></td>
														<td width="142" align="left" bgcolor="#F9F9F9" class="bg4"><font color="#666666">'${liuYanList[i].time}'</font></td>
													</tr>
													<tr>
														<td width="45" height="25" align="center"><font color="#FF0000">[标题]</font></td>
														<td width="334">'${liuYanList[i].title}'</td>
													</tr>
													<tr>
														<td  width="45"></td>
														<td height="1" colspan="2" background="<%=path%>/images/line.gif" align="center"></td>
													</tr>
													<tr>
														<td height="25" align="center"><font color="#FF0000">[内容]</font></td>
														<td><a class="d" href="#"
															onClick="MM_openBrWindow('guest_Show.asp?id='${liuYanList[i].content}'','','scrollbars=yes,width=550,height=400');return false;">'${liuYanList[i].time}'</a></td>
													</tr>
													<tr>
														<td  width="45"></td>
														<td height="1" colspan="2" background="<%=path%>/images/line.gif"></td>
													</tr>
													<tr>
														<td colspan="2">管理员<font color="#FF0000">['${liuYanList[i].time}']
														</font>回复:'${liuYanList[i].time}'
														</td>
													</tr>
												</table>
												</div>
												<br>
											</td>
										</tr>
									</table>
								</div>
								
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
	
		var page = 1;
		var liuYanList;
		var maxPerPage=10;   //单独页最大记录数 const 用来申明常量
	    var totalPut;   //总记录
	    var currentPage;  //当前页次
	    var totalPages;   //
	
		$(function(){
			hideAll();
			var linkSource = '${linkSource}';
			jump_div(linkSource);
		});
	
		function jump_div(num) {
			switch (num) {
				case '1' :
					hideAll();
					document.getElementById('title').innerHTML = '关于我们';
					$('#about').show();
					$('#about_b').show();
					break;
				case '2' :
					hideAll();
					$('#friendLink').show();
					$('#friendLink_b').show();
					document.getElementById('title').innerHTML = '友情链接';
					$.ajax({
						url : 'getFriendLink.action',
						type : 'post',
						success : function(data) {
							if(data.status == 200) {
								document.getElementById('friendLink').innerHTML = data.data;
							}
						},
						error : function(data) {
							
						}
					});
					break;
				case '3':
					hideAll();
					$('#mzsm').show();
					$('#mzsm_b').show();
					document.getElementById('title').innerHTML = '免责声明';
					break;
				case '4' :
					hideAll();
					$('#lianXi').show();
					$('#lianXi_b').show();
					document.getElementById('title').innerHTML = '联系我们';
					break;
				case '5' :
					hideAll();
					$('#liuYan').show();
					$('#liuYan_b').show();
					reloadCheckCode();
					document.getElementById('title').innerHTML = '留言反馈';
					break;
			}					
		}
		
		function hideAll() {
			$('#about_b').hide();
			$('#friendLink_b').hide();
			$('#mzsm_b').hide();
			$('#lianXi_b').hide();
			$('#liuYan_b').hide();

			$('#about').hide();
			$('#friendLink').hide();
			$('#mzsm').hide();
			$('#lianXi').hide();
			$('#liuYan').hide();
			$('#showLiuYan').hide();
		}
		
		/* 打开友情链接 */
		function openFriendLink(url) {
			window.open(url);
			return false;
		}
		
		//	显示文章
		function showProtalNewsPage(id,classID,flg) {
			window.open("showNewsPage.action?id=" + id + "&classID=" + classID + "&flg=" + flg, '_self');
			return false;
		}
		
		// 刷新验证码
		function reloadCheckCode() {
			$.ajax({
				url : 'getCheckCode.action?t=1',
				type : 'post',
				success : function(data) {
					if(data.status == 200) {
						document.getElementById("checkCode").src = ".." + data.data;
					}
				}
			});
		}
		
		//	添加留言
		function addLiuYan() {
			if(!$('#liuYanForm').form('validate')){
				$.messager.alert('提示','带*号的为必填内容!');
				return ;
			}
			$.post('checkCode.action', {'code':$('#code').textbox('getValue')}, function(data) {
				if(data.status == 200) {
					$.ajax({
						url : 'addLiuYan.action',
						type : 'post',
						data : $('#liuYanForm').serialize(),
						success : function(data) {
							if(data.status == 200) {
								alert('您的留言信息已经提交，请等待审核！');
								clearForm();
							} else {
								alert(data.msg);
							}
						}
					});
				} else {
					reloadCheckCode();
					alert('您输入的验证码错误，请返回检查！');
				}
			}); 
			
		}
		
		//	查看留言
		function getLiuYanList() {
			$('#liuYan').hide();
			$('#showLiuYan').show();
			
		}
		function getLiuYanList1() {
			$.ajax({
				url : 'getLiuYanCount.action',
				type : 'post',
				success : function(data) {
					if(data.status==200) {
						totalPut = data.data;
						totalPages = Math.ceil(totalPut / 10);
						
						$.ajax({
							url : 'getLiuYanList.action',
							type : 'post',
							data : {page:page},
							success : function(data) {
								if(data.status==200) {
									liuYanList = data.data;
									console.log(liuYanList);
								}
							}
						});
						$('#liuYan').hide();
						
					}
				}
			});
			//document.getElementById('title').innerHTML = '留言反馈';
		}
		
		//	清空表单
		function clearForm() {
			$('#liuYanForm').form('reset');
			$('#content').html('');
		}
		
		
	
	</script>
	
	<script type="text/javascript">
    //创建和初始化地图函数：
    function initMap(){
        createMap();//创建地图
        setMapEvent();//设置地图事件
        addMapControl();//向地图添加控件
        addMarker();//向地图中添加marker
        addPolyline();//向地图中添加线
    }
    
    //创建地图函数：
    function createMap(){
        var map = new BMap.Map("dituContent");//在百度地图容器中创建一个地图
        var point = new BMap.Point(113.913761,27.834157);//定义一个中心点坐标
        map.centerAndZoom(point,13);//设定地图的中心点和坐标并将地图显示在地图容器中
        window.map = map;//将map变量存储在全局
    }
    
    //地图事件设置函数：
    function setMapEvent(){
        map.enableDragging();//启用地图拖拽事件，默认启用(可不写)
        map.enableScrollWheelZoom();//启用地图滚轮放大缩小
        map.enableDoubleClickZoom();//启用鼠标双击放大，默认启用(可不写)
        map.enableKeyboard();//启用键盘上下左右键移动地图
    }
    
    //地图控件添加函数：
    function addMapControl(){
        //向地图中添加缩放控件
	var ctrl_nav = new BMap.NavigationControl({anchor:BMAP_ANCHOR_TOP_LEFT,type:BMAP_NAVIGATION_CONTROL_LARGE});
	map.addControl(ctrl_nav);
        //向地图中添加缩略图控件
	var ctrl_ove = new BMap.OverviewMapControl({anchor:BMAP_ANCHOR_BOTTOM_RIGHT,isOpen:1});
	map.addControl(ctrl_ove);
        //向地图中添加比例尺控件
	var ctrl_sca = new BMap.ScaleControl({anchor:BMAP_ANCHOR_BOTTOM_LEFT});
	map.addControl(ctrl_sca);
    }
    
    //标注点数组
    var markerArr = [{title:"普通寺",content:"杨岐普通禅寺",point:"113.908838|27.838757",isOpen:0,icon:{w:21,h:21,l:0,t:0,x:6,lb:5}}
		 ,{title:"沪昆高速萍乡出口",content:"沪昆高速萍乡出口，萍乡城区，上栗，莲花",point:"113.884153|27.692487",isOpen:0,icon:{w:21,h:21,l:0,t:0,x:6,lb:5}}
		 ,{title:"萍乡火车站",content:"萍乡火车站",point:"113.848292|27.651984",isOpen:0,icon:{w:21,h:21,l:0,t:0,x:6,lb:5}}
		 ];
    //创建marker
    function addMarker(){
        for(var i=0;i<markerArr.length;i++){
            var json = markerArr[i];
            var p0 = json.point.split("|")[0];
            var p1 = json.point.split("|")[1];
            var point = new BMap.Point(p0,p1);
			var iconImg = createIcon(json.icon);
            var marker = new BMap.Marker(point,{icon:iconImg});
			var iw = createInfoWindow(i);
			var label = new BMap.Label(json.title,{"offset":new BMap.Size(json.icon.lb-json.icon.x+10,-20)});
			marker.setLabel(label);
            map.addOverlay(marker);
            label.setStyle({
                        borderColor:"#808080",
                        color:"#333",
                        cursor:"pointer"
            });
			
			(function(){
				var index = i;
				var _iw = createInfoWindow(i);
				var _marker = marker;
				_marker.addEventListener("click",function(){
				    this.openInfoWindow(_iw);
			    });
			    _iw.addEventListener("open",function(){
				    _marker.getLabel().hide();
			    })
			    _iw.addEventListener("close",function(){
				    _marker.getLabel().show();
			    })
				label.addEventListener("click",function(){
				    _marker.openInfoWindow(_iw);
			    })
				if(!!json.isOpen){
					label.hide();
					_marker.openInfoWindow(_iw);
				}
			})()
        }
    }
    //创建InfoWindow
    function createInfoWindow(i){
        var json = markerArr[i];
        var iw = new BMap.InfoWindow("<b class='iw_poi_title' title='" + json.title + "'>" + json.title + "</b><div class='iw_poi_content'>"+json.content+"</div>");
        return iw;
    }
    //创建一个Icon
    function createIcon(json){
        var icon = new BMap.Icon("http://openapi.baidu.com/map/images/us_mk_icon.png", new BMap.Size(json.w,json.h),{imageOffset: new BMap.Size(-json.l,-json.t),infoWindowOffset:new BMap.Size(json.lb+5,1),offset:new BMap.Size(json.x,json.h)})
        return icon;
    }
//标注线数组
    var plPoints = [{style:"solid",weight:4,color:"#f00",opacity:0.6,points:["113.885877|27.694534","113.881853|27.689416","113.875529|27.685066","113.870355|27.697604","113.868917|27.704257","113.86978|27.711933","113.855982|27.735212","113.855982|27.75107","113.85282|27.760021","113.853682|27.768715","113.852532|27.772807","113.853754|27.777888"]}
		 ,{style:"solid",weight:4,color:"#f00",opacity:0.6,points:["113.853754|27.778144","113.852604|27.783769","113.856054|27.785815","113.858066|27.788116","113.854616|27.786582","113.852317|27.788116","113.852029|27.790161","113.84743|27.792717","113.84858|27.797319","113.853466|27.798853","113.855766|27.803965","113.858928|27.809078","113.857778|27.807289","113.860653|27.8078","113.863528|27.809589","113.864677|27.811378","113.865899|27.81189","113.866474|27.812656","113.867408|27.813168","113.868199|27.81272","113.86942|27.812976","113.870283|27.814318","113.869995|27.815212","113.871145|27.816171","113.872582|27.817129","113.875457|27.817513","113.877757|27.819494","113.888464|27.827417","113.889039|27.827161"]}
		 ,{style:"solid",weight:4,color:"#f00",opacity:0.6,points:["113.888177|27.827161","113.895938|27.832528","113.909449|27.839172"]}
		 ,{style:"solid",weight:4,color:"#f00",opacity:0.6,points:["113.848616|27.651888","113.855551|27.653616","113.857563|27.654128","113.856736|27.655216","113.856449|27.65608","113.856664|27.65688","113.857275|27.660208","113.857275|27.660784"]}
		 ,{style:"solid",weight:4,color:"#f00",opacity:0.6,points:["113.857275|27.660784","113.856952|27.661456","113.856197|27.662159","113.85609|27.662607","113.856413|27.663215","113.860365|27.668846"]}
		 ,{style:"solid",weight:4,color:"#f00",opacity:0.6,points:["113.860365|27.668878","113.864893|27.675149","113.868917|27.679372","113.86978|27.680331"]}
		 ,{style:"solid",weight:4,color:"#f00",opacity:0.6,points:["113.869708|27.680267","113.873517|27.68385","113.874307|27.684426","113.875313|27.685322","113.875026|27.685066","113.875062|27.685098","113.875134|27.685098"]}
		 ];
    //向地图中添加线函数
    function addPolyline(){
		for(var i=0;i<plPoints.length;i++){
			var json = plPoints[i];
			var points = [];
			for(var j=0;j<json.points.length;j++){
				var p1 = json.points[j].split("|")[0];
				var p2 = json.points[j].split("|")[1];
				points.push(new BMap.Point(p1,p2));
			}
			var line = new BMap.Polyline(points,{strokeStyle:json.style,strokeWeight:json.weight,strokeColor:json.color,strokeOpacity:json.opacity});
			map.addOverlay(line);
		}
	}
    
    initMap();	//创建和初始化地图
</script>
	
</html>
