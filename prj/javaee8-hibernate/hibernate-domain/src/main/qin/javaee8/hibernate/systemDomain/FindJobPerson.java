package qin.javaee8.hibernate.systemDomain;

import qin.javaee8.core.SuperEntity8;
import qin.javaee8.hibernate.domain.Gender;
import qin.javaee8.hibernate.hrDomain.Department;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

/**
 * 招聘人员管理实体类
 *
 * @author qinzhengying
 * @since 1.8
 */
@SuppressWarnings("all")
public class FindJobPerson implements SuperEntity8<Integer>
{
    private static final long serialVersionUID = 8823575085336227376L;

    //region 默认构造函数
    public FindJobPerson()
    {
        j8Tools.superInfo("初始化招聘人员管理实体类");
    }
    //endregion

    //region 带参数的构造函数

    /**
     * @param jobPersonName                                招聘人员名字
     * @param jobPersonGender                              招聘人员性别
     * @param jobPersonOldCompanyName                      以前公司名称
     * @param jobPersonOldJob                              当前行业职能
     * @param jobPersonStartJobTime                        开始工作年份
     * @param jobPersonJobName                             职位名称
     * @param jobPersonNowCity                             当前城市
     * @param jobPersonBirth                               出生年份
     * @param jobPersonIsMarried                           婚姻状况
     * @param jobPersonMobile                              手机
     * @param jobPersonEmail                               邮箱
     * @param jobPersonCountry                             国籍
     * @param jobPersonLocation                            户口
     * @param jobPersonWantJob                             期望行业
     * @param jobPersonFunction                            期望职能
     * @param jobPersonWantLocation                        期望地点
     * @param jobPersonWantsYearSalary                     期望年薪
     * @param jobPersonOldYearSalary                       以前年薪
     * @param jobPersonExperienceCompanyName               公司名称
     * @param jobPersonExperienceCompanyNature             公司性质
     * @param jobPersonExperienceCompanyPeopleNumber       公司规模
     * @param jobPersonExperienceCompanySimpleIntroduction 公司简介
     * @param jobPersonExperienceCompanyJobName            职位名称
     * @param jobPersonExperienceCompanyLocation           工作地点
     * @param jobPersonExperienceCompanyUnderlingPeople    下属人数
     * @param jobPersonExperienceCompanyJobTime            任职时间
     * @param jobPersonExperienceCompanyDutyOfWork         工作职责
     * @param jobPersonExperienceCompanyDepartment         所在部门
     * @param jobPersonExperienceCompanyJobReportToWHo     汇报对象
     * @param jobPersonExperienceCompanyMonthSalary        月薪
     * @param jobPersonExperienceCompanyScore              工作业绩
     * @param jobPersonSchoolName                          学校名称
     * @param jobPersonMajorName                           专业名称
     * @param jobPersonSchoolStudyTime                     就读时间
     * @param jobPersonSchoolRecord                        学历
     * @param jobPersonProjectName                         项目描述
     * @param jobPersonProjectCompanyName                  公司名称
     * @param jobPersonProjectFunction                     项目职务
     * @param jobPersonProjectDoTime                       项目时间
     * @param jobPersonProjectDescription                  项目描述
     * @param jobPersonProjectDuty                         项目职责
     * @param jobPersonProjectScore                        项目业绩
     * @param jobPersonMyIntroduction                      自我评价
     */
    public FindJobPerson
    (
              String jobPersonName, Gender jobPersonGender, String jobPersonOldCompanyName,
              String jobPersonOldJob, Date jobPersonStartJobTime, String jobPersonJobName,
              String jobPersonNowCity, Date jobPersonBirth, String jobPersonIsMarried,
              Long jobPersonMobile, String jobPersonEmail, String jobPersonCountry,
              String jobPersonLocation, String jobPersonWantJob, String jobPersonFunction,
              String jobPersonWantLocation, Double jobPersonWantsYearSalary, Double jobPersonOldYearSalary,
              String jobPersonExperienceCompanyName,
              String jobPersonExperienceCompanyNature,
              String jobPersonExperienceCompanyPeopleNumber,
              String jobPersonExperienceCompanySimpleIntroduction,
              String jobPersonExperienceCompanyJobName,
              String jobPersonExperienceCompanyLocation,
              Integer jobPersonExperienceCompanyUnderlingPeople,
              String jobPersonExperienceCompanyJobTime,
              String jobPersonExperienceCompanyDutyOfWork,
              Department jobPersonExperienceCompanyDepartment,
              String jobPersonExperienceCompanyJobReportToWHo,
              String jobPersonExperienceCompanyMonthSalary,
              String jobPersonExperienceCompanyScore, String jobPersonSchoolName,
              String jobPersonMajorName,
              String jobPersonSchoolStudyTime, String jobPersonSchoolRecord,
              String jobPersonProjectName,
              String jobPersonProjectCompanyName, String jobPersonProjectFunction,
              String jobPersonProjectDoTime,
              String jobPersonProjectDescription,
              String jobPersonProjectDuty,
              String jobPersonProjectScore, String jobPersonMyIntroduction
    )
    {
        this.jobPersonName = jobPersonName;
        this.jobPersonGender = jobPersonGender;
        this.jobPersonOldCompanyName = jobPersonOldCompanyName;
        this.jobPersonOldJob = jobPersonOldJob;
        this.jobPersonStartJobTime = jobPersonStartJobTime;
        this.jobPersonJobName = jobPersonJobName;
        this.jobPersonNowCity = jobPersonNowCity;
        this.jobPersonBirth = jobPersonBirth;
        this.jobPersonIsMarried = jobPersonIsMarried;
        this.jobPersonMobile = jobPersonMobile;
        this.jobPersonEmail = jobPersonEmail;
        this.jobPersonCountry = jobPersonCountry;
        this.jobPersonLocation = jobPersonLocation;
        this.jobPersonWantJob = jobPersonWantJob;
        this.jobPersonFunction = jobPersonFunction;
        this.jobPersonWantLocation = jobPersonWantLocation;
        this.jobPersonWantsYearSalary = jobPersonWantsYearSalary;
        this.jobPersonOldYearSalary = jobPersonOldYearSalary;
        this.jobPersonExperienceCompanyName = jobPersonExperienceCompanyName;
        this.jobPersonExperienceCompanyNature = jobPersonExperienceCompanyNature;
        this.jobPersonExperienceCompanyPeopleNumber = jobPersonExperienceCompanyPeopleNumber;
        this.jobPersonExperienceCompanySimpleIntroduction = jobPersonExperienceCompanySimpleIntroduction;
        this.jobPersonExperienceCompanyJobName = jobPersonExperienceCompanyJobName;
        this.jobPersonExperienceCompanyLocation = jobPersonExperienceCompanyLocation;
        this.jobPersonExperienceCompanyUnderlingPeople = jobPersonExperienceCompanyUnderlingPeople;
        this.jobPersonExperienceCompanyJobTime = jobPersonExperienceCompanyJobTime;
        this.jobPersonExperienceCompanyDutyOfWork = jobPersonExperienceCompanyDutyOfWork;
        this.jobPersonExperienceCompanyDepartment = jobPersonExperienceCompanyDepartment;
        this.jobPersonExperienceCompanyJobReportToWHo = jobPersonExperienceCompanyJobReportToWHo;
        this.jobPersonExperienceCompanyMonthSalary = jobPersonExperienceCompanyMonthSalary;
        this.jobPersonExperienceCompanyScore = jobPersonExperienceCompanyScore;
        this.jobPersonSchoolName = jobPersonSchoolName;
        this.jobPersonMajorName = jobPersonMajorName;
        this.jobPersonSchoolStudyTime = jobPersonSchoolStudyTime;
        this.jobPersonSchoolRecord = jobPersonSchoolRecord;
        this.jobPersonProjectName = jobPersonProjectName;
        this.jobPersonProjectCompanyName = jobPersonProjectCompanyName;
        this.jobPersonProjectFunction = jobPersonProjectFunction;
        this.jobPersonProjectDoTime = jobPersonProjectDoTime;
        this.jobPersonProjectDescription = jobPersonProjectDescription;
        this.jobPersonProjectDuty = jobPersonProjectDuty;
        this.jobPersonProjectScore = jobPersonProjectScore;
        this.jobPersonMyIntroduction = jobPersonMyIntroduction;
    }

