/*
 * JavaEE8核心jar包
 * 所有的项目都要使用此jar包
 * 此jar包为方便所有系统使用
 * 其中有mybatis和spring的功能
 * made by qinzhengying 2016.09
 * qq:937184304
 */

package qin.javaee8.hibernate.domain;

import qin.javaee65.core.hibernate.SuperEntity65;

import java.util.HashSet;
import java.util.Set;

/**
 * 用户类型实体类
 *
 * @author qinzhengying
 * @since 1.8
 */
@SuppressWarnings("all")
public class UserType implements SuperEntity65<String>
{
    private String id;

    //region 主键
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

    //region 用户类型名称
    private String user_type_name;

    public String getUser_type_name()
    {
        return user_type_name;
    }

    public void setUser_type_name(String user_type_name)
    {
        this.user_type_name = user_type_name;
    }
    //endregion

    //region 与用户一对多
    private Set<User> userSet = new HashSet<User>();

    public Set<User> getUserSet()
    {
        return userSet;
    }

    public void setUserSet(Set<User> userSet)
    {
        this.userSet = userSet;
    }
    //endregion
}