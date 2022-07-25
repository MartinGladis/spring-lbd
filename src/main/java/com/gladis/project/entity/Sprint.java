package com.gladis.project.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Sprint {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private LocalDate startDate;

    private LocalDate endDate;

    private String target;

    private String status;

    @ManyToMany
    @JoinTable(
            name = "sprints_user_stories",
            joinColumns = @JoinColumn(name = "sprint_id"),
            inverseJoinColumns = @JoinColumn(name = "user_story_id")
    )
    private Set<UserStory> userStories;

    public Sprint(String name, LocalDate startDate, LocalDate endDate, String target, String status, Set<UserStory> userStories) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.target = target;
        this.status = status;
        this.userStories = userStories;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getTarget() {
        return target;
    }

    public String getStatus() {
        return status;
    }

    public Set<UserStory> getUserStories() {
        return userStories;
    }
}
