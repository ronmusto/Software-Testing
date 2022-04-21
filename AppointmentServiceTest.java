//Author Name: Renaldo Musto

//Date: 4/10/2022

//Course ID: CS-320

//Description: JUnit tests for the AppointmentService class

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Appointment;
import main.AppointmentService;

class AppointmentServiceTest {

    @Test
    // Test to ensure that we can add appointments with a unique Id
    void testAddAppointment(){
    	AppointmentService a = new AppointmentService();
      
    	Appointment appointment = new Appointment("2022-04-25", "123456789", "Description of a task");
      
      a.addAppointment(appointment);
      
      Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
    	  Appointment appointment2 = new Appointment("2022-04-25", "123456789", "Description of a task");
            a.addAppointment(appointment2);
		});
      }
    
    @Test
    // Test to ensure we can delete an appointment with a unique Id
    void testDeleteAppointment(){
    	AppointmentService a = new AppointmentService();
      
    	Appointment appointment = new Appointment("2022-04-25", "123456789", "Description of a task");
      
      int listSize = a.appointmentList.size();
      
      a.deleteAppointment(appointment); 
			
      assertTrue(listSize != a.appointmentList.size());
      
    }
}