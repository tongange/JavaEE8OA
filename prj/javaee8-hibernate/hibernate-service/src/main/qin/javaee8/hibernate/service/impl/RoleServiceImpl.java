package qin.javaee8.hibernate.service.impl;

import org.springframework.stereotype.Service;
import qin.javaee65.core.hibernate.dao.JavaEE65DAOSupport;
import qin.javaee65.core.hibernate.service.impl.JavaEE65ServiceSupportImpl;
import qin.javaee65.exceptions.JavaEE6Exception;
import qin.javaee8.hibernate.dao.RoleDAO;
import qin.javaee8.hibernate.service.RoleService;
import qin.javaee8.hibernate.systemDomain.Role;

import javax.annotation.Resource;
import java.util.List;

/**
 * 岗位服务层实现
 *
 * @author qinzhengying
 * @since 1.8
 */
@Service(value = "roleService8")
@SuppressWarnings("all")
public class RoleServiceImpl
          extends JavaEE65ServiceSupportImpl<Role, Integer>
          implements RoleService
{
    private static final long serialVersionUID = -8130325383653543081L;

    //region 获取岗位服务层
    /**
     * 获取岗位服务层
     */
    private RoleDAO roleDAO;

    @Override
    public JavaEE65DAOSupport getDAO()
    {
        return roleDAO;
    }

    @Resource
    public void setRoleDAO(RoleDAO roleDAO)
    {
        this.roleDAO = roleDAO;
    }

    //endregion

    //region 根据实体类以及其他信息进行查询

    /**
     * 根据实体类以及其他信息进行查询
     *
     * @param entity   指定实体类
     * @param elements 其他元素
     * @return 返回查询结果集合
     */
    @Override
    public <E> List<?> findByEntity(Role entity, E elements) throws JavaEE6Exception
    {
        return null;
    }
    //endregion
}