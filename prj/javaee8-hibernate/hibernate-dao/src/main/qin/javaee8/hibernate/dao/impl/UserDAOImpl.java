package qin.javaee8.hibernate.dao.impl;

import org.springframework.stereotype.Repository;
import qin.javaee65.exceptions.JavaEE6Exception;
import qin.javaee8.core.JavaEE8BaseDAO;
import qin.javaee8.hibernate.dao.UserDAO;
import qin.javaee8.hibernate.domain.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户数据访问层实现
 *
 * @author qinzhengying
 * @since 1.8
 */
@Repository(value = "userDAO8")
@SuppressWarnings("all")
public class UserDAOImpl
          extends JavaEE8BaseDAO<User, Integer>
          implements UserDAO
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

    //region 登录实现

    @Override
    public String find(String user_loginName, String user_password)
    {
        List list = null;
        String msgResult = "";

        try
        {
            /*
            list = getSessionFactory()
                    .openSession()
                    .createQuery("from User where user_loginName='" + user_loginName + "'\n and user_password='" + user_password + "'")
                    .list();
            */
            String queryString = "from User where user_loginName=:user_loginName and user_password=:user_password";
            String[] paramNames = {"user_loginName", "user_password"};
            Object[] values = {user_loginName, user_password};

            list = superFindByNamedParam(queryString, paramNames, values);

            if (list.size() > 0)
            {
                msgResult = str_SUCCESS;
            }
            else
            {
                msgResult = str_FAILED;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return msgResult;
    }

    //endregion

    //region 查找用户国家以及其对应的编号值

    /**
     * 获取国家主键编号以及其名称(格式如下:93——————Afghanistan)
     *
     * @return 国家编号存入键值, 国家名称存入value值<br>
     * 格式如:<code>java.util.Map&lt;93, Afghanistan&gt;</code>
     */
    @Override
    public Map<Long, String> getCountryIdAndNames() throws JavaEE6Exception
    {
        Map<Long, String> result = new HashMap<>();

        List<Object[]> searchList = getSessionFactory()
                  .openSession()
                  .createQuery("select c.id, c.country_name from Country c")
                  .list();

        searchList.forEach
                  (
                            objs ->
                            {
                                for (int i = 0; i < objs.length; i++)
                                {
                                    //id-->name
                                    result.put((Long) objs[0], (String) objs[1]);
                                }
                            }
                  );

        return result;
    }
    //endregion

    //region 查询所有用户的值

    @Override
    public List<User> findAll()
    {
        return getSessionFactory()
                  .openSession()
                  .createQuery("from User ")
                  .list();
    }

    //endregion
}















