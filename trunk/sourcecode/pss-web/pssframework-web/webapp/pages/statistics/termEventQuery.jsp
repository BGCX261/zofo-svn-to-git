<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="../../commons/taglibs.jsp"%>
<%@include file="../../commons/meta.jsp"%>
<%@page import="org.pssframework.support.system.SystemConst"%>
<%@ taglib tagdir="/WEB-INF/tags/simpletable" prefix="simpletable"%>
<html>
<head>
<title>终端事件</title>
<link type="text/css" rel="stylesheet" href="<pss:path type="bgcolor"/>/css/content.css" />
<link type="text/css" rel="stylesheet" href="${ctx}/widgets/simpletable/simpletable.css" />
<script type="text/javascript" src="${ctx}/widgets/simpletable/simpletable.js"></script>
<script type="text/javascript">
function showDetail(edid) {
    var url = "${ctx}/statistics/termData/eventDetail04?orgId=0&tgId=-1&logicalAddr=&sdate=&edate=&edId=" + edid;
    windowPopup(url, 600, 400);
}
</script>
</head>
<body>
  <form:form action="${ctx}/statistics/termData/event" modelAttribute="statisticsQuery">
  <form:hidden path="tgId" />
  <form:hidden path="orgId" />
  <form:hidden path="sdate" />
  <form:hidden path="edate" />
  <form:hidden path="logicalAddr" />
  <div id="tbl-container" style="height: expression(((document.documentElement.clientHeight ||document.body.clientHeight)-29));">
  
  <table width="100%" border="0" cellspacing="0" class="gridBody" id="object_table">
    <thead class="tableHeader">
      <tr>
        <th>序号</th>
        <th sortColumn="orgName">单位名称</th>
        <th sortColumn="tgName">台区名称</th>
        <th sortColumn="logicalAddr">逻辑地址</th>
        <th sortColumn="exTime">发生时间</th>
        <th sortColumn="exName">异常名称</th>
        <!-- <th >查看</th> -->
      </tr>
    </thead>
    <tbody class="tableBody" id="dataBody">
      <c:forEach items="${page.result}" var="item" varStatus="status">
        <tr class="${status.count % 2 == 0 ? 'odd' : 'even'}">
          <td>${page.thisPageFirstElementNumber + status.index}</td>
          <td><c:out value='${item.orgName}' />&nbsp;</td>
          <td><c:out value='${item.tgName}' />&nbsp;</td>
          <td><c:out value='${item.logicalAddr}' />&nbsp;</td>
          <td><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${item.exTime}"></fmt:formatDate> &nbsp;</td>
          <td><c:if test="${item.exCode == '4'}"><a onclick="showDetail('${item.edId}')"><c:out value='${item.exName}' /></a></c:if><c:if test="${item.exCode != '4'}"><c:out value='${item.exName}' /></c:if>&nbsp;</td>
          <!-- <td>&nbsp;</td> -->
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
	window.simpleTable = new SimpleTable('statisticsQuery', '${page.thisPageNumber}', '${page.pageSize}', '${pageRequest.sortColumns}', '${page.exportReport}');
	window.simpleTable.ctx = '${ctx}';
});
</script>
</html>