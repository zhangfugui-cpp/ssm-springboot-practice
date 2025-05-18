package com.ztx.service;

import com.ztx.pojo.Headline;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ztx.pojo.vo.PortalVo;
import com.ztx.utils.Result;
import org.springframework.stereotype.Service;

/**
* @author 1
* @description 针对表【news_headline】的数据库操作Service
* @createDate 2025-05-16 14:38:28
*/
@Service
public interface HeadlineService extends IService<Headline> {

    Result findNewsPage(PortalVo portalVo);

    Result showHeadlineDetail(Integer hid);


    Result publish(Headline headline, String token);

    Result updateData(Headline headline);
}
