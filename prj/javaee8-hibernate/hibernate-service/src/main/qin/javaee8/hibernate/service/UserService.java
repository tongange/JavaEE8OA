package qin.javaee8.hibernate.service;

import qin.javaee65.core.hibernate.service.JavaEE65ServiceSupport;
import qin.javaee65.exceptions.JavaEE6Exception;
import qin.javaee8.hibernate.domain.User;

import java.util.Map;

@SuppressWarnings("all")
public interface UserService extends JavaEE65ServiceSupport<User, Integer>
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

    //region 显示国家和编号下拉框中数据
    Map<Long, String> getCountryIdAndNames() throws JavaEE6Exception;
    //endregion
}
