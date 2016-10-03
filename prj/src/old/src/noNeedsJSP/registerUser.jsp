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
            <!--
                界面设计:
                首姓名, 尾姓名
                登录名
                密码
                确认密码
                国家
                生日
                月           天       年
                性别
                国家和编号
                电话号码
                创建账户
            -->
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
                                <%--<div class="input-group">--%>
                                <input type="text" class="form-control" id="user_firstName" name="user_firstName"
                                       style="margin-bottom: 1%;margin-left: 1%;margin-top: 1%;" placeholder="首姓名">
                                <%--</div><!-- /input-group -->--%>
                            </div><!-- /.col-lg-6 -->
                            <div class="col-lg-6">
                                <%--<div class="input-group">--%>
                                <input type="text" class="form-control" id="user_lastName" name="user_lastName"
                                       style="margin-bottom: 1%;margin-left: 1%;margin-top: 1%; width: 90%;" placeholder="尾姓名">
                                <%--</div><!-- /input-group -->--%>
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
                                        <%--<option value="1">1</option>
                                        <option value="2">2</option>
                                        <option value="3">3</option>
                                        <option value="4">4</option>
                                        <option value="5">5</option>
                                        <option value="6">6</option>
                                        <option value="7">7</option>
                                        <option value="8">8</option>
                                        <option value="9">9</option>
                                        <option value="10">10</option>
                                        <option value="11">11</option>
                                        <option value="12">12</option>
                                        <option value="13">13</option>
                                        <option value="14">14</option>
                                        <option value="15">15</option>
                                        <option value="16">16</option>
                                        <option value="17">17</option>
                                        <option value="18">18</option>
                                        <option value="19">19</option>
                                        <option value="20">20</option>
                                        <option value="21">21</option>
                                        <option value="22">22</option>
                                        <option value="23">23</option>
                                        <option value="24">24</option>
                                        <option value="25">25</option>
                                        <option value="26">26</option>
                                        <option value="27">27</option>
                                        <option value="28">28</option>
                                        <option value="29">29</option>
                                        <option value="30">30</option>
                                        <option value="31">31</option>--%>
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
                                        <%--<option value="2016">2016</option>
                                        <option value="2015">2015</option>
                                        <option value="2014">2014</option>
                                        <option value="2013">2013</option>
                                        <option value="2012">2012</option>
                                        <option value="2011">2011</option>
                                        <option value="2010">2010</option>
                                        <option value="2009">2009</option>
                                        <option value="2008">2008</option>
                                        <option value="2007">2007</option>
                                        <option value="2006">2006</option>
                                        <option value="2005">2005</option>
                                        <option value="2004">2004</option>
                                        <option value="2003">2003</option>
                                        <option value="2002">2002</option>
                                        <option value="2001">2001</option>
                                        <option value="2000">2000</option>
                                        <option value="1999">1999</option>
                                        <option value="1998">1998</option>
                                        <option value="1997">1997</option>
                                        <option value="1996">1996</option>
                                        <option value="1995">1995</option>
                                        <option value="1994">1994</option>
                                        <option value="1993">1993</option>
                                        <option value="1992">1992</option>
                                        <option value="1991">1991</option>
                                        <option value="1990">1990</option>
                                        <option value="1989">1989</option>
                                        <option value="1988">1988</option>
                                        <option value="1987">1987</option>
                                        <option value="1986">1986</option>
                                        <option value="1985">1985</option>
                                        <option value="1984">1984</option>
                                        <option value="1983">1983</option>
                                        <option value="1982">1982</option>
                                        <option value="1981">1981</option>
                                        <option value="1980">1980</option>
                                        <option value="1979">1979</option>
                                        <option value="1978">1978</option>
                                        <option value="1977">1977</option>
                                        <option value="1976">1976</option>
                                        <option value="1975">1975</option>
                                        <option value="1974">1974</option>
                                        <option value="1973">1973</option>
                                        <option value="1972">1972</option>
                                        <option value="1971">1971</option>
                                        <option value="1970">1970</option>
                                        <option value="1969">1969</option>
                                        <option value="1968">1968</option>
                                        <option value="1967">1967</option>
                                        <option value="1966">1966</option>
                                        <option value="1965">1965</option>
                                        <option value="1964">1964</option>
                                        <option value="1963">1963</option>
                                        <option value="1962">1962</option>
                                        <option value="1961">1961</option>
                                        <option value="1960">1960</option>
                                        <option value="1959">1959</option>
                                        <option value="1958">1958</option>
                                        <option value="1957">1957</option>
                                        <option value="1956">1956</option>
                                        <option value="1955">1955</option>
                                        <option value="1954">1954</option>
                                        <option value="1953">1953</option>
                                        <option value="1952">1952</option>
                                        <option value="1951">1951</option>
                                        <option value="1950">1950</option>
                                        <option value="1949">1949</option>
                                        <option value="1948">1948</option>
                                        <option value="1947">1947</option>
                                        <option value="1946">1946</option>
                                        <option value="1945">1945</option>
                                        <option value="1944">1944</option>
                                        <option value="1943">1943</option>
                                        <option value="1942">1942</option>
                                        <option value="1941">1941</option>
                                        <option value="1940">1940</option>
                                        <option value="1939">1939</option>
                                        <option value="1938">1938</option>
                                        <option value="1937">1937</option>
                                        <option value="1936">1936</option>
                                        <option value="1935">1935</option>
                                        <option value="1934">1934</option>
                                        <option value="1933">1933</option>
                                        <option value="1932">1932</option>
                                        <option value="1931">1931</option>
                                        <option value="1930">1930</option>
                                        <option value="1929">1929</option>
                                        <option value="1928">1928</option>
                                        <option value="1927">1927</option>
                                        <option value="1926">1926</option>
                                        <option value="1925">1925</option>
                                        <option value="1924">1924</option>
                                        <option value="1923">1923</option>
                                        <option value="1922">1922</option>
                                        <option value="1921">1921</option>
                                        <option value="1920">1920</option>
                                        <option value="1919">1919</option>
                                        <option value="1918">1918</option>
                                        <option value="1917">1917</option>
                                        <option value="1916">1916</option>
                                        <option value="1915">1915</option>
                                        <option value="1914">1914</option>
                                        <option value="1913">1913</option>
                                        <option value="1912">1912</option>
                                        <option value="1911">1911</option>
                                        <option value="1910">1910</option>
                                        <option value="1909">1909</option>
                                        <option value="1908">1908</option>
                                        <option value="1907">1907</option>
                                        <option value="1906">1906</option>
                                        <option value="1905">1905</option>--%>
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
                    <td>&nbsp;</td>
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






