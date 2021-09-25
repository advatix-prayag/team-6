package com.advatix.hackathon.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity(name = "tbl_inventory_details")
public class inventoryinfo {
	
@Column
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int Sr_No;


@Column
private int Quantity;

public int getSr_No() {
	return Sr_No;
}

public void setSr_No(int sr_No) {
	Sr_No = sr_No;
}

public int getQuantity() {
	return Quantity;
}

public void setQuantity(int quantity) {
	Quantity = quantity;
}

public String getProduct_Location() {
	return Product_Location;
}

public void setProduct_Location(String product_Location) {
	Product_Location = product_Location;
}

public String getProduct_Unit_Id() {
	return Product_Unit_Id;
}

public void setProduct_Unit_Id(String product_Unit_Id) {
	Product_Unit_Id = product_Unit_Id;
}

public String getFC() {
	return FC;
}

public void setFC(String fC) {
	FC = fC;
}

@Column
private String Product_Location;

@Column
private String Product_Unit_Id;
@Column
private String FC;

 

 public inventoryinfo(int Sr_no, int Quentity, String FC ,String Product_Location,String Product_Unit_Id) {
super();
this.Sr_No = Sr_no;
this.Product_Unit_Id = Product_Unit_Id;
this.Quantity = Quentity;
this.FC = FC;
this.Product_Location = Product_Location;
}

 public inventoryinfo() {
super();
// TODO Auto-generated constructor stub
}

}