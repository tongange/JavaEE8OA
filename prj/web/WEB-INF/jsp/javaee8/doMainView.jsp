<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<head>
    <jsp:include page="/WEB-INF/include_easyui.jsp"></jsp:include>
    <script type="text/javascript" src="<c:url value="/qinJs/qin.doMainView.js"/> "></script>
</head>

<body class="easyui-layout">
<div data-options="region:'west',title:'导航菜单',split:true" style="width:200px;">
    <jsp:include page="/menuJSP/menuIndex.jsp"></jsp:include>
</div>
<div data-options="region:'center',title:'主页'" style="padding:5px;background:#eee;height: 3000px;">
    <table id="tb_user"></table>
    <br>
    <table id="tb_role"></table>
</div>
</body>






















