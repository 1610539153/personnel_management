package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class BonusPenalty implements Serializable {
 
private Integer bonusPenaltyMoney;

private Integer empId;

private Timestamp bonusPenaltyTime;

private String bonusPenaltyReason;

private Integer id;

private Integer bpIsExecute;

public Integer getBonusPenaltyMoney(){
 return bonusPenaltyMoney;};
 
 public void setBonusPenaltyMoney(Integer bonusPenaltyMoney){
 this.bonusPenaltyMoney=bonusPenaltyMoney;}
 
public Integer getEmpId(){
 return empId;};
 
 public void setEmpId(Integer empId){
 this.empId=empId;}
 
public Timestamp getBonusPenaltyTime(){
 return bonusPenaltyTime;};
 
 public void setBonusPenaltyTime(Timestamp bonusPenaltyTime){
 this.bonusPenaltyTime=bonusPenaltyTime;}
 
public String getBonusPenaltyReason(){
 return bonusPenaltyReason;};
 
 public void setBonusPenaltyReason(String bonusPenaltyReason){
 this.bonusPenaltyReason=bonusPenaltyReason;}
 
public Integer getId(){
 return id;};
 
 public void setId(Integer id){
 this.id=id;}
 
public Integer getBpIsExecute(){
 return bpIsExecute;};
 
 public void setBpIsExecute(Integer bpIsExecute){
 this.bpIsExecute=bpIsExecute;}
 
public String toString(){
 return "bonusPenaltyMoney="+bonusPenaltyMoney+","+"empId="+empId+","+"bonusPenaltyTime="+bonusPenaltyTime+","+"bonusPenaltyReason="+bonusPenaltyReason+","+"id="+id+","+"bpIsExecute="+bpIsExecute;};
}