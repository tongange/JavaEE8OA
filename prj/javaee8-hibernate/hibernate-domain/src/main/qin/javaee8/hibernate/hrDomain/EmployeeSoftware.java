package qin.javaee8.hibernate.hrDomain;

import qin.javaee8.core.SuperEntity8;

/**
 * 员工电脑软件管理实体类
 *
 * @author qinzhengying
 * @since 1.8
 */
@SuppressWarnings("all")
public class EmployeeSoftware implements SuperEntity8<Integer>
{
    private static final long serialVersionUID = -8915132632291911259L;

    //region 默认构造函数
    public EmployeeSoftware()
    {
        j8Tools.superInfo("初始化员工电脑软件管理实体类");
    }
    //endregion

    //region 员工电脑软件管理主键
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
}