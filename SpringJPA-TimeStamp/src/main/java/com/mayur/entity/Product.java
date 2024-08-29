package com.mayur.entity;

import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="productmaster")
public class Product {
	
	@Id
	@Column(name="Product_ID")
	
	private Integer pid;
	
	@Column(name="Product_Name")
	private String pname;
	
	@Column(name="Product_Price")
	private Double price;
	
	@CreationTimestamp
	@Column(name="Created_Date",updatable = false)
	private LocalDateTime createdDate;
	
	@UpdateTimestamp
	@Column(name="Updated_Date",insertable = false)
	private LocalDateTime updatedDate;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Product(Integer pid, String pname, Double price, LocalDateTime createdDate, LocalDateTime updatedDate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public Product() {
		super();
	} 
	
	
}
