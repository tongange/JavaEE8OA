package qin.javaee8.hibernate.service;

import qin.javaee65.core.hibernate.service.JavaEE65ServiceSupport;
import qin.javaee65.exceptions.JavaEE6Exception;
import qin.javaee8.core.JavaEE8BaseSupport;
import qin.javaee8.hibernate.systemDomain.FindJobPerson;

import java.util.Collections;
import java.util.List;

/**
 * 招聘人员服务层
 *
 * @author qinzhengying
 * @since 1.8
 */
@SuppressWarnings("all")
public interface FindJobPersonService
          extends JavaEE65ServiceSupport<FindJobPerson, Integer>,
          JavaEE8BaseSupport
{
    //region findByEntity
    @Override
    default <E> List<?> findByEntity(FindJobPerson entity, E elements) throws JavaEE6Exception
    {
        return Collections.emptyList();
    }
    //endregion

    //region 查询招聘人员基本信息

    /**
     * 查询招聘人员基本信息
     *
     * @return 返回招聘人员信息集合
     */
    List<?> findBasicInfo();
    //endregion

    //region 查询职业意向
    List<?> findJobWants();
    //endregion

    //region 查询招聘人员详细信息
    List<FindJobPerson> findDetails(FindJobPerson f);
    //endregion
}
