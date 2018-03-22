package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class Attendance implements Serializable {
 
private Timestamp clockOutTime;

private Integer empId;

private Timestamp clockInTime;

private Timestamp attenModifiedTime;

private Integer id;

private Timestamp attenCreateTime;

public Timestamp getClockOutTime(){
 return clockOutTime;};
 
 public void setClockOutTime(Timestamp clockOutTime){
 this.clockOutTime=clockOutTime;}
 
public Integer getEmpId(){
 return empId;};
 
 public void setEmpId(Integer empId){
 this.empId=empId;}
 
public Timestamp getClockInTime(){
 return clockInTime;};
 
 public void setClockInTime(Timestamp clockInTime){
 this.clockInTime=clockInTime;}
 
public Timestamp getAttenModifiedTime(){
 return attenModifiedTime;};
 
 public void setAttenModifiedTime(Timestamp attenModifiedTime){
 this.attenModifiedTime=attenModifiedTime;}
 
public Integer getId(){
 return id;};
 
 public void setId(Integer id){
 this.id=id;}
 
public Timestamp getAttenCreateTime(){
 return attenCreateTime;};
 
 public void setAttenCreateTime(Timestamp attenCreateTime){
 this.attenCreateTime=attenCreateTime;}
 
public String toString(){
 return "clockOutTime="+clockOutTime+","+"empId="+empId+","+"clockInTime="+clockInTime+","+"attenModifiedTime="+attenModifiedTime+","+"id="+id+","+"attenCreateTime="+attenCreateTime;};
}