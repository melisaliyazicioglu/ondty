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

	
	
}

