package qin.javaee8.hibernate.dao.impl;

import org.springframework.stereotype.Repository;
import qin.javaee8.core.JavaEE8BaseDAO;
import qin.javaee8.hibernate.dao.RoleDAO;
import qin.javaee8.hibernate.systemDomain.Role;

import java.util.List;

/**
 * 用户数据访问层实现
 *
 * @author qinzhengying
 * @since 1.8
 */
@Repository(value = "roleDAO8")
@SuppressWarnings("all")
public class RoleDAOImpl
          extends JavaEE8BaseDAO<Role, Integer>
          implements RoleDAO
{
    private static final long serialVersionUID = 3180632462541005842L;

    //region 获取配置文件路径
    @Override
    public String getLog4jLocations()
    {
        return j8Tools.getLog4jLocations();
    }

    @Override
    public String getFileLocation()
    {
        return j8Tools.getFileLocation();
    }
    //endregion

    //region 查询所有岗位信息

    @Override
    public List<Role> findAll()
    {
        return getSessionFactory()
                  .openSession()
                  .createQuery("from Role ")
                  .list();
    }

    //endregion
}