    //endregion

    //region 招聘人员管理主键
    private Integer id;

    @Override
    public Integer getId()
    {
        return id;
    }

    @Override
    public void setId(Integer id)
    {
        this.id = id;
    }
    //endregion

    //region 基本信息

    //region 招聘人员名字
    /**
     * 招聘人员名字
     */
    private String jobPersonName;

    public String getJobPersonName()
    {
        return jobPersonName;
    }

    public void setJobPersonName(String jobPersonName)
    {
        this.jobPersonName = jobPersonName;
    }
    //endregion

    //region 招聘人员性别
    /**
     * 招聘人员性别
     */
    private Gender jobPersonGender;

    public Gender getJobPersonGender()
    {
        return jobPersonGender;
    }

    public void setJobPersonGender(Gender jobPersonGender)
    {
        this.jobPersonGender = jobPersonGender;
    }
    //endregion

    //region 以前公司名称
    /**
     * 以前公司名称(有智能提示)
     */
    private String jobPersonOldCompanyName;

    public String getJobPersonOldCompanyName()
    {
        return jobPersonOldCompanyName;
    }

    public void setJobPersonOldCompanyName(String jobPersonOldCompanyName)
    {
        this.jobPersonOldCompanyName = jobPersonOldCompanyName;
    }
    //endregion

