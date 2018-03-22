package com.iotek.service;

import com.iotek.po.Customer;

import java.util.List;

/**
 * Created by xiaohuang on 2018/2/28.
 */

public interface CustomerService {
    boolean   addCustomer(Customer customer);
    Customer queryCustomerByName(Customer customer);
    Customer findCustomerByName(Customer customer);
    Customer queryCustomerState(Customer customer);
}
