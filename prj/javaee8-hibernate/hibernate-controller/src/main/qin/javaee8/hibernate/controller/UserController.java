package qin.javaee8.hibernate.controller;

import qin.javaee65.core.hibernate.controller.HibernateBaseController65;
import qin.javaee8.core.JavaEE8BaseSupport;
import qin.javaee8.core.MainViewSupport;
import qin.javaee8.hibernate.domain.User;

/**
 * 用户控制层
 *
 * @author qinzhengying
 * @since 1.8
 */
@SuppressWarnings("all")
public interface UserController extends HibernateBaseController65<User>,
          JavaEE8BaseSupport, MainViewSupport
{
}