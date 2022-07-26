package com.gladis.project.controller;

import com.gladis.project.dto.SprintDto;
import com.gladis.project.dto.UserStoryDto;
import com.gladis.project.entity.Sprint;
import com.gladis.project.entity.UserStory;
import com.gladis.project.mapper.SprintMapper;
import com.gladis.project.mapper.UserStoryMapper;
import com.gladis.project.service.SprintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/sprint")
public class SprintController {

    @Autowired
    SprintService sprintService;

    @Autowired
    SprintMapper sprintMapper;

    @Autowired
    UserStoryMapper userStoryMapper;

    @GetMapping
    public List<SprintDto> findSprints (@RequestParam(value = "tasks", required = false) boolean tasks) {
        List<Sprint> sprints = (List<Sprint>) sprintService.findAll(tasks);
        return sprintMapper.toDtos(sprints, tasks);
    }

    @GetMapping("user_stories/{id}")
    public List<UserStoryDto> findUserStoryBySprintId (@PathVariable Long id) {
        List<UserStory> userStories = sprintService.findUserStoryBySprintId(id);
        return userStoryMapper.toDtos(userStories);
    }

}
