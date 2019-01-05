package phones;

import java.util.ArrayList;
import java.util.List;

public class Message {
	private static final int MAXMSGLENGTH = 100;
	private String phoneNumber;
	private List<String> textMessage = new ArrayList<String>();

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String telNumber) {
		this.phoneNumber = telNumber;
	}

//	public List<String> getTextMessage() {
//		return textMessage;
//	}

	public void setTextMessage(String textMessage) {
		while (textMessage.length() > MAXMSGLENGTH) {
			if (textMessage.length() > MAXMSGLENGTH) {
				this.textMessage.add(textMessage.substring(0, MAXMSGLENGTH));
				textMessage = textMessage.substring(MAXMSGLENGTH);
			}
		}
		this.textMessage.add(textMessage);
	}
	
	public void displayMessage() {
		for (String textMessage : this.textMessage) {
				System.out.println(this.phoneNumber + " " + textMessage);
		}

	}
}
