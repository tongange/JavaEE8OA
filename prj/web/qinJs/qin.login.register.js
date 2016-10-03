/*
 登录和注册的js页面
 */
$(function ()
    {
        //region 登录实现
        $('#doLogin').click(function ()
            {
                doLogin();
            }
        );
        //endregion

        //region 注册实现
        $('#doRegister').click(function ()
            {
                window.location = "/user/registerUser.com";
            }
        );
        //endregion

        //region 实现国家和编号下拉框
        getCountryIdAndNames();
        //endregion
    }
);

//region 登录实现
function doLogin()
{
    //接收界面的值并且先行做判断
    var user_loginName = $('#user_loginName').val();
    var user_password = $('#user_password').val();

    if (user_loginName.length > 0 && user_password.length > 0)
    {
        //登录链接
        var loginURL = "/user/doLogin.com?user_loginName=" + user_loginName +
            "       &&user_password=" + user_password;

        $.ajax
        (
            {
                url: loginURL,
                method: 'POST',
                success: function (msg)
                {
                    if (msg == "success")
                    {
                        alert("登录成功!");
                    }
                    else
                    {
                        alert("登录失败!")
                    }
                }
            }
        );//end ajax
    }
    else
    {
        alert("用户名和密码不能为空!");
    }
}
//endregion

//region 实现国家和编号下拉框
function getCountryIdAndNames()
{
    $.ajax
    (
        {
            url: '/user/getCountryIdAndNames.com',
            method: 'POST',
            success: function (msg)
            {
                $('#user_country2').append(msg);
            }
        }
    )
}
//endregion























