package com.tyss.cg.jpa.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@SuppressWarnings("serial")
@Data 
@Entity
@Table(name = "projects_info")
public class ProjectBean implements Serializable {
	
	@Id
	@Column
	private Integer projectId;
	@Column
	private String projectName;
	@Column
	private String duration;
	@Column
	private String projectType;
	
	@Exclude
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "employee_projects", joinColumns = @JoinColumn(name = "projectId"), inverseJoinColumns = @JoinColumn(name = "empId"))
	private List<EmployeeInfoBean> employeeInfoBeanList;
}
