package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

public class Resume implements Serializable {
 
private String presentAddress;

private String major;

private String individualResume;

private String college;

private Integer customerId;

private Timestamp resumeCreateTime;

private String educationBackground;

private Timestamp resumeModifiedTime;

private Integer id;

private String picurl;

private String rName;

private String homeAdd;

public String getPresentAddress(){
 return presentAddress;};
 
 public void setPresentAddress(String presentAddress){
 this.presentAddress=presentAddress;}
 
public String getMajor(){
 return major;};
 
 public void setMajor(String major){
 this.major=major;}
 
public String getIndividualResume(){
 return individualResume;};
 
 public void setIndividualResume(String individualResume){
 this.individualResume=individualResume;}
 
public String getCollege(){
 return college;};
 
 public void setCollege(String college){
 this.college=college;}
 
public Integer getCustomerId(){
 return customerId;};
 
 public void setCustomerId(Integer customerId){
 this.customerId=customerId;}
 
public Timestamp getResumeCreateTime(){
 return resumeCreateTime;};
 
 public void setResumeCreateTime(Timestamp resumeCreateTime){
 this.resumeCreateTime=resumeCreateTime;}
 
public String getEducationBackground(){
 return educationBackground;};
 
 public void setEducationBackground(String educationBackground){
 this.educationBackground=educationBackground;}
 
public Timestamp getResumeModifiedTime(){
 return resumeModifiedTime;};
 
 public void setResumeModifiedTime(Timestamp resumeModifiedTime){
 this.resumeModifiedTime=resumeModifiedTime;}
 
public Integer getId(){
 return id;};
 
 public void setId(Integer id){
 this.id=id;}
 
public String getPicurl(){
 return picurl;};
 
 public void setPicurl(String picurl){
 this.picurl=picurl;}

 public String getrName() {
  return rName;
 }

 public void setrName(String rName) {
  this.rName = rName;
 }

 public String getHomeAdd(){
 return homeAdd;};
 
 public void setHomeAdd(String homeAdd){
 this.homeAdd=homeAdd;}
 
public String toString(){
 return "presentAddress="+presentAddress+","+"major="+major+","+"individualResume="+individualResume+","+"college="+college+","+"customerId="+customerId+","+"resumeCreateTime="+resumeCreateTime+","+"educationBackground="+educationBackground+","+"resumeModifiedTime="+resumeModifiedTime+","+"id="+id+","+"picurl="+picurl+","+"rName="+rName+","+"homeAdd="+homeAdd;};


}