    //region 当前行业职能
    /**
     * 当前行业职能(对话框)
     */
    private String jobPersonOldJob;

    public String getJobPersonOldJob()
    {
        return jobPersonOldJob;
    }

    public void setJobPersonOldJob(String jobPersonOldJob)
    {
        this.jobPersonOldJob = jobPersonOldJob;
    }
    //endregion

    //region 开始工作年份
    /**
     * 开始工作年份
     */
    private Date jobPersonStartJobTime;

    public Date getJobPersonStartJobTime()
    {
        return jobPersonStartJobTime;
    }

    public void setJobPersonStartJobTime(Date jobPersonStartJobTime)
    {
        this.jobPersonStartJobTime = jobPersonStartJobTime;
    }
    //endregion

    //region 职位名称
    /**
     * 职位名称(有智能提示)
     */
    private String jobPersonJobName;

    public String getJobPersonJobName()
    {
        return jobPersonJobName;
    }

    public void setJobPersonJobName(String jobPersonJobName)
    {
        this.jobPersonJobName = jobPersonJobName;
    }
    //endregion

    //region 当前城市
    /**
     * 当前城市(对话框)
     */
    private String jobPersonNowCity;

    public String getJobPersonNowCity()
    {
        return jobPersonNowCity;
    }

    public void setJobPersonNowCity(String jobPersonNowCity)
    {
        this.jobPersonNowCity = jobPersonNowCity;
    }
    //endregion

    //region 出生年份
    /**
     * 出生年份(下拉框)
     */
    private Date jobPersonBirth;

    public Date getJobPersonBirth()
    {
        return jobPersonBirth;
    }

    public void setJobPersonBirth(Date jobPersonBirth)
    {
        this.jobPersonBirth = jobPersonBirth;
    }
    //endregion

    //region 婚姻状况
    /**
     * 婚姻状况(下拉框)
     */
    private String jobPersonIsMarried;

    public String getJobPersonIsMarried()
    {
        return jobPersonIsMarried;
    }

    public void setJobPersonIsMarried(String jobPersonIsMarried)
    {
        this.jobPersonIsMarried = jobPersonIsMarried;
    }
    //endregion

    //region 手机
    /**
     * 手机
     */
    private Long jobPersonMobile;

    public Long getJobPersonMobile()
    {
        return jobPersonMobile;
    }

    public void setJobPersonMobile(Long jobPersonMobile)
    {
        this.jobPersonMobile = jobPersonMobile;
    }
    //endregion

