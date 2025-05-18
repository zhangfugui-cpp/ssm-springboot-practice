package com.ztx.service;

import com.ztx.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ztx.utils.Result;
import org.springframework.stereotype.Service;

/**
* @author 1
* @description 针对表【news_user】的数据库操作Service
* @createDate 2025-05-16 14:38:28
*/
@Service
public interface UserService extends IService<User> {

    Result login(User user);

    //根据token获取用户数据
    Result getUserInfo(String token);

    Result checkUserName(String username);

    Result regist(User user);


}
