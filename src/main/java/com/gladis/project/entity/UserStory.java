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

    private Integer storyPointsCount;

    private String status;

    @ManyToMany(mappedBy = "userStories")
    private Set<Sprint> sprints;
}
