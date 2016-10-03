package qin.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaEE8Test
{
    @Test
    public void testSpring()
    {
        SessionFactory sessionFactory = (SessionFactory) new
                  ClassPathXmlApplicationContext("applicationContext.xml")
                  .getBean("sessionFactory");
        Session session = sessionFactory.openSession();
    }
}