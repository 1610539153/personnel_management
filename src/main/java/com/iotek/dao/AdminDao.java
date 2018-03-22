package com.iotek.dao;

import com.iotek.po.Admin;

/**
 * Created by Administrator on 2018/3/20.
 */
public interface AdminDao {
    Admin findAdminByName(Admin admin);
}
