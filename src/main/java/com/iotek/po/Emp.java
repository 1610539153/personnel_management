package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class Emp implements Serializable {
 
private String empName;

private String empPassword;

private Timestamp entryTime;

private Timestamp empModifiedTime;

private Integer state;

private Integer id;

private Timestamp empCreateTime;

private Integer haveYouTrained;

private Integer baseSalary;
private  String dName;
 private String  postName;

 public String getdName() {
  return dName;
 }

 public void setdName(String dName) {
  this.dName = dName;
 }

 public String getPostName() {
  return postName;
 }

 public void setPostName(String postName) {
  this.postName = postName;
 }

 public String getEmpName() {
  return empName;
 }

 public void setEmpName(String empName) {
  this.empName = empName;
 }

 public String getEmpPassword() {
  return empPassword;
 }

 public void setEmpPassword(String empPassword) {
  this.empPassword = empPassword;
 }

 public Timestamp getEntryTime(){
 return entryTime;};
 
 public void setEntryTime(Timestamp entryTime){
 this.entryTime=entryTime;}
 
public Timestamp getEmpModifiedTime(){
 return empModifiedTime;};
 
 public void setEmpModifiedTime(Timestamp empModifiedTime){
 this.empModifiedTime=empModifiedTime;}
 
public Integer getState(){
 return state;};
 
 public void setState(Integer state){
 this.state=state;}
 
public Integer getId(){
 return id;};
 
 public void setId(Integer id){
 this.id=id;}
 
public Timestamp getEmpCreateTime(){
 return empCreateTime;};
 
 public void setEmpCreateTime(Timestamp empCreateTime){
 this.empCreateTime=empCreateTime;}
 
public Integer getHaveYouTrained(){
 return haveYouTrained;};
 
 public void setHaveYouTrained(Integer haveYouTrained){
 this.haveYouTrained=haveYouTrained;}
 
public Integer getBaseSalary(){
 return baseSalary;};
 
 public void setBaseSalary(Integer baseSalary){
 this.baseSalary=baseSalary;}
 
public String toString(){
 return "empName="+empName+","+"empPassword="+empPassword+","+"entryTime="+entryTime+","+"empModifiedTime="+empModifiedTime+","+"state="+state+","+"id="+id+","+"empCreateTime="+empCreateTime+","+"haveYouTrained="+haveYouTrained+","+"baseSalary="+baseSalary;};
}