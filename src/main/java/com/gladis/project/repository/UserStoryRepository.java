package com.gladis.project.repository;

import com.gladis.project.entity.UserStory;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface UserStoryRepository extends PagingAndSortingRepository {

}
