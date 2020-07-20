package com.example.dao;

import com.example.bean.UserBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

public interface IUserDao {
    public List<UserBean> findAll();
    public UserBean findById(Integer id);
    public void insertUser(UserBean userBean);
    public void deleteUser(Integer age);
    public void updateMap(Map<String, Integer> map);
}

