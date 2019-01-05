package phones;

import java.util.List;
import java.util.ArrayList;

public class Contacts {
	private List<Contact> contacts = new ArrayList<Contact>();

	public void addContact(Contact contact) {
		contacts.add(contact);
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public Contact searchContactByNumber(String phoneNumber) {
		Contact contactfind = null;
		for (Contact contact : contacts) {
			if (contact.ExistContact(phoneNumber)) {
				contactfind = contact;
			}
		}
		return contactfind;
	}
}
