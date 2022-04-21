//Author Name: Renaldo Musto

//Date: 4/2/2022

//Course ID: CS-320

//Description: The class that allows us to create tasks

package main;

public class Task {
	
	// Establish variables
	public String name;
	public String taskId;
	public String description;
	
	public Task(String name, String taskId, String description) {
		if(name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invalid Input");
		}
		
		if(taskId == null || taskId.length() > 10) {
			throw new IllegalArgumentException("Invalid Input");
		}
		
		if(description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid Input");
		}
		
		// If all tests pass assign values to variables
		this.name = name;
		this.taskId = taskId;
		this.description = description;
	}
	
    // Get methods to allow for testing constructor
	public String getName() {
		return name;
	}

	public String getTaskId() {
		return taskId;
	}

	public String getDescription() {
		return description;
	}

	// Setter methods for TaskService class
	public void setName(String name) {
		if(name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invalid Input");
        }
		this.name = name;
	}

	public void setDescription(String description) {
		if(description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid Input");
		}
		this.description = description;
	}
	
	public void setTaskId(String taskId) {
		if(taskId == null || taskId.length() > 10) {
			throw new IllegalArgumentException("Invalid Input");
		}
		this.taskId = taskId;
	}
}