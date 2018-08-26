<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>钢轨纵向爬行预测</title>
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
	
<script src="${pageContext.request.contextPath}/highcharts/highcharts.js"></script>
<script src="${pageContext.request.contextPath}/highcharts/themes/dark-blue.js"></script>
</head>
<body>
<form id="ggzx-ff" action="showPredictDataServlet" method="post">
	选择传感器：
	<input id="ggzx-cc" name="sensorId" value="">
	&nbsp;&nbsp;
	预测时间 : 未来    
	<select class="easyui-combobox" name="predictTime" style="width:50px;">
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
			<option value="6">6</option>
			<option value="7">7</option>
	</select>
	天
	&nbsp;&nbsp;
	选择预测模型:
	<select class="easyui-combobox" name="predictTime" style="width:150px;">
			<option value="model1">BP神经网络模型</option>
			<option value="model2">多元回归模型</option>
	</select>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">开始预测</a>&nbsp;&nbsp;
	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">取消</a>
</form>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<div id="container" style="min-width: 310px; height: 600px; margin: 0 auto"></div>
<script type="text/javascript">
	
	$('#ggzx-cc').combobox({
	    url:'showSensorGGZXServlet',
	    method:'post',
	    valueField:'sensorId',
	    textField:'sensorName'
	});
	
	function submitForm(){
		$('#ggzx-ff').form('submit', {
			success:function(data){
				//alert(data);
				var data_j = JSON.parse(data); //json字符串转换为对象
				showHighcharts(data_j);
			}
		});
	}
	
	function clearForm(){
		$('#ggzx-ff').form('clear');
	}
	
	var chart = Highcharts.chart('container', {
		title: {
				text: '铁路线桥隧状态数据预测'
		},
		subtitle: {
				text: '数据来源: 北京交大515'
		},
		yAxis: {
				title: {
						text: '钢  轨  纵  向  爬  行  数  据  预  测  值'
				}
		},
		legend: {
				layout: 'vertical',
				align: 'right',
				verticalAlign: 'middle'
		},
		plotOptions: {
				series: {
						label: {
								connectorAllowed: false
						}
				}
		},
		series: [{
	        name: $('#ggzx-cc').combobox('getText'),
	        data: []
	    }],
		responsive: {
				rules: [{
						condition: {
								maxWidth: 500
						},
						chartOptions: {
								legend: {
										layout: 'horizontal',
										align: 'center',
										verticalAlign: 'bottom'
								}
						}
				}]
		}
	});
	
	function showHighcharts(data){
		var x = []
		for(var i = 0;i<data.length;i++){
			x[i] = data[i].monitorDate
		}
		var s = []
		for(var i = 0;i<data.length;i++){
			s[i] = data[i].monitorValue
		}
		chart.update({
		    series: [{
		        name: $('#ggzx-cc').combobox('getText'),
		        data: s
		    }]
		})
	}

	
</script>
</body>
</html>