package com.oyww.edu.service;

import com.oyww.edu.model.User;
import com.oyww.edu.service.base.IBaseService;

public interface IUserService extends IBaseService<User>{

    //特有的方法
    public User login(String username, String password);
}
