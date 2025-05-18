package com.ztx.mapper;

import com.ztx.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 1
* @description 针对表【news_user】的数据库操作Mapper
* @createDate 2025-05-16 14:38:28
* @Entity com.ztx.pojo.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




