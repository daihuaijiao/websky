<%   
    String path = request.getContextPath();   
%>   

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="<%=path %>/js/jquery-easyui-1.5/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="<%=path %>/js/echarts/echarts.js"></script>
<title>websky</title>
</head>
<body>
<%  
    if(session.getAttribute("username") == null)  
    {  
        out.println("<script>alert('请先登陆');window.location.href='login.jsp'</script>");  
        return;  
    }  
    Object username = session.getAttribute("username");  
    out.println("欢迎"+username);  
  %>  
   <div id="main" style="width: 600px;height:500px; margin-top:50px"></div>
   <div id="all_chart"></div>
   <div id='c1' style="width: 400px;height:400px;  margin-top:50px"></div>
</body>
<script>
    
    /* 	var x,y;
    
        //'item':数据项图形触发，主要在散点图，饼图等无类目轴的图表中使用。

		//'axis':坐标轴触发，主要在柱状图，折线图等会使用类目轴的图表中使用
        */
        var all_data;
        
        var itm_cd = [];
        
        var data;
        var myChart = echarts.init(document.getElementById('main'));
       
        /*
        var data = [[7, 51.6,'a'], [2, 59.0,'b'], [8, 49.2,'c'], [9, 63.0,'d'], [10, 53.6,'e'],
	                [5, 59.0,'f'], [8, 47.6,'g'], [5, 69.8,'h'], [1, 66.8,'i'], [12, 75.2,'j'],
	            ];
        */
        
        //	自动从数据库加载数据
        $(function() {
			$.ajax({
				url : 'getAllItemScatterData.action',
				type : 'post',
				success : function(data) {
					if(data.status == 200) {
						all_data = data.data;
						console.log(all_data);
						formatScatterData();
					}
				}
			})
		})
		
		//	格式化散点所需要的数据
		function formatScatterData() {
        	var scatterData = [];
        	for(var i=0; i<all_data.length; i++) {
        		var t_data = all_data[i];
        		var temp = new Array(t_data.kctzDay,t_data.total,t_data.itmCd,t_data.mass,t_data.kcNum);
        		scatterData.push(temp);
        	}
        	console.log(scatterData);
        	initOption(scatterData);
        }
		
        
        //	加载和显示散点图
        function initOption(scatterData) {
        	data = scatterData;
        	var option = {/*
        		    animation: true,
        		    animationDuration: 1000,
        		    animationEasing: 'cubicInOut',
        		    animationDurationUpdate: 1000,
        		    animationEasingUpdate: 'cubicInOut',*/
        	    title : {
        	        text: '当月库存停滞散点图',
        	        subtext: '抽样调查来自: websky 2016 ',
       	        	left: 'center',/*
       	            textStyle: {
       	                color: '#000'
       	            }*/
        	    },/*
        	    grid: {
        	        left: '3%',
        	        right: '7%',
        	        bottom: '3%',
        	        containLabel: true
        	    },*/
        	    tooltip : {
        	        //trigger: 'axis',
        	        showDelay : 0,//鼠标经过提示
        	        formatter : function (params) {
        	            if (params.value.length > 1) {
        	                return params.seriesName + ' : ' + params.value[2] + '<br/>'
        	                + '停滞:' + params.value[0] + '天<br/>'
        	                + '金额 :' + params.value[1] + '<br/>'
        	                + '数量:' + params.value[4];
        	            }
        	            else {
        	                return params.seriesName + ' :<br/>'
        	                + params.name + ' : '
        	                + params.value + 'kg ';
        	            }
        	        },
        	        // 鼠标坐标显示
        	        axisPointer:{
        	            show: true,
        	            type : 'cross',
        	            lineStyle: {
        	                type : 'dashed',
        	                width : 1
        	            }
        	        }
        	    },
        	    toolbox: {
        	    	/*  iconStyle: {
        	             normal: {
        	                 borderColor: '#fff'
        	             },
        	             emphasis: {
        	                 borderColor: '#b1e4ff'
        	             }
        	         } */
        	        /* feature: {
        	        	    magicType: {
        	        	        type: ['line', 'bar', 'stack', 'tiled']
        	        	    }
        	        	}*/
        	    },
        	    brush: {
        	    	 outOfBrush: {
        	             color: '#abc'
        	         },
        	         brushStyle: {
        	             borderWidth: 2,
        	             color: 'rgba(0,0,0,0.2)',
        	             borderColor: 'rgba(0,0,0,0.5)',
        	         },
        	         /*seriesIndex: [0, 1],*/
        	         //框选后多久显示下一个图表
        	         throttleDelay: 500,
        	         throttleType: 'debounce',
        	    },/*
        	    legend: {
        	        data: ['女性','男性'],
        	        left: 'center'
        	    },*/
        	    xAxis : [
        	        {
        	        	name :'停滞天数',
        	            type : 'value',
        	            scale:true,
        	            axisLabel : {
        	                formatter: '{value} 天'
        	            },
        	            max : 31,
        	            splitLine: {
        	                show: true
        	            }
        	        }
        	    ],
        	    yAxis : [
        	        {
        	        	name: '库存金额',
        	            type : 'value',
        	            scale:true,
        	            axisLabel : {
        	                formatter: '{value} '
        	            },
        	            splitLine: {
        	                show: true
        	            },
        	            // 只显示整数坐标
        	            minInterval: 1,
        	            //	分隔刻度
        	            splitNumber : 20,/*
        	            maxInterval: 500,
        	            interval : 10,*/
        	        }
        	    ],
        	    //	y轴滚动
        	    dataZoom: [{
                    type: 'slider',
                    show: true,
                    yAxisIndex: [0],
                    left: '93%',
                    start: 0,
                    end: 5
               	 },
        	    ],
        	    series : [
        	        {
        	            name:'物料',
        	            type:'scatter',
        	            data: scatterData,
        	            //	散点大小
        	            symbolSize: function (val) {
        	            	console.log(val);
        	                return val[3] * 1.1;
        	            },
        	            
        	            /*
        	            markArea: {
        	                silent: true,
        	                itemStyle: {
        	                    normal: {
        	                        color: 'transparent',
        	                        borderWidth: 1,
        	                        borderType: 'dashed'
        	                    }
        	                },
        	                data: [[{
        	                    name: '女性分布区间',
        	                    xAxis: 'min',
        	                    yAxis: 'min'
        	                }, {
        	                    xAxis: 'max',
        	                    yAxis: 'max'
        	                }]]
        	            },
        	            markPoint : {
        	                data : [
        	                    {type : 'max', name: '最大值'},
        	                    {type : 'min', name: '最小值'}
        	                ]
        	            },
        	            markLine : {
        	                lineStyle: {
        	                    normal: {
        	                        type: 'solid'
        	                    }
        	                },
        	                data : [
        	                    {type : 'average', name: '平均值'},
        	                    { xAxis: 160 }
        	                ]
        	            }*/
        	        },
        	    ]
        	};
        	
	        if (option && typeof option === "object") {
	            myChart.setOption(option, true);
		        //myChart.setOption(option);
	        }
        }
        
        // 散点图框选监听
        myChart.on('brushselected', renderBrushed);
        
        function renderBrushed(params) {
            var mainSeries = params.batch[0].selected[0];
            var selectedItems = [];

            itm_cd = [];
            var maxBar = 30;
            var sum = 0;
            var count = 0;

            for (var i = 0; i < mainSeries.dataIndex.length; i++) {
                var rawIndex = mainSeries.dataIndex[i];
                var dataItem = data[rawIndex];
                var pmValue = dataItem[1];

                sum += pmValue;
                count++;

                selectedItems.push(new Object(dataItem));
            }

            selectedItems.sort(function (a, b) {
                return a[0] - b[0];
            });

            for (var i = 0; i < Math.min(selectedItems.length, maxBar); i++) {
                itm_cd.push(selectedItems[i][2]);
            }
            
            // 动态添加框选的散点并创建拆线图
            moreChart();
        };
        
        /*
        function myChart2SetOption() {
        	var option2 = {
            		title : {
            	        text: '每月库存数量',
            	        subtext: '抽样调查来自: Heinz  2003'
            	    },
            	    yAxis: [{
                    	type: 'value',
                    	name: '金额',
                    	axisLabel : {
         	                formatter: '{value} 元'
         	            }
                    },{
                    	type: 'value',
                    	name: '月',
                    	axisLabel : {
         	                formatter: '{value} 月'
         	            },
                    },],
                    xAxis: {
                    	type: 'category',
                        data: itm_cd,
                    	axisLabel : {
         	                formatter: '{value} 物料'
         	            },
                    },
                    series: [{
                    	name:'金额',
                        type:'bar',
                        data: total
                    },{
                    	name:'月',
                    	type:'bar',
                    	data: month,
                    	// 右侧Y坐标显示
                        yAxisIndex: 1,
                    }],
                    tooltip : {
            	        //trigger: 'axis',
            	        showDelay : 0,//鼠标经过提示
            	        formatter : function (params) {
            	            if (params.value.length > 1) {
            	                return params.seriesName + ' :<br/>'
            	                + params.value[0] + '个月 '
            	                + params.value[1] + '元 ';
            	            }
            	            else {
            	            	var name = params.seriesName;
            	            	if(name == "金额") {
    	        	            	return params.value + '元';
            	            	} else {
    	        	            	return params.value + '月';
            	            	}
            	            }
            	        },
            	        // 鼠标坐标显示
            	        axisPointer:{
            	            show: true,
            	            type : 'cross',
            	            lineStyle: {
            	                type : 'dashed',
            	                width : 1
            	            }
            	        }
            	    },
            }
        	
            myChart2.setOption(option2);
            
        }
        
        var myChart2 = echarts.init(document.getElementById('c1'));
         //在这里做一个点击事件的监听，绑定的是eConsole方法
         //myChart2.on(ecConfig.EVENT.CLICK, eConsole);     
         
         myChart2.on('click', function (params) {
 			console.log(params.name);
 		}); 
        */
         
        function moreChart() {
        	if(itm_cd != null) {
        		var len = itm_cd.length;
        		if(len > 10) {
        			var check =  confirm('框选物料数量大于10个，有可能导致画面卡顿，确定要继续吗？');
        			if(!check) {
        				return false;
        			}
        			/*
        			$.messager.confirm({title:'警告',msg:'框选物料数量大于10个，有可能导致画面卡顿，确定要继续吗？',ok:'继续',cancel:'返回重新框选',fn:function(r) {
        				if (r) {
        					
        				} else {
        					return false;
        				}
        			}});*/
   				}
        		addDom(len);
        		for(var i=0; i<len; i++) {
	        		var temp_itm_cd = itm_cd[i];
	        		formatLineData(temp_itm_cd,i);
        		}
        	}
        }
        
        //	动态添加dom对象
        function addDom(len) {
        	$('#all_chart').empty();
        	var charts = "";
        	for(var i=0; i<len; i++) {
        		charts += '<div id="chart'+i+'" style="width:400px; height:300px; float:left"></div>';
        	}
        	$('#all_chart').append(charts);
        }
        
        //	格式化拆线图所需要的数据
        function formatLineData(itm_cd,i) {
        	console.log(itm_cd);
        	if(itm_cd == null) {
        		return null;
        	}
        	var lineData = [];
        	var all_line_data = [];
        	
        	$.ajax({
        		url : 'getItemData.action',
        		data : {'itm_cd':itm_cd},
        		type : 'post',
        		success : function(data) {
					if(data.status == 200) {
						all_line_data = data.data;
			        	for(var j=0; j<all_line_data.length; j++) {
			        		var t_data = all_line_data[j];
			        		//var temp = new Array(t_data.zkNum + '');
			        		lineData.push(t_data.zkNum);
			        	}
			        	addChart(itm_cd,i,lineData);
					}
				}
        	})
        }

        
        //	动态创建拆线图
        function addChart(itm_cd,i,lineData) {
        		var chart_m = echarts.init(document.getElementById("chart"+i));
        		var temp = [];
            	for(var j=1; j<=31; j++) {
            		temp.push(j+'日');
            	}
            	console.log(temp);
            	console.log(lineData);
        		var option_m = {
        				//legend:{data:['用户来源']},//图例
        				title : {
                	        text: '当月库存数量变化    ' + itm_cd,
                	    },
                	    grid: {
                	    	x : 80,
                	    	x2 : 80,
                	    },
                        xAxis: {
                        	type: 'category',
                            data: temp,
                        	axisLabel : {
             	                formatter: '{value}'
             	            },
                        },
                	    yAxis: {
                        	type: 'value',
                        	name: '当日在库数量',
                        	axisLabel : {
             	                formatter: '{value}'
             	            }
                        },
                        series: {
                        	name:'当日在库数量',
                            type:'line',
                            data: lineData,
                        },
                        tooltip : {//提示框
                	        //trigger: 'axis',
                	        showDelay : 0,//鼠标经过提示
                	        formatter : function (params) {
                	            if (params.value.length > 1) {
                	                return params.seriesName + ' :<br/>'
                	                + params.value[0] + '个月 '
                	                + params.value[1] + '元 ';
                	            }
                	            else {
                	            	var name = params.seriesName;
                	            	if(name == "金额") {
        	        	            	return params.value + '元';
                	            	} else {
        	        	            	return '当日在库数量:' + params.value;
                	            	}
                	            }
                	        },
                	        // 鼠标坐标显示
                	        axisPointer:{
                	            show: true,
                	            type : 'cross',
                	            lineStyle: {
                	                type : 'dashed',
                	                width : 1
                	            }
                	        }
                	    },
        		}
        		
        		chart_m.setOption(option_m);
        }
        
       
        
        //获取三个DOM元素
        var sex = document.getElementById('sex');
        var height = document.getElementById('hight');
        var weight = document.getElementById('weight');
        
        var ecConfig = echarts.config;
        
        function eConsole(param){
            sex.innerText = param.seriesName;
            if(param.value.length > 1) {
                height.innerText = param.value[0]+'cm';
                weight.innerText = param.value[1]+'kg';
            } else {
                height.innerText = param.name+'cm';
                weight.innerText = param.value+'kg';
            }
        }
        
       
        
    </script>

</html>