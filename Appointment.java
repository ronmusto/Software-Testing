//Author Name: Renaldo Musto

//Date: 4/7/2022

//Course ID: CS-320

//Description: The class that allows us to create appointments

package main;

import java.time.LocalDate;

public class Appointment {
	
	// Establish variables
	public String appointmentId;
	public String description;
	public String userDate;
	
	public Appointment(String userDate, String appointmentId, String description) {
		
        LocalDate parsedDate = LocalDate.parse(userDate);
      	LocalDate today = LocalDate.now();
	    boolean result = parsedDate.isBefore(today);
      
          if(userDate == null || result == true) {
              throw new IllegalArgumentException("Invalid Input");
          }

          if(appointmentId == null || appointmentId.length() > 10) {
              throw new IllegalArgumentException("Invalid Input");
          }

          if(description == null || description.length() > 50) {
              throw new IllegalArgumentException("Invalid Input");
          }

          // If all tests pass assign values to variables
          this.userDate = userDate;
          this.appointmentId = appointmentId;
          this.description = description;
	}
	
    // Get methods to allow for testing constructor
	public String getDate() {
		return userDate;
	}

	public String getAppointmentId() {
		return appointmentId;
	}

	public String getDescription() {
		return description;
	}

	// Setter methods for TaskService class
	public void setDate(String userDate) {
		
        LocalDate parsedDate = LocalDate.parse(userDate);
      	LocalDate today = LocalDate.now();
	    boolean result = parsedDate.isBefore(today);
		
		if(userDate == null || result == true) {
			throw new IllegalArgumentException("Invalid Input");
        }
	
		this.userDate = userDate;
	}

	public void setDescription(String description) {
		if(description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid Input");
		}
		this.description = description;
	}
	
	public void setAppointmentId(String appointmentId) {
		if(appointmentId == null || appointmentId.length() > 10) {
			throw new IllegalArgumentException("Invalid Input");
		}
		this.appointmentId = appointmentId;
	}
}