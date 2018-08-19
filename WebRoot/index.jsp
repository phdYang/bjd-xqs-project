<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="copyright" content="All Rights Reserved, Copyright (C) 2018, 北京交大-515, lab" />
<title>铁路线桥隧状态监测预警</title>
<!-- 引入JQuery -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/jquery-easyui-1.5.5.5/jquery.min.js"></script>
<!-- 引入EasyUI -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/jquery-easyui-1.5.5.5/jquery.easyui.min.js"></script>
<!-- 引入EasyUI的中文国际化js，让EasyUI支持中文 -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/jquery-easyui-1.5.5.5/locale/easyui-lang-zh_CN.js"></script>
<!-- 引入EasyUI的样式文件-->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/jquery-easyui-1.5.5.5/themes/bootstrap/easyui.css"
	type="text/css" />
<!-- 引入EasyUI的图标样式文件-->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/jquery-easyui-1.5.5.5/themes/icon.css"
	type="text/css" />
<!-- 自定义js函数 -->
<script>
	// 弹出tab页
	function addTab(title, url) {
		if ($('#easyui-tabs').tabs('exists', title)) {
			$('#easyui-tabs').tabs('select', title);
		} else {
			var content = '<iframe scrolling="auto" frameborder="0"  src="' + url + '" style="width:100%;height:100%;"></iframe>';
			$('#easyui-tabs').tabs('add', {
				title : title,
				content : content,
				closable : true
			});
		}
	}
	
</script>
</head>
<body class="easyui-layout">
	<!-- 上侧 标题栏 -->
	<div data-options="region:'north',title:'',split:false"
		style="height: 70px;background-color: #1136c8;">
		<div class="index-north-left" style="float:left;width:20%;">
			<img src="${pageContext.request.contextPath}/imgs/index-north-bg1.png " style="height:60px;padding-left:60px;">
		</div>
		<div class="index-north-middle" 
			style="float:left;width:60%;text-align:center;font-size: 20px;font-weight: bold;font-style: ">
			<p style="padding-left: 10px;color: white;">铁&nbsp;路&nbsp;线&nbsp;桥&nbsp;隧&nbsp;状&nbsp;态&nbsp;监&nbsp;测&nbsp;预&nbsp;警</p>
		</div>
		<div class="index-north-right" style="float:left;width:20%;">right</div>
	</div>
	<!-- 下侧  -->
	<div data-options="region:'south',split:false"
		style="height: 30px;padding:5px; text-align:center;color:white;background-color: #1136c8;">
		&copy; 2018 北京交大-515.Lab All Rights Reserved
	</div>

	
	<!-- 左侧 -->
	<div data-options="region:'west',title:'功能项',split:false"
		style="width: 220px;">
		
		<div class="easyui-accordion" style="width: 210px;height:auto;">
			
			<div title="台账信息" style="overflow:auto;padding:5px;">
				<ul class="easyui-tree">
					<li><span><a onclick="addTab('传感器查询','showSensor.jsp');">传感器查询</a></span></li>
				</ul>
			</div>
			
			<div title="监测数据管理" style="overflow:auto;padding:5px;">
				<ul class="easyui-tree">
					<li><span><a onclick="addTab('数据查询','showMonitorData.jsp');">数据查询</a></span></li>
				</ul>
			</div>
			
			<div title="数据预测" style="overflow:auto;padding:5px;">
				<ul class="easyui-tree">
					<li><span><a onclick="addTab('BP神经网络预测模型','#');">BP神经网络预测模型</a></span></li>
				</ul>
			</div>
			
			<div title="数据报警" style="overflow:auto;padding:5px;">
				<ul class="easyui-tree">
					<li><span><a onclick="addTab('报警设置','#');">报警设置</a></span></li>
					<li><span><a onclick="addTab('报警查询','#');">报警查询</a></span></li>
				</ul>
			</div>
		</div>
			
	</div>
	<!-- 中心区域 -->
	<div data-options="region:'center',title:'基本操作区域'" style="height:auto;">
		<div id="easyui-tabs" class="easyui-tabs" data-options="fit:true,border:false" >
		    <div title="首页" 
		    	style="background-image: url(imgs/index-bg1.jpg);"></div>
		</div>
	</div>

	
</body>
</html>