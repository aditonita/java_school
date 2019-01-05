package phones;

public abstract class Phone implements PhoneFunctions {

	private int bateryLife;

	private Contacts contacts = new Contacts();
	private Messages messages = new Messages();
	private Calls calls = new Calls();

	protected Phone(int bateryLife) {
		this.bateryLife = bateryLife;
	}

	/**
	 * 
	 * @param contacts
	 * @param messages
	 * @param calls
	 * @param bateryLife
	 */
//	protected Phone(Contacts contacts, Messages messages, Calls calls, int bateryLife) {
//		this(bateryLife);
//		this.contacts = contacts;
//		this.messages = messages;
//		this.calls = calls;
//	}

	public void bateryStatus() {
			System.out.println("Batery phone has " + this.bateryLife);
	}

	public void addContact(Contact contact) {
		this.contacts.addContact(contact);
	}

	public void listContacts() {
		for (Contact contact : this.contacts.getContacts()) {
			contact.displayContact();
		}

	}

	public void sendMessage(String phoneNumber, Message message) {
		if (this.bateryLife > 0) {
			this.bateryLife = this.bateryLife - 1;
			this.messages.addMessage(message);
			String lastName = this.contacts.searchContactByNumber(phoneNumber).getLastName();
			String firstName = this.contacts.searchContactByNumber(phoneNumber).getFirstName();
			Call call = new Call(lastName, firstName, phoneNumber, CallType.MESSAGE);
			this.calls.addCall(call);
		}
	}

	public void listMessages() {
		for (Message message : this.messages.getMessages()) {
			message.displayMessage();
		}
	}

	public void call(String phoneNumber) {
		if (this.bateryLife > 1) {
			this.bateryLife = this.bateryLife - 2;
			String lastName = this.contacts.searchContactByNumber(phoneNumber).getLastName();
			String firstName = this.contacts.searchContactByNumber(phoneNumber).getFirstName();
			Call call = new Call(lastName, firstName, phoneNumber, CallType.VOICE);
			this.calls.addCall(call);
		}
	}

	public void viewHistory() {
		for (Call call : this.calls.getCalls()) {
			call.displayCall();
		}
	}

	public Contacts getContacts() {
		return contacts;
	}

	public void setContacts(Contacts contacts) {
		this.contacts = contacts;
	}

	public Messages getMessages() {
		return messages;
	}

	public void setMessages(Messages messages) {
		this.messages = messages;
	}

	public Calls getCalls() {
		return calls;
	}

	public void setCalls(Calls calls) {
		this.calls = calls;
	}

}
