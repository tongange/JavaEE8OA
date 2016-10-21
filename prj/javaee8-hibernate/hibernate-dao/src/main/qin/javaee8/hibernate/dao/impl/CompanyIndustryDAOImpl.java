package qin.javaee8.hibernate.dao.impl;

import org.springframework.stereotype.Repository;
import qin.javaee8.core.JavaEE8BaseDAO;
import qin.javaee8.hibernate.dao.CompanyIndustryDAO;
import qin.javaee8.hibernate.domain.CompanyIndustry;

import java.util.List;

/**
 * 公司行业数据访问层实现
 *
 * @author qinzhengying
 * @since 1.8
 */
@Repository(value = "companyIndustry8")
@SuppressWarnings("all")
public class CompanyIndustryDAOImpl
          extends JavaEE8BaseDAO<CompanyIndustry, Long>
          implements CompanyIndustryDAO
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

    @Override
    public List<CompanyIndustry> findAll()
    {
        List<CompanyIndustry> result = getSessionFactory()
                  .openSession()
                  .createQuery("from CompanyIndustry ")
                  .list();

        return result;
    }
}















