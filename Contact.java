package contact_service;

public class Contact {
	private String contactID;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    // Constructor
    public Contact(String contactID, String firstName, String lastName, String phone, String address) {
    	if(contactID != null && contactID.length() <= 10) {
    		this.contactID = contactID;
    	}
    	else {
    		throw new IllegalArgumentException("invalid argument");
    	}
    	
    	if(firstName != null && firstName.length() <= 10) {
    		this.firstName = firstName;
    	}
    	else {
    		throw new IllegalArgumentException("invalid argument");
    	}
    	
    	if(lastName != null && lastName.length() <= 10) {
    		this.lastName = lastName;
    	}
    	else {
    		throw new IllegalArgumentException("invalid argument");
    	}
    	
    	if(phone != null && phone.length() == 10 ) {
    		this.phone = phone;
    	}
    	else {
    		throw new IllegalArgumentException("invalid argument");
    	}
    	
    	if(address != null && address.length() <= 30){
    		this.address = address;
    	}
    	else {
    		throw new IllegalArgumentException("invalid argument");
    	}
    }
    // Getters and setters
    public String getContactID() {
        return contactID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

