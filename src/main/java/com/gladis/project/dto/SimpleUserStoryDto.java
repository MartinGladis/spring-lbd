package com.gladis.project.dto;

public class SimpleUserStoryDto {

    private String name;

    private int storyPoints;

    public SimpleUserStoryDto(String name, int storyPoints) {
        this.name = name;
        this.storyPoints = storyPoints;
    }

    public SimpleUserStoryDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStoryPoints() {
        return storyPoints;
    }

    public void setStoryPoints(int storyPoints) {
        this.storyPoints = storyPoints;
    }
}
