package com.gladis.project;

import com.gladis.project.repository.SprintRepository;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProjectApplicationTests {

	@Autowired
	SprintRepository sprintRepository;

	@Test
	void contextLoads() {
	}

}
