package com.lzl.ssm.controller;

import com.lzl.ssm.service.UserDaoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;


/**
 * fileName:Usercontrolle
 * description:
 * author:zz
 * createTime:2019/3/2 16:45
 */
@Controller
@RequestMapping("/user")
public class UserControlle {
     @Autowired
    private UserDaoService UserDaoService;


    @ResponseBody
    @RequestMapping("/list")
    public List<Map> list(){
        return  UserDaoService.getList();
    }

}
