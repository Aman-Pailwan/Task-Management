package com.pepecode.Tasks;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TasksRepository extends JpaRepository<Tasks,Integer> {
    boolean existsTasksById(Integer id);
}
