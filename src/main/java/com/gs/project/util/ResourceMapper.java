package com.gs.project.util;

import com.gs.project.dao.model.Project;
import com.gs.project.model.ProjectDTO;

public class ResourceMapper {

	public ProjectDTO convertToProjectDTO(Project project) {

		ProjectDTO projectDTO = new ProjectDTO();
		projectDTO.setAppId(project.getAppId());
		projectDTO.setAppName(project.getAppName());
		projectDTO.setAppNumber(project.getAppNumber());
		projectDTO.setAppType(project.getAppType());
		projectDTO.setAppStatus(project.getAppStatus());
		projectDTO.setComments(project.getComments());
		projectDTO.setStartDate(project.getStartDate());
		projectDTO.setEndDate(project.getEndDate());

		return projectDTO;
	}

	public Project convertToProject(ProjectDTO projectDTO) {

		Project project = new Project();
		project.setAppName(projectDTO.getAppName());
		project.setAppNumber(projectDTO.getAppNumber());
		project.setAppType(projectDTO.getAppType());
		project.setAppStatus(projectDTO.getAppStatus());
		project.setComments(projectDTO.getComments());
		project.setStartDate(projectDTO.getStartDate());
		project.setEndDate(projectDTO.getEndDate());

		return project;
	}

}
