<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="../../commons/taglibs.jsp"%>
<%@include file="../../commons/meta.jsp"%>
<%@page import="org.pssframework.support.system.SystemConst"%>
<%@ taglib tagdir="/WEB-INF/tags/simpletable" prefix="simpletable"%>
<html>
<head>
<title>供电可靠性信息</title>
<link type="text/css" rel="stylesheet" href="<pss:path type="bgcolor"/>/css/content.css" />
<link type="text/css" rel="stylesheet" href="${ctx}/widgets/simpletable/simpletable.css" />
<script type="text/javascript" src="${ctx}/widgets/simpletable/simpletable.js"></script>
<script type="text/javascript">
</script>
</head>
<body>
<form:form action="${ctx}/statistics/gdkkxQuery/gdkkxData" modelAttribute="statisticsQuery">
  <form:hidden path="tgId" />
  <form:hidden path="orgId" />
  <form:hidden path="sdate" />
  <form:hidden path="edate" />
  <div id="tbl-container" class="tbl-container" style="height: expression(((document.documentElement.clientHeight ||document.body.clientHeight)-29));">
  <table width="200%" border="0" cellspacing="0" class="gridBody" id="object_table">
    <thead class="tableHeader">
      <tr>
        <th>序号</th>
        <th sortColumn="orgName">单位名称</th>
        <th sortColumn="tgName">台区名称</th>
        <th sortColumn="psName">漏保名称</th>
        <th sortColumn="assetNo">资产编号</th>
        <th sortColumn="ddate">日期</th>
        <th sortColumn="eventCount">跳闸总次数</th>
        <th sortColumn="event00Count">漏电跳闸次数</th>
        <th sortColumn="event01Count">突变跳闸次数</th>
        <th sortColumn="event02Count">特波跳闸次数</th>
        <th sortColumn="event03Count">过载跳闸次数</th>
        <th sortColumn="event04Count">过压跳闸次数</th>
        <th sortColumn="event05Count">欠压跳闸次数</th>
        <th sortColumn="event06Count">短路跳闸次数</th>
        <th sortColumn="event07Count">手动跳闸次数</th>
        <th sortColumn="event08Count">停电跳闸次数</th>
        <th sortColumn="event09Count">互感器故障跳闸次数</th>
        <th sortColumn="event10Count">远程跳闸次数</th>
        <th sortColumn="event11Count">其它原因跳闸次数</th>
        <th sortColumn="lockCount">闭锁次数</th>
        <th sortColumn="powercutCount">停电次数</th>
        <th sortColumn="powercutMinutes">停电时间（分钟）</th>
        <th sortColumn="totalMinutes">总时间（分钟）</th>
        <th sortColumn="powerSupplyRate">供电可靠性</th>
      </tr>
    </thead>

    <tbody class="tableBody" id="dataBody" >
      <c:forEach items="${page.result}" var="item" varStatus="status">
        <tr class="${status.count % 2 == 0 ? 'odd' : 'even'}">
          <td>${page.thisPageFirstElementNumber + status.index}</td>
          <td><c:out value='${item.orgName}' />&nbsp;</td>
          <td><c:out value='${item.tgName}' />&nbsp;</td>
          <td><c:out value='${item.psName}' />&nbsp;</td>
          <td><c:out value='${item.assetNo}' />&nbsp;</td>
          <td><c:out value='${item.ddate}' />&nbsp;</td>
          <td><c:out value='${item.eventCount}' />&nbsp;</td>
          <td><c:out value='${item.event00Count}' />&nbsp;</td>
          <td><c:out value='${item.event01Count}' />&nbsp;</td>
          <td><c:out value='${item.event02Count}' />&nbsp;</td>
          <td><c:out value='${item.event03Count}' />&nbsp;</td>
          <td><c:out value='${item.event04Count}' />&nbsp;</td>
          <td><c:out value='${item.event05Count}' />&nbsp;</td>
          <td><c:out value='${item.event06Count}' />&nbsp;</td>
          <td><c:out value='${item.event07Count}' />&nbsp;</td>
          <td><c:out value='${item.event08Count}' />&nbsp;</td>
          <td><c:out value='${item.event09Count}' />&nbsp;</td>
          <td><c:out value='${item.event10Count}' />&nbsp;</td>
          <td><c:out value='${item.event11Count}' />&nbsp;</td>
          <td><c:out value='${item.lockCount}' />&nbsp;</td>
          <td><c:out value='${item.powercutCount}' />&nbsp;</td>
          <td><c:out value='${item.powercutMinutes}' />&nbsp;</td>
          <td><c:out value='${item.totalMinutes}' />&nbsp;</td>
          <td><c:out value='${item.powerSupplyRate}' />&nbsp;</td>
        </tr>
      </c:forEach>
    </tbody>
  </table>
  </div>
</form:form>
<div><simpletable:pageToolbar page="${page}"></simpletable:pageToolbar></div>
</body>
<script type="text/javascript">
$(document).ready(function() {
    // 分页需要依赖的初始化动作
    window.simpleTable = new SimpleTable('statisticsQuery','${page.thisPageNumber}','${page.pageSize}','${pageRequest.sortColumns}','${page.exportReport}');
    window.simpleTable.ctx = '${ctx}';
});
</script>
</html>