package com.gladis.project.service.employee;

import com.gladis.project.entity.employee.Employee;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Profile("dev")
@Service
public class EmployeeServiceImpl1 implements EmployeeService {

    @Value("${project.prefix}")
    private String prefix;

    @Value("${project.suffix}")
    private String suffix;

    private static final Log LOG = LogFactory.getLog(EmployeeServiceImpl1.class);

    private Map<Long, Employee> employeeMap = new HashMap<>();

    private Long index = 0L;

    public List<?> findAll() {
        return null;
    }

    public String getEmployeeNickname(String firstName, String lastName) {
        LOG.info(firstName);
        LOG.info(lastName);
        String nickname = prefix
                + firstName.substring(0, 3)
                + lastName.substring(0, 3)
                + suffix;
        LOG.debug(nickname);
        return nickname;
    }

    public Employee findByName(String name) {
        for (Employee employee : employeeMap.values()) {
            if (employee.getLastName().equals(name) || employee.getFirstName().equals(name)) {
                return employee;
            }
        }

        return null;
    }

    public Employee save(Employee employee) {
        this.employeeMap.put(index, employee);
        return this.employeeMap.get(index++);
    }
}
