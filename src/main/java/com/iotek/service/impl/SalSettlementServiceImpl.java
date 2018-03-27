package com.iotek.service.impl;

import com.iotek.dao.SalSettlementDao;
import com.iotek.po.SalSettlement;
import com.iotek.service.SalSettlementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/3/26.
 */
@Service(value = "salSettlementService")
public class SalSettlementServiceImpl implements SalSettlementService {
    @Autowired
    private SalSettlementDao salSettlementDao;
    @Override
    public boolean additionSalSettlement(SalSettlement salSettlement){
        return salSettlementDao.additionSalSettlement(salSettlement);
    }

    @Override
    public boolean salaryRelease() {
        return salSettlementDao.salaryRelease();
    }
}
