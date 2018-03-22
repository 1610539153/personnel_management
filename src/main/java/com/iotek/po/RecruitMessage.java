package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class RecruitMessage implements Serializable {
 
private Integer postId;

private Integer recruitNumber;

private Integer recruitSalary;

private Integer adminId;

private Integer id;

private Integer recruitIsNormal;

private Timestamp recruitCreateTime;

private Timestamp recruitModifiedTime;

 public Integer getPostId(){
 return postId;};

 public void setPostId(Integer postId){
 this.postId=postId;}

 public Integer getRecruitNumber() {
  return recruitNumber;
 }
 public void setRecruitNumber(Integer recruitNumber) {
  this.recruitNumber = recruitNumber;
 }
 public Integer getRecruitSalary(){
 return recruitSalary;};

 public void setRecruitSalary(Integer recruitSalary){
 this.recruitSalary=recruitSalary;}

public Integer getAdminId(){
 return adminId;};
 
 public void setAdminId(Integer adminId){
 this.adminId=adminId;}
 
public Integer getId(){
 return id;};
 
 public void setId(Integer id){
 this.id=id;}
 
public Integer getRecruitIsNormal(){
 return recruitIsNormal;};
 
 public void setRecruitIsNormal(Integer recruitIsNormal){
 this.recruitIsNormal=recruitIsNormal;}
 
public Timestamp getRecruitCreateTime(){
 return recruitCreateTime;};
 
 public void setRecruitCreateTime(Timestamp recruitCreateTime){
 this.recruitCreateTime=recruitCreateTime;}
 
public Timestamp getRecruitModifiedTime(){
 return recruitModifiedTime;};
 
 public void setRecruitModifiedTime(Timestamp recruitModifiedTime){
 this.recruitModifiedTime=recruitModifiedTime;}

 @Override
 public String toString() {
  return "RecruitMessage{" +
          "postId=" + postId +
          ", recruitNumber=" + recruitNumber +
          ", recruitSalary=" + recruitSalary +
          ", adminId=" + adminId +
          ", id=" + id +
          ", recruitIsNormal=" + recruitIsNormal +
          ", recruitCreateTime=" + recruitCreateTime +
          ", recruitModifiedTime=" + recruitModifiedTime +
          '}';
 }
}