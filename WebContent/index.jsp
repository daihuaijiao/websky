<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="./js/jquery-easyui-1.5/jquery-3.2.1.min.js"></script>
<title>index</title>
</head>
<body>
<script type="text/javascript" src="./js/echarts/echarts.js"></script>

<h2>index</h2>
<%-- <jsp:forward page="/WEB-INF/jsp/protal/index.jsp"></jsp:forward>
<jsp:forward page="/WEB-INF/jsp/protal/show_news.jsp"></jsp:forward> --%>

<a href="protal/showProtalPage.action">protal</a>
<a href="admin.action">后台管理</a>
<br><br>

<div id="line" style="width:300px; height:300px"></div>
<div id="bar" style="width:300px; height:300px"></div>
<div id="pie" style="width:300px; height:300px"></div>


<script type="text/javascript">
	var option = {
			title:{text:'数据统计'},
			tooltip:{},//提示框
			legend:{data:['用户来源']},//图例
			xAxis:{data:["Android","IOS","PC","Other"]},
			yAxis:{},
			series:[{//设置数据
				name:'访问量',
				type:'line',
				data:[500,200,360,100]
			}]
	};
	
	var myChar = echarts.init(document.getElementById("line"));
	myChar.setOption(option);
</script>
<script type="text/javascript">
	var option = {
			title:{text:'数据统计'},
			tooltip:{},//提示框
			legend:{data:['用户来源']},//图例
			xAxis:{data:["Android","IOS","PC","Other"]},
			yAxis:{},
			series:[{//设置数据
				name:'访问量',
				type:'bar',
				data:[500,200,360,100]
			}]
	};
	
	var myChar = echarts.init(document.getElementById("bar"));
	myChar.setOption(option);
</script>
<script type="text/javascript">
	var option = {
			title:{text:'数据统计'},
			tooltip:{},//提示框
			legend:{data:['用户来源']},//图例
			series:[{//设置数据
				name:'访问量',
				type:'pie',
				radius:'60%',
				data:[
				      {value:500,name:'Android'},
				      {value:200,name:'IOS'},
				      {value:360,name:'PC'},
				      {value:100,name:'Other'}
				      ]
			}]
	};
	
	var myChar = echarts.init(document.getElementById("pie"));
	myChar.setOption(option);
</script>

<div id="websky" style="width:800px; height:800px"></div>
<script type="text/javascript">
	
	
	var dd = new Array();
	var json;
	var arrs;
	var myChar = echarts.init(document.getElementById("websky"));
	$.ajax({
		url:'protal/getEChartData.action',
		type:'post',
		params:{},
		success:function(data){
			if(data.status ==200) {
				arrs = data.data;
				//dd = new Array(arrs.length);
				for(var i=0; i<arrs.length; i++) {
					var obj = new Object();
					obj.value = arrs[i].svrMsgSeq;
					obj.name = arrs[i].svrPrgNm;
					//dd.push(obj);
					dd[i] = obj;
					if(i>50) {
						break;
					}
				}
				//var obj = eval ("(" + data.data + ")");
				//alert(obj);
				myChar.setOption(option);
			}
		}
	});
	
	var option = {
			title:{text:'数据统计'},
			tooltip:{},//提示框
			legend:{data:['用户来源']},//图例
			series:[{//设置数据
				name:'访问量',
				type:'pie',
				radius:'80%',
				data:dd,
					/* [
				      {value:500,name:'Android'},
				      {value:200,name:'IOS'},
				      {value:360,name:'PC'},
				      {value:100,name:'Other'}
				      ] */
			}]
	};
	
</script>

</body>
</html>