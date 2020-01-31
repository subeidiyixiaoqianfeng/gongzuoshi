package com.example.demo.service;

import com.example.demo.model.User;


import java.util.List;

public interface UserService {
    void add(String img,String title,String name,String des,String classify,Integer isdownload,String empower);
    void delect(Long id);
    User get(Long id);
    List<User> lists();
    void up(User user);
}
