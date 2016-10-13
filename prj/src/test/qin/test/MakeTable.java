package qin.test;

import org.junit.Test;
import qin.javaee8.core.JavaEE8BaseSupport;
import qin.javaee8.hibernate.domain.Gender;
import qin.javaee8.hibernate.hrDomain.Department;
import qin.javaee8.hibernate.systemDomain.FindJobPerson;
import qin.javaee8.hibernate.systemDomain.Role;

/**
 * Created by Administrator on 2016/10/5 10-005-05.<br/>
 */
public class MakeTable implements JavaEE8BaseSupport
{

    private static final JavaEE8Test j8 = new JavaEE8Test();

    //region 3
    @Test
    public void makeFindJobPersonDataGrid()
    {
        String s = j8Tools.printDataGrid
                  (
                            "用户招聘详细信息", "tb_findJobPerson", "url", 3000, 700,
                            true, true,
                            new String[]
                                      {
                                                "findJobPerson_id", "jobPersonName", "jobPersonGender", "jobPersonOldCompanyName", "jobPersonOldJob", "jobPersonStartJobTime", "jobPersonJobName", "jobPersonNowCity", "jobPersonBirth",
                                                "jobPersonIsMarried", "jobPersonMobile", "jobPersonEmail", "jobPersonCountry", "jobPersonLocation", "jobPersonWantJob", "jobPersonFunction", "jobPersonWantLocation", "jobPersonWantsYearSalary",
                                                "jobPersonOldYearSalary", "jobPersonExperienceCompanyName", "jobPersonExperienceCompanyNature", "jobPersonExperienceCompanyPeopleNumber", "jobPersonExperienceCompanySimpleIntroduction",
                                                "jobPersonExperienceCompanyJobName", "jobPersonExperienceCompanyLocation", "jobPersonExperienceCompanyUnderlingPeople", "jobPersonExperienceCompanyJobTime", "jobPersonExperienceCompanyDutyOfWork",
                                                "jobPersonExperienceCompanyJobReportToWho", "jobPersonExperienceCompanyMonthSalary", "jobPersonExperienceCompanyScore", "jobPersonSchoolName", "jobPersonMajorName", "jobPersonSchoolStudyTime",
                                                "jobPersonSchoolRecord", "jobPersonProjectName", "jobPersonProjectCompanyName", "jobPersonProjectFunction", "jobPersonProjectDoTime", "jobPersonProjectDescription", "jobPersonProjectDuty",
                                                "jobPersonProjectScore", "jobPersonMyIntroduction", "jobPersonExperienceCompanyDepartment"
                                      },
                            new String[]
                                      {
                                                "招聘人员编号", "招聘人员名字", "招聘人员性别", "以前公司名称", "当前行业职能", "开始工作年份", "职位名称", "当前城市", "出生年份", "婚姻状况", "手机", "邮箱", "国籍", "户口", "期望行业", "期望职能", "期望地点", "期望年薪",
                                                "以前年薪", "公司名称", "公司性质", "公司规模", "公司简介", "职位名称", "工作地点", "下属人数", "任职时间", "工作职责", "汇报对象", "月薪", "工作业绩", "学校名称", "专业名称", "就读时间", "学历", "项目名称", "公司名称", "项目职务",
                                                "项目时间", "项目描述", "项目职责", "项目业绩", "自我评价", "所在部门"
                                      },
                            new Integer[]
                                      {
                                                400, 400, 400, 400, 400,
                                                400, 400, 400, 400, 400,
                                                400, 400, 400, 400, 400,
                                                400, 400, 400, 400, 400,
                                                400, 400, 400, 400, 400,
                                                400, 400, 400, 400, 400,
                                                400, 400, 400, 400, 400,
                                                400, 400, 400, 400, 400,
                                                400, 400, 400, 400, 400
                                      }
                  );
        j8Tools.superInfo(s);
    }

    @Test
    public void makeFindJobPersonDataGrid2()
    {
        String s = j8Tools.printDataGrid
                  (
                            "用户招聘详细信息", "tb_findJobPerson", "url", 3000, 700,
                            true, true,
                            new String[]
                                      {
                                                "jobPersonName", "jobPersonGender", "jobPersonStartJobTime",
                                                "jobPersonJobName", "jobPersonNowCity", "jobPersonBirth",
                                                "jobPersonMobile", "jobPersonEmail", "jobPersonCountry",
                                                "jobPersonLocation", "jobPersonWantJob", "jobPersonFunction",
                                                "jobPersonWantLocation", "jobPersonWantsYearSalary"
                                      },
                            new String[]
                                      {
                                                "招聘人员名字", "招聘人员性别", "开始工作年份",
                                                "职位名称", "当前城市", "出生年份",
                                                "手机", "邮箱", "国籍",
                                                "户口", "期望行业", "期望职能",
                                                "期望地点", "期望年薪"
                                      },
                            new Integer[]
                                      {
                                                300, 200, 400, 400, 300, 300, 200, 300, 300, 300, 300, 300, 200, 300
                                      }
                  );
        j8Tools.superInfo(s);
    }

