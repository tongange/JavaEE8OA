package qin.javaee8.core;

import qin.javaee65.core.JavaEE6BaseSupport;
import qin.javaee65.core.Objects;

import java.util.Calendar;
import java.util.Collection;

/**
 * JavaEE8最基础接口
 *
 * @author qinzhengying
 * @since 1.8
 */
@SuppressWarnings("all")
public interface JavaEE8BaseSupport extends JavaEE6BaseSupport
{
    //region 内部类实现此接口

    /**
     * 实现输出功能主要是使用jdk1.8重写输出功能
     *
     * @author qinzhengying
     * @since 1.8
     */
    class JavaEE8BaseSupportImpl
              extends Objects
              implements JavaEE8BaseSupport
    {
        public static final String log4jLocation = "D:\\idea15ProjectLocation\\JavaEE8OA\\prj\\javaee8-hibernate\\src\\resources\\log4j.properties";

        public JavaEE8BaseSupportImpl(String fileLocation)
        {
            super(log4jLocation);
        }

        //region jdk1.8版输出集合
        @Override
        public <T> void printCollections(Collection<T>[] tCollection)
        {
            for (int i = 0; i < tCollection.length; i++)
            {
                tCollection[i].forEach
                          (
                                    e ->
                                    {
                                        superInfo(e + str_equals);
                                    }
                          );
            }
        }
        //endregion
    }
    //endregion

    /**
     * 实例化最终工具类变量
     */
    JavaEE8BaseSupportImpl j8Tools = new JavaEE8BaseSupportImpl("");

    //region 获取日历类
    /**
     * 获取日历类
     */
    Calendar calendar = Calendar.getInstance();
    //endregion

    //region 全角空格
    /**
     * 全角空格
     */
    String _nbsp = "　　　　　　　　　　";
    //endregion
}














