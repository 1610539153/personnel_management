package com.iotek.dao;

import com.iotek.po.Emp;

import java.util.List;

/**
 * Created by Administrator on 2018/3/21.
 */
public interface EmpDao {
    boolean addEmp(Emp emp);//添加
    Emp  findEmpByName(Emp emp);//登陆
    Emp findEmp(Emp emp);//注册
    List<Emp> checkEmp();//查找
    boolean updateEmp(Emp emp);//修改
    boolean frostEmp(Emp emp);//冻结
    List<Emp> checkEmpByPostName(Emp emp);
    Emp checkEmpById(Emp emp);

}
