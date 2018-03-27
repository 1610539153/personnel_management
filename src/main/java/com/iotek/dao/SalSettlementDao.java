package com.iotek.dao;

import com.iotek.po.SalSettlement;

/**
 * Created by Administrator on 2018/3/26.
 */
public interface SalSettlementDao {
  boolean   additionSalSettlement(SalSettlement salSettlement);
  boolean  salaryRelease();
}
