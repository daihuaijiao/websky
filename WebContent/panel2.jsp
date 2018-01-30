<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8"> 
	<title>Bootstrap 实例 - 带列表组的面板</title>
	
	<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
	<link href="./css/custom.min.css" rel="stylesheet">
	<link href="./css/animate.min.css" rel="stylesheet">
	<link href="./css/font-awesome.min.css" rel="stylesheet">
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<style type="text/css">  
            *{  
                margin: 0;  
                padding: 0;  
            }  
            .wrap{  
                width: 200px;  
            }  
            .accordion{  
                padding: 10px;  
            }  
            .accordion>p{  
                background: #ccc;  
                color: #333;  
                padding: 0 10px;  
                line-height: 26px;  
                margin-top: 5px;  
            }  
            .accordion>p.active{  
                background: blue;  
                color: #fff;  
            }  
            .accordion>p em{  
                margin-right: 10px;  
            }  
            .accordion>div, .accordion>ul{  
                border: 1px solid blue;  
                display: none;  
            }  
            .panel-body>ul{  
                list-style: none;  
            }  
            .panel-body>ul li{  
                padding: 0 10px;  
                line-height: 30px;
                border-bottom: 1px;  
            }  
        </style> 
</head>
<body>
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column" style="height: 100px;">
				&nbsp;
			</div>
		</div>
		<div class="row clearfix">
			<!-- <div class="col-md-3 column"> -->
			<div class="col-md-3  left_col">
				<div class="left_col scroll-view">
 
        <div class="navbar nav_title" style="border: 0;">
            <a href="index.html" class="site_title">Gentelella Alela!</a>
        </div>
 
        <div class="profile"><!--img_2 -->
            <div class="profile_pic">
                <img src="images/img.jpg" alt="..." class="img-circle profile_img">
            </div>
            <div class="profile_info">
                <span>Welcome,</span>
                <h2>Anthony Mutisya</h2>
            </div>
        </div>
 
        <br>
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
                            <li><a href="form_wizards.html">Form Wizard</a></li>
                            <li><a href="form_upload.html">Form Upload</a></li>
                            <li><a href="form_buttons.html">Form Buttons</a></li>
                        </ul>
                    </li>
                    <li><a><i class="fa fa-desktop"></i> UI Elements <span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="general_elements.html">General Elements</a></li>
                            <li><a href="media_gallery.html">Media Gallery</a></li>
                            <li><a href="typography.html">Typography</a></li>
                            <li><a href="icons.html">Icons</a></li>
                            <li><a href="glyphicons.html">Glyphicons</a></li>
                            <li><a href="widgets.html">Widgets</a></li>
                            <li><a href="invoice.html">Invoice</a></li>
                            <li><a href="inbox.html">Inbox</a></li>
                            <li><a href="calendar.html">Calendar</a></li>
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
                            <li><a href="chartjs2.html">Chart JS2</a></li>
                            <li><a href="morisjs.html">Moris JS</a></li>
                            <li><a href="echarts.html">ECharts </a></li>
                            <li><a href="other_charts.html">Other Charts </a></li>
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
                            <li><a href="e_commerce_backend.html">E-commerce Backend</a></li>
                            <li><a href="projects.html">Projects</a></li>
                            <li><a href="project_detail.html">Project Detail</a></li>
                            <li><a href="contacts.html">Contacts</a></li>
                            <li><a href="profile.html">Profile</a></li>
                            <li><a href="real_estate.html">Real Estate</a></li>
 
                        </ul>
                    </li>
                    <li><a><i class="fa fa-windows"></i> Extras <span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="page_404.html">404 Error</a></li>
                            <li><a href="page_500.html">500 Error</a></li>
                            <li><a href="coming_soon.html">Coming Soon</a></li>
                            <li><a href="plain_page.html">Plain Page</a></li>
                            <li><a href="login.html">Login Page</a></li>
                            <li><a href="sign_up.html">SignUp Page</a></li>
                            <li><a href="pricing_tables.html">Pricing Tables</a></li>
 
                        </ul>
                    </li>
                    <li><a><i class="fa fa-laptop"></i> Landing Page <span class="label label-success pull-right">Coming Soon</span></a></li>
                </ul>
            </div>
 
        </div>
 
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
            <a data-toggle="tooltip" data-placement="top" title="Logout">
                <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
            </a>
        </div>
    </div>
			<!-- 
				<div class="panel-group" id="accordion">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" data-parent="#accordion" 
								   href="#collapseOne">
									面板标题
								</a>
							</h4>
						</div>
						<div id="collapseOne" class="panel-collapse collapse in">
							<div class="panel-body">
								<ul>
									<li>免费域名注册</li>
									<li>免费 Window 空间托管</li>
									<li>图像的数量</li>
									<li>24*7 支持</li>
									<li>每年更新成本</li>
								</ul>
							</div>
						</div>
					</div>
					
					<div class="panel panel-default">
						<div class="panel-heading">
							<a  data-toggle="collapse" 
									data-target="#collapseTwo" data-parent="#accordion"  style="width: 100%">
								简单的可折叠组件
							</a>
						</div>
						<div id="collapseTwo" class="panel-collapse collapse">
							<div class="panel-body">
								<ul class="list-group" style="border:0;" >
									<li class="list-group-item">免费域名注册</li>
									<li class="list-group-item">免费 Window 空间托管</li>
									<li class="list-group-item">图像的数量</li>
									<li class="list-group-item">24*7 支持</li>
									<li class="list-group-item">每年更新成本</li>
								</ul>
							</div>
						</div>
					</div>
					
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a style="width: 100%;" data-toggle="collapse" data-parent="#accordion" 
								   href="#collapseThree">
									面板标题
								</a>
							</h4>
						</div>
						<div id="collapseThree" class="panel-collapse collapse">
							<div class="panel-body">
								<ul style="border:none;" class="list-group">
									<li class="list-group-item">免费域名注册</li>
									<li class="list-group-item">免费 Window 空间托管</li>
									<li class="list-group-item">图像的数量</li>
									<li class="list-group-item">24*7 支持</li>
									<li class="list-group-item">每年更新成本</li>
								</ul>
							</div>
						</div>
					</div>
				</div>
				 -->
			</div>
			<div class="col-md-8 column">
			
			</div>
		</div>
	</div>
</body>
</html>