package com.yash.ppmtoolapi.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Future;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.Id;

@Entity
public class Project {
	
	@Id
	 long Id;
	
	 String projectName;
	
	 String projectIdentifier;
	
	


	/**
	 * description of project
	 */

	  String description;

	@Column(updatable = false)
	@JsonFormat(pattern = "yyyy-MM-dd")
	/**
	 * Date creation of project
	 */
	  Date created_At;

	@JsonFormat(pattern = "yyyy-MM-dd")

	/**
	 * Date of project Updation
	 */
	  Date updated_At;
	
	@Future
	@JsonFormat(pattern = "yyyy-MM-dd")
	
	/**
	 * Expected End Date Of Project
	 */
	  Date end_Date;
	@JsonFormat(pattern = "yyyy-MM-dd")
	
	/**
	 * Start of Project
	 */
	  Date start_Date;
	
	
	
	
	public long getId() {
		return Id;
	}


	public void setId(long id) {
		Id = id;
	}




	public Date getEnd_Date() {
		return end_Date;
	}
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


	public Date getCreated_At() {
		return created_At;
	}


	public void setCreated_At(Date created_At) {
		this.created_At = created_At;
	}


	public Date getUpdated_At() {
		return updated_At;
	}


	public void setUpdated_At(Date updated_At) {
		this.updated_At = updated_At;
	}


	public Date getStart_Date() {
		return start_Date;
	}


	public void setStart_Date(Date start_Date) {
		this.start_Date = start_Date;
	}


	public void setEnd_Date(Date end_Date) {
		this.end_Date = end_Date;
	}
	
	
	public String getProjectName() {
		return projectName;
	}
	
	
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	
	public String getProjectIdentifier() {
		return projectIdentifier;
	}
	
	
	public void setProjectIdentifier(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
	}


	public Project(long id, String projectName, String projectIdentifier, String description, Date created_At,
			Date updated_At, @Future Date end_Date, Date start_Date) {
		super();
		Id = id;
		this.projectName = projectName;
		this.projectIdentifier = projectIdentifier;
		this.description = description;
		this.created_At = created_At;
		this.updated_At = updated_At;
		this.end_Date = end_Date;
		this.start_Date = start_Date;
	}


	@Override
	public String toString() {
		return "Project [Id=" + Id + ", projectName=" + projectName + ", projectIdentifier=" + projectIdentifier
				+ ", description=" + description + ", created_At=" + created_At + ", updated_At=" + updated_At
				+ ", end_Date=" + end_Date + ", start_Date=" + start_Date + "]";
	}


	public Project() {
		super();
	}

	

}
