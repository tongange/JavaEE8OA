package qin.javaee8.core;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import qin.javaee65.core.hibernate.dao.impl.JavaEE65DAOSupportImpl;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * JavaEE8数据访问层实现类
 *
 * @param <T>  任意实体类型
 * @param <ID> 任意主键类型
 * @author qinzhengying
 * @since 1.8
 */
@Repository(value = "javaee8SuperDAO")
@SuppressWarnings("all")
public class JavaEE8BaseDAO<T, ID extends Serializable>
          extends JavaEE65DAOSupportImpl<T, ID>
          implements JavaEE8BaseSupport
{
    //region 获取配置文件和日志

    /**
     * 获取配置文件
     *
     * @return
     */
    @Override
    public String getLog4jLocations()
    {
        return j8Tools.getLog4jLocations();
    }

    @Override
    public String getFileLocation()
    {
        return getLog4jLocations();
    }

    /**
     * 获取日志
     *
     * @return
     */
    @Override
    public Logger getMyLogger()
    {
        return Logger.getLogger(JavaEE8BaseDAO.class);
    }
    //endregion

    private SessionFactory sessionFactory;

    @Override
    public SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }

    @Resource
    @Override
    public void setSessionFactory(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }
}












