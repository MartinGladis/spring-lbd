package com.gladis.project.mapper;

import com.gladis.project.dto.SimpleUserStoryDto;
import com.gladis.project.dto.UserStoryDto;
import com.gladis.project.entity.UserStory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserStoryMapper{

    public List<UserStory> toEntities(List<SimpleUserStoryDto> simpleUserStoryDtos) {
        return null;
    }

    public List<SimpleUserStoryDto> toSimpleDtos(List<UserStory> userStories) {
        List<SimpleUserStoryDto> simpleUserStoryDtos = new ArrayList<>();
        for (UserStory userStory : userStories) {
            simpleUserStoryDtos.add(toSimpleDto(userStory));
        }

        return simpleUserStoryDtos;
    }

    public List<UserStoryDto> toDtos(List<UserStory> userStories) {
        List<UserStoryDto> userStoryDtos = new ArrayList<>();
        for (UserStory userStory : userStories) {
            userStoryDtos.add(toDto(userStory));
        }

        return userStoryDtos;
    }

    public UserStory toEntity(UserStoryDto dto) {
        return null;
    }

    public SimpleUserStoryDto toSimpleDto(UserStory userStory) {
        return new SimpleUserStoryDto(userStory.getName(), userStory.getStoryPoints());
    }

    public UserStoryDto toDto(UserStory userStory) {
        return new UserStoryDto(userStory.getId(), userStory.getName(), userStory.getDescription(), userStory.getStoryPoints(), userStory.getStatus());
    }
}
