<%   
    String path = request.getContextPath();   
    String basePath = request.getScheme()+"://" +request.getServerName()+":" +request.getServerPort()+path+"/" ;   
%>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8"> 
	<title>websky</title>
	
	<link href="<%=path %>/css/custom.min.css" rel="stylesheet">
	<link href="<%=path %>/css/animate.min.css" rel="stylesheet">
	<link href="<%=path %>/css/font-awesome.min.css" rel="stylesheet">
	<link href="<%=path %>/css/nprogress.css" rel="stylesheet">
	<script type="text/javascript" src="<%=path %>/js/fastclick.js"></script>
	<script type="text/javascript" src="<%=path %>/js/custom.min.js"></script>
	<script type="text/javascript" src="<%=path %>/js/nprogress.js"></script>
	<link rel="stylesheet" type="text/css" href="<%=path %>/js/bootstarp3.3.7/css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="<%=path %>/css/login.css" />
	<script type="text/javascript" src="<%=path %>/js/jquery-easyui-1.5/jquery-3.2.1.min.js"></script>
	<script type="text/javascript" src="<%=path %>/js/bootstarp3.3.7/js/bootstrap.js"></script>
</head>
<body class="nav-md">
<%  
    if(session.getAttribute("username") == null)  
    {  
        out.println("<script>alert('请先登陆');window.location.href='login.jsp'</script>");  
        return;  
    }  
    Object username = session.getAttribute("username");  
    out.println("欢迎"+username);  
  %>  
    <div class="container body">
      <div class="main_container">
        <div class="col-md-3 left_col">
          <div class="left_col scroll-view">
            <div class="navbar nav_title" style="border: 0;">
              <a href="index.html" class="site_title"><i class="fa fa-paw"></i> <span>Gentelella Alela!</span></a>
            </div>

            <div class="clearfix"></div>

            <!-- menu profile quick info -->
            <div class="profile clearfix">
              <div class="profile_pic">
                <img src="images/img.jpg" alt="..." class="img-circle profile_img">
              </div>
              <div class="profile_info">
                <span>Welcome,</span>
                <h2>John Doe</h2>
              </div>
              <div class="clearfix"></div>
            </div>
            <!-- /menu profile quick info -->

            <br />

            <!-- sidebar menu -->
            <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
              <div class="menu_section">
                <h3>General</h3>
                <ul class="nav side-menu">
                  <li><a><i class="fa fa-home"></i> Home <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="index.html">Dashboard</a></li>
                      <li><a href="index2.html">Dashboard2</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-edit"></i> Forms <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="form.html">General Form</a></li>
                      <li><a href="form_advanced.html">Advanced Components</a></li>
                      <li><a href="form_validation.html">Form Validation</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-desktop"></i> UI Elements <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="general_elements.html">General Elements</a></li>
                      <li><a href="media_gallery.html">Media Gallery</a></li>
                      <li><a href="typography.html">Typography</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-table"></i> Tables <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="tables.html">Tables</a></li>
                      <li><a href="tables_dynamic.html">Table Dynamic</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-bar-chart-o"></i> Data Presentation <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="chartjs.html">Chart JS</a></li>
                      <li><a href="echarts.html">ECharts</a></li>
                      <li><a href="other_charts.html">Other Charts</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-clone"></i>Layouts <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="fixed_sidebar.html">Fixed Sidebar</a></li>
                      <li><a href="fixed_footer.html">Fixed Footer</a></li>
                    </ul>
                  </li>
                </ul>
              </div>
              <div class="menu_section">
                <h3>Live On</h3>
                <ul class="nav side-menu">
                  <li><a><i class="fa fa-bug"></i> Additional Pages <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="e_commerce.html">E-commerce</a></li>
                      <li><a href="projects.html">Projects</a></li>
                      <li><a href="project_detail.html">Project Detail</a></li>
                      <li><a href="contacts.html">Contacts</a></li>
                      <li><a href="profile.html">Profile</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-windows"></i> Extras <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="page_403.html">403 Error</a></li>
                      <li><a href="page_404.html">404 Error</a></li>
                      <li><a href="page_500.html">500 Error</a></li>
                      <li><a href="plain_page.html">Plain Page</a></li>
                      <li><a href="login.html">Login Page</a></li>
                      <li><a href="pricing_tables.html">Pricing Tables</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-sitemap"></i> Multilevel Menu <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                        <li><a href="#level1_1">Level One</a>
                        <li><a>Level One<span class="fa fa-chevron-down"></span></a>
                          <ul class="nav child_menu">
                            <li class="sub_menu"><a href="level2.html">Level Two</a>
                            </li>
                            <li><a href="#level2_1">Level Two</a>
                            </li>
                            <li><a href="#level2_2">Level Two</a>
                            </li>
                          </ul>
                        </li>
                        <li><a href="#level1_2">Level One</a>
                        </li>
                    </ul>
                  </li>                  
                  <li><a href="javascript:void(0)"><i class="fa fa-laptop"></i> Landing Page <span class="label label-success pull-right">Coming Soon</span></a></li>
                </ul>
              </div>

            </div>
            <!-- /sidebar menu -->

            <!-- /menu footer buttons -->
            <div class="sidebar-footer hidden-small">
              <a data-toggle="tooltip" data-placement="top" title="Settings">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="FullScreen">
                <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="Lock">
                <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="Logout" href="login.html">
                <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
              </a>
            </div>
            <!-- /menu footer buttons -->
          </div>
        </div>

        <!-- top navigation -->
        <div class="top_nav">
          <div class="nav_menu">
            <nav>
              <div class="nav toggle">
                <a id="menu_toggle"><i class="fa fa-bars"></i></a>
              </div>

              <ul class="nav navbar-nav navbar-right">
                <li class="">
                  <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                    <img src="images/img.jpg" alt="">John Doe
                    <span class=" fa fa-angle-down"></span>
                  </a>
                  <ul class="dropdown-menu dropdown-usermenu pull-right">
                    <li><a href="javascript:;"> Profile</a></li>
                    <li>
                      <a href="javascript:;">
                        <span class="badge bg-red pull-right">50%</span>
                        <span>Settings</span>
                      </a>
                    </li>
                    <li><a href="javascript:;">Help</a></li>
                    <li><a href="login.html"><i class="fa fa-sign-out pull-right"></i> Log Out</a></li>
                  </ul>
                </li>

                <li role="presentation" class="dropdown">
                  <a href="javascript:;" class="dropdown-toggle info-number" data-toggle="dropdown" aria-expanded="false">
                    <i class="fa fa-envelope-o"></i>
                    <span class="badge bg-green">6</span>
                  </a>
                  <ul id="menu1" class="dropdown-menu list-unstyled msg_list" role="menu">
                    <li>
                      <a>
                        <span class="image"><img src="images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <a>
                        <span class="image"><img src="images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <a>
                        <span class="image"><img src="images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <a>
                        <span class="image"><img src="images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <div class="text-center">
                        <a>
                          <strong>See All Alerts</strong>
                          <i class="fa fa-angle-right"></i>
                        </a>
                      </div>
                    </li>
                  </ul>
                </li>
              </ul>
            </nav>
          </div>
        </div>
        <!-- /top navigation -->

        <!-- page content -->
        <div class="right_col" role="main">
          <div class="">
            <div class="page-title">
              <div class="title_left">
                <h3>Plain Page</h3>
              </div>

              <div class="title_right">
                <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
                  <div class="input-group">
                    <input type="text" class="form-control" placeholder="Search for...">
                    <span class="input-group-btn">
                      <button class="btn btn-default" type="button">Go!</button>
                    </span>
                  </div>
                </div>
              </div>
            </div>

            <div class="clearfix"></div>

            <div class="row">
              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>Plain Page</h2>
                    <ul class="nav navbar-right panel_toolbox">
                      <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                      </li>
                      <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                        <ul class="dropdown-menu" role="menu">
                          <li><a href="#">Settings 1</a>
                          </li>
                          <li><a href="#">Settings 2</a>
                          </li>
                        </ul>
                      </li>
                      <li><a class="close-link"><i class="fa fa-close"></i></a>
                      </li>
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                  	<div id="main" style="width: 600px;height:500px; margin-top:50px"></div>
					<div id="all_chart"></div>
					<div id='c1' style="width: 400px;height:400px;  margin-top:50px"></div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- /page content -->

        <!-- footer content -->
        <footer>
          <div class="pull-right">
            Gentelella - Bootstrap Admin Template by <a href="https://colorlib.com">Colorlib</a>
          </div>
          <div class="clearfix"></div>
        </footer>
        <!-- /footer content -->
      </div>
    </div>
    
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