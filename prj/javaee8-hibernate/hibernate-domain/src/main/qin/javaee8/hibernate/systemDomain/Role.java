package qin.javaee8.hibernate.systemDomain;

import qin.javaee8.core.SuperEntity8;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

/**
 * 岗位管理实体类
 *
 * @author qinzhengying
 * @since 1.8
 */
@SuppressWarnings("all")
public class Role implements SuperEntity8<Integer>
{
    private static final long serialVersionUID = 8823575085336227376L;

    //region 默认构造函数
    public Role()
    {
        j8Tools.superInfo("初始化岗位实体类");
    }
    //endregion

    //region 带参数的构造函数

    /**
     * @param role_name        名称
     * @param role_description 描述
     * @param role_isFull      是否招满
     * @param role_needPersons 所需人数
     * @param role_publishTime 发布时间
     * @param role_endTime     结束时间
     */
    public Role(String role_name, String role_description, boolean role_isFull,
                Short role_needPersons, Date role_publishTime, Date role_endTime)
    {
        this.role_name = role_name;
        this.role_description = role_description;
        this.role_isFull = role_isFull;
        this.role_needPersons = role_needPersons;
        this.role_publishTime = role_publishTime;
        this.role_endTime = role_endTime;
    }

    public Role(String role_name, String role_description, boolean role_isFull,
                Short role_needPersons, Date role_publishTime, Date role_endTime, Set<FindJobPerson> personSet)
    {
        this.role_name = role_name;
        this.role_description = role_description;
        this.role_isFull = role_isFull;
        this.role_needPersons = role_needPersons;
        this.role_publishTime = role_publishTime;
        this.role_endTime = role_endTime;
        this.personSet = personSet;
    }

    //endregion

    //region 岗位管理主键
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

    //region 岗位名称
    /**
     * 岗位名称
     */
    private String role_name;

    public String getRole_name()
    {
        return role_name;
    }

    public void setRole_name(String role_name)
    {
        this.role_name = role_name;
    }
    //endregion

    //region 岗位要求描述
    /**
     * 岗位要求描述
     */
    private String role_description;

    public String getRole_description()
    {
        return role_description;
    }

    public void setRole_description(String role_description)
    {
        this.role_description = role_description;
    }
    //endregion

    //region 岗位是否已招满
    /**
     * 岗位是否已招满
     */
    private boolean role_isFull;

    public boolean isRole_isFull()
    {
        return role_isFull;
    }

    public void setRole_isFull(boolean role_isFull)
    {
        this.role_isFull = role_isFull;
    }
    //endregion

    //region 岗位所需人员数
    /**
     * 岗位所需人员数
     */
    private Short role_needPersons;

    public Short getRole_needPersons()
    {
        return role_needPersons;
    }

    public void setRole_needPersons(Short role_needPersons)
    {
        this.role_needPersons = role_needPersons;
    }
    //endregion

    //region 岗位发布日期
    /**
     * 岗位发布日期
     */
    private Date role_publishTime;

    public Date getRole_publishTime()
    {
        return role_publishTime;
    }

    public void setRole_publishTime(Date role_publishTime)
    {
        this.role_publishTime = role_publishTime;
    }
    //endregion

    //region 岗位截止日期
    /**
     * 岗位截止日期
     */
    private Date role_endTime;

    public Date getRole_endTime()
    {
        return role_endTime;
    }

    public void setRole_endTime(Date role_endTime)
    {
        this.role_endTime = role_endTime;
    }
    //endregion

    //region 岗位所对应的招聘人员
    /**
     * 岗位所对应的招聘人员
     */
    private Set<FindJobPerson> personSet = new TreeSet<>();

    public Set<FindJobPerson> getPersonSet()
    {
        return personSet;
    }

    public void setPersonSet(Set<FindJobPerson> personSet)
    {
        this.personSet = personSet;
    }
    //endregion
}