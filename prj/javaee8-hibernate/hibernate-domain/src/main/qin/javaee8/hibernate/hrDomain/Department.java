package qin.javaee8.hibernate.hrDomain;

import qin.javaee8.core.SuperEntity8;
import qin.javaee8.hibernate.systemDomain.FindJobPerson;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 部门实体类
 *
 * @author qinzhengying
 * @since 1.8
 */
@SuppressWarnings("all")
public class Department implements SuperEntity8<String>
{
    private static final long serialVersionUID = -8915132632291911259L;

    //region 默认构造函数
    public Department()
    {
        j8Tools.superInfo("初始化部门实体类");
    }
    //endregion

    //region 带参数的构造函数

    /**
     * @param departmentName        名称
     * @param departmentDescription 描述
     */
    public Department(String departmentName, String departmentDescription)
    {
        this.departmentName = departmentName;
        this.departmentDescription = departmentDescription;
    }

    /**
     * @param departmentName         名称
     * @param departmentDescription  描述
     * @param departmentJobPersonSet 对应的招聘人数
     * @param departmentParent       上级部门
     * @param departmentChildrenSet  下级部门
     */
    public Department(String departmentName, String departmentDescription, Set<FindJobPerson> departmentJobPersonSet, Department departmentParent, Set<Department> departmentChildrenSet)
    {
        this.departmentName = departmentName;
        this.departmentDescription = departmentDescription;
        this.departmentJobPersonSet = departmentJobPersonSet;
        this.departmentParent = departmentParent;
        this.departmentChildrenSet = departmentChildrenSet;
    }

    //endregion

    //region 部门管理主键
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

    //region 部门名称
    /**
     * 部门名称
     */
    private String departmentName;

    public String getDepartmentName()
    {
        return departmentName;
    }

    public void setDepartmentName(String departmentName)
    {
        this.departmentName = departmentName;
    }
    //endregion

    //region 部门描述
    /**
     * 部门描述
     */
    private String departmentDescription;

    public String getDepartmentDescription()
    {
        return departmentDescription;
    }

    public void setDepartmentDescription(String departmentDescription)
    {
        this.departmentDescription = departmentDescription;
    }
    //endregion

    //region 对应的招聘人员
    /**
     * 对应的招聘人员
     */
    private Set<FindJobPerson> departmentJobPersonSet = new HashSet<>();

    public Set<FindJobPerson> getDepartmentJobPersonSet()
    {
        return departmentJobPersonSet;
    }

    public void setDepartmentJobPersonSet(Set<FindJobPerson> departmentJobPersonSet)
    {
        this.departmentJobPersonSet = departmentJobPersonSet;
    }
    //endregion

    //region 对应的上级部门
    /**
     * 对应的上级部门
     */
    private Department departmentParent;

    public Department getDepartmentParent()
    {
        return departmentParent;
    }

    public void setDepartmentParent(Department departmentParent)
    {
        this.departmentParent = departmentParent;
    }
    //endregion

    //region 部门所对应的子部门
    /**
     * 部门所对应的子部门(一个部门有多个子部门)
     */
    private Set<Department> departmentChildrenSet = new TreeSet<>();

    public Set<Department> getDepartmentChildrenSet()
    {
        return departmentChildrenSet;
    }

    public void setDepartmentChildrenSet(Set<Department> departmentChildrenSet)
    {
        this.departmentChildrenSet = departmentChildrenSet;
    }
    //endregion
}