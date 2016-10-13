package qin.javaee8.hibernate.dao;

import qin.javaee65.exceptions.JavaEE6Exception;
import qin.javaee8.core.JavaEE8BaseSupport;
import qin.javaee8.core.JavaEE8DAOSupport;
import qin.javaee8.hibernate.domain.User;

import java.util.Map;

/**
 * 用户数据访问层
 *
 * @author qinzhengying
 * @since 1.8
 */
@SuppressWarnings("all")
public interface UserDAO extends JavaEE8DAOSupport<User, Integer>,
          JavaEE8BaseSupport
{
    //region 查找用户(登录功能)

    /**
     * 查找用户(登录功能)
     *
     * @param user_loginName 登录名
     * @param user_password  密码
     * @return 如果登录成功返回true 否则返回false
     */
    String find(String user_loginName, String user_password);
    //endregion

    //region 查找用户国家以及其对应的编号值

    /**
     * 获取国家主键编号以及其名称(格式如下:93——————Afghanistan)
     *
     * @return 国家编号存入键值, 国家名称存入value值<br>
     * 格式如:<code>java.util.Map&lt;93, Afghanistan&gt;</code>
     * @throws JavaEE6Exception 如果没有值抛出大异常
     */
    Map<Long, String> getCountryIdAndNames() throws JavaEE6Exception;
    //endregion
}