    @Test
    public void makeFindJobPersonDataGrid3()
    {
        String s = j8Tools.printDataGrid
                  (
                            "用户职业意向信息", "tb_findJobWants", "\"/findJobPerson/findJobWants.com\"", 1500, 700,
                            true, true,
                            new String[]
                                      {
                                                "jobPersonWantJob", "jobPersonFunction", "jobPersonWantLocation",
                                                "jobPersonWantsYearSalary", "jobPersonOldYearSalary"
                                      },
                            new String[]
                                      {
                                                "期望行业", "期望职能", "期望地点",
                                                "期望年薪", "目前年薪"
                                      },
                            new Integer[]
                                      {
                                                300, 300, 300, 300, 300
                                      }
                  );
        j8Tools.superInfo(s);
    }
    //endregion

    //region 2
    @Test
    public void saveRole()
    {
        Role role = new Role("java开发", "实现java软件的开发", false, (short) 30, j8Tools.getTime(2016, 10, 7), j8Tools.getTime(2016, 10, 8));
        j8.session.save(role);
    }

    //@org.junit.AfterClass
    public static void end()
    {
        j8.transaction.commit();
    }

    @Test
    public void makeDataGrid()
    {
        String s = j8Tools.printDataGrid
                  (
                            "用户详细信息", "tb_user", "url", 1024, 768,
                            true, true,
                            new String[]
                                      {
                                                "id", "user_firstName", "user_lastName", "user_loginName",
                                                "user_email", "user_country", "user_birthdate", "user_gender",
                                                "user_phoneNumber", "user_description", "userType"
                                      },
                            new String[]
                                      {
                                                "用户编号", "用户首姓名", "用户尾姓名", "用户登录名",
                                                "用户邮箱", "用户所对应的国家", "用户生日", "用户性别",
                                                "用户联系方式", "用户描述", "用户所对应的类型"
                                      },
                            new Integer[]
                                      {
                                                60, 100, 100, 100,
                                                300, 300, 300, 300,
                                                300, 300, 300
                                      }
                  );
        j8Tools.superInfo(s);
    }

    @Test
    public void makeDataGrid1()
    {
        String s = j8Tools.printDataGrid
                  (
                            "电子公章详细信息", "tb_elSeal", "url", 1024, 768,
                            true, true,
                            new String[]
                                      {
                                                "elSeal_id", "elSeal_title", "elSeal_description",
                                                "elSeal_CreateTime", "elSeal_path", "elSeal_employee"
                                      },
                            new String[]
                                      {
                                                "公章编号", "公章标题", "公章描述",
                                                "公章创建时间", "公章路径", "公章所对应的员工"
                                      },
                            new Integer[]
                                      {
                                                100, 300, 400,
                                                400, 400, 500
                                      }
                  );
        j8Tools.superInfo(s);
    }

    @Test
    public void saveFindJobPerson()
    {
        FindJobPerson f = new FindJobPerson();
        f.setJobPersonName("刘峰良");
        f.setJobPersonGender(Gender.BOY);
        f.setJobPersonOldCompanyName(" ");
        f.setJobPersonOldJob(" ");
        f.setJobPersonStartJobTime(j8Tools.getTime(2003, 9, 1));
        f.setJobPersonJobName("java开发工程师");
        f.setJobPersonNowCity("北京");
        f.setJobPersonBirth(j8Tools.getTime(1984, 2, 19));
        f.setJobPersonIsMarried("保密");
        f.setJobPersonMobile(13061681019l);
        f.setJobPersonEmail("liufengliang@163.com");
        f.setJobPersonCountry("湖北");
        f.setJobPersonLocation("湖北");
        f.setJobPersonWantJob("软件行业");
        f.setJobPersonFunction("java开发或c#开发");
        f.setJobPersonWantLocation("上海或杭州");
        f.setJobPersonWantsYearSalary(500000.0000d);
        f.setJobPersonOldYearSalary(400000.0000d);
        f.setJobPersonExperienceCompanyName("上海宝信软件");
        f.setJobPersonExperienceCompanyNature("国企");
        f.setJobPersonExperienceCompanyPeopleNumber("50人");
        f.setJobPersonExperienceCompanySimpleIntroduction("上市公司+国企");
        f.setJobPersonExperienceCompanyJobName("java高级开发工程师");
        f.setJobPersonExperienceCompanyLocation("上海");
        f.setJobPersonExperienceCompanyUnderlingPeople(20);
        f.setJobPersonExperienceCompanyJobTime(" ");
        f.setJobPersonExperienceCompanyDutyOfWork("开发java程序");
        f.setJobPersonExperienceCompanyDepartment(j8.session.get(Department.class, "Object"));
        f.setJobPersonExperienceCompanyJobReportToWHo("项目经理");
        f.setJobPersonExperienceCompanyMonthSalary("250000");
        f.setJobPersonExperienceCompanyScore("完成业绩");
        f.setJobPersonSchoolName(" ");
        f.setJobPersonMajorName(" ");
        f.setJobPersonSchoolStudyTime(" ");
        f.setJobPersonSchoolRecord(" ");
        f.setJobPersonProjectName(" ");
        f.setJobPersonProjectCompanyName(" ");
        f.setJobPersonProjectFunction(" ");
        f.setJobPersonProjectDoTime(" ");
        f.setJobPersonProjectDescription(" ");
        f.setJobPersonProjectDuty(" ");
        f.setJobPersonProjectScore(" ");
        f.setJobPersonMyIntroduction(" ");

        j8.session.save(f);
        j8.transaction.commit();
    }

