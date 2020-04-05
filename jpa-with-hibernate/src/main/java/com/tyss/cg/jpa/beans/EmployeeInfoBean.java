package com.tyss.cg.jpa.beans;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@SuppressWarnings("serial")
@Entity			//to tell db that this is bean class containing all the attributes.
@Data			//to get all the getter and setters
@Table(name = "employee_info")
public class EmployeeInfoBean implements Serializable{
	@Id			//whichever attr we want as primary key we mention this @ above the attr.
	//@GeneratedValue(strategy = GenerationType.AUTO)			//it will increment on its own for this value.
	@Column(name = "emp_id")
	private int empid;		//primary key here
	@Column					//to specify this as column
	private String name;
	@Column(name = "mail_id", unique = true)
	private String mailId;
	@Column
	@ToString.Exclude			//or exclude if not working
	private String password;
	@Column
	private LocalDate birthDate;
	@Column
	private LocalDate joining;
	@Column(unique = true, name = "mobile_no")
	private Long mobileNo;
	@Column
	private double salary;
	
	@OneToOne(mappedBy = "employeeInfoBean", cascade = CascadeType.ALL)	//it has already been mapped.
	private PassportBean passportBean;
	
	@OneToMany(mappedBy = "employeeInfoBean", cascade = CascadeType.ALL)
	private List<AddressBean> addressBeans;    //as multipe addresses so list

	@ManyToMany(mappedBy = "employeeInfoBeanList", cascade = CascadeType.ALL)
	private List<ProjectBean> projectBeans;

}
//@nullable for not nul constraint.
