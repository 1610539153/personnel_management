package com.iotek.dao;

import com.iotek.po.Department;

/**
 * Created by Administrator on 2018/3/20.
 */
public interface DepartmentDao {
    boolean addDepartment(Department department);
    Department queryDepartmentByName(Department department);
}
