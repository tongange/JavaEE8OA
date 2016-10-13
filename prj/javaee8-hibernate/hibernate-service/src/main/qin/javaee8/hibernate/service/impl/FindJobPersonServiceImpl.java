package qin.javaee8.hibernate.service.impl;

import org.springframework.stereotype.Service;
import qin.javaee65.core.hibernate.service.impl.JavaEE65ServiceSupportImpl;
import qin.javaee8.hibernate.dao.FindJobPersonDAO;
import qin.javaee8.hibernate.service.FindJobPersonService;
import qin.javaee8.hibernate.systemDomain.FindJobPerson;

import javax.annotation.Resource;
import java.util.List;

/**
 * 招聘人员服务层实现
 *
 * @author qinzhengying
 * @since 1.8
 */
@Service(value = "findJobPersonService8")
@SuppressWarnings("all")
public class FindJobPersonServiceImpl
          extends JavaEE65ServiceSupportImpl<FindJobPerson, Integer>
          implements FindJobPersonService
{
    private static final long serialVersionUID = -8130325383653543081L;

    //region 招聘人员数据访问层
    private FindJobPersonDAO findJobPersonDAO;

    @Override
    public FindJobPersonDAO getDAO()
    {
        return findJobPersonDAO;
    }

    @Resource
    public void setFindJobPersonDAO(FindJobPersonDAO findJobPersonDAO)
    {
        this.findJobPersonDAO = findJobPersonDAO;
    }
    //endregion

    //region 查询基本信息
    @Override
    public List<?> findBasicInfo()
    {
        return findJobPersonDAO.findBasicInfo();
    }
    //endregion

    //region 查询职业意向
    @Override public  List<?> findJobWants() {
        return findJobPersonDAO.findJobWants();
    }
    //endregion
}