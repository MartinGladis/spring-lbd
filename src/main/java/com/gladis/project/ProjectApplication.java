package com.gladis.project;

import com.gladis.project.service.employee.EmployeeService;
import com.gladis.project.service.employee.EmployeeServiceImpl1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ProjectApplication {

	@Autowired
	EmployeeService employeeService;

	@Autowired
	EmployeeServiceImpl1 employeeServiceImpl1;

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	@PostConstruct
	public void post() {
		employeeService.findAll();
		employeeServiceImpl1.getEmployeeNickname("Boryc", "Schultz");
	}

}
