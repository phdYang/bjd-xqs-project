<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>报警数据查询</title>
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
	<div style="padding-top:50px;">
		<table id="sal-dg"></table>
	</div>
<script>
$(function(){
	$('#sal-dg').datagrid({    
	    url:'showAlarmLogServlet',
	    method:'post', 
	    onLoadError: function(){
	    	$.messager.alert("提示","没有查询到相关数据！");
	    },
	    columns:[[    
	        {field:'seqId',title:'报警编号',width:100},    
	        {field:'alarmCode',title:'报警传感器编码',width:100},
	        {field:'alarmLevel',title:'报警级别',width:100},
	        {field:'alarmSource',title:'报警传感器名称',width:100},
	        {field:'alarmContent',title:'报警内容',width:100, 
	        	formatter: function (value) {
                	return "<span title='" + value + "'>" + value + "</span>";
            	}
	        },
	        {field:'alarmDate',title:'报警时间',width:100}
	    ]],
	    pageSize:20,
	    pagination:true, //分页
	    fitColumns:true //列自适应宽度
	});  
})

</script>
</body>
</html>