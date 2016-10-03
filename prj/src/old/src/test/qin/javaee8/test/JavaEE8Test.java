package qin.javaee8.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import qin.javaee8.core.JavaEE8BaseSupport;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaEE8Test implements JavaEE8BaseSupport
{
    @Test
    public void printTest()
    {
        //System.out.println(j8Tools.getFileLocation());
        //System.out.println(j8Tools.getLog4jLocations());
    }

    @Test
    public void springBeansTest()
    {
        SessionFactory sessionFactory = (SessionFactory) new
                  ClassPathXmlApplicationContext("applicationContext.xml")
                  .getBean("sessionFactory");
        Session session = sessionFactory.openSession();
    }

    @Test
    public void test2()
    {
        System.out.println(new Date());
        Date d = new Date();
        String s = new SimpleDateFormat("yyyy-MM-dd").format(d);
        System.out.println(s.substring(0, 4));
    }

    @Test
    public void test3() throws Exception
    {
    }
}















