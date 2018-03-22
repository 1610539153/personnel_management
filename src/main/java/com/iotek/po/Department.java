package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class Department implements Serializable {
 
private Timestamp departmentModifiedTime;

private Timestamp departmentCreateTime;

private Integer id;

private String dName;

public Timestamp getDepartmentModifiedTime(){
 return departmentModifiedTime;};
 
 public void setDepartmentModifiedTime(Timestamp departmentModifiedTime){
 this.departmentModifiedTime=departmentModifiedTime;}
 
public Timestamp getDepartmentCreateTime(){
 return departmentCreateTime;};
 
 public void setDepartmentCreateTime(Timestamp departmentCreateTime){
 this.departmentCreateTime=departmentCreateTime;}
 
public Integer getId(){
 return id;};
 
 public void setId(Integer id){
 this.id=id;}

 public String getdName() {
  return dName;
 }

 public void setdName(String dName) {
  this.dName = dName;
 }

 public String toString(){
 return "departmentModifiedTime="+departmentModifiedTime+","+"departmentCreateTime="+departmentCreateTime+","+"id="+id+","+"dName="+dName;};
}