//Author Name: Renaldo Musto

//Date: 4/7/2022

//Course ID: CS-320

//Description: This class adds and deletes appointments

package main;
import java.util.ArrayList;
public class AppointmentService {
  
        public ArrayList<Appointment> appointmentList;

        public AppointmentService(){
        	appointmentList = new ArrayList<Appointment>();
        }
  
     	public void addAppointment(Appointment appointment){
          
           String newId = appointment.getAppointmentId();
          
           for (int i=0; i < appointmentList.size(); i++) {
             String id = appointmentList.get(i).getAppointmentId();
               if (id.equals(newId)) {
                 throw new IllegalArgumentException("Duplicate Id Found");
               }
           }
           appointmentList.add(appointment);
        }
     	
        public void deleteAppointment(Appointment appointment) {
        	
           String idToDelete = appointment.getAppointmentId();
        
           for (int i=0; i < appointmentList.size(); i++) {
              String id = appointmentList.get(i).getAppointmentId();
                 if (id.equals(idToDelete)) {
                	 appointmentList.remove(i);
                 }
           }
           
           for (int i=0; i < appointmentList.size(); i++) {
              String id = appointmentList.get(i).getAppointmentId();
                 if (id.equals(idToDelete)) {
                    throw new IllegalArgumentException("Task Not Deleted");
                 }
           }
        }
}  