<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<form:form id="updateForm" class="form-inline" method="post" modelAttribute="examStu">
<div class="modal fade" id="updateModal" tabindex="-1" role="dialog" 
   aria-labelledby="myModalLabel" aria-hidden="true">
   <div class="modal-dialog">
      <div class="modal-content">
         <div class="modal-header">
            <button type="button" class="close" 
               data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>
            <h4 class="modal-title" id="myModalLabel">
              更新
            </h4>
         </div>
         <div class="modal-body" style="text-align: center">
       		<div class="form-group">
       			<label>学号:</label>	
       			<form:input cssClass="form-control" type="number"
				path="examStuNumber" min="0"/><br/>
				<form:errors cssClass="red" path="examStuNumber"/>
     		</div><br/>
     		<div class="form-group">
           		<label>姓名:</label>	
           		<form:input cssClass="form-control" maxlength="12" path="examStuName" /><br/>
				<form:errors cssClass="red" path="examStuName"/>
         	</div><br/>
     		<div class="form-group">
           		<label>性别:</label>
				<form:radiobutton path="examStuSex" value="m" />男 
				<form:radiobutton path="examStuSex" value="f" />女<br/>
				<form:errors cssClass="red" path="examStuSex"/>
         	</div><br/>
     		<div class="form-group">
           		<label>生日:</label>
				<form:input cssClass="form-control" type="date"
				path="examStuBirthday" /><br>
				<form:errors cssClass="red" path="examStuBirthday"/>
         	</div><br/>
     		<div class="form-group">
           		<label>电话:</label>
				<form:input cssClass="form-control" type="number"
				path="examStuTel" /><br>
				<form:errors cssClass="red" path="examStuTel"/>
         	</div><br/>
     		<div class="form-group">
           		<label>地址:</label>
				<form:input cssClass="form-control" path="examStuAddress" maxlength="25" /><br>
				<form:errors cssClass="red" path="examStuAddress"/>
         	</div>
         </div>
         <div class="modal-footer">
            <button type="button" class="btn btn-default" 
               data-dismiss="modal">取消
            </button>
            <button type="button" class="btn btn-primary btnUpdate">
               更新
            </button>
         </div>
      </div>
    </div>
</div>
</form:form>