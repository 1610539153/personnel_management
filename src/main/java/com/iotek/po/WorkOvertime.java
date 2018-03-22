package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class WorkOvertime implements Serializable {
 
private Integer overtimeCost;

private Integer empId;

private Integer overtimeHours;

private Integer executeOrNot;

private Integer agreeOrNot;

private Integer id;

private Timestamp woModifiedTime;

private Timestamp overtime;

private Timestamp woCreateTime;

public Integer getOvertimeCost(){
 return overtimeCost;};
 
 public void setOvertimeCost(Integer overtimeCost){
 this.overtimeCost=overtimeCost;}
 
public Integer getEmpId(){
 return empId;};
 
 public void setEmpId(Integer empId){
 this.empId=empId;}
 
public Integer getOvertimeHours(){
 return overtimeHours;};
 
 public void setOvertimeHours(Integer overtimeHours){
 this.overtimeHours=overtimeHours;}
 
public Integer getExecuteOrNot(){
 return executeOrNot;};
 
 public void setExecuteOrNot(Integer executeOrNot){
 this.executeOrNot=executeOrNot;}
 
public Integer getAgreeOrNot(){
 return agreeOrNot;};
 
 public void setAgreeOrNot(Integer agreeOrNot){
 this.agreeOrNot=agreeOrNot;}
 
public Integer getId(){
 return id;};
 
 public void setId(Integer id){
 this.id=id;}
 
public Timestamp getWoModifiedTime(){
 return woModifiedTime;};
 
 public void setWoModifiedTime(Timestamp woModifiedTime){
 this.woModifiedTime=woModifiedTime;}
 
public Timestamp getOvertime(){
 return overtime;};
 
 public void setOvertime(Timestamp overtime){
 this.overtime=overtime;}
 
public Timestamp getWoCreateTime(){
 return woCreateTime;};
 
 public void setWoCreateTime(Timestamp woCreateTime){
 this.woCreateTime=woCreateTime;}
 
public String toString(){
 return "overtimeCost="+overtimeCost+","+"empId="+empId+","+"overtimeHours="+overtimeHours+","+"executeOrNot="+executeOrNot+","+"agreeOrNot="+agreeOrNot+","+"id="+id+","+"woModifiedTime="+woModifiedTime+","+"overtime="+overtime+","+"woCreateTime="+woCreateTime;};
}