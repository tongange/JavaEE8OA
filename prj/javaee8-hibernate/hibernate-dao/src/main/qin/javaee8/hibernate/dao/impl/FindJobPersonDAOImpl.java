package qin.javaee8.hibernate.dao.impl;

import org.springframework.stereotype.Repository;
import qin.javaee8.core.JavaEE8BaseDAO;
import qin.javaee8.hibernate.dao.FindJobPersonDAO;
import qin.javaee8.hibernate.systemDomain.FindJobPerson;

import java.util.List;

/**
 * 招聘人员数据访问层实现
 *
 * @author qinzhengying
 * @since 1.8
 */
@Repository(value = "findJobPersonDAO8")
@SuppressWarnings("all")
public class FindJobPersonDAOImpl
          extends JavaEE8BaseDAO<FindJobPerson, Integer>
          implements FindJobPersonDAO
{
    private static final long serialVersionUID = 3180632462541005842L;

    //region 获取招聘人员信息实体类 类 类型
    @Override
    public Class<FindJobPerson> getEntityClass()
    {
        return FindJobPerson.class;
    }
    //endregion

    @Override
    public List<FindJobPerson> findBasicInfo()
    {
        //language=hql
        String hqlQuery = new StringBuilder()
                  .append("")
                  .append("select f.jobPersonName, ")
                  .append("f.jobPersonGender, ")
                  .append("f.jobPersonOldCompanyName,")
                  .append("f.jobPersonOldJob, ")
                  .append("f.jobPersonStartJobTime, ")
                  .append("f.jobPersonJobName,")
                  .append("f.jobPersonNowCity, ")
                  .append("f.jobPersonBirth, ")
                  .append("f.jobPersonIsMarried, ")
                  .append("f.jobPersonMobile, ")
                  .append("f.jobPersonEmail, ")
                  .append("f.jobPersonCountry, ")
                  .append("f.jobPersonLocation\n")
                  .append("from FindJobPerson f").toString();
        List findJobPersonList = getSessionFactory()
                  .openSession()
                  .createQuery(hqlQuery)
                  .list();

        return findJobPersonList;
    }
}















