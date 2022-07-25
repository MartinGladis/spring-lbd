package com.gladis.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class UserStory {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;

    private Integer storyPoints;

    private String status;

    @ManyToMany(mappedBy = "userStories")
    private Set<Sprint> sprints;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getStoryPoints() {
        return storyPoints;
    }

    public String getStatus() {
        return status;
    }

    public Set<Sprint> getSprints() {
        return sprints;
    }
}
