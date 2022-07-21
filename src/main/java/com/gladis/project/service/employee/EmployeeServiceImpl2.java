package com.gladis.project.service.employee;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Profile("dev")
@Service
public class EmployeeServiceImpl2 implements EmployeeService {
    public List<?> findAll() {
        return null;
    }
}