    //region 邮箱
    /**
     * 邮箱
     */
    private String jobPersonEmail;

    public String getJobPersonEmail()
    {
        return jobPersonEmail;
    }

    public void setJobPersonEmail(String jobPersonEmail)
    {
        this.jobPersonEmail = jobPersonEmail;
    }
    //endregion

    //region 国籍
    /**
     * 国籍(对话框)
     */
    private String jobPersonCountry;

    public String getJobPersonCountry()
    {
        return jobPersonCountry;
    }

    public void setJobPersonCountry(String jobPersonCountry)
    {
        this.jobPersonCountry = jobPersonCountry;
    }
    //endregion

    //region 户口
    /**
     * 户口(对话框)
     */
    private String jobPersonLocation;

    public String getJobPersonLocation()
    {
        return jobPersonLocation;
    }

    public void setJobPersonLocation(String jobPersonLocation)
    {
        this.jobPersonLocation = jobPersonLocation;
    }
    //endregion

    //endregion

    //region 职业意向

    //region 期望行业
    /**
     * 期望行业(对话框)
     */
    private String jobPersonWantJob;

    public String getJobPersonWantJob()
    {
        return jobPersonWantJob;
    }

    public void setJobPersonWantJob(String jobPersonWantJob)
    {
        this.jobPersonWantJob = jobPersonWantJob;
    }
    //endregion

    //region 期望职能
    /**
     * 期望职能(对话框)
     */
    private String jobPersonFunction;

    public String getJobPersonFunction()
    {
        return jobPersonFunction;
    }

    public void setJobPersonFunction(String jobPersonFunction)
    {
        this.jobPersonFunction = jobPersonFunction;
    }
    //endregion

    //region 期望地点
    /**
     * 期望地点(对话框)
     */
    private String jobPersonWantLocation;

    public String getJobPersonWantLocation()
    {
        return jobPersonWantLocation;
    }

    public void setJobPersonWantLocation(String jobPersonWantLocation)
    {
        this.jobPersonWantLocation = jobPersonWantLocation;
    }
    //endregion

    //region 期望年薪
    /**
     * 期望年薪(x元/月*x个月=y万)或面议
     */
    private Double jobPersonWantsYearSalary;

    public Double getJobPersonWantsYearSalary()
    {
        return jobPersonWantsYearSalary;
    }

    public void setJobPersonWantsYearSalary(Double jobPersonWantsYearSalary)
    {
        this.jobPersonWantsYearSalary = jobPersonWantsYearSalary;
    }
    //endregion

    //region 目前年薪
    /**
     * 目前年薪(x元/月*x个月=y万)或保密
     */
    private Double jobPersonOldYearSalary;

    public Double getJobPersonOldYearSalary()
    {
        return jobPersonOldYearSalary;
    }

    public void setJobPersonOldYearSalary(Double jobPersonOldYearSalary)
    {
        this.jobPersonOldYearSalary = jobPersonOldYearSalary;
    }
    //endregion

    //endregion

    //region 工作经历

    //region 公司名称
    /**
     * 公司名称
     */
    private String jobPersonExperienceCompanyName;

    public String getJobPersonExperienceCompanyName()
    {
        return jobPersonExperienceCompanyName;
    }

    public void setJobPersonExperienceCompanyName(String jobPersonExperienceCompanyName)
    {
        this.jobPersonExperienceCompanyName = jobPersonExperienceCompanyName;
    }
    //endregion

    //region 公司性质
    /**
     * 公司性质(下拉框)
     */
    private String jobPersonExperienceCompanyNature;

    public String getJobPersonExperienceCompanyNature()
    {
        return jobPersonExperienceCompanyNature;
    }

    public void setJobPersonExperienceCompanyNature(String jobPersonExperienceCompanyNature)
    {
        this.jobPersonExperienceCompanyNature = jobPersonExperienceCompanyNature;
    }
    //endregion

    //region 公司规模
    /**
     * 公司规模(下拉框)
     */
    private String jobPersonExperienceCompanyPeopleNumber;

