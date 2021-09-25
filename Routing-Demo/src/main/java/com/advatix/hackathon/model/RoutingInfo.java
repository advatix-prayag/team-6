package com.advatix.hackathon.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity(name = "tbl_route_detail")
public class RoutingInfo {
	
@Column
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int Sr_No;
@Column
private int ZipA;
@Column
private int ordernumber;
@Column
private int ZipB;
@Column
private int Distance;
public int getSr_No() {
	return Sr_No;
}

public void setSr_No(int sr_No) {
	Sr_No = sr_No;
}

public int getZipA() {
	return ZipA;
}

public void setZipA(int zipA) {
	ZipA = zipA;
}

public int getZipB() {
	return ZipB;
}

public void setZipB(int zipB) {
	ZipB = zipB;
}

public int getDistance() {
	return Distance;
}

public void setDistance(int distance) {
	Distance = distance;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

@Column
private String address;

 

 public RoutingInfo(int Sr_no, int orderNumber, int ZipA, int ZipB, int distance ,String address) {
super();
this.Sr_No = Sr_no;
this.ordernumber = orderNumber;
this.ZipA = ZipA;
this.ZipA = ZipB;
this.address = address;
}

 public RoutingInfo() {
super();
// TODO Auto-generated constructor stub
}

}