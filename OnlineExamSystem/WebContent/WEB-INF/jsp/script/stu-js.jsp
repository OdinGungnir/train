<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript">
$(function(){
	jqGridLoad();
	if("${message}"!=''){
		$("#tipsModal").modal('show');
		$("#tipsModal .modal-body").html("${message}");
		setTimeout(function() {
			$("#tipsModal").modal('hide');
		}, 10000);
	}
})
function deleted(id){
	var uri="${pageContext.request.contextPath }/stu/"+id+"/delete";
	$("#deleteModal .btn-danger").click(function(){
	$.ajax({
		dataType:"json",
		type:"get",
		url:uri,
		cache:false,
		success:function(data){
			if('success'==data.result){
				$("#tipsModal").modal('show');
				$("#tipsModal .modal-body").html(data.message);
				$("#deleteModal").modal('hide');
				$("#stuList").trigger("reloadGrid");
				setTimeout(function() {
					$("#tipsModal").modal('hide');
				}, 10000);
			}else{
				$("#tipsModal").modal('show');
				$("#tipsModal .modal-body").html(data.message);
				$("#deleteModal").modal('hide');
				setTimeout(function() {
					$("#tipsModal").modal('hide');
				}, 10000);
			}
		}
	})
	});
}
function uReceive(id){
	var uri="${pageContext.request.contextPath }/stu/"+id+"/update";
	$.ajax({
		dataType:"json",
		type:"get",
		url:uri,
		cache:false,
		success:function(data){
				if("success"==data.result){
					$.each(data.examStu, function(i, stu) {
						var inp=$("#updateModal input");
						var birthday=dateUtil(stu.examStuBirthday.time);
						inp.eq(0).val(stu.examStuNumber);
						inp.eq(1).val(stu.examStuName);
						if(inp.eq(2).val()==stu.examStuSex){
							inp.eq(2).get(0).checked=true;
						}
						if(inp.eq(3).val()==stu.examStuSex){
							inp.eq(3).get(0).checked=true;
						}
						inp.eq(4).val(birthday);
						inp.eq(5).val(stu.examStuTel);
						inp.eq(6).val(stu.examStuAddress);
					})
					$(".btnUpdate").attr("onclick","update("+id+")");
				}else if("error"==data.result){
					$("#tipsModal").modal('show');
					$("#tipsModal #modal-body").html(data.message);
					setTimeout(function() {
						$("#tipsModal").modal('hide');
					}, 10000);
				}
			},
			error:function(){
				$("#tipsModal").modal('show');
				$("#tipsModal #modal-body").html("无法连接到服务器！请稍后再试！");
				setTimeout(function() {
					$("#tipsModal").modal('hide');
				}, 10000);
			}
	})
}
function update(id){
	var uri="${pageContext.request.contextPath }/stu/"+id+"/update";
	var inp=$("#updateModal input");
	var examStuSex="";
	if(inp.eq(2).get(0).checked==true){
		examStuSex="m";
	}
	if(inp.eq(3).get(0).checked==true){
		examStuSex="f";
	}
	$.ajax({
		data:{	examStuNumber:inp.eq(0).val(),
				examStuName:inp.eq(1).val(),
				examStuSex:examStuSex,
				examStuBirthday:inp.eq(4).val(),
				examStuTel:inp.eq(5).val(),
				examStuAddress:inp.eq(6).val()
			  },
		dataType:"json",
		type:"post",
		url:uri,
		cache:false,
		success:function(data){
				if("success"==data.result){
					$("#tipsModal").modal('show');
					$("#tipsModal .modal-body").html(data.message);
					$("#updateModal").modal('hide');
					$("#stuList").trigger("reloadGrid");
					setTimeout(function() {
						$("#tipsModal").modal('hide');
					}, 10000);
				}else if("error"==data.result){
					$("#tipsModal").modal('show');
					$("#tipsModal .modal-body").html(data.message);
					setTimeout(function() {
						$("#tipsModal").modal('hide');
					}, 10000);
				}
			},
		error:function(){
			$("#tipsModal").modal('show');
			$("#tipsModal #modal-body").html("无法连接到服务器！请稍后再试！");
			setTimeout(function() {
				$("#tipsModal").modal('hide');
			}, 10000);
			}
		})
}

