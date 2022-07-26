package com.gladis.project.mapper;

import com.gladis.project.dto.SprintDto;
import com.gladis.project.dto.SimpleUserStoryDto;
import com.gladis.project.entity.Sprint;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SprintMapper{


    public List<SprintDto> toDtos(List<Sprint> sprints, boolean tasks) {
        List<SprintDto> sprintDtos = new ArrayList<>();
        for (Sprint sprint : sprints) {
            sprintDtos.add(toDto(sprint, tasks));
        }

        return sprintDtos;
    }


    public List<Sprint> toEntities(List<SprintDto> dtos) {
        return null;
    }


    public SprintDto toDto(Sprint sprint, boolean tasks) {
        UserStoryMapper userStoryMapper = new UserStoryMapper();
        List<SimpleUserStoryDto> simpleUserStoryDto = userStoryMapper.toSimpleDtos(sprint.getUserStories());
        SprintDto sprintDto = new SprintDto(
                sprint.getId(),
                sprint.getName(),
                sprint.getStartDate(),
                sprint.getEndDate(),
                sprint.getTarget(),
                sprint.getStatus()
        );

        if (tasks) {
            sprintDto.setUserStoryDtos(simpleUserStoryDto);
        }

        return sprintDto;
    }

    public Sprint toEntity(SprintDto dto) {
        return null;
    }
}
