package com.iotek.service.impl;

import com.iotek.dao.EmpDao;
import com.iotek.po.Emp;
import com.iotek.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/3/21.
 */
@Service(value = "empService")
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDao empDao;
    @Override
    public boolean addEmp(Emp emp){
        if(emp==null){
            return false;
        }
        return empDao.addEmp(emp);
    }

    @Override
    public Emp findEmpByName(Emp emp){
        return empDao.findEmpByName(emp);
    }

    @Override
    public Emp findEmp(Emp emp) {
        return empDao.findEmp(emp);
    }

    @Override
    public List<Emp> checkEmp() {
        return empDao.checkEmp();
    }

    @Override
    public boolean updateEmp(Emp emp) {
        return empDao.updateEmp(emp);
    }

    @Override
    public boolean frostEmp(Emp emp) {
        return empDao.frostEmp(emp);
    }

    @Override
    public  List<Emp> checkEmpByPostName(Emp emp) {
        return empDao.checkEmpByPostName(emp);
    }

    @Override
    public Emp checkEmpById(Emp emp) {
        return empDao.checkEmpById(emp);
    }
}
