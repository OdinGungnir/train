<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${pageContext.request.contextPath }/static/jquery-1.12.4/jquery-1.12.4.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr><td>标题1</td><td>标题2</td><td>标题3</td></tr>
		</thead>
		<tbody>
		</tbody>
	</table>
	<button onclick="add()">add</button>
	
<script type="text/javascript">
function add(){
	var tr=$("<tr></tr>");
	var td1=$("<td></td>");
	$("tbody").append(tr);
}
</script>
</body>
</html>