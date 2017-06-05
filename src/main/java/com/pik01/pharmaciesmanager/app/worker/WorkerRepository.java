package com.pik01.pharmaciesmanager.app.worker;

import com.pik01.pharmaciesmanager.app.worker.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
    List<Worker> findAllByOrderByLastName();
}
