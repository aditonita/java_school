package phones;

public class Call {
	private String lastName = "";
	private String firstName = "";
	private String phoneNumber;
	private CallType callType;

	/**
	 * 
	 * @param lastName
	 * @param firstName
	 * @param phoneNumber
	 * @param callType
	 */
	public Call(String lastName, String firstName, String phoneNumber, CallType callType) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.phoneNumber = phoneNumber;
		this.callType = callType;
	}

	public void displayCall() {
		System.out.println(this.phoneNumber + " " + this.lastName + " " + this.firstName + " " + this.callType);
	}

}
