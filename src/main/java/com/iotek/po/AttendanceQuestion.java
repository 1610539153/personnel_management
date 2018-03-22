package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class AttendanceQuestion implements Serializable {
 
private Integer empId;

private Timestamp attenModifiedTime;

private Integer id;

private Timestamp attenCreateTime;

private String question;

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
 
public String getQuestion(){
 return question;};
 
 public void setQuestion(String question){
 this.question=question;}
 
public String toString(){
 return "empId="+empId+","+"attenModifiedTime="+attenModifiedTime+","+"id="+id+","+"attenCreateTime="+attenCreateTime+","+"question="+question;};
}