package com.example.demo.controller;

import com.example.demo.model.User;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller

public class UserController {
    @RequestMapping(value = "/login",method = RequestMethod.GET)

    @ResponseBody

    public String login(HttpSession session, User user){

        if("aaa".equals(user.getUsername())&&"123456".equals(user.getPassword()))

        {

            session.setAttribute("username",user.getUsername());

            return "登录成功";

        }
        else{

            return "登录失败";

        }

    }



    @RequestMapping(value = "/logout",method = RequestMethod.GET)

    @ResponseBody

    public String logout(HttpSession session){

        session.invalidate();

        return "注销成功";

    }



    @RequestMapping(value = "status",method = RequestMethod.GET)

    @ResponseBody

    public String status(HttpSession session){

        try {

            return "用户名为："+session.getAttribute("username").toString();

        }catch(Exception e){

            return "session不存在";

        }

    }
}
