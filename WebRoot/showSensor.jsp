<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>显示传感器</title>
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
</head>
<body>
<form id="showSensor-ff" style="padding:10px;">
	选择传感器类型:   <input id="showSensor-cc" name="typeId" value="">
	选择传感器监测对象:   <input id="showSensor-cc2" name="targetId" value="">
	选择传感器位置:   <input id="showSensor-cc3" name="sectionId" value="">
		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">查询</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">取消</a>
</form>
<table id="dg"></table>
 
<script type="text/javascript">
	
	$('#showSensor-cc').combobox({
	    url:'showSensorTypeServlet',
	    method:'post',
	    valueField:'typeId',
	    textField:'typeName'
	});
	
	$('#showSensor-cc2').combobox({
	    url:'showSensorTargetServlet',
	    method:'post',
	    valueField:'targetId',
	    textField:'targetName'
	});
	
	$('#showSensor-cc3').combobox({
	    url:'showSensorLocationSectionServlet',
	    method:'post',
	    valueField:'sectionId',
	    textField:'sectionName'
	});
	
	function submitForm(){
		$('#dg').datagrid('load',{    
			typeId: $('#showSensor-cc').val(),
			targetId: $('#showSensor-cc2').val(),
			sectionId: $('#showSensor-cc3').val()
		}); 
	}
	
	function clearForm(){
		$('#showSensor-ff').form('clear');
	}
	
	$(function(){
		$('#dg').datagrid({    
		    url:'showSensorServlet',
		    method:'post',
		    onLoadError: function(){
		    	$.messager.alert("提示","没有查询到相关数据！");
		    },
		    columns:[[    
		        {field:'sensorId',title:'传感器编号',width:100},    
		        {field:'sensorName',title:'传感器名称',width:100},
		        {field:'sensorTypeName',title:'传感器类型',width:100},
		        {field:'sensorTargetName',title:'传感器监测对象',width:100},
		        {field:'sensorLocationSectionName',title:'传感器位置',width:100}
		    ]],
		    pagination:true, //分页
		    fitColumns:true //列自适应宽度
		});  
	})
</script>

</body>
</html>