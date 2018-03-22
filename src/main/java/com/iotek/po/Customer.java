package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class Customer implements Serializable {
 
private Integer customerIsNormal;

private String customerName;

private String customerPassword;

private String customerEmail;

private String customerPhone;

private Integer id;

private Timestamp customerModifiedTime;

private Timestamp customerCreateTime;

public Integer getCustomerIsNormal(){
 return customerIsNormal;};
 
 public void setCustomerIsNormal(Integer customerIsNormal){
 this.customerIsNormal=customerIsNormal;}
 
public String getCustomerName(){
 return customerName;};
 
 public void setCustomerName(String customerName){
 this.customerName=customerName;}
 
public String getCustomerPassword(){
 return customerPassword;};
 
 public void setCustomerPassword(String customerPassword){
 this.customerPassword=customerPassword;}
 
public String getCustomerEmail(){
 return customerEmail;};
 
 public void setCustomerEmail(String customerEmail){
 this.customerEmail=customerEmail;}
 
public String getCustomerPhone(){
 return customerPhone;};
 
 public void setCustomerPhone(String customerPhone){
 this.customerPhone=customerPhone;}
 
public Integer getId(){
 return id;};
 
 public void setId(Integer id){
 this.id=id;}
 
public Timestamp getCustomerModifiedTime(){
 return customerModifiedTime;};
 
 public void setCustomerModifiedTime(Timestamp customerModifiedTime){
 this.customerModifiedTime=customerModifiedTime;}
 
public Timestamp getCustomerCreateTime(){
 return customerCreateTime;};
 
 public void setCustomerCreateTime(Timestamp customerCreateTime){
 this.customerCreateTime=customerCreateTime;}
 
public String toString(){
 return "customerIsNormal="+customerIsNormal+","+"customerName="+customerName+","+"customerPassword="+customerPassword+","+"customerEmail="+customerEmail+","+"customerPhone="+customerPhone+","+"id="+id+","+"customerModifiedTime="+customerModifiedTime+","+"customerCreateTime="+customerCreateTime;};
}