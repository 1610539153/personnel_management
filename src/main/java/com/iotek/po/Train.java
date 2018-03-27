package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class Train implements Serializable {
 
private String trainContent;

private Timestamp trainCreateTime;

private String trainTime;

private Integer adminId;

private String trainAddress;

private Timestamp trainModifiedTime;


private Integer id;

public String getTrainContent(){
 return trainContent;};
 
 public void setTrainContent(String trainContent){
 this.trainContent=trainContent;}
 
public Timestamp getTrainCreateTime(){
 return trainCreateTime;};
 
 public void setTrainCreateTime(Timestamp trainCreateTime){
 this.trainCreateTime=trainCreateTime;}


public Integer getAdminId(){
 return adminId;};
 
 public void setAdminId(Integer adminId){
 this.adminId=adminId;}
 
public String getTrainAddress(){
 return trainAddress;};

 public String getTrainTime() {
  return trainTime;
 }

 public void setTrainTime(String trainTime) {
  this.trainTime = trainTime;
 }

 public void setTrainAddress(String trainAddress){
 this.trainAddress=trainAddress;}
 
public Timestamp getTrainModifiedTime(){
 return trainModifiedTime;};
 
 public void setTrainModifiedTime(Timestamp trainModifiedTime){
 this.trainModifiedTime=trainModifiedTime;}

 
public Integer getId(){
 return id;};
 
 public void setId(Integer id){
 this.id=id;}

 @Override
 public String toString() {
  return "Train{" +
          "trainContent='" + trainContent + '\'' +
          ", trainCreateTime=" + trainCreateTime +
          ", trainTime='" + trainTime + '\'' +
          ", adminId=" + adminId +
          ", trainAddress='" + trainAddress + '\'' +
          ", trainModifiedTime=" + trainModifiedTime +
          ", id=" + id +
          '}';
 }
}