package com.ztx.Test;

import com.ztx.mapper.EmployeeMapper;
import com.ztx.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class   mybatisTest {

    @Test
    public void test01() throws IOException {
        //读取外部配置文件
        InputStream ips = Resources.getResourceAsStream("mybatis-config.xml");

        //创建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(ips);

        //根据sqlSessionFactory创建session对象，每个业务创建一个
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //获取mapper代理对象
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> employee = mapper.queryAll();
        System.out.println("employee = " + employee);

        //关闭事务
        sqlSession.close();

    }

    @Test
    public void testInsert() throws IOException {
        //读取外部配置文件
        InputStream ips = Resources.getResourceAsStream("mybatis-config.xml");

        //创建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(ips);

        //根据sqlSessionFactory创建session对象，每个业务创建一个
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //获取mapper代理对象
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = new Employee();
        employee.setEmpName("高嘉千");
        employee.setEmpSalary(10000.9);
        int rows=mapper.insertEmp(employee);
        System.out.println("rows = " + rows);

        //关闭事务
        sqlSession.commit();
        sqlSession.close();

    }
}
