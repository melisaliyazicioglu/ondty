package com.project.yasar.onduty.domain;

import javax.persistence.*;

public class Department {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	@Column
	private long departmentName;

	public Department(long departmentName) {
		super();
		this.departmentName = departmentName;
	}

	public Department() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(long departmentName) {
		this.departmentName = departmentName;
	}

	
	
}

