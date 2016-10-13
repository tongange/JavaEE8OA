package qin.javaee8.hibernate.service;

import qin.javaee65.core.hibernate.service.JavaEE65ServiceSupport;
import qin.javaee65.exceptions.JavaEE6Exception;
import qin.javaee8.core.JavaEE8BaseSupport;
import qin.javaee8.hibernate.systemDomain.ElSeal;

import java.util.Collections;
import java.util.List;

/**
 * 电子公章服务层
 *
 * @author qinzhengying
 * @since 1.8
 */
@SuppressWarnings("all")
public interface ElSealService extends JavaEE65ServiceSupport<ElSeal, Integer>,
          JavaEE8BaseSupport
{
    @Override
    default <E> List<?> findByEntity(ElSeal entity, E elements) throws JavaEE6Exception
    {
        return Collections.emptyList();
    }
}
