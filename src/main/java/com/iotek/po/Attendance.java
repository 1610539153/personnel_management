package com.iotek.po;


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

public class Attendance implements Serializable {
 
private Date clockOutTime;

private Integer empId;

private Date clockInTime;

 private Date clockInLate;


private Timestamp attenModifiedTime;

private Integer id;

private Timestamp attenCreateTime;

 public Date getClockInLate() {
  return clockInLate;
 }

 public void setClockInLate(Date clockInLate) {
  this.clockInLate = clockInLate;
 }

 public Date getClockOutTime() {
  return clockOutTime;
 }

 public void setClockOutTime(Date clockOutTime) {
  this.clockOutTime = clockOutTime;
 }

 public Date getClockInTime() {
  return clockInTime;
 }

 public void setClockInTime(Date clockInTime) {
  this.clockInTime = clockInTime;
 }

 public Integer getEmpId(){
 return empId;};
 
 public void setEmpId(Integer empId){
 this.empId=empId;}
 

 
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

 @Override
 public String toString() {
  return "Attendance{" +
          "clockOutTime=" + clockOutTime +
          ", empId=" + empId +
          ", clockInTime=" + clockInTime +
          ", clockInLate=" + clockInLate +
          ", attenModifiedTime=" + attenModifiedTime +
          ", id=" + id +
          ", attenCreateTime=" + attenCreateTime +
          '}';
 }
}