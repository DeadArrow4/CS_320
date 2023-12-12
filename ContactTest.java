package contact_service;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import contact_service.Contact;

public class ContactTest {
	@Test
    public void testContactCreation() {
        Contact contact = new Contact("1234567890","FirstName","LastName","1112223333","123 Bannana AVE.");
        assertNotNull(contact);
        assertEquals("1234567890", contact.getContactID());
        assertEquals("FirstName", contact.getFirstName());
        assertEquals("LastName", contact.getLastName());
        assertEquals("1112223333", contact.getPhone());
        assertEquals("123 Bannana AVE.", contact.getAddress());
    }
	@Test
	public void testInvalidIDNotNull() {
		assertThrows(IllegalArgumentException.class, () -> {
        new Contact(null, "FirstName", "LastName", "1112223333", "123 Bannana AVE.");
		});
	}
	@Test
	public void testInvalidFirstNameNotNull() {
		assertThrows(IllegalArgumentException.class, () -> {
        new Contact("1234567890", null , "LastName", "1112223333", "123 Bannana AVE.");
		});
	}
	@Test
	public void testInvalidLastNameNotNull() {
		assertThrows(IllegalArgumentException.class, () -> {
        new Contact("1234567890", "FirstName", null , "1112223333", "123 Bannana AVE.");
		});
	}
	@Test
	public void testInvalidPhoneNotNull() {
		assertThrows(IllegalArgumentException.class, () -> {
        new Contact("1234567890", "FirstName", "LastName", null , "123 Bannana AVE.");
		});
	}
	@Test
	public void testInvalidAddressNotNull() {
		assertThrows(IllegalArgumentException.class, () -> {
        new Contact("1234567890", "FirstName", "LastName", "1112223333", null);
		});
	}
	
	@Test
	public void testInvalidContactID() {
		assertThrows(IllegalArgumentException.class, () -> {
        new Contact("12345678901", "FirstName", "LastName", "1112223333", "123 Bannana AVE.");
		});
	}

	@Test
	public void testInvalidFirstName() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "ThisIsTooLongFirstName", "LastName", "1112223333", "123 Bannana AVE.");
		});
	}

	@Test
	public void testInvalidLastName() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "FirstName", "ThisIsTooLongLastName", "1112223333", "123 Bannana AVE.");
		});
	}

	@Test
	public void testInvalidPhone() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "FirstName", "LastName", "12345", "123 Bannana AVE.");
		});	
	}

	@Test
	public void testInvalidAddress() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "FirstName", "LastName", "1234567890", "ThisAddressIsTooLongAndInvalid123");
		});
	}
}
