package com.project.yasar.onduty.domain;

import java.util.Date;

public class Project {
	
	private long projectid;
	private Date startdate;
	private Date enddate;
	private String projectname;
	
	private State state;
	private ProjectState projectstate;
	public long getProjectid() {
		return projectid;
	}
	public void setProjectid(long projectid) {
		this.projectid = projectid;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public ProjectState getProjectstate() {
		return projectstate;
	}
	public void setProjectstate(ProjectState projectstate) {
		this.projectstate = projectstate;
	}
	
	
	
	
	
	

}
