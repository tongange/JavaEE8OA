package qin.javaee8.hibernate.service.impl;

import org.springframework.stereotype.Service;
import qin.javaee65.core.hibernate.service.impl.JavaEE65ServiceSupportImpl;
import qin.javaee8.hibernate.dao.ElSealDAO;
import qin.javaee8.hibernate.service.ElSealService;
import qin.javaee8.hibernate.systemDomain.ElSeal;

import javax.annotation.Resource;

/**
 * 电子公章服务层实现
 *
 * @author qinzhengying
 * @since 1.8
 */
@Service(value = "elSealService8")
@SuppressWarnings("all")
public class ElSealServiceImpl
          extends JavaEE65ServiceSupportImpl<ElSeal, Integer>
          implements ElSealService
{
    private static final long serialVersionUID = -8130325383653543081L;

    //region 获取电子公章数据访问层
    private ElSealDAO elSealDAO;

    @Override
    public ElSealDAO getDAO()
    {
        return elSealDAO;
    }

    @Resource
    public void setElSealDAO(ElSealDAO elSealDAO)
    {
        this.elSealDAO = elSealDAO;
    }
    //endregion
}