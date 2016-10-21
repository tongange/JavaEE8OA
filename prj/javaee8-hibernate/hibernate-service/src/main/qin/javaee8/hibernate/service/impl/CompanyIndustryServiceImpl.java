package qin.javaee8.hibernate.service.impl;

import org.springframework.stereotype.Service;
import qin.javaee65.core.hibernate.dao.JavaEE65DAOSupport;
import qin.javaee65.core.hibernate.service.impl.JavaEE65ServiceSupportImpl;
import qin.javaee8.hibernate.dao.CompanyIndustryDAO;
import qin.javaee8.hibernate.domain.CompanyIndustry;
import qin.javaee8.hibernate.service.CompanyIndustryService;

import javax.annotation.Resource;

/**
 * 招聘人员服务层实现
 *
 * @author qinzhengying
 * @since 1.8
 */
@Service(value = "companyIndustryService8")
@SuppressWarnings("all")
public class CompanyIndustryServiceImpl
          extends JavaEE65ServiceSupportImpl<CompanyIndustry, Long>
          implements CompanyIndustryService
{
    private static final long serialVersionUID = -8130325383653543081L;

    //region 注入招聘人员服务层
    private CompanyIndustryDAO companyIndustryDAO;

    @Resource
    public void setCompanyIndustryDAO(CompanyIndustryDAO companyIndustryDAO)
    {
        this.companyIndustryDAO = companyIndustryDAO;
    }

    @Override
    public JavaEE65DAOSupport getDAO()
    {
        return companyIndustryDAO;
    }
    //endregion
}










