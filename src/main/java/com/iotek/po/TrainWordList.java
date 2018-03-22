package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class TrainWordList implements Serializable {
 
private Timestamp twlCreateTime;

private Integer empId;

private Integer trainId;

private Integer id;

private Timestamp twlModifiedTime;

public Timestamp getTwlCreateTime(){
 return twlCreateTime;};
 
 public void setTwlCreateTime(Timestamp twlCreateTime){
 this.twlCreateTime=twlCreateTime;}
 
public Integer getEmpId(){
 return empId;};
 
 public void setEmpId(Integer empId){
 this.empId=empId;}
 
public Integer getTrainId(){
 return trainId;};
 
 public void setTrainId(Integer trainId){
 this.trainId=trainId;}
 
public Integer getId(){
 return id;};
 
 public void setId(Integer id){
 this.id=id;}
 
public Timestamp getTwlModifiedTime(){
 return twlModifiedTime;};
 
 public void setTwlModifiedTime(Timestamp twlModifiedTime){
 this.twlModifiedTime=twlModifiedTime;}
 
public String toString(){
 return "twlCreateTime="+twlCreateTime+","+"empId="+empId+","+"trainId="+trainId+","+"id="+id+","+"twlModifiedTime="+twlModifiedTime;};
}