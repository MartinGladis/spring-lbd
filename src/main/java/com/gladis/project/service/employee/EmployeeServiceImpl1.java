package com.gladis.project.service.employee;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Primary
@Service
public class EmployeeServiceImpl1 implements EmployeeService {
    public List<?> findAll() {
        return null;
    }
}
