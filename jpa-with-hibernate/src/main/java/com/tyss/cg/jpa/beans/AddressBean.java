package com.tyss.cg.jpa.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@SuppressWarnings("serial")
@Entity
@Table(name = "address_info")
@Data
public class AddressBean implements Serializable {
	@Id
	@Column
	private Integer addressId;
	@Column
	private String addressType;
	@Column
	private String addressLine1;
	@Column
	private String addressLine2;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private String country;
	@Column
	private Integer zipCode;
	
	@Exclude
	@ManyToOne(cascade = CascadeType.ALL)	//since a person can have multiple addresses
	@JoinColumn(name = "empid")
	private EmployeeInfoBean employeeInfoBean;
}
