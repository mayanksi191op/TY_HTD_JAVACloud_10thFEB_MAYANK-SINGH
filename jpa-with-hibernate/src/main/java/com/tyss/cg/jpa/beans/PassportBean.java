package com.tyss.cg.jpa.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Entity
@Table(name = "passport_info")
@Data
@SuppressWarnings("serial")
public class PassportBean implements Serializable {
	@Id
	@Column
	private String passportId;
	@Column
	private String country;
	@Exclude
	@OneToOne 		//a passport can belong to only one person so one to one.
	private EmployeeInfoBean employeeInfoBean;
}
