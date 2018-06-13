package com.project.yasar.onduty.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	@Column
	private long departmentName;

	@JoinColumn(name = "personal_id")
	@ManyToMany(cascade = CascadeType.DETACH)
	private List<Personal> personals = new ArrayList<Personal>();


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

