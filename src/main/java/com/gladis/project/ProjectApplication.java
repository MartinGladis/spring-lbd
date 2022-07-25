package com.gladis.project;

import com.gladis.project.entity.Sprint;
import com.gladis.project.service.SprintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	@Autowired
	SprintService sprintService;

	@PostConstruct
	public void run() {
		Sprint sprint = new Sprint("Sprint 2", LocalDate.now(), LocalDate.now().plusMonths(1), "xyz", null, null);
		sprintService.save(sprint);
	}

}
