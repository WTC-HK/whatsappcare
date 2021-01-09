package com.rai.binding;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "CUST_DTLS")
public class Customer {
	@Id
	@GeneratedValue
	@Column (name = "CUST_NUMBER")
	private String customerNumber;
	@Column (name = "CUST_NAME")
	private String customerName;
	@Column (name = "CUST_CITY")
	private String customerCity;
	

}
