package contact_service;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class ContactServiceTest {
	private ContactService contactService;
    private Contact sampleContact;

    @BeforeEach
    public void setUp() {
        contactService = new ContactService();
        sampleContact = new Contact("1234567890","FirstName","LastName","1112223333","123 Bannana AVE.");
    }

    @Test
    public void testAddContact() {
        contactService.addContact(sampleContact);

        Contact retrievedContact = contactService.getContactById("1234567890");
        assertNotNull(retrievedContact);
        assertEquals(sampleContact, retrievedContact);
    }

    @Test
    public void testDeleteContact() {
        contactService.addContact(sampleContact);
        contactService.deleteContact("1234567890");

        assertNull(contactService.getContactById("1234567890"));
    }

    @Test
    public void testUpdateFirstName() {
        contactService.addContact(sampleContact);
        String newFirstName = "Jane";
        contactService.updateContact("1234567890", "firstname" ,newFirstName);

        Contact updatedContact = contactService.getContactById("1234567890");
        assertNotNull(updatedContact);
        assertEquals(newFirstName, updatedContact.getFirstName());
    }
    @Test
    public void testUpdateLastName() {
        contactService.addContact(sampleContact);
        String newLastName = "Smith";
        contactService.updateContact("1234567890", "lastname" ,newLastName);

        Contact updatedContact = contactService.getContactById("1234567890");
        assertNotNull(updatedContact);
        assertEquals(newLastName, updatedContact.getLastName());
    }
    @Test
    public void testUpdatePhone() {
        contactService.addContact(sampleContact);
        String newPhone = "7778889999";
        contactService.updateContact("1234567890", "phone" ,newPhone);

        Contact updatedContact = contactService.getContactById("1234567890");
        assertNotNull(updatedContact);
        assertEquals(newPhone, updatedContact.getPhone());
    }
    @Test
    public void testUpdateAddress() {
        contactService.addContact(sampleContact);
        String newAddress = "12 W Orange ST.";
        contactService.updateContact("1234567890", "address" , newAddress);

        Contact updatedContact = contactService.getContactById("1234567890");
        assertNotNull(updatedContact);
        assertEquals(newAddress, updatedContact.getAddress());
    }
}

