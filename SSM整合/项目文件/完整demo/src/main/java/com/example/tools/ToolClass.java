package com.example.tools;


import com.example.bean.UserBean;
import com.example.dao.IUserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolClass {

    public static SqlSession init() throws IOException {
        String resource = "mybatis.xml";
        String string = null;
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(resource));
        //sesion里面有各种增删查改函数
        SqlSession session = sessionFactory.openSession();
        return session;
    }

    public static List<UserBean> getList() throws IOException {
        SqlSession session =init();
        IUserDao service = session.getMapper(IUserDao.class);

        List<UserBean> list = service.findAll();

        return list;
    }
    public static UserBean getId(Integer age) throws IOException {
        SqlSession session =init();

        IUserDao service = session.getMapper(IUserDao.class);

        UserBean userBean= service.findById(age);

        return userBean;
    }

    public static void insertUser(UserBean userBean) throws IOException {
        SqlSession session =init();
        IUserDao service = session.getMapper(IUserDao.class);

        service.insertUser(userBean);
        session.commit();
        session.close();
    }

    public static void deleteUser(Integer age) throws IOException {
        SqlSession session =init();
        IUserDao service = session.getMapper(IUserDao.class);
        service.deleteUser(age);
        session.commit();
    }

    public static void updateMap(Integer age) throws IOException {
        SqlSession session =init();
        IUserDao service = session.getMapper(IUserDao.class);
        Map<String, Integer> map = new HashMap<>();
        map.put("age",age);
        System.out.println(map.get("age"));
        service.updateMap(map);
        session.commit();
    }

}
