package com.iotek.service.impl;

import com.iotek.dao.AdminDao;
import com.iotek.po.Admin;
import com.iotek.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/3/20.
 */
@Service(value = "adminService")
public class AdminServiceImpl  implements AdminService{
    @Autowired
   private AdminDao adminDao;
    @Override
    public Admin findAdminByName(Admin admin) {
        return adminDao.findAdminByName(admin);
    }
}