    public String getJobPersonExperienceCompanyPeopleNumber()
    {
        return jobPersonExperienceCompanyPeopleNumber;
    }

    public void setJobPersonExperienceCompanyPeopleNumber(String jobPersonExperienceCompanyPeopleNumber)
    {
        this.jobPersonExperienceCompanyPeopleNumber = jobPersonExperienceCompanyPeopleNumber;
    }
    //endregion

    //region 公司简介
    /**
     * 公司简介(textarea)
     */
    private String jobPersonExperienceCompanySimpleIntroduction;

    public String getJobPersonExperienceCompanySimpleIntroduction()
    {
        return jobPersonExperienceCompanySimpleIntroduction;
    }

    public void setJobPersonExperienceCompanySimpleIntroduction(String jobPersonExperienceCompanySimpleIntroduction)
    {
        this.jobPersonExperienceCompanySimpleIntroduction = jobPersonExperienceCompanySimpleIntroduction;
    }
    //endregion

    //region 职位名称
    /**
     * 职位名称
     */
    private String jobPersonExperienceCompanyJobName;

    public String getJobPersonExperienceCompanyJobName()
    {
        return jobPersonExperienceCompanyJobName;
    }

    public void setJobPersonExperienceCompanyJobName(String jobPersonExperienceCompanyJobName)
    {
        this.jobPersonExperienceCompanyJobName = jobPersonExperienceCompanyJobName;
    }
    //endregion

    //region 工作地点
    /**
     * 工作地点(对话框)
     */
    private String jobPersonExperienceCompanyLocation;

    public String getJobPersonExperienceCompanyLocation()
    {
        return jobPersonExperienceCompanyLocation;
    }

    public void setJobPersonExperienceCompanyLocation(String jobPersonExperienceCompanyLocation)
    {
        this.jobPersonExperienceCompanyLocation = jobPersonExperienceCompanyLocation;
    }
    //endregion

    //region 下属人数
    /**
     * 下属人数
     */
    private Integer jobPersonExperienceCompanyUnderlingPeople;

    public Integer getJobPersonExperienceCompanyUnderlingPeople()
    {
        return jobPersonExperienceCompanyUnderlingPeople;
    }

    public void setJobPersonExperienceCompanyUnderlingPeople(Integer jobPersonExperienceCompanyUnderlingPeople)
    {
        this.jobPersonExperienceCompanyUnderlingPeople = jobPersonExperienceCompanyUnderlingPeople;
    }
    //endregion

    //region 任职时间
    /**
     * 任职时间 年+月+日————年+月+日
     */
    private String jobPersonExperienceCompanyJobTime;

    public String getJobPersonExperienceCompanyJobTime()
    {
        return jobPersonExperienceCompanyJobTime;
    }

    public void setJobPersonExperienceCompanyJobTime(String jobPersonExperienceCompanyJobTime)
    {
        this.jobPersonExperienceCompanyJobTime = jobPersonExperienceCompanyJobTime;
    }
    //endregion

    //region 工作职责
    /**
     * 工作职责(textarea)
     */
    private String jobPersonExperienceCompanyDutyOfWork;

    public String getJobPersonExperienceCompanyDutyOfWork()
    {
        return jobPersonExperienceCompanyDutyOfWork;
    }

    public void setJobPersonExperienceCompanyDutyOfWork(String jobPersonExperienceCompanyDutyOfWork)
    {
        this.jobPersonExperienceCompanyDutyOfWork = jobPersonExperienceCompanyDutyOfWork;
    }
    //endregion

    //region 所在部门
    /**
     * 所在部门
     */
    private Department jobPersonExperienceCompanyDepartment;

    public Department getJobPersonExperienceCompanyDepartment()
    {
        return jobPersonExperienceCompanyDepartment;
    }

    public void setJobPersonExperienceCompanyDepartment(Department jobPersonExperienceCompanyDepartment)
    {
        this.jobPersonExperienceCompanyDepartment = jobPersonExperienceCompanyDepartment;
    }
    //endregion

    //region 汇报对象
    /**
     * 汇报对象
     */
    private String jobPersonExperienceCompanyJobReportToWHo;

