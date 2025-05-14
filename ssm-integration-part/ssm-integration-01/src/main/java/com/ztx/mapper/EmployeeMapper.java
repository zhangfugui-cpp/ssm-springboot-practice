package com.ztx.mapper;

import com.ztx.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface EmployeeMapper {
    List<Employee> queryList();
}
