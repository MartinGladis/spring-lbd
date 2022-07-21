package com.gladis.project.service.employee;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Profile("prod")
@Service
public class EmployeeServiceImpl1 implements EmployeeService {

    @Value("${project.prefix}")
    private String prefix;

    @Value("${project.suffix}")
    private Integer suffix;

    public List<?> findAll() {
        return null;
    }

    public String getEmployeeName(String firstName, String lastName) {
        return prefix
                + firstName.toLowerCase().substring(0, 3)
                + lastName.toLowerCase().substring(0, 3)
                + suffix;
    }
}
