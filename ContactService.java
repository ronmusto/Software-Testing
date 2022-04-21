//Author Name: Renaldo Musto

//Date: 3/24/2022

//Course ID: CS-320

//Description: This class adds deletes and modifies contacts

package main;
import java.util.ArrayList;
public class ContactService {
  
        public ArrayList<Contact> contactList;

        public ContactService(){
           contactList = new ArrayList<Contact>();
        }
  
     	public void addContact(Contact contact){
          
          String newId = contact.getContactId();
          
        for (int i=0; i < contactList.size(); i++) {
          String id = contactList.get(i).getContactId();
            if (id.equals(newId)) {
              throw new IllegalArgumentException("Duplicate Id Found");
            }
        }
          
          contactList.add(contact);
     }   	
     	
	public void updateContact(Contact contact, String newFirstName, String newLastName, String newNumber, String newAddress) {
	 	
		String idToUpdate = contact.getContactId();
		
		for (int i=0; i < contactList.size(); i++) {
			String id = contactList.get(i).getContactId();
			   if (id.equals(idToUpdate)) {
				   contactList.get(i).setFirstName(newFirstName);
				   contactList.get(i).setLastName(newLastName);
				   contactList.get(i).setAddress(newAddress);
				   contactList.get(i).setNumber(newNumber);
			   }
		}
	}
	
    public void deleteContact(Contact contact) {
    	
        String idToDelete = contact.getContactId();
     
        for (int i=0; i < contactList.size(); i++) {
           String id = contactList.get(i).getContactId();
              if (id.equals(idToDelete)) {
                 contactList.remove(i);
              }
        }
        
        for (int i=0; i < contactList.size(); i++) {
           String id = contactList.get(i).getContactId();
              if (id.equals(idToDelete)) {
                 throw new IllegalArgumentException("Task Not Deleted");
              }
        }
     }
}
