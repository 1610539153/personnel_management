package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class Leave implements Serializable {
 
private Timestamp leaveModifiedTime;

private Timestamp leaveTime;

private Integer empId;

private Integer numberOfDays;

private Integer executeOrNot;

private Timestamp leaveCreateTime;

private Integer agreeOrNot;

private Integer id;

public Timestamp getLeaveModifiedTime(){
 return leaveModifiedTime;};
 
 public void setLeaveModifiedTime(Timestamp leaveModifiedTime){
 this.leaveModifiedTime=leaveModifiedTime;}
 
public Timestamp getLeaveTime(){
 return leaveTime;};
 
 public void setLeaveTime(Timestamp leaveTime){
 this.leaveTime=leaveTime;}
 
public Integer getEmpId(){
 return empId;};
 
 public void setEmpId(Integer empId){
 this.empId=empId;}
 
public Integer getNumberOfDays(){
 return numberOfDays;};
 
 public void setNumberOfDays(Integer numberOfDays){
 this.numberOfDays=numberOfDays;}
 
public Integer getExecuteOrNot(){
 return executeOrNot;};
 
 public void setExecuteOrNot(Integer executeOrNot){
 this.executeOrNot=executeOrNot;}
 
public Timestamp getLeaveCreateTime(){
 return leaveCreateTime;};
 
 public void setLeaveCreateTime(Timestamp leaveCreateTime){
 this.leaveCreateTime=leaveCreateTime;}
 
public Integer getAgreeOrNot(){
 return agreeOrNot;};
 
 public void setAgreeOrNot(Integer agreeOrNot){
 this.agreeOrNot=agreeOrNot;}
 
public Integer getId(){
 return id;};
 
 public void setId(Integer id){
 this.id=id;}
 
public String toString(){
 return "leaveModifiedTime="+leaveModifiedTime+","+"leaveTime="+leaveTime+","+"empId="+empId+","+"numberOfDays="+numberOfDays+","+"executeOrNot="+executeOrNot+","+"leaveCreateTime="+leaveCreateTime+","+"agreeOrNot="+agreeOrNot+","+"id="+id;};
}