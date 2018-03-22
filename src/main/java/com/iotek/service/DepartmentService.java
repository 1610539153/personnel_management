package com.iotek.service;

import com.iotek.po.Department;

/**
 * Created by Administrator on 2018/3/20.
 */
public interface DepartmentService {
    boolean addDepartment(Department department);
    Department queryDepartmentByName(Department department);
}
