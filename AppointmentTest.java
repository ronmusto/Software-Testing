//Author Name: Renaldo Musto

//Date: 4/7/2022

//Course ID: CS-320

//Description: JUnit tests for the Appointment class

package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Appointment;

class AppointmentTest {

	@Test
	//Testing to make sure that the program properly constructs an appointment
	void testAppointment() {
		Appointment appointment = new Appointment("2022-04-25", "123456789", "Description of an appointment");
		assertTrue(appointment.getDate().equals("2022-04-25"));
		assertTrue(appointment.getAppointmentId().equals("123456789"));
		assertTrue(appointment.getDescription().equals("Description of an appointment"));
	}
	
	@Test
	// Test to ensure a date is present
	void testDateNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(null, "123456789", "Description of an appointment");
		});
	}
	
	@Test
	// Test to ensure a date is not in the past
	void testDateNotInPast() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("2020-04-25", "123456789", "Description of an appointment");
		});
	}
	
	
	@Test
	// Test to ensure that a appointment Id is present
	void testAppointmentIdNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("2022-04-25", null, "Description of an appointment");
		});
	}
	
	@Test
	// Test to ensure that the appointment Id is not more than 10 characters
	void testAppointmentIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("2022-04-25", "12345678999", "Description of an appointment");
		});
	}
	
	@Test
	// Test to ensure that a description is present
	void testDescriptionNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("2022-04-25", "123456789", null);
		});
	}
	
	@Test
	// Test to ensure that the description is not longer than 50 characters
	void testDescriptionTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("2022-04-25", "123456789", "Description of an appointment that is wayyyyyyyyyyyyyyyyyyyyyyy tooooooooooooooooooo looooooooonnnnnnnnnnngggggggggggggggg");
		});
	}
	
	@Test
	// Test to ensure that the setters can update a task
	void testSetters() {
		Appointment appointment = new Appointment("2022-04-25", "123456789", "Description of an appointment");
		appointment.setDate("2022-04-25");
		appointment.setAppointmentId("123456789");
		appointment.setDescription("Description of an appointment");
	    assertTrue(appointment.appointmentId.equals("123456789"));
	    assertTrue(appointment.userDate.equals("2022-04-25"));
	    assertTrue(appointment.description.equals("Description of an appointment"));
	}
	
	@Test
	// Test to ensure that the name entered was not null
	void testDateNotNullSetter() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Appointment appointment = new Appointment(null, "123456789", "Description of an appointment");
			appointment.setDate(null);
		});
	}
	
	@Test
	// Test to ensure that the name entered was not in the past
	void testDateNotInPastSetter() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Appointment appointment = new Appointment("2020-04-25", "123456789", "Description of an appointment");
			appointment.setDate("2020-04-25");
		});
	}
	
	@Test
	// To ensure that the description being updated isn't null
	void testDescriptionNotNullSetter() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Appointment appointment = new Appointment("2022-04-25", "123456789", null);
			appointment.setDescription(null);
		});
	}
	
	@Test
	// To ensure that the description being updated isn't too long
	void testDescriptionTooLongSetter() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Appointment appointment = new Appointment("2022-04-25", "123456789", "Description of an appointment");
			appointment.setDescription("jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
		});
	}
	
	@Test
	// To ensure that the appointmentId entered isn't too long
	void testAppointmentIdNotTooLongSetter() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Appointment appointment = new Appointment("2022-04-25", "123456789", "Description of an appointment");
			appointment.setAppointmentId("555555555555555");
		});
	}
	
	@Test
	// To ensure that the appointmentId entered is not null
	void testAppointmentIdNotNullSetter() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Appointment appointment = new Appointment("2022-04-25", null, "Description of an appointment");
			appointment.setAppointmentId(null);
		});
	}
}