function add(){
	var uri="${pageContext.request.contextPath }/stu/add";
	var inp=$("#addModal input");
	var examStuSex="";
	if(inp.eq(3).get(0).checked==true){
		examStuSex="m";
	}else if(inp.eq(4).get(0).checked==true){
		examStuSex="f";
	}
	$.ajax({
		data:{	examStuNumber:inp.eq(0).val(),
				examStuName:inp.eq(1).val(),
				examStuPassword:inp.eq(2).val(),
				examStuSex:examStuSex,
				examStuBirthday:inp.eq(5).val(),
				examStuTel:inp.eq(6).val(),
				examStuAddress:inp.eq(7).val()
			  },
		dataType:"json",
		type:"post",
		url:uri,
		cache:false,
		success:function(data){
				if("success"==data.result){
					$("#tipsModal").modal('show');
					$("#tipsModal .modal-body").html(data.message);
					$("#addModal").modal('hide');
					$("#stuList").trigger("reloadGrid");
					setTimeout(function() {
						$("#tipsModal").modal('hide');
					}, 10000);
					$("#addForm")[0].reset();
				}else if("error"==data.result){
					$("#tipsModal").modal('show');
					$("#tipsModal .modal-body").html(data.message);
					setTimeout(function() {
						$("#tipsModal").modal('hide');
					}, 10000);
				}
		},
		error:function(){
			$("#tipsModal").modal('show');
			$("#tipsModal #modal-body").html("无法连接到服务器！请稍后再试！");
			setTimeout(function() {
				$("#tipsModal").modal('hide');
			}, 10000);
			}
		})
}
function jqGridLoad(){
	$("#stuList").jqGrid({  
        url: "${pageContext.request.contextPath }/stu/load",  
        datatype: "json",  
        mtype: "POST",  
        height: 350,  
        autowidth: true,  
        colModel: [  
              {name:"examStuId",index:"examStuId",label:"学生ID",width:40,align:'center'},    
              {name:"examStuNumber",index:"examStuNumber",label:"学号",width:100,sortable:false,align:'center'},  
              {name:"examStuName",index:"examStuName",label:"姓名",width:80,sortable:false,align:'center'},  
              {name:"examStuSex",index:"examStuSex",label:"性别",width:40,sortable:false,formatter:changeSex,align:'center'},  
              {name:"birthday",index:"examStuBirthday",label:"生日",width:100,sohenrirtable:false,align:'center'},
              {name:"examStuTel",index:"examStuTel",label:"电话",width:80,sortable:false,align:'center'},
              {name:"examStuAddress",index:"examStuAddress",label:"地址",width:80,sortable:false,align:'center'},
              {name:"examStuId",index:"examStuId",label:"操作",width:80,sortable:false,formatter:operator,align:'center'}
        ],  
        viewrecords: true,  
        rowNum: 5, 
        rowList: [5,10,15],
        pager: "#pager",  
        caption: "学生列表",
        gridComplete: function(){
            $('#stuList').closest("div.ui-jqgrid-view")
            .children("div.ui-jqgrid-titlebar").css("text-align", "center")
            .children("span.ui-jqgrid-title").css("float", "none");
            },
        loadComplete:function(){
        	 var rowNum = $("#stuList").jqGrid('getGridParam','records');
        	    if (rowNum == 0){
        	            $("#stuList").parent().append("<div id='norecords'><pre>没有查询记录！</pre></div>");
        	        $("#norecords").show();
        	    }else{//如果存在记录，则隐藏提示信息。
        	        $("#norecords").hide();
        	    }
        },
        loadError:function(){
        	$("#tipsModal").modal('show');
			$("#tipsModal .modal-body").html("无法连接到服务器");
			setTimeout(function() {
				$("#tipsModal").modal('hide');
			}, 10000);
            }
    }).jqGrid("navGrid","#pager",{
		edit:true,
		add:true,
		search:true
     });
}
function changeSex(sex){
	if(sex=='m')
		return "男";
	if(sex=='f')
		return "女";
}
function dateUtil(date_t){
	var date=new Date(date_t);
	var year=date.getFullYear();
	var month=date.getMonth()+1;
	var day=date.getDate();
	if(month<10)
		month="0"+month;
	if(day<10)
		day="0"+day;
	return year+"-"+month+"-"+day;
}
function operator(id){
	var a1=$("<a></a>");
	a1.addClass("update");
	a1.attr({"data-toggle":"modal","data-target":"#updateModal","onclick":"uReceive("+id+")"});
	a1.html("更新");
	var a2=$("<a></a>");
	a2.addClass("delete");
	a2.attr({"data-toggle":"modal","data-target":"#deleteModal","onclick":"deleted("+id+")"});
	a2.html("删除");
	var tr=$("<tr></tr>");
	tr.append(a1);
	tr.append(" ");
	tr.append(a2);
	return tr.html();
}
$(function(){
	var addValid=$("#addForm").validate({
		rules:{
			examStuNumber:{required:true, rangelength:[5,12]},
			examStuName:{required:true, rangelength:[2,12]},
			examStuPassword:{required:true, rangelength:[4,12]},
			examStuSex:"required",
			examStuBirthday:{required:true, date:true},
			examStuTel:{maxlength:15, min:0},
			examStuAddress:{rangelength:[0,25]}
			},
		messages:{
			examStuNumber:{required:"请输入学号", rangelength:"长度必须在5到12位"},
			examStuName:{required:"请填写姓名", rangelength:"长度必须在2到12位"},
			examStuPassword:{required:"请输入密码", rangelength:"长度必须在4到12位"},
			examStuSex:"请选择性别",
			examStuBirthday:{required:"请选择日期",date:"日期格式不正确"},
			examStuTel:{maxlength:"电话格式不正确", min:"电话格式不正确"},
			examStuAddress:{rangelength:"长度必须在0到25个字符"}
			},
		showErrors:function(errorMap, errorList){
			var div;
			$(".jq_tips_box").remove();
			for(var key in errorMap){
				div=$("#addForm #"+key).parent();
				div.tips({
					side : 2,
					msg : errorMap[key],
					color : '#FFF',
					bg : '#F00',
					time : 2
				}).keydown(function(){
					div.removeClass('has-error');
				}).change(function(){
					div.removeClass('has-error');
					});
				if(!div.hasClass('has-error'))
					div.addClass("has-error");
			}
		},
	});
	$("#addSubmit").click(function(){
		if($("#addForm").valid()){
			add();
		}
		});
})
</script>