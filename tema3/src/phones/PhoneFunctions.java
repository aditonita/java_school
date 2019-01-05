package phones;

public interface PhoneFunctions {

	public void addContact(Contact contact);
	
	public void listContacts();
	
	public void sendMessage(String phoneNumber, Message message);
	
	public void listMessages();
	
	public void call(String phoneNumber);
	
	public void viewHistory();
	
}
