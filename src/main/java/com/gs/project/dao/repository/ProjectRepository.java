package com.gs.project.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gs.project.dao.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer>{

}
