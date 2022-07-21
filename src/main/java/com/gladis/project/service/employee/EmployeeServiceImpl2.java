package com.gladis.project.service.employee;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier("impl2")
public class EmployeeServiceImpl2 implements EmployeeService {
    public List<?> findAll() {
        return null;
    }
}
