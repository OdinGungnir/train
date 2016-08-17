<%@page import="com.ol.util.DateUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/static/bootstrap/css/bootstrap.min.css">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/static/jquery-ui-1.12.0.custom/jquery-ui.min.css">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/static/jqGrid/css/ui.jqgrid.css">
<title>在线考试系统|学生列表</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/jquery-1.12.4/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/jquery-ui-1.12.0.custom/jquery-ui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/jqGrid/js/i18n/grid.locale-cn.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/jqGrid/js/jquery.jqGrid.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/jquery-validation/jquery.validate.min.js"></script>
<script src="${pageContext.request.contextPath}/static/jquery-1.12.4/jquery.tips.js"></script>
<style type="text/css">
div{text-align: center;}
.error{color: red}
</style>
</head>
<body>
	<div class="container">
		<div class="row" style="margin-top: 50px">
			<table id="stuList" style="text-align: center;"></table>
			<div id="pager"></div><br/>
			<button class="btn btn-default" data-toggle="modal"   data-target="#addModal">添加</button>
		</div>
	</div>
<!-- 引入添加的模态框	 -->
<jsp:include page="/WEB-INF/jsp/student/stuadd.jsp"/>
<!-- 引入更新的模态框	 -->
<jsp:include page="/WEB-INF/jsp/student/stuUpdate.jsp"/>
<!-- 引入提示的模态框	 -->
<jsp:include page="/WEB-INF/jsp/tipsModal.jsp"/>

<div class="modal fade" id="deleteModal" tabindex="-1" role="dialog">
  <div class="modal-dialog modal-sm">
    <div class="modal-content">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
            <h3 id="myModalLabel">Delete Confirmation</h3>
        </div>
        <div class="modal-body">
            <p class="error-text"><i class="fa fa-warning modal-icon"></i>Are you sure you want to delete the data?<br>This cannot be undone.</p>
        </div>
        <div class="modal-footer">
            <button class="btn btn-default" data-dismiss="modal">Cancel</button>
            <button class="btn btn-danger" data-dismiss="modal">Delete</button>
        </div>
      </div>
    </div>
</div>	
<script type="text/javascript" src="${pageContext.request.contextPath }/static/bootstrap/js/bootstrap.min.js"></script>
<jsp:include page="/WEB-INF/jsp/script/stu-js.jsp"></jsp:include>
</body>
</html>