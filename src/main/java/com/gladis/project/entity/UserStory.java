package com.gladis.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserStory {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;

    private Integer storyPoints;

    private String status;

    @ManyToMany(mappedBy = "userStories")
    private List<Sprint> sprints;
}
