package com.yash.ppmtoolapi.exception;

public class ProjectIDExceptionResponse {

	private String projectIdentifier;
	
	
	private String getProjectIdentifier() {
		return projectIdentifier;
	}
	
	public void setProjectIdentifier(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
		
	}

	public ProjectIDExceptionResponse(String projectIdentifier) {
	
	this.projectIdentifier = projectIdentifier;
	}
	
	}
