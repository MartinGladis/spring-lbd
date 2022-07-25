package com.gladis.project.repository;

import com.gladis.project.entity.Sprint;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SprintRepository extends CrudRepository<Sprint, Long> {
    Sprint save(Sprint sprint);
}
