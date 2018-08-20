<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>报警通知方式</title>
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
<form>
	<div>
		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">保存修改</a>
	</div>
	<div style="width:700px;padding-left:450px;padding-top:100px;">
		<div style="float:left;">
			<div id="sam-p1" class="easyui-panel" title="系统报警" style="width:200px;height:150px;padding:10px;">
				<input type="checkbox" checked onchange="#"> 弹窗
				<br>
				<input type="checkbox" checked onchange="#"> 邮件
				<br>
				<input type="checkbox" checked onchange="#"> 短信
			</div>
		</div>
		<div style="float:left;">
			<div id="sam-p2" class="easyui-panel" title="一级结构报警" style="width:200px;height:150px;padding:10px;">
				<input type="checkbox" checked onchange="#"> 弹窗
				<br>
				<input type="checkbox" checked onchange="#"> 邮件
				<br>
				<input type="checkbox" checked onchange="#"> 短信
			</div>
		</div>
		<div style="float:left;">
			<div id="sam-p3" class="easyui-panel" title="二级结构报警" style="width:200px;height:150px;padding:10px;">
				<input type="checkbox" checked onchange="#"> 弹窗
				<br>
				<input type="checkbox" checked onchange="#"> 邮件
				<br>
				<input type="checkbox" checked onchange="#"> 短信
			</div>
		</div>
	</div>
</form>
</body>
</html>