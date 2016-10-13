package qin.javaee8.hibernate.systemDomain;

import qin.javaee8.core.SuperEntity8;
import qin.javaee8.hibernate.hrDomain.Employee;

import java.util.Date;

/**
 * 电子公章
 *
 * @author qinzhengying
 * @since 1.8
 */
@SuppressWarnings("all")
public class ElSeal implements SuperEntity8<Integer>
{
    private static final long serialVersionUID = 8823575085336227376L;

    //region 默认构造函数
    public ElSeal()
    {
        j8Tools.superInfo("初始化电子公章实体类");
    }
    //endregion

    //region 带参数构造函数

    /**
     * @param elSeal_title       标题
     * @param elSeal_description 描述
     * @param elSeal_CreateTime  创建时间
     * @param elSeal_path        路径
     */
    public ElSeal(String elSeal_title, String elSeal_description, Date elSeal_CreateTime, String elSeal_path)
    {
        this.elSeal_title = elSeal_title;
        this.elSeal_description = elSeal_description;
        this.elSeal_CreateTime = elSeal_CreateTime;
        this.elSeal_path = elSeal_path;
    }

    //endregion

    //region 电子公章主键
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

    //region 公章标题
    /**
     * 公章标题
     */
    private String elSeal_title;

    public String getElSeal_title()
    {
        return elSeal_title;
    }

    public void setElSeal_title(String elSeal_title)
    {
        this.elSeal_title = elSeal_title;
    }
    //endregion

    //region 公章描述
    /**
     * 公章描述
     */
    private String elSeal_description;

    public String getElSeal_description()
    {
        return elSeal_description;
    }

    public void setElSeal_description(String elSeal_description)
    {
        this.elSeal_description = elSeal_description;
    }
    //endregion

    //region 公章创建时间
    /**
     * 公章创建时间
     */
    private Date elSeal_CreateTime;

    public Date getElSeal_CreateTime()
    {
        return elSeal_CreateTime;
    }

    public void setElSeal_CreateTime(Date elSeal_CreateTime)
    {
        this.elSeal_CreateTime = elSeal_CreateTime;
    }
    //endregion

    //region 公章所对应的员工(一个公章对应一个员工)
    /**
     * 公章所对应的员工
     */
    private Employee elSeal_employee;

    public Employee getElSeal_employee()
    {
        return elSeal_employee;
    }

    public void setElSeal_employee(Employee elSeal_employee)
    {
        this.elSeal_employee = elSeal_employee;
    }
    //endregion

    //region 公章路径
    /**
     * 公章路径
     */
    private String elSeal_path;

    public String getElSeal_path()
    {
        return elSeal_path;
    }

    public void setElSeal_path(String elSeal_path)
    {
        this.elSeal_path = elSeal_path;
    }
    //endregion
}














