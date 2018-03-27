package com.iotek.service;

import com.iotek.po.Emp;

import java.util.List;

/**
 * Created by Administrator on 2018/3/21.
 */
public interface EmpService {
    boolean addEmp(Emp emp);
    Emp  findEmpByName(Emp emp);
    Emp findEmp(Emp emp);
    List<Emp> checkEmp();
    boolean updateEmp(Emp emp);
    boolean frostEmp(Emp emp);
    List<Emp> checkEmpByPostName(Emp emp);
    Emp checkEmpById(Emp emp);
}
