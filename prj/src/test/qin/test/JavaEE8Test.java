package qin.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import qin.javaee8.core.JavaEE8BaseSupport;

public class JavaEE8Test implements JavaEE8BaseSupport
{
    SessionFactory sessionFactory = (SessionFactory) new
              ClassPathXmlApplicationContext("applicationContext.xml")
              .getBean("sessionFactory");
    Session session = sessionFactory.openSession();
    Transaction transaction = session.beginTransaction();

    @Test
    public void saveTableData()
    {
    }

    @Test
    public void longTest()
    {
        j8Tools.superInfo(Long.MAX_VALUE);
    }

    @Test
    public void javaReplaceTest()
    {
        String s = "  /\n" +
                  "      <!-- @param  jobPersonName                                招聘人员名字-->\n" +
                  "      <!-- @param  jobPersonGender                              招聘人员性别-->\n" +
                  "      <!-- @param  jobPersonOldCompanyName                      以前公司名称-->\n" +
                  "      <!-- @param  jobPersonOldJob                              当前行业职能-->\n" +
                  "      <!-- @param  jobPersonStartJobTime                        开始工作年份-->\n" +
                  "      <!-- @param  jobPersonJobName                             职位名称-->\n" +
                  "      <!-- @param  jobPersonNowCity                             当前城市-->\n" +
                  "      <!-- @param  jobPersonBirth                               出生年份-->\n" +
                  "      <!-- @param  jobPersonIsMarried                           婚姻状况-->\n" +
                  "      <!-- @param  jobPersonMobile                              手机-->\n" +
                  "      <!-- @param  jobPersonEmail                               邮箱-->\n" +
                  "      <!-- @param  jobPersonCountry                             国籍-->\n" +
                  "      <!-- @param  jobPersonLocation                            户口-->\n" +
                  "      <!-- @param  jobPersonWantJob                             期望行业-->\n" +
                  "      <!-- @param  jobPersonFunction                            期望职能-->\n" +
                  "      <!-- @param  jobPersonWantLocation                        期望地点-->\n" +
                  "      <!-- @param  jobPersonWantsYearSalary                     期望年薪-->\n" +
                  "      <!-- @param  jobPersonOldYearSalary                       以前年薪-->\n" +
                  "      <!-- @param  jobPersonExperienceCompanyName               公司名称-->\n" +
                  "      <!-- @param  jobPersonExperienceCompanyNature             公司性质-->\n" +
                  "      <!-- @param  jobPersonExperienceCompanyPeopleNumber       公司规模-->\n" +
                  "      <!-- @param  jobPersonExperienceCompanySimpleIntroduction 公司简介-->\n" +
                  "      <!-- @param  jobPersonExperienceCompanyJobName            职位名称-->\n" +
                  "      <!-- @param  jobPersonExperienceCompanyLocation           工作地点-->\n" +
                  "      <!-- @param  jobPersonExperienceCompanyUnderlingPeople    下属人数-->\n" +
                  "      <!-- @param  jobPersonExperienceCompanyJobTime            任职时间-->\n" +
                  "      <!-- @param  jobPersonExperienceCompanyDutyOfWork         工作职责-->\n" +
                  "      <!-- @param  jobPersonExperienceCompanyDepartment         所在部门-->\n" +
                  "      <!-- @param  jobPersonExperienceCompanyJobReportToWHo     汇报对象-->\n" +
                  "      <!-- @param  jobPersonExperienceCompanyMonthSalary        月薪-->\n" +
                  "      <!-- @param  jobPersonExperienceCompanyScore              工作业绩-->\n" +
                  "      <!-- @param  jobPersonSchoolName                          学校名称-->\n" +
                  "      <!-- @param  jobPersonMajorName                           专业名称-->\n" +
                  "      <!-- @param  jobPersonSchoolStudyTime                     就读时间-->\n" +
                  "      <!-- @param  jobPersonSchoolRecord                        学历-->\n" +
                  "      <!-- @param  jobPersonProjectName                         项目描述-->\n" +
                  "      <!-- @param  jobPersonProjectCompanyName                  公司名称-->\n" +
                  "      <!-- @param  jobPersonProjectFunction                     项目职务-->\n" +
                  "      <!-- @param  jobPersonProjectDoTime                       项目时间-->\n" +
                  "      <!-- @param  jobPersonProjectDescription                  项目描述-->\n" +
                  "      <!-- @param  jobPersonProjectDuty                         项目职责-->\n" +
                  "      <!-- @param  jobPersonProjectScore                        项目业绩-->\n" +
                  "      <!-- @param  jobPersonMyIntroduction                      自我评价-->\n" +
                  "     /";
        j8Tools.superInfo(s);
    }
}





















