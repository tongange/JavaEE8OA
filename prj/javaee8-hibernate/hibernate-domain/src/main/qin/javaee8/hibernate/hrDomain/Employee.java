package qin.javaee8.hibernate.hrDomain;

import qin.javaee8.core.SuperEntity8;
import qin.javaee8.hibernate.domain.Gender;
import qin.javaee8.hibernate.systemDomain.ElSeal;

/**
 * 员工实体类
 *
 * @author qinzhengying
 * @since 1.8
 */
@SuppressWarnings("all")
public class Employee implements SuperEntity8<Integer>
{
    private static final long serialVersionUID = -8915132632291911259L;

    //region 默认构造函数
    public Employee()
    {
        j8Tools.superInfo("初始化员工管理实体类");
    }
    //endregion

    //region 带参数的构造函数

    /**
     * @param employeeName        姓名
     * @param employeeGender      性别
     * @param employeeAge         年龄
     * @param employeeDescription 描述
     */
    public Employee(String employeeName, Gender employeeGender, Short employeeAge, String employeeDescription)
    {
        this.employeeName = employeeName;
        this.employeeGender = employeeGender;
        this.employeeAge = employeeAge;
        this.employeeDescription = employeeDescription;
    }

    /**
     * @param employeeName
     * @param employeeGender
     * @param employeeAge
     * @param employeeDescription
     * @param employeeElSeal      对应的电子公章
     */
    public Employee(String employeeName, Gender employeeGender,
                    Short employeeAge, String employeeDescription, ElSeal employeeElSeal)
    {
        this.employeeName = employeeName;
        this.employeeGender = employeeGender;
        this.employeeAge = employeeAge;
        this.employeeDescription = employeeDescription;
        this.employeeElSeal = employeeElSeal;
    }

    //endregion

    //region 员工管理主键
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

    //region 员工姓名
    /**
     * 员工姓名
     */
    private String employeeName;

    public String getEmployeeName()
    {
        return employeeName;
    }

    public void setEmployeeName(String employeeName)
    {
        this.employeeName = employeeName;
    }
    //endregion

    //region 员工性别
    /**
     * 员工性别
     */
    private Gender employeeGender;

    public Gender getEmployeeGender()
    {
        return employeeGender;
    }

    public void setEmployeeGender(Gender employeeGender)
    {
        this.employeeGender = employeeGender;
    }
    //endregion

    //region 员工年龄
    /**
     * 员工年龄
     */
    private Short employeeAge;

    public Short getEmployeeAge()
    {
        return employeeAge;
    }

    public void setEmployeeAge(Short employeeAge)
    {
        this.employeeAge = employeeAge;
    }
    //endregion

    //region 员工工作描述
    /**
     * 员工工作描述
     */
    private String employeeDescription;

    public String getEmployeeDescription()
    {
        return employeeDescription;
    }

    public void setEmployeeDescription(String employeeDescription)
    {
        this.employeeDescription = employeeDescription;
    }
    //endregion

    //region 员工对应的公章
    /**
     * 员工对应的公章(一对一)
     */
    private ElSeal employeeElSeal;

    public ElSeal getEmployeeElSeal()
    {
        return employeeElSeal;
    }

    public void setEmployeeElSeal(ElSeal employeeElSeal)
    {
        this.employeeElSeal = employeeElSeal;
    }
    //endregion
}