<%@page import="org.pssframework.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>
<%
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<html>

<head>
	<%@ include file="/commons/meta.jsp" %>
	<base href="<%=basePath%>">
	<link href="${ctx}/widgets/extremecomponents/extremecomponents.css" type="text/css" rel=stylesheet>
	<script src="${ctx}/scripts/rest.js" ></script>
	<title><fmt:message key="entity.deleted" /><fmt:message key="tree.org" /><spring:message code="entity.deleted"></spring:message> 维护</title>
</head>

<body>
<%@ include file="/commons/messages.jsp" %>

<div class="queryPanel">
<form method="get" style="display: inline;">
<fieldset>
	<legend>搜索</legend>
	<table>
		<tr>	
			<td class="tdLabel">
					<%=UserInfo.ALIAS_USERNAME%>
			</td>		
			<td>
				<input value="${pageRequest.filters.username}"  name="s_username"  />
			</td>
			<td class="tdLabel">
					<%=UserInfo.ALIAS_PASSWORD%>
			</td>		
			<td>
				<input value="${pageRequest.filters.password}"  name="s_password"  />
			</td>
			<td class="tdLabel">
					<%=UserInfo.ALIAS_BIRTH_DATE%>
			</td>		
			<td>
				<input value="${pageRequest.filters.birthDate}" onclick="WdatePicker({dateFmt:'<%=UserInfo.FORMAT_BIRTH_DATE%>'})"  name="s_birthDate"   />
			</td>
			<td class="tdLabel">
					<%=UserInfo.ALIAS_SEX%>
			</td>		
			<td>
				<input value="${pageRequest.filters.sex}"  name="s_sex"  />
			</td>
		</tr>	
		<tr>	
			<td class="tdLabel">
					<%=UserInfo.ALIAS_AGE%>
			</td>		
			<td>
				<input value="${pageRequest.filters.age}"  name="s_age"  />
			</td>
		</tr>	
	</table>
</fieldset>
<div class="handleControl">
	<input type="submit" class="stdButton" style="width:80px" value="查询" onclick="getReferenceForm(this).action='${ctx}/userinfo'"/>
	<input type="button" class="stdButton" style="width:80px" value="新增" onclick="window.location = '${ctx}/userinfo/new'"/>
	<input type="button" class="stdButton" style="width:80px" value="删除" onclick="doRestBatchDelete('${ctx}/userinfo','items',document.forms.ec)"/>
<div>
</form>
</div>

<ec:table items='page.result' var="item" method="get"
	retrieveRowsCallback="limit" sortRowsCallback="limit" filterRowsCallback="limit"
	action="${ctx}/userinfo" autoIncludeParameters="true">
  <ec:exportXls fileName="output.xls" tooltip="Export Excel" />
	<ec:row>
		<ec:column property="选择" filterable="false" title="<input type='checkbox' onclick=\"setAllCheckboxState('items',this.checked)\" >" sortable="false" width="3%" viewsAllowed="html">
			<input type="checkbox" name="items" value="${item.userId}"/>
		</ec:column>
		<ec:column property="username"  title="<%=UserInfo.ALIAS_USERNAME%>"/>
		<ec:column property="password"  title="<%=UserInfo.ALIAS_PASSWORD%>"/>
		<ec:column property="birthDate" value="${item.birthDateString}" title="<%=UserInfo.ALIAS_BIRTH_DATE%>"/>
		<ec:column property="sex"  title="<%=UserInfo.ALIAS_SEX%>"/>
		<ec:column property="age"  title="<%=UserInfo.ALIAS_AGE%>"/>
		<ec:column property="操作" title="操作" filterable="false"  sortable="false" viewsAllowed="html">
			<a href="${ctx}/userinfo/${item.userId}">查看html</a>&nbsp;&nbsp;
			<a href="${ctx}/userinfo/${item.userId}.json">查看json</a>&nbsp;&nbsp;
			<a href="${ctx}/userinfo/${item.userId}.xml">查看xml</a>&nbsp;&nbsp;
			<a href="${ctx}/userinfo/${item.userId}/edit">修改</a>&nbsp;&nbsp;
			<a href="${ctx}/userinfo/${item.userId}" onclick="doRestDelete(this,'你确认删除?');return false;">删除</a>
		</ec:column>
	</ec:row>
</ec:table>

</body>

</html>

