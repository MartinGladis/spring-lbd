package com.gladis.project.service;

import com.gladis.project.entity.Sprint;
import com.gladis.project.entity.UserStory;
import com.gladis.project.repository.SprintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

@Service
public class SprintServiceImpl implements SprintService {

    @Autowired
    SprintRepository sprintRepository;

    @Transactional
    @Override
    public Sprint save(Sprint sprint) {
        boolean requireCondition = Stream.of(
                sprint.getName(),
                sprint.getStartDate(),
                sprint.getEndDate(),
                sprint.getStatus()
        ).allMatch(Objects::nonNull);

        if (!requireCondition) {
            throw new RuntimeException();
        }

        return sprintRepository.save(sprint);
    }

    @Override
    public Iterable<Sprint> findAll(boolean tasks) {

        return sprintRepository.findAll();
    }

    @Override
    public Iterable<UserStory> findUserStoriesById(Long id) {
        Optional<Sprint> sprintOptional = sprintRepository.findById(id);
        if (!sprintOptional.isPresent()) {
            return null;
        }

        Sprint sprint = sprintOptional.get();
        return sprint.getUserStories();
    }

    @Override
    public Iterable<Sprint> findSprintsByDateRange(LocalDate startDate, LocalDate endDate) {
        Iterable<Sprint> sprints = sprintRepository.findAll();
        List<Sprint> matchingSprints = new ArrayList<>();
        for (Sprint sprint : sprints) {
            if (sprint.getStartDate() == startDate && sprint.getEndDate() == endDate){
                matchingSprints.add(sprint);
            }
        }

        return matchingSprints;
    }

    @Override
    public List<UserStory> findUserStoryBySprintId(Long id) {
        Optional<Sprint> sprint = sprintRepository.findById(id);
        return sprint.map(Sprint::getUserStories).orElse(null);
    }
}
