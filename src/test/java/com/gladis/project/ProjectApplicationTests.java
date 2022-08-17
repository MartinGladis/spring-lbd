package com.gladis.project;

import com.gladis.project.repository.SprintRepository;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RequiredArgsConstructor
class ProjectApplicationTests {

	SprintRepository sprintRepository;

	@Test
	void contextLoads() {
	}

}
