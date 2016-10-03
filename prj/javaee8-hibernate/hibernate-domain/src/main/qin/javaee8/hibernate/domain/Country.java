/*
 * --------------------------------------------------------------------------------------------------------------------------
 * class Long extends Number {}
 * class Number implements Serializable{}
 * 所以Long是Serializable的子类
 * --------------------------------------------------------------------------------------------------------------------------
 */

package qin.javaee8.hibernate.domain;

import qin.javaee65.core.hibernate.SuperEntity65;

import java.util.HashSet;
import java.util.Set;

/**
 * 国家实体类
 *
 * @author qinzhengying
 * @since 1.8
 */
@SuppressWarnings("all")
public class Country implements SuperEntity65<Long>
{
    private static final long serialVersionUID = -1129424608222680471L;

    //region 主键
    private Long id;

    @Override
    public Long getId()
    {
        return id;
    }

    @Override
    public void setId(Long id)
    {
        this.id = id;
    }
    //endregion

    //region 国家名称
    /**
     * 国家名称
     */
    private String country_name;

    public String getCountry_name()
    {
        return country_name;
    }

    public void setCountry_name(String country_name)
    {
        this.country_name = country_name;
    }
    //endregion

    //region 与用户一对多
    private Set<User> userSet = new HashSet<User>();

    public Set<User> getUserSet()
    {
        return userSet;
    }

    public void setUserSet(Set<User> userSet)
    {
        this.userSet = userSet;
    }
    //endregion
}