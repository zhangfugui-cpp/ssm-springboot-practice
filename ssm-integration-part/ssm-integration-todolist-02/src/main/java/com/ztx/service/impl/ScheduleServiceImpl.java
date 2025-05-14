package com.ztx.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ztx.mapper.ScheduleMapper;
import com.ztx.pojo.Schedule;
import com.ztx.service.ScheduleService;
import com.ztx.utils.PageBean;
import com.ztx.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    private ScheduleMapper scheduleMapper;

    @Override
    public R page(int pageSize, int currentPage) {
        //分页
        PageHelper.startPage(currentPage, pageSize);
        //查询
        List<Schedule> scheduleList =scheduleMapper.queryList();
        //分页装配数据
        PageInfo<Schedule> info = new PageInfo<Schedule>(scheduleList);

        //装配PageBean
        PageBean<Schedule> pageBean
                = new PageBean<Schedule>(currentPage,pageSize,info.getTotal(),info.getList());
        R ok = R.ok(pageBean);
        return ok;
    }

    @Override
    public R remove(Integer id) {
        int rows=scheduleMapper.deleteById(id);

        if(rows>0){
            return R.ok(null);
        }

        return R.fail(null);
    }

    @Override
    public R save(Schedule schedule) {
        int rows=scheduleMapper.insert(schedule);

        if(rows>0){
            return R.ok(null);
        }

        return R.fail(null);
    }

    @Override
    public R update(Schedule schedule) {
        if(schedule.getId()==null){
            return R.fail("核心参数为空，不能修改");
        }
        int rows=scheduleMapper.update(schedule);

        if(rows>0){
            return R.ok(null);
        }

        return R.fail(null);
    }
}
