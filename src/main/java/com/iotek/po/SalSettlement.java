package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class SalSettlement implements Serializable {
 
private Integer basicSalary;

private Integer bonusPenaltyMoney;

private Integer empId;

private Integer socialSecurity;

private Integer achievementBonus;

private Integer realWages;

private Integer theoryOfWages;

private Integer id;

private Integer overtimeExpenses;

private Timestamp salModifiedTime;

private Timestamp salCreateTime;

private Integer whetherIssued;

public Integer getBasicSalary(){
 return basicSalary;};
 
 public void setBasicSalary(Integer basicSalary){
 this.basicSalary=basicSalary;}
 
public Integer getBonusPenaltyMoney(){
 return bonusPenaltyMoney;};
 
 public void setBonusPenaltyMoney(Integer bonusPenaltyMoney){
 this.bonusPenaltyMoney=bonusPenaltyMoney;}
 
public Integer getEmpId(){
 return empId;};
 
 public void setEmpId(Integer empId){
 this.empId=empId;}
 
public Integer getSocialSecurity(){
 return socialSecurity;};
 
 public void setSocialSecurity(Integer socialSecurity){
 this.socialSecurity=socialSecurity;}
 
public Integer getAchievementBonus(){
 return achievementBonus;};
 
 public void setAchievementBonus(Integer achievementBonus){
 this.achievementBonus=achievementBonus;}
 
public Integer getRealWages(){
 return realWages;};
 
 public void setRealWages(Integer realWages){
 this.realWages=realWages;}
 
public Integer getTheoryOfWages(){
 return theoryOfWages;};
 
 public void setTheoryOfWages(Integer theoryOfWages){
 this.theoryOfWages=theoryOfWages;}
 
public Integer getId(){
 return id;};
 
 public void setId(Integer id){
 this.id=id;}
 
public Integer getOvertimeExpenses(){
 return overtimeExpenses;};
 
 public void setOvertimeExpenses(Integer overtimeExpenses){
 this.overtimeExpenses=overtimeExpenses;}
 
public Timestamp getSalModifiedTime(){
 return salModifiedTime;};
 
 public void setSalModifiedTime(Timestamp salModifiedTime){
 this.salModifiedTime=salModifiedTime;}
 
public Timestamp getSalCreateTime(){
 return salCreateTime;};
 
 public void setSalCreateTime(Timestamp salCreateTime){
 this.salCreateTime=salCreateTime;}
 
public Integer getWhetherIssued(){
 return whetherIssued;};
 
 public void setWhetherIssued(Integer whetherIssued){
 this.whetherIssued=whetherIssued;}
 
public String toString(){
 return "basicSalary="+basicSalary+","+"bonusPenaltyMoney="+bonusPenaltyMoney+","+"empId="+empId+","+"socialSecurity="+socialSecurity+","+"achievementBonus="+achievementBonus+","+"realWages="+realWages+","+"theoryOfWages="+theoryOfWages+","+"id="+id+","+"overtimeExpenses="+overtimeExpenses+","+"salModifiedTime="+salModifiedTime+","+"salCreateTime="+salCreateTime+","+"whetherIssued="+whetherIssued;};
}