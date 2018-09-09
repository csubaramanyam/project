package com.gs.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gs.project.model.ProjectDTO;
import com.gs.project.service.ProjectService;
import com.gs.project.validation.ProjectValidator;

@RestController
@RequestMapping("/project")
public class ProjectController {

	@Autowired
	ProjectService projectService;
	
	@Autowired
	ProjectValidator projectValidator;
	
	@RequestMapping(value = "/{projectId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ProjectDTO getProjectDetailsByProjectId(@PathVariable Integer projectId) {

		ProjectDTO projectDTO = projectService.getProjectDetailsByProjectId(projectId);
		
		return projectDTO;
	}
	
	@RequestMapping(value = "/projectId/{projectId}",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public Boolean createProject(@PathVariable Integer projectId) {

		return true;
	}
	
}
