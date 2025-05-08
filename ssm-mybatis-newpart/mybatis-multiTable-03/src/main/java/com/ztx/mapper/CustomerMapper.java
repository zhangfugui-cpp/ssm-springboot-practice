package com.ztx.mapper;

import com.ztx.pojo.Customer;

import java.util.List;

public interface CustomerMapper {
    List<Customer> getAllCustomers();

    List<Customer> getAllCustomersWithOrders();
}
