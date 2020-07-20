package com.example.demo;

import com.example.bean.UserBean;
import com.example.tools.ToolClass;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.CookieStore;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@Configuration
public class control {
    @RequestMapping(value = "/")
    public  String getIndex(String name ,int id){
        return "foward:index.html";
    }

    @RequestMapping(value = "/method1")
    public String getValue1(HttpServletRequest req, HttpServletResponse res){

        return req.getParameter("name");
    }



    @RequestMapping(value = "/json")
    public Map<String,Object> getJson(@RequestBody UserBean userBean){
        Map<String,Object> map = new HashMap<>();
        map.put("user",userBean);
        return map;
    }
    @RequestMapping(value = "/mybatis")
    public List<UserBean> getBean() throws IOException {

        return ToolClass.getList();
    }

    @RequestMapping(value = "/id")
    public UserBean getId(Integer age) throws IOException {

        return ToolClass.getId(age);
    }

    @RequestMapping(value = "/insert")
    public void insertUser(String name,String address,Integer age) throws IOException {
        UserBean userBean = new UserBean();
        userBean.setAddress(address);
        userBean.setAge(age);
        userBean.setName(name);
       ToolClass.insertUser(userBean);
    }
    @RequestMapping(value = "/delete")
    public void deleteUser(Integer age) throws IOException {

        ToolClass.deleteUser(age);
    }

    @RequestMapping(value = "/update")
    public void updateUser(Integer age) throws IOException {
        ToolClass.updateMap(age);
    }
}
