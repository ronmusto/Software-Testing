//Author Name: Renaldo Musto

//Date: 3/24/2022

//Course ID: CS-320

//Description: The class that allows us to create contacts

package main;

public class Contact {
	
	// Establish variables
	public String firstName;
	public String lastName;
	public String contactId;
	public String number;
	public String address;
	
	public Contact(String firstName, String lastName, String contactId, String number, String address) {
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid Input");
		}
		
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Input");
		}
		
		if(contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Invalid Input");
		}
		
		if(number == null || number.length() != 10) {
			throw new IllegalArgumentException("Invalid Input");
		}
		
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Input");
		}
		
		// If all tests pass assign values to variables
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactId = contactId;
		this.number = number;
		this.address = address;
	}
	
    // Get methods to allow for testing constructor
	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getContactId() {
		return contactId;
	}

	public String getNumber() {
		return number;
	}

	public String getAddress() {
		return address;
	}
	
	// Setter methods for ContactService class
	public void setLastName(String lastName) {
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Input");
        }
		this.lastName = lastName;
	}
	
	public void setFirstName(String firstName) {
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid Input");
		}
		this.firstName = firstName;
	}
	
	public void setAddress(String address) {
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Input");
		}
		this.address = address;
	}
	
	public void setNumber(String number) {
		if(number == null || number.length() != 10) {
			throw new IllegalArgumentException("Invalid Input");
		}
		this.number = number;
	}
	
	public void setContactId(String contactId) {
		if(contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Invalid Input");
		}
		this.contactId = contactId;
	}
}