//Author Name: Renaldo Musto

//Date: 4/2/2022

//Course ID: CS-320

//Description: This class adds, deletes and modifies tasks

package main;
import java.util.ArrayList;
public class TaskService {
  
        public ArrayList<Task> taskList;

        public TaskService(){
           taskList = new ArrayList<Task>();
        }
  
     	public void addTask(Task task){
          
           String newId = task.getTaskId();
          
           for (int i=0; i < taskList.size(); i++) {
             String id = taskList.get(i).getTaskId();
               if (id.equals(newId)) {
                 throw new IllegalArgumentException("Duplicate Id Found");
               }
           }
           taskList.add(task);
        }
     	
        public void deleteTask(Task task) {
        	
           String idToDelete = task.getTaskId();
        
           for (int i=0; i < taskList.size(); i++) {
              String id = taskList.get(i).getTaskId();
                 if (id.equals(idToDelete)) {
                    taskList.remove(i);
                 }
           }
           
           for (int i=0; i < taskList.size(); i++) {
              String id = taskList.get(i).getTaskId();
                 if (id.equals(idToDelete)) {
                    throw new IllegalArgumentException("Task Not Deleted");
                 }
           }
        }
        
        public void updateTask(Task task, String newName, String newDescription) {
         	
        	String idToUpdate = task.getTaskId();
        	
        	for (int i=0; i < taskList.size(); i++) {
        		String id = taskList.get(i).getTaskId();
        		   if (id.equals(idToUpdate)) {
        			   taskList.get(i).setName(newName);
        			   taskList.get(i).setDescription(newDescription);
        		   }
        	}
        }
}  