package com.ejemplo.mi_primera_api;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    // In-memory storage (simulating a database)
    private List<Task> tasks = new ArrayList<>();
    private Long nextId = 1L; // To simulate auto-incrementing IDs

    // Constructor with sample data
    public TaskController(){
        tasks.add(new Task(nextId++, "Learn Spring Boot", "Complete first REST API tutorial", false));
        tasks.add(new Task(nextId++, "Build Portfolio", "Create GitHub repository with projects", false));
        tasks.add(new Task(nextId++, "Practice Java", "Review OOP concepts and collections", true));
    }

    // Get /api/tasks - Get all tasks
    @GetMapping
    public List<Task> getAllTasks(){
        return tasks;
    }

    // Get /api/tasks/{id} - Get task by ID
    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id){
        return tasks.stream()
                    .filter(task -> task.getId().equals(id))
                    .findFirst()
                    .orElse(null);
    }

    // Post /api/tasks - Create a new task
    @PostMapping
    public Task createTask(@RequestBody Map<String, Object> taskData){
        String title = (String) taskData.get("title");
        String description = (String) taskData.get("description");
        boolean completed = taskData.containsKey("completed") ? (Boolean) taskData.get("completed") : false;

        Task newTask = new Task(nextId++, title, description, completed);
        tasks.add(newTask);
        return newTask;
    }

    // Put /api/tasks/{id} - Update task
    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Map<String, Object> taskData){
        Task task = getTaskById(id);
        if(task != null){
            if(taskData.containsKey("title")){
                task.setTitle((String) taskData.get("title"));
            }
            if(taskData.containsKey("description")){
                task.setDescription((String) taskData.get("description"));
            }
            if(taskData.containsKey("completed")){
                task.setCompleted((Boolean) taskData.get("completed"));
            }
        }
        return task;
    }

    // Delete /api/tasks/{id} - Delete task
    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable Long id){
        tasks.removeIf(task -> task.getId().equals(id));
        return "Task with ID " + id + " deleted.";
    }

}
