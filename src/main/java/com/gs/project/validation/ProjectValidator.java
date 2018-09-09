package com.gs.project.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.gs.project.model.ProjectDTO;

public class ProjectValidator implements Validator{

	@Override
	public boolean supports(Class<?> clzz) {
		return clzz.equals(ProjectDTO.class);
	}

	@Override
	public void validate(Object req, Errors errors) {
		
	}

}
