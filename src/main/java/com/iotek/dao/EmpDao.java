package com.iotek.dao;

import com.iotek.po.Emp;

/**
 * Created by Administrator on 2018/3/21.
 */
public interface EmpDao {
    boolean addEmp(Emp emp);
    Emp  findEmpByName(Emp emp);
    Emp findEmp(Emp emp);
}
