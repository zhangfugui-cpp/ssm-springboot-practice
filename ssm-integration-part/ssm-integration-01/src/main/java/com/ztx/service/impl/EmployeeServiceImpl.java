package com.ztx.service.impl;

import com.ztx.mapper.EmployeeMapper;
import com.ztx.pojo.Employee;
import com.ztx.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> findAll() {
        List<Employee> employees=employeeMapper.queryList();
        return employees;
    }
}
