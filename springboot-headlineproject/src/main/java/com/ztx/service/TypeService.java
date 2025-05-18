package com.ztx.service;

import com.ztx.pojo.Type;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ztx.pojo.vo.PortalVo;
import com.ztx.utils.Result;
import org.springframework.stereotype.Service;

/**
* @author 1
* @description 针对表【news_type】的数据库操作Service
* @createDate 2025-05-16 14:38:28
*/
@Service
public interface TypeService extends IService<Type> {

    Result findAllTypes();

}
