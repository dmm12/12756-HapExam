$(document).ready(function() {
	var url;
	$('#datagridTable').datagrid({
		url : "getEasyUIDateGrid",
		width : 1200,
		height : 450,
		iconCls : "icon-save",
		pagination : true,
		title : "Film Date",
		toolbar : "#tb",
		striped : true,
		columns : [ [ {
			field : 'ck',
			checkbox : true,
			width : '90'
		}, // 复选框
		{
			field : 'film_id',
			width : '50',
			title : 'film_id'
		}, {
			field : 'title',
			width : '200',
			title : 'title'
		}, {
			field : 'description',
			width : '800',
			title : 'description'
		}, {
			field : 'name',
			width : '120',
			title : 'name'
		}, ] ],
	});

	$('#btn_delete').click(function() {
		// $('#datagridTable tr').find('td:eq(0)').show();
		var str = window.confirm("确定要删除?");
		var idStr = [];
		if (str) {
			var selectRows = $('#datagridTable').datagrid('getSelections');// 获取选中行的全部信息,object{id:
			// name:}
			// selectRows中包括id这些数据，他本身就是一个集合，如果要获得那就selectRows[0]
			var selectLenth = selectRows.length;
			if (selectLenth < 1) {
				alert('所选内容为空，请选择你要删除的内容');
			} else {
				for (var i = 0; i < selectLenth; i++) {
					var id = selectRows[i].film_id;
					idStr.push(id);
					alert(idStr[i]);
				}
				$.ajax({
					type : 'POST', // GET
					url : 'delecte?id='+idStr,
					data : {
						'idStr' : idStr
					}, // getInfo就是$("#filmId").val()
					async : true, // 或false,是否异步
					traditional : true,
					dataType : 'text', // 返回的数据格式：json/xml/html/script/jsonp/text
					success : function(data) {
						if(data > 1) {
                            alert('删除成功');
                            $('#datagridTable').datagrid('reload');
                        }else {
                            alert('外键关联，没有成功');
                        }
					},
					error : function(data) {
						alert('失败了');
					}
				});
			}
		}
	});
	$('#btn_add').click(function() {
		$('#dd').dialog({
			width : 500,
			height : 300,
			closed : true,
			cache : false,
			minimizable : true,
			maximizable : true,
			resizable : true,// 可缩放
			collapsible : true,// 可折叠
			// href: 'get_content.php',
			modal : true,
			buttons : '#dlg-buttons'
		}).dialog('open').dialog('setTitle', '新增用户');
	});
	
	$('#tool_save').click(function() {
		var title = $('#title').val();
		var description = $('#description').val();
		var selectLanguage = $('#selectLanguage option:selected').val();
		var infomation = title +','+description+','+selectLanguage;
//		var infomation=[{"title":title},{"description":description},{"selectLanguage":selectLanguage}];
		alert(infomation);
		$.ajax({
			type:'POST',
			url:"addList",
			data:{'infomation':infomation},
			dataType : 'json',
			async : true, // 或false,是否异步
			traditional : true,
			dataType : 'json', // 返回的数据格式：json/xml/html/script/jsonp/text
			success : function(data) {
			},
			error : function(result) {
				alert('成功');
				$('#dd').dialog('close');
			}
		});
	});
	
	$("#btn_alert").click(function(){
		var selectRows = $('#datagridTable').datagrid('getSelections');
		var length = selectRows.length;
		if(length < 1 && length > 1){
			alert('选项为空，请至少选择一项');
		}else{
			$('#da').dialog('open').dialog('setTitle',"编辑页面");
			$("#title1").val(selectRows[0].title);
			$("#description1").val(selectRows[0].description);
			$("#selectLanguage1").combobox('selectRows[0].description');
			var title = $('#title1').val();
			var description = $('#description1').val();
			var selectLanguage = $('#selectLanguage1 option:selected').val();
			var infomation = title +','+description+','+selectLanguage;
//			var infomation=[{"title":title},{"description":description},{"selectLanguage":selectLanguage}];
			alert(infomation);
		}
	});
	
	$('#tool_post').click(function() {
		var selectRows = $('#datagridTable').datagrid('getSelections');
		var id = selectRows[0].film_id;
		var title = $('#title1').val();
		var description = $('#description1').val();
		var selectLanguage = $('#selectLanguage1 option:selected').val();
		var infomation = id+','+title +','+description+','+selectLanguage;
//		var infomation=[{"title":title},{"description":description},{"selectLanguage":selectLanguage}];
		alert(infomation);
		$.ajax({
			type:'POST',
			url:'alterList',
			data:{'infomation':infomation},
			dataType : 'json',
			async : true, // 或false,是否异步
			traditional : true,
			dataType : 'json', // 返回的数据格式：json/xml/html/script/jsonp/text
			success : function(data) {
			},
			error : function(result) {
				alert('成功');
				$('#da').dialog('close');
			}
		});
	});
//	$("#doserch").click(function(){
//		$('#dg').datagrid('load',{
//			productid:$('#productid').val()
//		});
//	});
});
function doserch(){
	alert('sss');
	$('#dd').datagrid('load',{
		productid:$('#productid').val()
	});
}
