package com.lzl.ssm.service;

import com.lzl.ssm.dao.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * fileName:UserServiceImpl
 * description:
 * author:zz
 * createTime:2019/3/5 9:40
 */
@Service
public class UserServiceImpl implements  UserDaoService {
    @Autowired
    private UserDao dao;

    @Override
    public List<Map> getList() {
            return  dao.getList();

    }
}
