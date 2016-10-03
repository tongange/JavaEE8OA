package qin.javaee8.hibernate.service.impl;

import org.springframework.stereotype.Service;
import qin.javaee65.core.hibernate.service.impl.JavaEE65ServiceSupportImpl;
import qin.javaee65.exceptions.JavaEE6Exception;
import qin.javaee8.hibernate.dao.UserDAO;
import qin.javaee8.hibernate.domain.User;
import qin.javaee8.hibernate.service.UserService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 用户服务层实现
 *
 * @author qinzhengying
 * @since 1.8
 */
@Service(value = "userService8")
@SuppressWarnings("all")
public class UserServiceImpl
          extends JavaEE65ServiceSupportImpl<User, Integer>
          implements UserService
{
    private static final long serialVersionUID = -8130325383653543081L;

    //region 获取用户数据访问层
    private UserDAO userDAO;

    public UserDAO getDAO()
    {
        return userDAO;
    }

    @Resource
    public void setUserDAO(UserDAO userDAO)
    {
        this.userDAO = userDAO;
    }
    //endregion

    //region 查找用户(登录功能)

    /**
     * 查找用户(登录功能)
     *
     * @param user_loginName 登录名
     * @param user_password  密码
     * @return 如果登录成功返回true 否则返回false
     */
    @Override
    public String find(String user_loginName, String user_password)
    {
        return userDAO.find(user_loginName, user_password);
    }
    //endregion

    //region 根据实体和别的信息进行查询
    @Override
    public <E> List<?> findByEntity(User entity, E elements) throws JavaEE6Exception
    {
        return null;
    }
    //endregion

    //region 显示国家和编号下拉框中数据
    @Override
    public Map<Long, String> getCountryIdAndNames() throws JavaEE6Exception
    {
        return userDAO.getCountryIdAndNames();
    }
    //endregion
}