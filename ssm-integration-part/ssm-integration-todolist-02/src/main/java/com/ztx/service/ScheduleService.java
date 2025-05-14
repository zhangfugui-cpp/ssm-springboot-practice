package com.ztx.service;

import com.ztx.pojo.Schedule;
import com.ztx.utils.R;

public interface ScheduleService {
    R page(int pageSize, int currentPage);

    R remove(Integer id);

    R save(Schedule schedule);

    R update(Schedule schedule);
}
