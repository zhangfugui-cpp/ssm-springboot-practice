package com.ztx.MybatisTest;

import com.ztx.mapper.CustomerMapper;
import com.ztx.mapper.OrderMapper;
import com.ztx.pojo.Customer;
import com.ztx.pojo.Order;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class OrderTest {
    private SqlSession session;

    @BeforeEach
    public void init() throws IOException, IOException {
        session = new SqlSessionFactoryBuilder()
                .build(
                        Resources.getResourceAsStream("mybatis-config.xml"))
                .openSession();
    }

    @Test
    public void test01() {
        OrderMapper mapper = session.getMapper(OrderMapper.class);
        List<Order> ordersByCustomerId = mapper.getOrdersByCustomerId(1);
        for (Order order : ordersByCustomerId) {
            System.out.println(order);
        }
    }

    @Test
    public void test02() {
        CustomerMapper mapper = session.getMapper(CustomerMapper.class);
        List<Customer> allCustomers = mapper.getAllCustomers();
        for (Customer customer : allCustomers) {
            System.out.println(customer);
        }
    }

    @Test
    public void test03() {
        CustomerMapper mapper = session.getMapper(CustomerMapper.class);
        List<Customer> allCustomersWithOrders = mapper.getAllCustomersWithOrders();
        for (Customer customer : allCustomersWithOrders) {
            System.out.println(customer);
        }
    }

    @AfterEach
    public void clear() {
        session.commit();
        session.close();
    }
}
