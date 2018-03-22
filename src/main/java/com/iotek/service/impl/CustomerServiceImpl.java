package com.iotek.service.impl;

import com.iotek.dao.CustomerDao;
import com.iotek.po.Customer;
import com.iotek.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xiaohuang on 2018/3/7.
 * ----------------The heart withered--------
 */
@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Override
    public boolean addCustomer(Customer customer) {
        if (customer == null) {
            return  false;
        }
        return  customerDao.addCustomer(customer);
    }

    @Override
    public Customer queryCustomerByName(Customer customer) {
        if (customer == null) {
            return   null;
        }
        return customerDao.findCustomerByName(customer);
    }

    @Override
    public Customer findCustomerByName(Customer customer){
        return customer;
    }

    @Override
    public Customer queryCustomerState(Customer customer){
        if(customer==null){
            return null;
        }
        return customerDao.queryCustomerState(customer);
    }


}
