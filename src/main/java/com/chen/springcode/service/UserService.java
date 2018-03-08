package com.chen.springcode.service;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {
    
    public String add(){
        System.out.println("UserService add()");
        return "add";
    }
    
    public boolean delete(){
        System.out.println("UserService delete()");
        return true;
    }
    
    public void edit(){
        System.out.println("UserService edit()");
        int i = 5/0;
    }
    
    
}
