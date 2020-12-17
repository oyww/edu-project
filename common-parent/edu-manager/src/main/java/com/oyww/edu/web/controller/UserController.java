package com.oyww.edu.web.controller;

import com.oyww.edu.model.User;
import com.oyww.edu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("login")
    public String login(){
        System.out.println(".....");
        return "Default";
    }
    @RequestMapping("index")
    public String showIndex(){
        return "Default";
    }

    @RequestMapping("find")
    @ResponseBody
    public User find(Integer id){
        System.out.println(".....");
        User user = userService.findById(id);
        System.out.println(user);
        return user;
    }

    @RequestMapping("manage")
    public String manage(){
        return "User/UserManage";
    }

    @RequestMapping("info")
    public String info(){
        return "User/UserInfo";
    }

    @RequestMapping("edit")
    public String edit(){
        return "User/UserEdit";
    }
}
