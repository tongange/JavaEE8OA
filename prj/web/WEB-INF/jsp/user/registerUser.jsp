<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<head>
    <jsp:include page="/WEB-INF/include_bootstrap.jsp"></jsp:include>
    <script type="text/javascript" src="<c:url value="/qinJs/qin.login.register.js"/> "></script>
</head>

<body>

<div class="container" style="width: 100%;">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <jsp:include page="/WEB-INF/indexJsp/header.jsp"></jsp:include>
        </div>
    </div>
    <div class="row clearfix">
        <!-- 导航开始 -->
        <jsp:include page="/WEB-INF/indexJsp/navigator.jsp"></jsp:include>
        <!-- 导航结束 -->
        <div class="col-md-6 column">
            <table width="1750" border="10" bordercolor="#330066" ;>
                <tr>
                    <td colspan="3" class="register_td_captain"> 注册用户</td>
                </tr>
                <tr>
                    <td class="register_td_title">字段</td>
                    <td class="register_td_title">控件</td>
                    <td class="register_td_title">说明</td>
                </tr>
                <tr>
                    <td class="register_td_title">首姓名+尾姓名</td>
                    <td>
                        <div class="row">
                            <div class="col-lg-6">
                                <input type="text" class="form-control" id="user_firstName" name="user_firstName"
                                       style="margin-bottom: 1%;margin-left: 1%;margin-top: 1%;" placeholder="首姓名">
                            </div><!-- /.col-lg-6 -->
                            <div class="col-lg-6">
                                <input type="text" class="form-control" id="user_lastName" name="user_lastName"
                                       style="margin-bottom: 1%;margin-left: 1%;margin-top: 1%; width: 90%;" placeholder="尾姓名">
                            </div><!-- /.col-lg-6 -->
                        </div><!-- /.row -->
                    </td>
                    <td class="register_td_description">两个输入框中的值都不能为空!</td>
                </tr>
                <tr>
                    <td class="register_td_title">登录名</td>
                    <td>
                        <input type="text" class="form-control" id="user_loginName" name="user_loginName"
                               style="margin-bottom: 1%;margin-left: 1%;margin-top: 1%; width: 90%;" placeholder="登录名">
                    </td>
                    <td class="register_td_description">用户登录名(unique)</td>
                </tr>
                <tr>
                    <td class="register_td_title">用户描述</td>
                    <td>
                        <input type="text" class="form-control" id="user_description" name="user_description"
                               style="margin-bottom: 1%;margin-left: 1%;margin-top: 1%; width: 90%;" placeholder="用户描述">
                    </td>
                    <td class="register_td_description">用户描述(可为空)</td>
                </tr>
                <tr>
                    <td class="register_td_title">密码</td>
                    <td>
                        <input type="password" class="form-control" id="user_password" name="user_password"
                               style="margin-bottom: 1%;margin-left: 1%;margin-top: 1%; width: 90%;" placeholder="密码">
                    </td>
                    <td class="register_td_description">请输入用户密码</td>
                </tr>
                <tr>
                    <td class="register_td_title">确认密码</td>
                    <td>
                        <input type="password" class="form-control" id="user_password2" name="user_password2"
                               style="margin-bottom: 1%;margin-left: 1%;margin-top: 1%; width: 90%;" placeholder="确认密码">
                    </td>
                    <td class="register_td_description">重复密码</td>
                </tr>
                <tr>
                    <td class="register_td_title">生日</td>
                    <td>
                        <table width="100%;" border="0">
                            <tr>
                                <td>
                                    <select id="select_month" name="select_month">
                                        <option selected="selected" value="">Month</option>
                                        <option value="1">January</option>
                                        <option value="2">February</option>
                                        <option value="3">March</option>
                                        <option value="4">April</option>
                                        <option value="5">May</option>
                                        <option value="6">June</option>
                                        <option value="7">July</option>
                                        <option value="8">August</option>
                                        <option value="9">September</option>
                                        <option value="10">October</option>
                                        <option value="11">November</option>
                                        <option value="12">December</option>
                                    </select>
                                </td>
                                <td>
                                    <select id="select_day" name="select_day">
                                        <option selected="selected" value="">Day</option>
                                        <%
                                            for (int i = 1; i <= 31; i++)
                                            {
                                                out.println("<option value=\"" + i + "\">" + i + "</option>");
                                            }
                                        %>
                                    </select>
                                </td>
                                <td>
                                    <select id="select_year" name="select_year">
                                        <option selected="selected" value="">Year</option>
                                        <%
                                            Date d = new Date();
                                            String sDate = new SimpleDateFormat("yyyy-MM-dd").format(d).substring(0, 4);
                                            Integer bigInt = Integer.valueOf(sDate);
                                            for (int i = 1800; i <= bigInt; i++)
                                            {
                                                out.println("<option value=\"" + i + "\">" + i + "</option>");
                                            }
                                        %>
                                    </select>
                                </td>
                            </tr>
                        </table>
                    </td>
                    <td class="register_td_description">日期(不能为空!)</td>
                </tr>
                <tr>
                    <td class="register_td_title">性别</td>
                    <td>
                        <select id="select_gender" name="select_gender">
                            <option selected="selected" value="">gender</option>
                            <option value="1">男</option>
                            <option value="2">女</option>
                        </select>
                    </td>
                    <td class="register_td_description">从下拉框中选择(不能为空!)</td>
                </tr>
                <tr>
                    <td class="register_td_title">国家和编号</td>
                    <td>
                        <select id="user_country2" name="user_country2">
                        </select>
                    </td>
                    <td class="register_td_description">国家+编号(能为空!)</td>
                </tr>
                <tr>
                    <td class="register_td_title">电话号码</td>
                    <td>
                        <input type="text" class="form-control" id="user_phoneNumber" name="user_phoneNumber"
                               style="margin-left: 1%;margin-right: 1%;margin-top: 1%;margin-bottom: 1%;width: 90%;"
                               placeholder="电话号码">
                    </td>
                    <td class="register_td_description">用户联系方式(不能为空!)</td>
                </tr>
                <tr>
                    <td colspan="3">新增</td>
                </tr>
            </table>
        </div>
    </div>
</div>

</body>






