package qin.javaee8.hibernate.hrDomain;

import qin.javaee8.core.SuperEntity8;

/**
 * 员工项目管理实体类
 *
 * @author qinzhengying
 * @since 1.8
 */
@SuppressWarnings("all")
public class EmployeeProject implements SuperEntity8<String>
{
    private static final long serialVersionUID = -8915132632291911259L;

    //region 默认构造函数
    public EmployeeProject()
    {
        j8Tools.superInfo("初始化员工项目管理实体类");
    }
    //endregion

    //region 员工项目管理主键
    private String id;

    @Override
    public String getId()
    {
        return id;
    }

    @Override
    public void setId(String id)
    {
        this.id = id;
    }
    //endregion
}