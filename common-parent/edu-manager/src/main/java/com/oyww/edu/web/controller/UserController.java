package com.oyww.edu.web.controller;

import com.oyww.edu.model.User;
import com.oyww.edu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("index")
    public String index(){
        System.out.println("打开首页");
        return "Default";
    }

    @RequestMapping("login")
    public String login(){
        System.out.println(".....");
        return "Default";
    }

    @RequestMapping("find")
    public String find(Integer id){
        System.out.println(".....");
        User user = userService.findById(id);
        System.out.println(user);
        return null;
    }

    @RequestMapping("manage")
    public String manage(){
        return "user/manage";
    }

    @RequestMapping("info")
    public String info(){
        return "user/info";
    }

    @RequestMapping("edit")
    public String edit(){
        return "user/edit";
    }
}
