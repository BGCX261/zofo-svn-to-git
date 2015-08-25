<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="../../commons/taglibs.jsp"%>
<%@include file="../../commons/meta.jsp"%>
<%@page import="org.pssframework.support.system.SystemConst"%>
<%@ taglib tagdir="/WEB-INF/tags/simpletable" prefix="simpletable"%>
<html>
<head>
<title>漏保电压电流曲线</title>
<link type="text/css" rel="stylesheet" href="<pss:path type="bgcolor"/>/css/content.css" />
<link type="text/css" rel="stylesheet" href="${ctx}/widgets/simpletable/simpletable.css" />
<script type="text/javascript" src="${ctx}/widgets/simpletable/simpletable.js"></script>
<script type="text/javascript" src="<pss:path type="webapp"/>/scripts/jquery.js"></script>
<script type="text/javascript" src="${ctx}/scripts/FusionChartsJSClass/FusionCharts.js"></script>
<script type="text/javascript">
function chgSjlx() {
    var url = '<pss:path type="webapp"/>' + '/psmanage/psmon/ecCurvQuery_Chart?caption=漏保数据曲线&chartType=1&chartCategory=' + $("#sjlx").val() + '&width=0&height=0&psId=${param.psId}&sdate=${param.sdate}&edate=${param.edate}&r=' + Math.random();
    //alert(url);
    location.href = url;
}

$(document).ready(function() {
    $("#sjlx").val('${param.chartCategory}');
});
</script>
</head>
<body>
<div align="right">数据类型：<select id="sjlx" name="sjlx" onchange="chgSjlx()"><option value="1">电压数据</option><option value="2">电流数据</option><option value="3">剩余电流</option></select></div>
<div class="graphContainer" style="width: 100%; height:expression(((document.documentElement.clientHeight||document.body.clientHeight))-22);">
  <c:out value='${chart}' escapeXml="false" />
</div>
</body>
</html>