package controller;

import module.Login;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tools.MD5;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/3/29.
 */
@Controller
@RequestMapping("User")
public class User {
    static ApplicationContext Context = SpringBoot.getApplicationContext();
    @RequestMapping("login.do")
    public void login (String username, String password, HttpServletRequest request, HttpServletResponse response){
        Login login = (Login) Context.getBean("Login");
        if (login.checkuser(password,username)){
            RespenseTools.success("success",response);
            request.getSession().setAttribute("islogin",true);
        }else {
            RespenseTools.fail(400,"用户名或者密码错误",response);
        }
    }
    @RequestMapping(value = "register.do", method ={RequestMethod.POST})
    public void register (bean.User user, HttpServletResponse response, HttpServletRequest request){
        Login login = (Login) Context.getBean("Login");
        String result = login.register(user);
        if (result.equals("注册成功")){
            RespenseTools.success("注册成功",response);
            request.getSession().setAttribute("islogin",true);
        }else {
            RespenseTools.fail(400,result,response);
        }
    }
    @RequestMapping("islogin.do")
    public  void  islogin (HttpServletResponse response, HttpServletRequest request){

        try {
            if ((boolean)request.getSession().getAttribute("islogin")){
                RespenseTools.success("已登录",response);
            }
        } catch (Exception e) {
            RespenseTools.fail(400,"未登录",response);
            e.printStackTrace();
        }
    }
}
