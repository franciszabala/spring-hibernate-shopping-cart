package com.franciszabala.model;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	
	private String productDesc;
	
	@Column(nullable = false)
	private String productName;
	
	private BigInteger productPrice;
	
	public String getProductDesc() {
		return productDesc;
	}
	
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public BigInteger getProductPrice() {
		return productPrice;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setProductPrice(BigInteger productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName="
				+ productName + ", productDesc=" + productDesc
				+ ", productPrice=" + productPrice + "]";
	}

}
