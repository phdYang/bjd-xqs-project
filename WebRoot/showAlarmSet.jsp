<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>报警紧迫程度</title>
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
<div style="padding-left:280px;padding-top:50px;">
	<div>
		<span>系统故障报警：</span>
		<select class="easyui-combobox" name="alarmUrgency" style="width:50px;">
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
			<option value="6">6</option>
			<option value="7">7</option>
			<option value="8">8</option>
			<option value="9">9</option>
			<option value="10">10</option>
			<option value="11">11</option>
			<option value="12">12</option>
			<option value="13">13</option>
		</select>
		<select class="easyui-combobox" name="alarmUrgencyUnit" style="width:50px;">
			<option value="d">天</option>
			<option value="h">时</option>
			<option value="m">分</option>
		</select>
	</div>
	<div>
		<span>结构一级报警：</span>
		<select class="easyui-combobox" name="alarmUrgency" style="width:50px;">
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
			<option value="6">6</option>
			<option value="7">7</option>
			<option value="8">8</option>
			<option value="9">9</option>
			<option value="10">10</option>
			<option value="11">11</option>
			<option value="12">12</option>
			<option value="13">13</option>
		</select>
		<select class="easyui-combobox" name="alarmUrgencyUnit" style="width:50px;">
			<option value="d">天</option>
			<option value="h">时</option>
			<option value="m">分</option>
		</select>
	</div>
	<div>
		<span>结构二级报警：</span>
		<select class="easyui-combobox" name="alarmUrgency" style="width:50px;">
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
			<option value="6">6</option>
			<option value="7">7</option>
			<option value="8">8</option>
			<option value="9">9</option>
			<option value="10">10</option>
			<option value="11">11</option>
			<option value="12">12</option>
			<option value="13">13</option>
		</select>
		<select class="easyui-combobox" name="alarmUrgencyUnit" style="width:50px;">
			<option value="d">天</option>
			<option value="h">时</option>
			<option value="m">分</option>
		</select>
	</div>
</div>
</body>
</html>