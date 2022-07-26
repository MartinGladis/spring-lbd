package com.gladis.project.service;

import com.gladis.project.entity.Sprint;
import com.gladis.project.entity.UserStory;

import java.time.LocalDate;
import java.util.List;


public interface SprintService {
    Sprint save(Sprint sprint);

    Iterable<UserStory> findUserStoriesById(Long id);

    Iterable<Sprint> findSprintsByDateRange(LocalDate startDate, LocalDate endDate);

    Iterable<Sprint> findAll(boolean tasks);

    List<UserStory> findUserStoryBySprintId(Long id);
}
