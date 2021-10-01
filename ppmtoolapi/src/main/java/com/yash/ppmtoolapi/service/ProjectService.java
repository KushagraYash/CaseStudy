package com.yash.ppmtoolapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.ppmtoolapi.domain.Project;
import com.yash.ppmtoolapi.exception.ProjectIDException;
import com.yash.ppmtoolapi.repository.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;

//	@Autowired
//	private BacklogRepository backlogRepository;

	public Project saveOrUpdate(Project project) {
		try {
			project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
			System.out.println("Project ID "+project.getId());
			Long id = project.getId();
			projectRepository.save(project);
//			if(id!=project.getId()) {
//				Backlog backlog = new Backlog();
//				backlog.setProjectIdentifier(project.getProjectIdentifier());
//				backlog.setProject(project);
//				backlogRepository.save(backlog);
//			}

			Project savedProject = projectRepository.save(project);
			return savedProject;
		} catch(Exception e) {
			e.printStackTrace();
			throw new ProjectIDException("Project Identifier"+ project.getProjectIdentifier().toUpperCase() +"Already Exists" );
		}
	}
	
	public void deleteProjectByProjectIdentifier(String projectIdentifier) {
		Project project = projectRepository.findByProjectIdentifier(projectIdentifier);
		if(project == null) {
			throw new ProjectIDException("Project Identifier " + projectIdentifier.toUpperCase()+ " not exists");
		}
//		Backlog backlog = backlogRepository.findByProjectIdentifier(projectIdentifier);
//		backlogRepository.delete(backlog);
		projectRepository.delete(project);

	}

	public List<Project> getAllProject(){
		return (List<Project>) projectRepository.findAll();
	}		
	public Project getProjectByProjectIdentifier(String projectIdentifier) {
		Project project = projectRepository.findByProjectIdentifier(projectIdentifier.toUpperCase());
		if (project == null) {
			throw new ProjectIDException("Project Identifier "+ projectIdentifier.toUpperCase() + " not exists");

		}
		return project;

	}

}