    public String getJobPersonExperienceCompanyJobReportToWHo()
    {
        return jobPersonExperienceCompanyJobReportToWHo;
    }

    public void setJobPersonExperienceCompanyJobReportToWHo(String jobPersonExperienceCompanyJobReportToWHo)
    {
        this.jobPersonExperienceCompanyJobReportToWHo = jobPersonExperienceCompanyJobReportToWHo;
    }
    //endregion

    //region 月薪
    /**
     * 月薪 x元/月*x个月
     */
    private String jobPersonExperienceCompanyMonthSalary;

    public String getJobPersonExperienceCompanyMonthSalary()
    {
        return jobPersonExperienceCompanyMonthSalary;
    }

    public void setJobPersonExperienceCompanyMonthSalary(String jobPersonExperienceCompanyMonthSalary)
    {
        this.jobPersonExperienceCompanyMonthSalary = jobPersonExperienceCompanyMonthSalary;
    }
    //endregion

    //region 工作业绩
    /**
     * 工作业绩(textarea)
     */
    private String jobPersonExperienceCompanyScore;

    public String getJobPersonExperienceCompanyScore()
    {
        return jobPersonExperienceCompanyScore;
    }

    public void setJobPersonExperienceCompanyScore(String jobPersonExperienceCompanyScore)
    {
        this.jobPersonExperienceCompanyScore = jobPersonExperienceCompanyScore;
    }
    //endregion

    //endregion

    //region 教育经历

    //region 学校名称
    /**
     * 学校名称
     */
    private String jobPersonSchoolName;

    public String getJobPersonSchoolName()
    {
        return jobPersonSchoolName;
    }

    public void setJobPersonSchoolName(String jobPersonSchoolName)
    {
        this.jobPersonSchoolName = jobPersonSchoolName;
    }
    //endregion

    //region 专业名称
    /**
     * 专业名称
     */
    private String jobPersonMajorName;

    public String getJobPersonMajorName()
    {
        return jobPersonMajorName;
    }

    public void setJobPersonMajorName(String jobPersonMajorName)
    {
        this.jobPersonMajorName = jobPersonMajorName;
    }
    //endregion

    //region 就读时间
    /**
     * 就读时间 年/月——年/月
     */
    private String jobPersonSchoolStudyTime;

    public String getJobPersonSchoolStudyTime()
    {
        return jobPersonSchoolStudyTime;
    }

    public void setJobPersonSchoolStudyTime(String jobPersonSchoolStudyTime)
    {
        this.jobPersonSchoolStudyTime = jobPersonSchoolStudyTime;
    }
    //endregion

    //region 学历
    /**
     * 学历(下拉框)
     */
    private String jobPersonSchoolRecord;

    public String getJobPersonSchoolRecord()
    {
        return jobPersonSchoolRecord;
    }

    public void setJobPersonSchoolRecord(String jobPersonSchoolRecord)
    {
        this.jobPersonSchoolRecord = jobPersonSchoolRecord;
    }
    //endregion

    //endregion

    //region 项目经验

    //region 项目名称
    /**
     * 项目名称
     */
    private String jobPersonProjectName;

    public String getJobPersonProjectName()
    {
        return jobPersonProjectName;
    }

    public void setJobPersonProjectName(String jobPersonProjectName)
    {
        this.jobPersonProjectName = jobPersonProjectName;
    }
    //endregion

    //region 公司名称
    /**
     * 公司名称
     */
    private String jobPersonProjectCompanyName;

    public String getJobPersonProjectCompanyName()
    {
        return jobPersonProjectCompanyName;
    }

    public void setJobPersonProjectCompanyName(String jobPersonProjectCompanyName)
    {
        this.jobPersonProjectCompanyName = jobPersonProjectCompanyName;
    }
    //endregion

    //region 项目职务
    /**
     * 项目职务
     */
    private String jobPersonProjectFunction;

    public String getJobPersonProjectFunction()
    {
        return jobPersonProjectFunction;
    }

