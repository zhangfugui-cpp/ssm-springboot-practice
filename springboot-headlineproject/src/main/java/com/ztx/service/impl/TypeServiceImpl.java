package com.ztx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ztx.pojo.Type;
import com.ztx.pojo.vo.PortalVo;
import com.ztx.service.HeadlineService;
import com.ztx.service.TypeService;
import com.ztx.mapper.TypeMapper;
import com.ztx.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 1
* @description 针对表【news_type】的数据库操作Service实现
* @createDate 2025-05-16 14:38:28
*/
@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type>
    implements TypeService{

    @Autowired
    private TypeMapper typeMapper;


    @Override
    public Result findAllTypes() {
        List<Type> types = typeMapper.selectList(null);

        return Result.ok(types);
    }

}




