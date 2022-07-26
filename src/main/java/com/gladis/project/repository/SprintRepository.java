package com.gladis.project.repository;

import com.gladis.project.entity.Sprint;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SprintRepository extends CrudRepository<Sprint, Long> {
    @Override
    <S extends Sprint> S save(S entity);

    @Override
    Optional<Sprint> findById(Long aLong);
}
