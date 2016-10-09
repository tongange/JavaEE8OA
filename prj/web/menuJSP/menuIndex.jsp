<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="easyui-accordion" style="width: 100%; height: 60%;">
    <div title="系统管理" data-options="iconCls:'icon-filter'" style="overflow:visible;padding:10px;">
        <a id="btn_userManager" class="easyui-linkbutton c1" style="width:90%">用户管理</a><br><br>
        <a id="btn_roleManager" class="easyui-linkbutton c2" style="width:90%">岗位管理</a><br><br>
        <a id="btn_elSealManager" class="easyui-linkbutton c3" style="width:90%">电子公章</a><br><br>
        <a id="btn_findJobPersonManager" class="easyui-linkbutton c4" style="width:90%">招聘人员管理</a><br><br>
    </div>
    <div title="行政管理" data-options="iconCls:'icon-tip',selected:true" style="padding:10px;">
        <a id="btn_meetingManager" class="easyui-linkbutton c5" style="width:90%">会议管理</a><br><br>
        <a id="btn_employeeManager" class="easyui-linkbutton c6" style="width:90%">员工管理</a><br><br>
        <a id="btn_employeeComputerManager" class="easyui-linkbutton c7" style="width:90%">员工电脑管理</a><br><br>
        <a id="btn_employeeProjectManager" class="easyui-linkbutton c8" style="width:90%">员工项目管理</a><br><br>
    </div>
    <div title="关于" data-options="iconCls:'icon-more',selected:true" style="padding:10px;">
        <a id="ben_aboutJava8" class="easyui-linkbutton c9" style="width:90%">java8新特性</a><br><br>
        <a id="ben_aboutProject" class="easyui-linkbutton c1" style="width:90%">关于此项目</a><br><br>
    </div>
</div>