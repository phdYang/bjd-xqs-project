<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="copyright" content="zhaoyang" />
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
		<div class="index-north-right" style="float:left;width:20%;"></div>
	</div>
	<!-- 下侧  -->
	<div data-options="region:'south',split:false"
		style="height: 30px;padding:5px; text-align:center;color:white;background-color: #1136c8;">
		&copy; 2018 北京交大-515.Lab All Rights Reserved
	</div>

	
	<!-- 左侧 -->
	<div data-options="region:'west',title:'',split:false"
		style="width: 220px;">
		
		<div class="easyui-accordion" style="width: 210px;height:auto;">
			
			<div title="用户管理" style="overflow:auto;padding:5px;">
				<ul class="easyui-tree">
					<li><span><a onclick="addTab('用户操作日志查询','showUserLog.jsp');">用户操作日志查询</a></span></li>
					<li><span><a onclick="addTab('用户权限设置','showUserRight.jsp');">用户权限设置</a></span></li>
				</ul>
			</div>
			
			<div title="台账管理" style="overflow:auto;padding:5px;">
				<ul class="easyui-tree">
					<li><span><a onclick="addTab('传感器管理','showSensor.jsp');">传感器管理</a></span></li>
					<li><span><a onclick="addTab('设备管理','showDevice.jsp');">设备管理</a></span></li>
				</ul>
			</div>
			
			<div title="监测数据管理" style="overflow:auto;padding:5px;">
				<ul class="easyui-tree">
					<li><span><a onclick="addTab('监测数据查询','showMonitorData.jsp');">监测数据查询</a></span></li>
					<li><span><a onclick="addTab('监测数据校验','showMonitorDataCheck.jsp');">监测数据检验</a></span></li>
				</ul>
			</div>
			
			<div title="工务辅助决策" style="overflow:auto;padding:5px;">
				<ul class="easyui-tree">
					<li><span>监测数据预测</span>
						<ul>
							<li><span><a onclick="addTab('梁端伸缩位移预测','showLDSSPredictData.jsp');">梁端伸缩位移预测</a></span></li>
							<li><span><a onclick="addTab('钢轨纵向爬行预测','showGGZXPredictData.jsp');">钢轨纵向爬行预测</a></span></li>
							<li><span><a onclick="addTab('尖轨尖端伸缩预测','showJGJDPredictData.jsp');">尖轨尖端伸缩预测</a></span></li>
							<li><span><a onclick="addTab('钢轨附加应力预测','showGGFJPredictData.jsp');">钢轨附加应力预测</a></span></li>
						</ul>
					</li>
					<li><span>数据异常报警</span>
						<ul>
							<li><span>报警设置</span>
							<ul>
								<li><span><a onclick="addTab('报警通知方式','showAlarmMessage.jsp');">报警通知方式</a></span></li>
								<li><span><a onclick="addTab('报警阈值修改','showAlarmStd.jsp');">报警阈值修改</a></span></li>
								<li><span><a onclick="addTab('报警紧迫程度','showAlarmSet.jsp');">报警紧迫程度</a></span></li>
							</ul>
							</li>
							<li><span><a onclick="addTab('报警查询','showAlarmLog.jsp');">报警查询</a></span></li>
						</ul>
					</li>
				</ul>
			</div>
			
		</div>
			
	</div>
	<!-- 中心区域 -->
	<div data-options="region:'center',title:''" style="height:auto;">
		<div id="easyui-tabs" class="easyui-tabs" data-options="fit:true,border:false" >
		    <div title="桥上道岔监测示范工点传感器布置情况" 
		    	style="background: url(imgs/index-bg2.png) no-repeat; background-size:100% 100%;"></div>
		</div>
	</div>

	
</body>
</html>