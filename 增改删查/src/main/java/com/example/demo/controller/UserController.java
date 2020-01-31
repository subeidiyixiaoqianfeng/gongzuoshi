package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/kaishi")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/zengjia")
    public String add(String img,String title,String name,String des,String classify,Integer isdownload,String empower){
        userService.add(img, title, name, des, classify, isdownload, empower);
        return "添加信息成功";
    }
    @RequestMapping("/shanchu")
    public String del(long id){
        userService.delect(id);
        return "删除信息成功";
    }
    @RequestMapping("/chaxun")
    public User get(long id){
        User user = userService.get(id);
        return user;
    }
    @RequestMapping("/xianshiquanbu")
    public List<User> lists(){
        List<User> users = userService.lists();
        return  users;
    }
    @RequestMapping("/xiugai")
    public String up(long id,String img,String title,String name,String desc,String classify,Integer isdownload,String empower){
        User user=new User();
        user.setId(id);
        user.setImg(img);
        user.setTitle(title);
        user.setName(name);
        user.setDes(desc);
        user.setClassify(classify);
        user.setIsDownLoad(isdownload);
        user.setEmpower(empower);
        userService.up(user);
        return "修改成功";
    }

}