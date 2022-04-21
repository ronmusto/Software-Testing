//Author Name: Renaldo Musto

//Date: 4/2/2022

//Course ID: CS-320

//Description: JUnit tests for the Task class

package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Task;

class TaskTest {

	@Test
	//Testing to make sure that the program properly constructs a task
	void testTask() {
		Task task = new Task("TaskToDo", "123456789", "Description of a task");
		assertTrue(task.getName().equals("TaskToDo"));
		assertTrue(task.getTaskId().equals("123456789"));
		assertTrue(task.getDescription().equals("Description of a task"));
	}
	
	@Test
	// Test to ensure a name is present
	void testNameNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "123456789", "Description of a task");
		});
	}
	
	@Test
	// Test to ensure the name is not more than 20 characters
	void testNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("TaskkkkkkkkToooooooooDooooooooooo","123456789", "Description of a task");
		});
	}
	
	@Test
	// Test to ensure that a task Id is present
	void testTaskIdNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("Task", null, "Description of a task");
		});
	}
	
	@Test
	// Test to ensure that the task Id is not more than 10 characters
	void testTaskIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("Task", "12345678999", "Description of a task");
		});
	}
	
	@Test
	// Test to ensure that an description is present
	void testDescriptionNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("Task", "123456789", null);
		});
	}
	
	@Test
	// Test to ensure that the description is not longer than 50 characters
	void testDescriptionTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("Task", "123456789", "Description of a task that is wayyyyyyyyyyyyyyyyyyyyyyy tooooooooooooooooooo looooooooonnnnnnnnnnngggggggggggggggg");
		});
	}
	
	@Test
	// Test to ensure that the setters can update a task
	void testSetters() {
		Task task = new Task("Task", "123456789", "Description of a task");
		task.setName("Task");
		task.setTaskId("123456789");
	    task.setDescription("Description of a task");
	    assertTrue(task.taskId.equals("123456789"));
	    assertTrue(task.name.equals("Task"));
	    assertTrue(task.description.equals("Description of a task"));
	}
	
	@Test
	// Test to ensure that the name entered was not null
	void testNameNotNullSetter() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Task task = new Task(null, "123456789", "Description of a task");
			task.setName(null);
		});
	}
	
	@Test
	// To test that the name being updated isn't too long
	void testNameTooLongSetter() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Task task = new Task("Task", "123456789", "Description of a task");
			task.setName("jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
		});
	}
	
	@Test
	// To ensure that the description being updated isn't null
	void testDescriptionNotNullSetter() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Task task = new Task("Task", "123456789", "Description of a task");
			task.setDescription(null);
		});
	}
	
	@Test
	// To ensure that the description being updated isn't too long
	void testDescriptionTooLongSetter() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Task task = new Task("Task", "123456789", "Description of a task");
			task.setDescription("jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
		});
	}
	
	@Test
	// To ensure that the taskId entered isn't too long
	void testTaskIdNotTooLongSetter() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Task task = new Task("Task", "123456789", "Description of a task");
			task.setTaskId("555555555555555");
		});
	}
	
	@Test
	// To ensure that taskId entered is not null
	void testTaskIdNotNullSetter() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Task task = new Task("John", "123456789", "Description of a task");
			task.setTaskId(null);
		});
	}
}
