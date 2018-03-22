package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class Post implements Serializable {
 
private String postName;

private Integer departmentId;

private Timestamp postCreateTime;

private Integer adminId;

private Integer id;

private Integer postIsNormal;

private Timestamp postModifiedTime;

public String getPostName(){
 return postName;};
 
 public void setPostName(String postName){
 this.postName=postName;}
 
public Integer getDepartmentId(){
 return departmentId;};
 
 public void setDepartmentId(Integer departmentId){
 this.departmentId=departmentId;}
 
public Timestamp getPostCreateTime(){
 return postCreateTime;};
 
 public void setPostCreateTime(Timestamp postCreateTime){
 this.postCreateTime=postCreateTime;}
 
public Integer getAdminId(){
 return adminId;};
 
 public void setAdminId(Integer adminId){
 this.adminId=adminId;}
 
public Integer getId(){
 return id;};
 
 public void setId(Integer id){
 this.id=id;}
 
public Integer getPostIsNormal(){
 return postIsNormal;};
 
 public void setPostIsNormal(Integer postIsNormal){
 this.postIsNormal=postIsNormal;}
 
public Timestamp getPostModifiedTime(){
 return postModifiedTime;};
 
 public void setPostModifiedTime(Timestamp postModifiedTime){
 this.postModifiedTime=postModifiedTime;}
 
public String toString(){
 return "postName="+postName+","+"departmentId="+departmentId+","+"postCreateTime="+postCreateTime+","+"adminId="+adminId+","+"id="+id+","+"postIsNormal="+postIsNormal+","+"postModifiedTime="+postModifiedTime;};
}