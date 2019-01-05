package phones;

public class Contact {
	private int id;
	private String firstName;
	private String lastName;
	private String phoneNumber;

	/**
	 * 
	 * @param phoneNumber
	 * @param lastName
	 * @param firstName
	 */
	public Contact(int id, String phoneNumber, String lastName, String firstName) {
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.lastName = lastName;
		this.firstName = firstName;
	}

	public boolean ExistContact(String phoneNumber) {
		if (this.phoneNumber.substring(0, phoneNumber.length()) == phoneNumber) {
			return true;
		} else {
			return false;
		}
	}

	public void displayContact() {
		System.out.println(this.id + " " + this.lastName + " " + this.firstName + " " + this.phoneNumber);
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

}
