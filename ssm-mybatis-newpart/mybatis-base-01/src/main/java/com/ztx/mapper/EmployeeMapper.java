package com.ztx.mapper;
import com.ztx.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {
    Employee queryById(Integer id);

    int deleteById(Integer id);

    List<Employee> queryAll();

    int insertEmp(Employee employee);
}
