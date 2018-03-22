package com.iotek.dao;

import com.iotek.po.Customer;

import java.util.List;

/**
 * Created by xiaohuang on 2018/2/28.
 */
public interface CustomerDao {
    boolean addCustomer(Customer customer);
    Customer findCustomerByName(Customer customer);
    Customer queryCustomerState(Customer customer);
}
