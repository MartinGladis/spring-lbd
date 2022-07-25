package com.gladis.project.repository;

import com.gladis.project.entity.Sprint;
import com.gladis.project.entity.UserStory;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface SprintRepository extends CrudRepository<Sprint, Long> {
    Sprint save(Sprint sprint);
}
