/*
 * JavaEE8核心jar包
 * 所有的项目都要使用此jar包
 * 此jar包为方便所有系统使用
 * 其中有mybatis和spring的功能
 * made by qinzhengying 2016.09
 * qq:937184304
 *
 *  --------------------------------------------------------------------------------------------------------------------------
 *  User实体登录类
 *
 *  登录所需要的信息(一共10个字段)
 *  用户名——邮箱——密码
 *  用户实体类所对应的字段以及描述
 *  姓名第一个名称       firstName
 *  姓名末尾        lastName
 *  登录名/用户名     userName
 *  邮箱      email
 *  密码      password
 *  国家country(下拉框)
 *  出生年月        birthdate(下拉框)
 *  性别      gender(下拉框)
 *  联系方式        phoneNumber
 *  描述      description
 *
 *  --------------------------------------------------------------------------------------------------------------------------
 *
 */

package qin.javaee8.hibernate.domain;

import qin.javaee65.core.hibernate.SuperEntity65;

import java.util.Date;

/**
 * 用户登录实体类
 *
 * @author qinzhengying
 * @since 1.8
 */
@SuppressWarnings("all")
public class User implements SuperEntity65<Integer>
{
    private static final long serialVersionUID = 578208336380377972L;

    //region 构造函数
    public User()
    {

    }

    /**
     * 带参数构造函数
     *
     * @param user_firstName   首姓名
     * @param user_lastName    尾姓名
     * @param user_loginName   登录名
     * @param user_email       邮箱
     * @param user_password    密码
     * @param user_country     国家
     * @param user_birthdate   出生日期
     * @param user_gender      性别
     * @param user_phoneNumber 联系方式
     * @param user_description 描述
     */
    public User
    (
              String user_firstName, String user_lastName, String user_loginName,
              String user_email, String user_password, Country user_country, Date user_birthdate,
              Gender user_gender, String user_phoneNumber, String user_description
    )
    {
        this.user_firstName = user_firstName;
        this.user_lastName = user_lastName;
        this.user_loginName = user_loginName;
        this.user_email = user_email;
        this.user_password = user_password;
        this.user_country = user_country;
        this.user_birthdate = user_birthdate;
        this.user_gender = user_gender;
        this.user_phoneNumber = user_phoneNumber;
        this.user_description = user_description;
    }
    //endregion

    //region 主键
    private Integer id;

    @Override
    public Integer getId()
    {
        return id;
    }

    @Override
    public void setId(Integer id)
    {
        this.id = id;
    }
    //endregion

    //region 姓名第一个名称
    /**
     * 姓名第一个名称
     */
    private String user_firstName;

    public String getUser_firstName()
    {
        return user_firstName;
    }

    public void setUser_firstName(String user_firstName)
    {
        this.user_firstName = user_firstName;
    }
    //endregion

    //region 姓名末尾
    /**
     * 姓名末尾
     */
    private String user_lastName;

    public String getUser_lastName()
    {
        return user_lastName;
    }

    public void setUser_lastName(String user_lastName)
    {
        this.user_lastName = user_lastName;
    }
    //endregion

    //region 登录名/用户名
    /**
     * 登录名/用户名
     */
    private String user_loginName;

    public String getUser_loginName()
    {
        return user_loginName;
    }

    public void setUser_loginName(String user_loginName)
    {
        this.user_loginName = user_loginName;
    }
    //endregion

    //region 邮箱
    /**
     * 邮箱
     */
    private String user_email;

    public String getUser_email()
    {
        return user_email;
    }

    public void setUser_email(String user_email)
    {
        this.user_email = user_email;
    }
    //endregion

    //region 密码
    /**
     * 密码
     */
    private String user_password;

    public String getUser_password()
    {
        return user_password;
    }

    public void setUser_password(String user_password)
    {
        this.user_password = user_password;
    }
    //endregion

    //region 国家
    /**
     * 国家(<code>class Country</code>)<br>一个国家对应多个用户
     */
    private Country user_country;

    public Country getUser_country()
    {
        return user_country;
    }

    public void setUser_country(Country user_country)
    {
        this.user_country = user_country;
    }
    //endregion

    //region 出生年月
    /**
     * 出生年月
     */
    private Date user_birthdate;

    public Date getUser_birthdate()
    {
        return user_birthdate;
    }

    public void setUser_birthdate(Date user_birthdate)
    {
        this.user_birthdate = user_birthdate;
    }
    //endregion

    //region 性别
    /**
     * 性别
     */
    private Gender user_gender;

    public Gender getUser_gender()
    {
        return user_gender;
    }

    public void setUser_gender(Gender user_gender)
    {
        this.user_gender = user_gender;
    }
    //endregion

    //region 联系方式
    /**
     * 联系方式
     */
    private String user_phoneNumber;

    public String getUser_phoneNumber()
    {
        return user_phoneNumber;
    }

    public void setUser_phoneNumber(String user_phoneNumber)
    {
        this.user_phoneNumber = user_phoneNumber;
    }
    //endregion

    //region 描述
    /**
     * 描述
     */
    private String user_description;

    public String getUser_description()
    {
        return user_description;
    }

    public void setUser_description(String user_description)
    {
        this.user_description = user_description;
    }
    //endregion

    //region 用户类型
    private UserType userType;

    public UserType getUserType()
    {
        return userType;
    }

    public void setUserType(UserType userType)
    {
        this.userType = userType;
    }
    //endregion

    //region 界面接收字段

    //region 确认密码
    private String user_password2;

    public String getUser_password2()
    {
        return user_password2;
    }

    public void setUser_password2(String user_password2)
    {
        this.user_password2 = user_password2;
    }
    //endregion

    //region 性别
    private String user_gender2;

    public String getUser_gender2()
    {
        return user_gender2;
    }

    public void setUser_gender2(String user_gender2)
    {
        this.user_gender2 = user_gender2;
    }
    //endregion

    //region 用户所对应的国家
    private String user_country2;

    public String getUser_country2()
    {
        return user_country2;
    }

    public void setUser_country2(String user_country2)
    {
        this.user_country2 = user_country2;
    }
    //endregion

    //endregion

    //region toString()

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", user_firstName='").append(user_firstName).append('\'');
        sb.append(", user_lastName='").append(user_lastName).append('\'');
        sb.append(", user_loginName='").append(user_loginName).append('\'');
        sb.append(", user_email='").append(user_email).append('\'');
        sb.append(", user_password='").append(user_password).append('\'');
        sb.append(", user_phoneNumber='").append(user_phoneNumber).append('\'');
        sb.append(", user_description='").append(user_description).append('\'');
        sb.append(", user_password2='").append(user_password2).append('\'');
        sb.append(", user_gender2='").append(user_gender2).append('\'');
        sb.append(", user_country2='").append(user_country2).append('\'');
        sb.append('}');
        return sb.toString();
    }

    //endregion
}
