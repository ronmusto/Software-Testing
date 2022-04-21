//Author Name: Renaldo Musto

//Date: 4/2/2022

//Course ID: CS-320

//Description: JUnit tests for the TaskService class

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Task;
import main.TaskService;

class TaskServiceTest {

    @Test
    // Test to ensure that we can add tasks with a unique Id
    void testAddTask(){
      TaskService t = new TaskService();
      
      Task task = new Task("Task", "123456789", "Description of a task");
      
      t.addTask(task);
      
      Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			Task task2 = new Task("Task", "123456789", "Description of a task");
            t.addTask(task2);
		});
      }
    
    @Test
    // Test to ensure we can delete a task with a unique Id
    void testDeleteTask(){
      TaskService t = new TaskService();
      
      Task task = new Task("Task", "123456789", "Description of a task");
      
      int listSize = t.taskList.size();
      
      t.deleteTask(task); 
			
      assertTrue(listSize != t.taskList.size());
      
    }
    
    @Test
    // Test to ensure that we can update created tasks details
    void testUpdateTask() {
    	TaskService t = new TaskService();
    	
        Task task = new Task("Task", "123456789", "Description of a task");
        
        String newName = "new task";
        String newDescription = "new description";
        
        t.updateTask(task, newName, newDescription);
			
        assertTrue(task.getName().equals(newName));
        assertTrue(task.getDescription().equals(newDescription));
        
    }
}