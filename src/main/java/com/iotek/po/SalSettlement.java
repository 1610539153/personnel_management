package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class SalSettlement implements Serializable {
 
private Integer basicSalary;

private Integer bonusPenaltyMoney;

private Integer empId;

private Integer realWages;

private Integer theoryOfWages;

private Integer id;

private Timestamp salModifiedTime;

private Timestamp salCreateTime;

private Integer whetherIssued;

private Integer workDay;

 public Integer getWorkDay() {
  return workDay;
 }

 public void setWorkDay(Integer workDay) {
  this.workDay = workDay;
 }

 public Integer getBasicSalary() {
  return basicSalary;
 }

 public void setBasicSalary(Integer basicSalary) {
  this.basicSalary = basicSalary;
 }

 public Integer getBonusPenaltyMoney() {
  return bonusPenaltyMoney;
 }

 public void setBonusPenaltyMoney(Integer bonusPenaltyMoney) {
  this.bonusPenaltyMoney = bonusPenaltyMoney;
 }

 public Integer getEmpId() {
  return empId;
 }

 public void setEmpId(Integer empId) {
  this.empId = empId;
 }

 public Integer getRealWages() {
  return realWages;
 }

 public void setRealWages(Integer realWages) {
  this.realWages = realWages;
 }

 public Integer getTheoryOfWages() {
  return theoryOfWages;
 }

 public void setTheoryOfWages(Integer theoryOfWages) {
  this.theoryOfWages = theoryOfWages;
 }

 public Integer getId() {
  return id;
 }

 public void setId(Integer id) {
  this.id = id;
 }

 public Timestamp getSalModifiedTime() {
  return salModifiedTime;
 }

 public void setSalModifiedTime(Timestamp salModifiedTime) {
  this.salModifiedTime = salModifiedTime;
 }

 public Timestamp getSalCreateTime() {
  return salCreateTime;
 }

 public void setSalCreateTime(Timestamp salCreateTime) {
  this.salCreateTime = salCreateTime;
 }

 public Integer getWhetherIssued() {
  return whetherIssued;
 }

 public void setWhetherIssued(Integer whetherIssued) {
  this.whetherIssued = whetherIssued;
 }

 @Override
 public String toString() {
  return "SalSettlement{" +
          "basicSalary=" + basicSalary +
          ", bonusPenaltyMoney=" + bonusPenaltyMoney +
          ", empId=" + empId +
          ", realWages=" + realWages +
          ", theoryOfWages=" + theoryOfWages +
          ", id=" + id +
          ", salModifiedTime=" + salModifiedTime +
          ", salCreateTime=" + salCreateTime +
          ", whetherIssued=" + whetherIssued +
          ", workDay=" + workDay +
          '}';
 }

}