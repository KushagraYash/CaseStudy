package com.yash.ppmtoolapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.ppmtoolapi.domain.Project;
/**
 * 
 * @author kushagra.sharma
 *
 */

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{
	Project findByProjectIdentifier(String projectidentifier);

}
