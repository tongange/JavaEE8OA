package qin.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import qin.javaee8.core.JavaEE8BaseSupport;

public class JavaEE8Test implements JavaEE8BaseSupport
{
    protected SessionFactory sessionFactory = null;
    protected Session session = null;
    protected Transaction transaction = null;

    public JavaEE8Test()
    {
        sessionFactory = (SessionFactory) new
                  ClassPathXmlApplicationContext("applicationContext.xml")
                  .getBean("sessionFactory");
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
    }
}





















