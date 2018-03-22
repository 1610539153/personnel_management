package com.iotek.service.impl;

import com.iotek.dao.DepartmentDao;
import com.iotek.po.Department;
import com.iotek.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/3/20.
 */
@Service(value = "departmentService")
public class DepartmentServiceImpl  implements DepartmentService{
    @Autowired
    private DepartmentDao departmentDao;
    @Override
    public boolean addDepartment(Department department){
       return departmentDao.addDepartment(department);
    }
    @Override
    public Department queryDepartmentByName(Department department) {
        return departmentDao.queryDepartmentByName(department);
    }
}
