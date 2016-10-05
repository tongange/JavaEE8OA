package qin.javaee8.hibernate.hrDomain;

import qin.javaee8.core.SuperEntity8;

/**
 * 会议实体类
 *
 * @author qinzhengying
 * @since 1.8
 */
@SuppressWarnings("all")
public class Meeting implements SuperEntity8<String>
{
    private static final long serialVersionUID = -8915132632291911259L;

    //region 默认构造函数
    public Meeting()
    {
        j8Tools.superInfo("初始化会议管理实体类");
    }
    //endregion

    //region 会议管理主键
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