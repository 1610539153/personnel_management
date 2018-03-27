package com.iotek.service;

import com.iotek.po.SalSettlement;

/**
 * Created by Administrator on 2018/3/26.
 */
public interface SalSettlementService {
    boolean   additionSalSettlement(SalSettlement salSettlement);
    boolean   salaryRelease();
}
