package qin.javaee8.hibernate.dao.impl;

import org.springframework.stereotype.Repository;
import qin.javaee8.core.JavaEE8BaseDAO;
import qin.javaee8.hibernate.dao.RoleDAO;
import qin.javaee8.hibernate.systemDomain.Role;

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

    @Override
    public Class<Role> getEntityClass()
    {
        return Role.class;
    }
}















