package contact_service;
import java.util.HashMap;
import java.util.Map;

public class ContactService {
	private Map<String, Contact> contacts;

    public ContactService() {
        this.contacts = new HashMap<>();
    }
    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getContactID())) {
            System.out.println("Contact with ID " + contact.getContactID() + " already exists.");
        } else {
            contacts.put(contact.getContactID(), contact);
            System.out.println("Contact added: " + contact.getContactID());
        }
    }

    public void deleteContact(String contactID) {
        if (contacts.containsKey(contactID)) {
            contacts.remove(contactID);
            System.out.println("Contact deleted: " + contactID);
        } else {
            System.out.println("Contact with ID " + contactID + " does not exist.");
        }
    }

    public void updateContact(String contactID, String fieldToUpdate, String updatedValue) {
        if (contacts.containsKey(contactID)) {
            Contact contact = contacts.get(contactID);
            switch (fieldToUpdate.toLowerCase()) {
                case "firstname":
                    contact.setFirstName(updatedValue);
                    break;
                case "lastname":
                    contact.setLastName(updatedValue);
                    break;
                case "phone":
                    contact.setPhone(updatedValue);
                    break;
                case "address":
                    contact.setAddress(updatedValue);
                    break;
                default:
                    System.out.println("Invalid field to update: " + fieldToUpdate);
                    return;
            }
            contacts.put(contactID, contact);
            System.out.println("Contact updated: " + contactID);
        } else {
            System.out.println("Contact with ID " + contactID + " does not exist.");
        }
    }
    public Contact getContactById(String contactId) {
        return contacts.get(contactId);
    }
}

