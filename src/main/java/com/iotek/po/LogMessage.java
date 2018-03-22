package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class LogMessage implements Serializable {
 
private String messageTupe;

private Timestamp leCreateTime;

private Integer id;

private String content;

private Timestamp leModifiedTime;

public String getMessageTupe(){
 return messageTupe;};
 
 public void setMessageTupe(String messageTupe){
 this.messageTupe=messageTupe;}
 
public Timestamp getLeCreateTime(){
 return leCreateTime;};
 
 public void setLeCreateTime(Timestamp leCreateTime){
 this.leCreateTime=leCreateTime;}
 
public Integer getId(){
 return id;};
 
 public void setId(Integer id){
 this.id=id;}
 
public String getContent(){
 return content;};
 
 public void setContent(String content){
 this.content=content;}
 
public Timestamp getLeModifiedTime(){
 return leModifiedTime;};
 
 public void setLeModifiedTime(Timestamp leModifiedTime){
 this.leModifiedTime=leModifiedTime;}
 
public String toString(){
 return "messageTupe="+messageTupe+","+"leCreateTime="+leCreateTime+","+"id="+id+","+"content="+content+","+"leModifiedTime="+leModifiedTime;};
}