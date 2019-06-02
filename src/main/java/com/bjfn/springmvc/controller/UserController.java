package com.bjfn.springmvc.controller;

import com.bjfn.springmvc.entity.User;
import com.bjfn.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getAllUser")
    public String getAllUser(Model model){
        List<User> list = userService.getAllUser();
        System.out.println(list + "========");
        model.addAttribute("userList",list);
        return "userList";
    }

    @RequestMapping("getUser")
    public String getUsre(){
        return "user";
    }
}
