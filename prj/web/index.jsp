<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<head>
    <jsp:include page="WEB-INF/include_bootstrap.jsp"></jsp:include>
    <script type="text/javascript" src="<c:url value="/qinJs/qin.login.register.js"/> "></script>
</head>

<body>

<div class="container" style="width: 100%;">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <jsp:include page="WEB-INF/indexJsp/header.jsp"></jsp:include>
        </div>
    </div>
    <div class="row clearfix">
        <!-- 导航开始 -->
        <jsp:include page="WEB-INF/indexJsp/navigator.jsp"></jsp:include>
        <!-- 导航结束 -->
        <div class="col-md-6 column">
            <div class="container">
                <!-- 左边工具栏 -->
                <div class="row clearfix">
                    <div class="col-md-6 column">
                        <div style="font-family: 微软雅黑; font-size: 50px; color: red;">
                            此项目支持的浏览器:
                        </div>
                        <img src="/jsLib/bootstrap/img/browser-icon-chrome.png">
                        <img src="/jsLib/bootstrap/img/browser-icon-firefox.png"> <br>
                        <div style="font-family: 微软雅黑; font-size: 50px; color: red;">
                            此项目使用的开发工具:
                        </div>
                        <img src="/jsLib/bootstrap/img/idea.ico">
                    </div>
                    <!-- 左边工具栏 -->
                    <div class="col-md-6 column">
                        <!-- 登录实现 -->
                        <form class="form-horizontal" role="form">
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-2 control-label">
                                    <div class="labelFont">
                                        用户名
                                    </div>
                                </label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="user_loginName" name="user_loginName"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-2 control-label">
                                    <div class="labelFont">
                                        密码
                                    </div>
                                </label>
                                <div class="col-sm-10">
                                    <input type="password" class="form-control" id="user_password" name="user_password"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-offset-2 col-sm-10">
                                    <button type="button"
                                            class="btn btn-default btn-block btn-info" id="doLogin" name="doLogin">登录
                                    </button>
                                    <br>
                                    <button type="button"
                                            class="btn btn-default btn-block btn-info" id="doRegister" name="doRegister">注册
                                    </button>
                                </div>
                            </div>
                        </form>
                        <!-- 登录实现 -->
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

</body>






