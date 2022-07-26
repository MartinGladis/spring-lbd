package com.gladis.project.service;

import com.gladis.project.entity.UserStory;
import com.gladis.project.repository.UserStoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserStoryServiceImpl implements UserStoryService {

    @Autowired
    UserStoryRepository userStoryRepository;
}
