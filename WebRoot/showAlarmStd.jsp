<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>报警阈值修改</title>
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
		<table id="sas-dg"></table>
	</div>
<script>

var editIndex = undefined; 
//该方法用于关闭上一个焦点的editing状态  
function endEditing() {
    if (editIndex == undefined) {  
        return true  
    }  
    if ($('#sas-dg').datagrid('validateRow', editIndex)) {  
        $('#sas-dg').datagrid('endEdit', editIndex);  
        editIndex = undefined;  
        return true;  
    } else {  
        return false;  
    }  
}
//点击单元格事件：  
function onClickCell(index,field,value) {  
    if (endEditing()) {  
        if(field=="min"||field=="max"){  
            $(this).datagrid('beginEdit', index);  
            var ed = $(this).datagrid('getEditor', {index:index,field:field});  
            $(ed.target).focus();  
        }         
        editIndex = index;  
    }  
    $('#sas-dg').datagrid('onClickRow')  
} 
//单元格失去焦点执行的方法  
function onAfterEdit(index, row, changes) {  
    var updated = $('#sas-dg').datagrid('getChanges', 'updated');  
    if (updated.length < 1) {  
        editRow = undefined;  
        $('#sas-dg').datagrid('unselectAll');  
        return;  
    } else {  
        // 传值  
        submitForm(index, row, changes);  
    }  
}  
//提交数据  
function submitForm(index, row, changes) {
    var id=row.id; //id  
    if(id==""){  
        $.messager.alert('提醒', '数据无效！');  
        $("#sas-dg").datagrid('reload');  
        return;  
    }  
    var min = row.min;
    var max = row.max;
    
    var r =/^-?[1-9]/;//判断输入的是正整数  
    if(!r.test(min) || !r.test(max)){  
        $.messager.alert('提醒', '请输入正整数！');  
        return;  
    }
   // alert(id+","+min+","+max);
    $.ajax({  
            type : "post",  
            url : "showAlarmStdUpdataServlet",  
            data : {  
                "id" :id,  
                "min":min,  
                "max":max  
            },  
            success : function(data) {  
                if(data==true){  
                    alert("保存成功");  
                    $("#sas-dg").datagrid('reload');  
                }  
            }  
        })  
}


$(function(){
	$('#sas-dg').datagrid({    
	    url:'showAlarmStdServlet',
	    method:'post',
	    onClickCell:onClickCell,  
        onAfterEdit:onAfterEdit, 
	    onLoadError: function(){
	    	$.messager.alert("提示","没有查询到相关数据！");
	    },
	    columns:[[    
	        {field:'id',title:'阈值编号',width:100},    
	        {field:'desc',title:'监测项目',width:100},
	        {field:'mean',title:'均值',width:100},
	        {field:'dev',title:'方差',width:100},
	        {field:'min',title:'最小值',width:100,editor:'text'},
	        {field:'max',title:'最大值',width:100,editor:'text'}
	    ]],
	    pagination:false, //分页
	    fitColumns:true //列自适应宽度
	});  
})
</script>
</body>
</html>