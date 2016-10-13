package qin.javaee8.hibernate.dao.impl;

import org.springframework.stereotype.Repository;
import qin.javaee8.core.JavaEE8BaseDAO;
import qin.javaee8.hibernate.dao.ElSealDAO;
import qin.javaee8.hibernate.systemDomain.ElSeal;

/**
 * 电子公章数据访问层实现
 *
 * @author qinzhengying
 * @since 1.8
 */
@Repository(value = "elSealDAO8")
@SuppressWarnings("all")
public class ElSealDAOImpl
          extends JavaEE8BaseDAO<ElSeal, Integer>
          implements ElSealDAO
{
    private static final long serialVersionUID = 3180632462541005842L;

    @Override
    public Class<ElSeal> getEntityClass()
    {
        return ElSeal.class;
    }
}















