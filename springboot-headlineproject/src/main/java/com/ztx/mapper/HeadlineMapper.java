package com.ztx.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ztx.pojo.Headline;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ztx.pojo.vo.PortalVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
* @author 1
* @description 针对表【news_headline】的数据库操作Mapper
* @createDate 2025-05-16 14:38:28
* @Entity com.ztx.pojo.Headline
*/
@Mapper
public interface HeadlineMapper extends BaseMapper<Headline> {
    IPage<Map> selectMyPage(IPage page,@Param("portalVo")PortalVo portalVo);

    Map queryDetailMap(Integer hid);
}




