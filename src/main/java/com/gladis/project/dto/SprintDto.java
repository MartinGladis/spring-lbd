package com.gladis.project.dto;

import java.time.LocalDate;
import java.util.List;

public class SprintDto {

    private Long id;

    private String name;

    private LocalDate startDate;

    private LocalDate endDate;

    private String target;

    private String status;

    private List<SimpleUserStoryDto> userStory;

    public SprintDto(Long id, String name, LocalDate startDate, LocalDate endDate, String target, String status) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.target = target;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<SimpleUserStoryDto> getUserStory() {
        return userStory;
    }

    public void setUserStoryDtos(List<SimpleUserStoryDto> simpleUserStoryDtos) {
        this.userStory = simpleUserStoryDtos;
    }
}
