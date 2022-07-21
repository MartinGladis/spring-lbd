package com.gladis.project.service.employee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Profile("dev")
@Service
public class EmployeeServiceImpl1 implements EmployeeService {

    @Value("${prefix}")
    private String prefix;

    @Value("${suffix}")
    private String suffix;

    private static final Logger LOG = LoggerFactory.getLogger(EmployeeServiceImpl1.class);

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
        LOG.info(nickname);
        return nickname;
    }
}
