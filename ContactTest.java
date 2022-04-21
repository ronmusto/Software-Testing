//Author Name: Renaldo Musto

//Date: 3/24/2022

//Course ID: CS-320

//Description: JUnit tests for the Contact class

package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import main.Contact;

class ContactTest {

	@Test
	//Testing to make sure that the program properly constructs a contact
	void testContact() {
		Contact contact = new Contact("John", "Doe", "123456789", "0123456789", "1 N st");
		assertTrue(contact.getFirstName().equals("John"));
		assertTrue(contact.getLastName().equals("Doe"));
		assertTrue(contact.getContactId().equals("123456789"));
		assertTrue(contact.getNumber().equals("0123456789"));
		assertTrue(contact.getAddress().equals("1 N st"));
	}
	
	
	@Test
	// Test to ensure a first name is present
	void testFirstNameNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Doe", "123456789", "0123456789", "1 N st");
		});
	}
	
	@Test
	// Test to ensure the first name is not more than 10 characters
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Johnnnnnnnnnn", "Doe", "123456789", "0123456789", "1 N st");
		});
	}
	
	@Test
	// Test to ensure a last name is present
	void testLastNameNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("John", null, "123456789", "0123456789", "1 N st");
		});
	}
	
	@Test
	// Test to ensure the last name is not more than 10 characters
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("John", "Doeeeeeeeeee", "123456789", "0123456789", "1 N st");
		});
	}
	
	@Test
	// Test to ensure that a contact Id is present
	void testContactIdNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("John", "Doe", null, "0123456789", "1 N st");
		});
	}
	
	@Test
	// Test to ensure that contact Id is not more than 10 characters
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("John", "Doe", "12345678999", "0123456789", "1 N st");
		});
	}
	
	@Test
	// Test to ensure a number is present
	void testNumberNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("John", "Doe", "123456789", null, "1 N st");
		});
	}
	
	@Test
	// Test to ensure the number is 10 characters
	void testNumberTen() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("John", "Doe", "123456789", "012345678999", "1 N st");
		});
	}
	
	@Test
	// Test to ensure that an address is present
	void testAddressNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("John", "Doe", "123456789", "0123456789", null);
		});
	}
	
	@Test
	// Test to ensure that the address is not longer than 30 characters
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("John", "Doe", "123456789", "0123456789", "1 N stttttttttttttttttttttttttttttttt");
		});
	}
	
	@Test
	// Test to ensure that ContactService can update a contact
	void testSetters() {
		Contact contact = new Contact("John", "Doe", "123456789", "0123456789", "1 N st");
		contact.setFirstName("Bill");
	    contact.setAddress("2 N st");
	    contact.setLastName("Smith");
	    contact.setNumber("5555555555");
	    assertTrue(contact.address.equals("2 N st"));
	    assertTrue(contact.firstName.equals("Bill"));
	    assertTrue(contact.lastName.equals("Smith"));
	    assertTrue(contact.number.equals("5555555555"));
	}
	
	@Test
	// Test to ensure the first name was entered was not null
	void testFirstNameNotNullSetter() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("John", "Doe", "123456789", "0123456789", "1 N st");
			contact.setFirstName(null);
		});
	}
	
	@Test
	// To test that the first name being updated isn't too long
	void testFirstNameTooLongSetter() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("John", "Doe", "123456789", "0123456789", "1 N st");
			contact.setFirstName("jjjjjjjjjjjjjjj");
		});
	}
	
	@Test
	// To ensure that that last name being updated isn't null
	void testLastNameNotNullSetter() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("John", "Doe", "123456789", "0123456789", "1 N st");
			contact.setLastName(null);
		});
	}
	
	@Test
	// Too ensure that the Last name being updated isn't too long
	void testLastNameTooLongSetter() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("John", "Doe", "123456789", "0123456789", "1 N st");
			contact.setLastName("jjjjjjjjjjjjjjj");
		});
	}
	
	@Test
	// To ensure that the address being updated isn't null
	void testAddressNotNullSetter() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("John", "Doe", "123456789", "0123456789", "1 N st");
			contact.setAddress(null);
		});
	}
	
	@Test
	// To ensure that the address being updated isn't too long
	void testAddressTooLongSetter() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("John", "Doe", "123456789", "0123456789", "1 N st");
			contact.setAddress("jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
		});
	}
	
	@Test
	// To ensure that number being updated isn't null
	void testNumberNotNullSetter() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("John", "Doe", "123456789", "0123456789", "1 N st");
			contact.setNumber(null);
		});
	}
	
	@Test
	// To ensure that number being updated is ten
	void testNumberNotTenSetter() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("John", "Doe", "123456789", "0123456789", "1 N st");
			contact.setNumber("555555555555555");
		});
	}
	
	@Test
	// To ensure that contactId entered is less than 10
	void testContactIdNotTooLongSetter() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("John", "Doe", "123456789", "0123456789", "1 N st");
			contact.setContactId("555555555555555");
		});
	}
	
	@Test
	// To ensure that contactId entered is not null
	void testContactIdNotNullSetter() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("John", "Doe", "123456789", "0123456789", "1 N st");
			contact.setContactId(null);
		});
	}
}