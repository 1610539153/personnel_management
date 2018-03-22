package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class Train implements Serializable {
 
private String trainContent;

private Timestamp trainCreateTime;

private Timestamp trainTime;

private Integer adminId;

private String trainAddress;

private Timestamp trainModifiedTime;

private Timestamp trainLongTime;

private Integer id;

public String getTrainContent(){
 return trainContent;};
 
 public void setTrainContent(String trainContent){
 this.trainContent=trainContent;}
 
public Timestamp getTrainCreateTime(){
 return trainCreateTime;};
 
 public void setTrainCreateTime(Timestamp trainCreateTime){
 this.trainCreateTime=trainCreateTime;}
 
public Timestamp getTrainTime(){
 return trainTime;};
 
 public void setTrainTime(Timestamp trainTime){
 this.trainTime=trainTime;}
 
public Integer getAdminId(){
 return adminId;};
 
 public void setAdminId(Integer adminId){
 this.adminId=adminId;}
 
public String getTrainAddress(){
 return trainAddress;};
 
 public void setTrainAddress(String trainAddress){
 this.trainAddress=trainAddress;}
 
public Timestamp getTrainModifiedTime(){
 return trainModifiedTime;};
 
 public void setTrainModifiedTime(Timestamp trainModifiedTime){
 this.trainModifiedTime=trainModifiedTime;}
 
public Timestamp getTrainLongTime(){
 return trainLongTime;};
 
 public void setTrainLongTime(Timestamp trainLongTime){
 this.trainLongTime=trainLongTime;}
 
public Integer getId(){
 return id;};
 
 public void setId(Integer id){
 this.id=id;}
 
public String toString(){
 return "trainContent="+trainContent+","+"trainCreateTime="+trainCreateTime+","+"trainTime="+trainTime+","+"adminId="+adminId+","+"trainAddress="+trainAddress+","+"trainModifiedTime="+trainModifiedTime+","+"trainLongTime="+trainLongTime+","+"id="+id;};
}