    public void setJobPersonProjectFunction(String jobPersonProjectFunction)
    {
        this.jobPersonProjectFunction = jobPersonProjectFunction;
    }
    //endregion

    //region 项目时间
    /**
     * 项目时间 年/月——年/月
     */
    private String jobPersonProjectDoTime;

    public String getJobPersonProjectDoTime()
    {
        return jobPersonProjectDoTime;
    }

    public void setJobPersonProjectDoTime(String jobPersonProjectDoTime)
    {
        this.jobPersonProjectDoTime = jobPersonProjectDoTime;
    }
    //endregion

    //region 项目描述
    /**
     * 项目描述
     */
    private String jobPersonProjectDescription;

    public String getJobPersonProjectDescription()
    {
        return jobPersonProjectDescription;
    }

    public void setJobPersonProjectDescription(String jobPersonProjectDescription)
    {
        this.jobPersonProjectDescription = jobPersonProjectDescription;
    }
    //endregion

    //region 项目职责
    /**
     * 项目职责
     */
    private String jobPersonProjectDuty;

    public String getJobPersonProjectDuty()
    {
        return jobPersonProjectDuty;
    }

    public void setJobPersonProjectDuty(String jobPersonProjectDuty)
    {
        this.jobPersonProjectDuty = jobPersonProjectDuty;
    }
    //endregion

    //region 项目业绩
    /**
     * 项目业绩
     */
    private String jobPersonProjectScore;

    public String getJobPersonProjectScore()
    {
        return jobPersonProjectScore;
    }

    public void setJobPersonProjectScore(String jobPersonProjectScore)
    {
        this.jobPersonProjectScore = jobPersonProjectScore;
    }
    //endregion

    //endregion

    //region 自我评价
    /**
     * 自我评价
     */
    private String jobPersonMyIntroduction;

    public String getJobPersonMyIntroduction()
    {
        return jobPersonMyIntroduction;
    }

    public void setJobPersonMyIntroduction(String jobPersonMyIntroduction)
    {
        this.jobPersonMyIntroduction = jobPersonMyIntroduction;
    }
    //endregion

    //region 对应的岗位(可能有多个)
    private Set<Role> jobPersonRoleSet = new TreeSet<>();

    public Set<Role> getJobPersonRoleSet()
    {
        return jobPersonRoleSet;
    }

    public void setJobPersonRoleSet(Set<Role> jobPersonRoleSet)
    {
        this.jobPersonRoleSet = jobPersonRoleSet;
    }
    //endregion

