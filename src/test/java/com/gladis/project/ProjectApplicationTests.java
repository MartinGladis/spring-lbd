package com.gladis.project;

import com.gladis.project.entity.employee.Employee;
import com.gladis.project.service.employee.EmployeeServiceImpl1;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
class ProjectApplicationTests {

	@Autowired
	private EmployeeServiceImpl1 employeeService;

	@Test
	void contextLoads() {
		String nickname = employeeService.getEmployeeNickname("Martin", "Gladis");
		Boolean condition = nickname.equals("PROMarGla123");
		assertEquals(nickname, "PROMarGla123");
	}

	@Test
	void employeeServiceSaveAndFindTest() {

		Employee employee = new Employee(1, "Martin", "Gladis", "56734565432", "456456", "456678234");
		assertEquals(employee, employeeService.save(employee));

		employee = new Employee(2, "Grzegorz", "Datko", "34534", "45645", "456");
		assertEquals(employee, employeeService.save(employee));

		employee = new Employee(3, "Mateusz", "Nowak", "34534", "45645", "456");
		assertEquals(employee, employeeService.save(employee));

		employee = new Employee(4, "Sandra", "Kwiatkowska", "34534", "45645", "456");
		assertEquals(employee, employeeService.save(employee));

		boolean condition = employeeService.findByName("Gladis") != null;
		Assertions.assertThat(condition).isTrue();

		condition = employeeService.findByName("Kwiatkowska") != null;
		Assertions.assertThat(condition).isTrue();

		condition = employeeService.findByName("Sabina") == null;
		Assertions.assertThat(condition).isTrue();

		condition = employeeService.findByName("Mateusz") != null;
		Assertions.assertThat(condition).isTrue();

		condition = employeeService.findByName("Datko") != null;
		Assertions.assertThat(condition).isTrue();

	}

}
