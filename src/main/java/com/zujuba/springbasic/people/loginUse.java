package com.zujuba.springbasic.people;

import com.zujuba.domain.userLogin;
import com.zujuba.mapper.userServerMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/login")
public class loginUse {

    private static Logger logger = Logger.getLogger(loginUse.class);

    private static SqlSessionFactory getSessionFactory() {
        SqlSessionFactory sessionFactory = null;
        String resource = "mybatis-config.xml";
        try {
            sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(resource));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sessionFactory;
    }

    @RequestMapping(value = "/test1" ,method = RequestMethod.POST,consumes = "application/json")
    @ResponseBody
    public testuseclass logintest1(@RequestBody testuseclass testuseclass) {
        logger.info("run in logintest1 ");
        logger.info("testuseclass1 is "+ " id is " + testuseclass.getId() + " name is " + testuseclass.getName() );
        return testuseclass;
    }


    @RequestMapping(value = "/test2" ,method = RequestMethod.POST, consumes = "text/plain")
    @ResponseBody
    public String logintest2(@RequestBody String testuseclass) {
        logger.info("run in logintest2 ");
        logger.info("testuseclass2 is "+ " id is " + testuseclass );
        return testuseclass;
    }


    @RequestMapping(value = "/test3" ,method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public testuseclass logintest3(@RequestBody testuseclass testuseclass) {
        logger.info("run in logintest3 ");
        logger.info("testuseclass3 is " + " id is " + testuseclass.getId() + " name is " + testuseclass.getName() );
        return testuseclass;
    }



    @RequestMapping(value = "/")
    public String userLogin() {
        logger.info("run in userLogin ");
////        创建一个sql的会议，标准格式；
//        SqlSession sqlSession = getSessionFactory().openSession();
////        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        //创建pojo的接口类，并用sql会议赋值，标准格式；
//        userServerMapper usMapper = sqlSession.getMapper(userServerMapper.class);
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
//        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
//        //创建要写入的实例；
//        userLogin userNow = new userLogin();
////        userNow.setid(11);
//        userNow.setlogintime(new Date());
//        userNow.setname("Goying");
//        //使用接口方法将数据写入；
//        usMapper.addUserLogin(userNow);
//        sqlSession.commit();
//
        return "Hello World";
    }

//    @RequestMapping(value = "/save/{name}/{address}",method = RequestMethod.POST)
//    public String saveUser(@PathVariable String name, @PathVariable String address ) {
//        User user = new User();
//        user.setName(name);
//        user.setAddress(address);
//        userService.saveUser(user);
//        return "保存成功";
//    }

}