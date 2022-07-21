package com.gladis.project;

import com.gladis.project.service.employee.EmployeeServiceImpl1;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProjectApplicationTests {

	@Test
	void contextLoads() {
		EmployeeServiceImpl1 employeeService = new EmployeeServiceImpl1();
		String nickname = employeeService.getEmployeeNickname("Martin", "Gladis");
		Boolean condition = nickname.equals("PROMarGla123");
		Assertions.assertThat(condition).isTrue();
	}

}
