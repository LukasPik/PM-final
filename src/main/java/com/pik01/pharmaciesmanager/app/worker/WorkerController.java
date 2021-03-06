package com.pik01.pharmaciesmanager.app.worker;

import com.pik01.pharmaciesmanager.app.worker.model.Worker;
import com.pik01.pharmaciesmanager.app.worker.model.WorkerRole;
import com.pik01.pharmaciesmanager.app.worker.model.dto.WorkerDto;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/worker")
public class WorkerController {
    private WorkerService workerService;

    public WorkerController(WorkerService workerService) {
        this.workerService = workerService;
    }

    @GetMapping
    public List<Worker> getAll() {
        return workerService.getAll();
    }

    @GetMapping("/roles")
    public List<String> getRoles() {
        return Stream.of(WorkerRole.values())
                .map(WorkerRole::name)
                .collect(Collectors.toList());
    }

    @PutMapping("/add")
    public Worker addWorker(@RequestBody WorkerDto worker) {
        return workerService.addWorker(worker);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteWorker(@PathVariable long id) {
        workerService.deleteWorker(id);
    }
}
