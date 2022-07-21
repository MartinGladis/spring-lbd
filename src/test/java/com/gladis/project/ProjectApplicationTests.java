package com.gladis.project;

import com.gladis.project.entity.employee.Employee;
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

	@Test
	void employeeServiceSaveAndFindTest() {
		EmployeeServiceImpl1 employeeService = new EmployeeServiceImpl1();

		Employee employee = new Employee(1, "Martin", "Gladis", "56734565432", "456456", "456678234");
		boolean confirm = employeeService.save(employee);
		Assertions.assertThat(confirm).isTrue();

		employee = new Employee(2, "Grzegorz", "Datko", "34534", "45645", "456");
		confirm = employeeService.save(employee);
		Assertions.assertThat(confirm).isTrue();

		employee = new Employee(3, "Mateusz", "Nowak", "34534", "45645", "456");
		confirm = employeeService.save(employee);
		Assertions.assertThat(confirm).isTrue();

		employee = new Employee(4, "Sandra", "Kwiatkowska", "34534", "45645", "456");
		confirm = employeeService.save(employee);
		Assertions.assertThat(confirm).isTrue();

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
