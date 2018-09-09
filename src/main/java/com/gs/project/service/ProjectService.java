package com.gs.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gs.project.dao.model.Project;
import com.gs.project.dao.repository.ProjectRepository;
import com.gs.project.model.ProjectDTO;
import com.gs.project.util.ResourceMapper;

@Service
public class ProjectService {
	
	@Autowired
	ProjectRepository projectRepository;
	
	@Autowired
	ResourceMapper resourceMapper;
	
	public ProjectDTO getProjectDetailsByProjectId(final Integer projectId) {
		
		Project project = projectRepository.findOne(projectId);
		
		ProjectDTO projectDTO = resourceMapper.convertToProjectDTO(project);
		
		return projectDTO;
	}
	
}
