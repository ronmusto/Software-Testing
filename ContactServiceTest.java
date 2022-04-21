//Author Name: Renaldo Musto

//Date: 3/24/2022

//Course ID: CS-320

//Description: JUnit tests for the ContactService class

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Contact;
import main.ContactService;

class ContactServiceTest {

    @Test
    // Test to ensure that we can add contacts with a unique Id
    void testAddContact(){
      ContactService c = new ContactService();
      
      Contact contact = new Contact("John", "Doe", "123456789", "0123456789", "1 N st");
      
      c.addContact(contact);
      
      Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			Contact contact2 = new Contact("John", "Doe", "123456789", "0123456789", "1 N st");
            c.addContact(contact2);
		});
      }
 
	@Test
	// Test to ensure we can delete a contact with a unique Id
	void testDeleteContact(){
	  ContactService c = new ContactService();
	  
	  Contact contact = new Contact("John", "Doe", "123456789", "0123456789", "1 N st");
	  
	  int listSize = c.contactList.size();
	  
	  c.deleteContact(contact);
			
	  assertTrue(listSize != c.contactList.size());
	  
	}
	
	@Test
	// Test to ensure that we can update created contact details
	void testUpdateContact() {
		ContactService c = new ContactService();
		
	    Contact contact = new Contact("John", "Doe", "123456789", "0123456789", "1 N st");
	    
	    String newFirstName = "new first name";
	    String newLastName = "new last name";
	    String newNumber = "new last name";
	    String newAddress = "new address";
	    
	    c.updateContact(contact, newFirstName, newLastName, newAddress, newNumber);
			
	    assertTrue(contact.getFirstName().equals(newFirstName));
	    assertTrue(contact.getLastName().equals(newLastName));
	    assertTrue(contact.getAddress().equals(newAddress));
	    assertTrue(contact.getNumber().equals(newNumber));
	    
	}
}
