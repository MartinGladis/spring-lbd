package com.gladis.project.repository;

import com.gladis.project.entity.UserStory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserStoryRepository extends CrudRepository<UserStory, Long> {
    UserStory save(UserStory userStory);
}
