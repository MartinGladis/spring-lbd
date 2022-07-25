package com.gladis.project.service;

import com.gladis.project.entity.Sprint;
import com.gladis.project.repository.SprintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SprintServiceImpl implements SprintService {

    @Autowired
    SprintRepository sprintRepository;

    public Sprint save(Sprint sprint) {
        //validation
        return sprintRepository.save(sprint);
    }
}
