package qin.javaee8.hibernate.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import qin.javaee65.core.hibernate.controller.BaseController;
import qin.javaee8.hibernate.domain.User;
import qin.javaee8.hibernate.service.UserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.Set;

/**
 * 用户控制层实现
 *
 * @author qinzhengying
 * @since 1.8
 */
@Controller(value = "userController8")
@Scope("prototype")
@RequestMapping(value = "/user")
@SuppressWarnings("all")
public class UserControllerImpl extends BaseController<User> implements UserController
{
    private static final long serialVersionUID = -6934302859160903756L;

    //region 注入用户服务层
    private UserService userService;

    public UserService getUserService()
    {
        return userService;
    }

    @Resource
    public void setUserService(UserService userService)
    {
        this.userService = userService;
    }
    //endregion

    //region 返回用户注册页面

    @Override
    @RequestMapping(value = "/registerUser")
    public ModelAndView doMainView()
    {
        return new ModelAndView("/user/registerUser");
    }

    //endregion

    //region 实现登录功能

    /**
     * 实现登录功能
     *
     * @param vo       实体类用于接收用户名和密码
     * @param response 回复
     */
    @RequestMapping(value = "/doLogin")
    public void doLogin(User vo, HttpServletResponse response)
    {
        //事先定义变量接收界面值
        String user_loginName = "";
        //密码
        String user_password = "";

        try
        {
            user_loginName = vo.getUser_loginName().trim();
            user_password = vo.getUser_password().trim();

            String ajaxMsg = userService.find(user_loginName, user_password);

            j8Tools.returnJson(ajaxMsg, response);

            actionFlag = true;
        }
        catch (Exception ex)
        {
            actionFlag = false;
        }
        finally
        {
            j8Tools.doCheck(actionFlag);
        }
    }
    //endregion

    //region 显示国家和编号下拉框中数据

    /**
     * 显示国家和编号下拉框中数据
     */
    @RequestMapping(value = "/getCountryIdAndNames")
    public void getCountryIdAndNames(HttpServletResponse response)
    {
        //传送select的字符串
        StringBuilder sbSelect = new StringBuilder();
        String start = "<option selected=\"selected\" value=\"\">country</option><br>";

        try
        {
            Map<Long, String> countryIdAndNames = userService.getCountryIdAndNames();
            Set<Long> countryKeySet = countryIdAndNames.keySet();
            //map.get(key)
            //迭代set集合并且将信息字符串赋进
            countryKeySet.forEach
                      (
                                k ->
                                {
                                    sbSelect.append("<option value=\"" + k + "\">" + countryIdAndNames.get(k) + "</option><br>");
                                }
                      );

            j8Tools.returnJson(sbSelect.toString(), response);

            actionFlag = true;
        }
        catch (Exception ex)
        {
            actionFlag = false;
        }
        finally
        {
            j8Tools.doCheck(actionFlag);
        }
    }
    //endregion
}




