    //region toString()

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("FindJobPerson{");
        sb
                  .append("id=")
                  .append(id);
        sb
                  .append(", jobPersonName='")
                  .append(jobPersonName)
                  .append('\'');
        sb
                  .append(", jobPersonGender=")
                  .append(jobPersonGender);
        sb
                  .append(", jobPersonOldCompanyName='")
                  .append(jobPersonOldCompanyName)
                  .append('\'');
        sb
                  .append(", jobPersonOldJob='")
                  .append(jobPersonOldJob)
                  .append('\'');
        sb
                  .append(", jobPersonStartJobTime=")
                  .append(jobPersonStartJobTime);
        sb
                  .append(", jobPersonJobName='")
                  .append(jobPersonJobName)
                  .append('\'');
        sb
                  .append(", jobPersonNowCity='")
                  .append(jobPersonNowCity)
                  .append('\'');
        sb
                  .append(", jobPersonBirth=")
                  .append(jobPersonBirth);
        sb
                  .append(", jobPersonIsMarried='")
                  .append(jobPersonIsMarried)
                  .append('\'');
        sb
                  .append(", jobPersonMobile=")
                  .append(jobPersonMobile);
        sb
                  .append(", jobPersonEmail='")
                  .append(jobPersonEmail)
                  .append('\'');
        sb
                  .append(", jobPersonCountry='")
                  .append(jobPersonCountry)
                  .append('\'');
        sb
                  .append(", jobPersonLocation='")
                  .append(jobPersonLocation)
                  .append('\'');
        sb
                  .append(", jobPersonWantJob='")
                  .append(jobPersonWantJob)
                  .append('\'');
        sb
                  .append(", jobPersonFunction='")
                  .append(jobPersonFunction)
                  .append('\'');
        sb
                  .append(", jobPersonWantLocation='")
                  .append(jobPersonWantLocation)
                  .append('\'');
        sb
                  .append(", jobPersonWantsYearSalary=")
                  .append(jobPersonWantsYearSalary);
        sb
                  .append(", jobPersonOldYearSalary=")
                  .append(jobPersonOldYearSalary);
        sb
                  .append(", jobPersonExperienceCompanyName='")
                  .append(jobPersonExperienceCompanyName)
                  .append('\'');
        sb
                  .append(", jobPersonExperienceCompanyNature='")
                  .append(jobPersonExperienceCompanyNature)
                  .append('\'');
        sb
                  .append(", jobPersonExperienceCompanyPeopleNumber='")
                  .append(jobPersonExperienceCompanyPeopleNumber)
                  .append('\'');
        sb
                  .append(", jobPersonExperienceCompanySimpleIntroduction='")
                  .append(jobPersonExperienceCompanySimpleIntroduction)
                  .append('\'');
        sb
                  .append(", jobPersonExperienceCompanyJobName='")
                  .append(jobPersonExperienceCompanyJobName)
                  .append('\'');
        sb
                  .append(", jobPersonExperienceCompanyLocation='")
                  .append(jobPersonExperienceCompanyLocation)
                  .append('\'');
        sb
                  .append(", jobPersonExperienceCompanyUnderlingPeople=")
                  .append(jobPersonExperienceCompanyUnderlingPeople);
        sb
                  .append(", jobPersonExperienceCompanyJobTime='")
                  .append(jobPersonExperienceCompanyJobTime)
                  .append('\'');
        sb
                  .append(", jobPersonExperienceCompanyDutyOfWork='")
                  .append(jobPersonExperienceCompanyDutyOfWork)
                  .append('\'');
        sb
                  .append(", jobPersonExperienceCompanyJobReportToWHo='")
                  .append(jobPersonExperienceCompanyJobReportToWHo)
                  .append('\'');
        sb
                  .append(", jobPersonExperienceCompanyMonthSalary='")
                  .append(jobPersonExperienceCompanyMonthSalary)
                  .append('\'');
        sb
                  .append(", jobPersonExperienceCompanyScore='")
                  .append(jobPersonExperienceCompanyScore)
                  .append('\'');
        sb
                  .append(", jobPersonSchoolName='")
                  .append(jobPersonSchoolName)
                  .append('\'');
        sb
                  .append(", jobPersonMajorName='")
                  .append(jobPersonMajorName)
                  .append('\'');
        sb
                  .append(", jobPersonSchoolStudyTime='")
                  .append(jobPersonSchoolStudyTime)
                  .append('\'');
        sb
                  .append(", jobPersonSchoolRecord='")
                  .append(jobPersonSchoolRecord)
                  .append('\'');
        sb
                  .append(", jobPersonProjectName='")
                  .append(jobPersonProjectName)
                  .append('\'');
        sb
                  .append(", jobPersonProjectCompanyName='")
                  .append(jobPersonProjectCompanyName)
                  .append('\'');
        sb
                  .append(", jobPersonProjectFunction='")
                  .append(jobPersonProjectFunction)
                  .append('\'');
        sb
                  .append(", jobPersonProjectDoTime='")
                  .append(jobPersonProjectDoTime)
                  .append('\'');
        sb
                  .append(", jobPersonProjectDescription='")
                  .append(jobPersonProjectDescription)
                  .append('\'');
        sb
                  .append(", jobPersonProjectDuty='")
                  .append(jobPersonProjectDuty)
                  .append('\'');
        sb
                  .append(", jobPersonProjectScore='")
                  .append(jobPersonProjectScore)
                  .append('\'');
        sb
                  .append(", jobPersonMyIntroduction='")
                  .append(jobPersonMyIntroduction)
                  .append('\'');
        sb
                  .append('}');
        return sb.toString();
    }

    //endregion

}