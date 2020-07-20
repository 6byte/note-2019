package com.example.service;


import com.example.bean.UserBean;
import com.example.dao.IUserDao;

import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Service
public class Service implements IUserDao {
    @Override
    public List<UserBean> findAll() {
        return null;
    }

    @Override
    public UserBean findById(Integer id) {
        return null;
    }


    @Override
    public void insertUser(UserBean userBean) {

    }

    @Override
    public void deleteUser(Integer age) {

    }

    @Override
    public void updateMap(Map<String, Integer> map) {

    }

}
