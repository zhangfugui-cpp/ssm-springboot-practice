package com.ztx.Test;

import com.ztx.mapper.UserMapper;
import com.ztx.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
public class SpringBootMybatisPlusTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert() {
        User user = new User();
        user.setAge(25);
        user.setName("高嘉千");
        user.setEmail("@163.com");
        int rows = userMapper.insert(user);
        System.out.println("rows = " + rows);
    }

    @Test
    public void testDelete(Integer id) {
        int rows = userMapper.deleteById(id);
        System.out.println("rows = " + rows);
        Map Type=new HashMap();
        Type.put("age",20);
        int rows2=userMapper.deleteByMap(Type);
        System.out.println("rows = " + rows2);
    }
}
