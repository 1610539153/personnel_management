package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class Interview implements Serializable {
 
private Integer interviewSite;

private Integer customerId;

private Integer interviewOrNot;

private Timestamp interviewCreateTime;

private Integer id;

private String interviewTime;

private Timestamp interviewModifiedTime;

public Integer getInterviewSite(){
 return interviewSite;};
 
 public void setInterviewSite(Integer interviewSite){
 this.interviewSite=interviewSite;}
 
public Integer getCustomerId(){
 return customerId;};
 
 public void setCustomerId(Integer customerId){
 this.customerId=customerId;}
 
public Integer getInterviewOrNot(){
 return interviewOrNot;};
 
 public void setInterviewOrNot(Integer interviewOrNot){
 this.interviewOrNot=interviewOrNot;}
 
public Timestamp getInterviewCreateTime(){
 return interviewCreateTime;};
 
 public void setInterviewCreateTime(Timestamp interviewCreateTime){
 this.interviewCreateTime=interviewCreateTime;}
 
public Integer getId(){
 return id;};
 
 public void setId(Integer id){
 this.id=id;}

 public String getInterviewTime() {
  return interviewTime;
 }

 public void setInterviewTime(String interviewTime) {
  this.interviewTime = interviewTime;
 }

 public Timestamp getInterviewModifiedTime(){
 return interviewModifiedTime;};
 
 public void setInterviewModifiedTime(Timestamp interviewModifiedTime){
 this.interviewModifiedTime=interviewModifiedTime;}
 
public String toString(){
 return "interviewSite="+interviewSite+","+"customerId="+customerId+","+"interviewOrNot="+interviewOrNot+","+"interviewCreateTime="+interviewCreateTime+","+"id="+id+","+"interviewTime="+interviewTime+","+"interviewModifiedTime="+interviewModifiedTime;};
}