package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class ApplyForMessage implements Serializable {
 
private Integer postId;

private Integer applyIsSee;

private Timestamp applyModifiedTime;

private Integer resumeId;

private Integer id;

private Timestamp applyCreateTime;

private Integer applyIsNormal;

public Integer getPostId(){
 return postId;};
 
 public void setPostId(Integer postId){
 this.postId=postId;}
 
public Integer getApplyIsSee(){
 return applyIsSee;};
 
 public void setApplyIsSee(Integer applyIsSee){
 this.applyIsSee=applyIsSee;}
 
public Timestamp getApplyModifiedTime(){
 return applyModifiedTime;};
 
 public void setApplyModifiedTime(Timestamp applyModifiedTime){
 this.applyModifiedTime=applyModifiedTime;}
 
public Integer getResumeId(){
 return resumeId;};
 
 public void setResumeId(Integer resumeId){
 this.resumeId=resumeId;}
 
public Integer getId(){
 return id;};
 
 public void setId(Integer id){
 this.id=id;}
 
public Timestamp getApplyCreateTime(){
 return applyCreateTime;};
 
 public void setApplyCreateTime(Timestamp applyCreateTime){
 this.applyCreateTime=applyCreateTime;}
 
public Integer getApplyIsNormal(){
 return applyIsNormal;};
 
 public void setApplyIsNormal(Integer applyIsNormal){
 this.applyIsNormal=applyIsNormal;}
 
public String toString(){
 return "postId="+postId+","+"applyIsSee="+applyIsSee+","+"applyModifiedTime="+applyModifiedTime+","+"resumeId="+resumeId+","+"id="+id+","+"applyCreateTime="+applyCreateTime+","+"applyIsNormal="+applyIsNormal;};
}