    @Test
    public void new_saveDepartment()
    {
        Department top = new Department("Object", "谷歌顶级部门", "管理谷歌所有事务");
        Department programm = new Department("Programm", "开发部", "开发谷歌软件:比如安卓, 谷歌浏览器");
        top.getDepartmentChildrenSet().add(programm);
        programm.setDepartmentParent(top);

        j8.session.save(top);
        j8.session.save(programm);

        j8.transaction.commit();
    }
    //endregion

    //region 1
    private void saveObjects(Object... objects)
    {
        for (int i = 0; i < objects.length; i++)
        {
            j8.session.save(objects[i]);
        }
    }

    @Test
    public void saveTop()
    {
        Department top = new Department("谷歌董事部[001]", "googleDSB", "管理谷歌公司所有事情(高管, 持股)");
        j8.session.save(top);
        j8.transaction.commit();
    }

    @Test
    public void doDelete()
    {
        j8.session.delete(j8.session.get(Department.class, "谷歌董事部[001]"));
        j8.transaction.commit();
    }

    @Test
    public void saveDepartment()
    {
        Department d1 = new Department("谷歌董事部[001]", "googleDSB", "管理谷歌公司所有事情(高管, 持股)");
        Department d2 = new Department("开发部[002]", "go[WriteCode]", "开发部使用java或c++或android开发");
        Department d3 = new Department("开发部--java[002-001]", "go[W-Java]", "使用java开发项目");
        Department d4 = new Department("开发部--c++[002-002]", "go[W-c++]", "使用c++开发项目");
        Department d5 = new Department("开发部--android[002-003]", "go[W-Android]", "使用安卓开发项目");
        Department d6 = new Department("开发部--c++[002-004]", "c++[c++]", "使用c++开发项目");
        Department d7 = new Department("测试部-testing[003]", "do testing", "对开发的软件进行测试");
        Department d8 = new Department("测试部-testing[003-001]", "qtp testing", "对开发的软件进行自动化测试");
        Department d9 = new Department("测试部-testing[003-黑盒]", "执行黑盒测试", "对编写的软件进行黑盒测试");
        Department d10 = new Department("测试部-testing[003-白盒]", "执行白盒测试", "对编写的软件进行白盒测试");
        Department d11 = new Department("后勤-招聘[004-招聘]", "招聘人才", "根据招聘需求招聘需要的人才");
        Department d12 = new Department("后勤-财务[004-财务]", "财务部", "结算工资");
        Department d13 = new Department("后勤-总经理助理[004-总经理助理]", "总经理助理", "在总经理开会时给他传递咖啡");
        Department d14 = new Department("后勤-前台[004-前台]", "后勤保障部-总经理助理", "前台负责接待人员");
        Department d15 = new Department("管理-项目经理[005-项目Manager]", "负责项目", "负责开发项目");
        Department d16 = new Department("管理-测试经理[005-测试项目经理]", "测试经理TestManager", "测试经理");
        Department d17 = new Department("管理-架构师[005-架构师]", "架构师", "负责项目架构");
        Department d18 = new Department("管理-需求师[005-需求师]", "需求分析师", "需求设计师对项目需求进行设计");

        j8.session.save(d1);
        j8.session.save(d2);
        j8.session.save(d3);
        j8.session.save(d4);
        j8.session.save(d5);
        j8.session.save(d6);
        j8.session.save(d7);
        j8.session.save(d8);
        j8.session.save(d9);
        j8.session.save(d10);
        j8.session.save(d11);
        j8.session.save(d12);
        j8.session.save(d13);
        j8.session.save(d14);
        j8.session.save(d15);
        j8.session.save(d16);
        j8.session.save(d17);
        j8.session.save(d18);

        j8.transaction.commit();
    }

    @Test
    public void print()
    {
        for (int i = 1; i <= 18; i++)
        {
            System.out.println("j8.session.save(d" + i + ");");
        }
    }
    //endregion
}














