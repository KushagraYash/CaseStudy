package com.yash.ppmtoolapi;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yash.ppmtoolapi.domain.Project;
import com.yash.ppmtoolapi.repository.ProjectRepository;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class ProjectRepositorytest 
{
	@Autowired
	ProjectRepository projectRepository;
	
	public void TestSave() {
		Project p = new Project();
		
	}
}
