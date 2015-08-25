<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="../../commons/taglibs.jsp"%>
<%@include file="../../commons/meta.jsp"%>
<%@page import="org.pssframework.support.system.SystemConst"%>
<%@ taglib tagdir="/WEB-INF/tags/simpletable" prefix="simpletable"%>
<html>
<head>
<title>终端事件明细</title>
<link type="text/css" rel="stylesheet" href="<pss:path type="bgcolor"/>/css/content.css" />
<link type="text/css" rel="stylesheet" href="${ctx}/widgets/simpletable/simpletable.css" />
<script type="text/javascript" src="${ctx}/widgets/simpletable/simpletable.js"></script>
<script type="text/javascript">

</script>
</head>
<body>
  <form:form action="${ctx}/statistics/termData/eventDetail04" modelAttribute="statisticsQuery">
  <form:hidden path="tgId" />
  <form:hidden path="orgId" />
  <form:hidden path="sdate" />
  <form:hidden path="edate" />
  <form:hidden path="logicalAddr" />
  <form:hidden path="edId" />
  <div id="tbl-container" style="height: expression(((document.documentElement.clientHeight ||document.body.clientHeight)-29));">
  <table width="100%" border="0" cellspacing="0" class="gridBody" id="object_table">
    <thead class="tableHeader">
      <tr>
        <th>序号</th>
        <th sortColumn="logicalAddr">逻辑地址</th>
        <th sortColumn="switchNo">开关量编号</th>
        <th sortColumn="switchName">开关量名称</th>
        <th sortColumn="alarmName">报警内容</th>
      </tr>
    </thead>
    <tbody class="tableBody" id="dataBody">
      <c:forEach items="${page.result}" var="item" varStatus="status">
        <tr class="${status.count % 2 == 0 ? 'odd' : 'even'}">
          <td>${page.thisPageFirstElementNumber + status.index}</td>
          <td><c:out value='${item.logicalAddr}' />&nbsp;</td>
          <td><c:out value='${item.switchNo}' />&nbsp;</td>
          <td><c:out value='${item.switchName}' />&nbsp;</td>
          <td><c:out value='${item.alarmName}' />&nbsp;</td>
        </tr>
      </c:forEach>
    </tbody>
  </table>
  </div>
</form:form>
<div><simpletable:pageToolbar page="${page}"></simpletable:pageToolbar></div>
</body>
<script type="text/javascript">
$(document).ready( function() {
    // 分页需要依赖的初始化动作
    window.simpleTable = new SimpleTable('statisticsQuery', '${page.thisPageNumber}', '${page.pageSize}', '${pageRequest.sortColumns}', '');
    window.simpleTable.ctx = '${ctx}';
});
</script>
</html>