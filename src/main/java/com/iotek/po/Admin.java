package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class Admin implements Serializable {
 
private Timestamp adminCreateTime;

private Integer adminIsNormal;

private String adminPassword;

private String adminName;

private Integer id;

private Timestamp adminModifiedTime;

public Timestamp getAdminCreateTime(){
 return adminCreateTime;};
 
 public void setAdminCreateTime(Timestamp adminCreateTime){
 this.adminCreateTime=adminCreateTime;}
 
public Integer getAdminIsNormal(){
 return adminIsNormal;};
 
 public void setAdminIsNormal(Integer adminIsNormal){
 this.adminIsNormal=adminIsNormal;}
 
public String getAdminPassword(){
 return adminPassword;};
 
 public void setAdminPassword(String adminPassword){
 this.adminPassword=adminPassword;}

 public String getAdminName() {
  return adminName;
 }

 public void setAdminName(String adminName) {
  this.adminName = adminName;
 }

 public Integer getId(){
 return id;};
 
 public void setId(Integer id){
 this.id=id;}
 
public Timestamp getAdminModifiedTime(){
 return adminModifiedTime;};
 
 public void setAdminModifiedTime(Timestamp adminModifiedTime){
 this.adminModifiedTime=adminModifiedTime;}

public String toString(){
 return "adminCreateTime="+adminCreateTime+","+"adminIsNormal="+adminIsNormal+","+"adminPassword="+adminPassword+","+"adminName="+adminName+","+"id="+id+","+"adminModifiedTime="+adminModifiedTime;};
}