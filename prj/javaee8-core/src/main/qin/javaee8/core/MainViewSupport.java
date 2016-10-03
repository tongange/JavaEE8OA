package qin.javaee8.core;

import org.springframework.web.servlet.ModelAndView;

/**
 * 返回主页面
 *
 * @author qinzhengying
 * @since 1.8
 */
public interface MainViewSupport
{
    //region 返回主页面

    /**
     * 返回主页面
     *
     * @param colRM   (Controller--RequestMapping)控制层的RequestMapping访问值
     * @param conName 控制层名称(需要访问的链接)
     * @return
     */
    default ModelAndView doMainView(String colRM, String conName)
    {
        return new ModelAndView("/" + colRM + "/" + conName + ".com");
    }
    //endregion

    //region 默认返回主页面
    default ModelAndView doMainView()
    {
        return null;
    }
    //endregion
}