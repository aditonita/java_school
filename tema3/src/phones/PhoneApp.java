/**
 * 
 */
package phones;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adi
 *
 */
public class PhoneApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int id = 0;
		String lastName;
		String firstName;
		String phoneNumber;
		String textMessage;
		Contact contact;
		Message message;
		
		List<Phone> phoneList = new ArrayList<Phone>();

		SamsungYoung samsungYoung = new SamsungYoung(12, "alb");
		Phone samsungGalaxy = new SamsungGalaxyS6(15, "negru", "metal");
		Huawei huaweiP20 = new HuaweiP20(17, "verde", "plastic");
		Phone huaweiMateSE = new HuaweiMateSE(19, "roz", "mixt");
		
		samsungYoung.setImei("120tres45328hht560");
		
		phoneList.add(samsungYoung);
		phoneList.add(samsungGalaxy);
		phoneList.add(huaweiP20);
		phoneList.add(huaweiMateSE);

		id = samsungYoung.getContacts().getContacts().size() + 1;
		lastName = "primulPrenume";
		firstName = "PrimulNume";
		phoneNumber = "0741111111";
		contact = new Contact(id, phoneNumber, lastName, firstName);
		samsungYoung.addContact(contact);
		samsungYoung.call(phoneNumber);

		id = samsungYoung.getContacts().getContacts().size() + 1;
		lastName = "AlDoilePrenume";
		firstName = "AlDoileaNume";
		phoneNumber = "0742222222";
		textMessage = "Acesta este mesajul al doilea";
		contact = new Contact(id, phoneNumber, lastName, firstName);
		message = new Message();
		message.setPhoneNumber(phoneNumber);
		message.setTextMessage(textMessage);
		samsungYoung.addContact(contact);
		samsungYoung.sendMessage(phoneNumber, message);

		id = samsungGalaxy.getContacts().getContacts().size() + 1;
		lastName = "AlTreileaPrenume";
		firstName = "AlTreileaNume";
		phoneNumber = "0743333333";
		contact = new Contact(id, phoneNumber, lastName, firstName);
		samsungGalaxy.addContact(contact);
		samsungGalaxy.call(phoneNumber);
		
		id = samsungGalaxy.getContacts().getContacts().size() + 1;
		lastName = "AlPatruleaPrenume";
		firstName = "AlPatruleaNume";
		phoneNumber = "0744444444";
		textMessage = "Acesta este mesajul al patrulea";
		contact = new Contact(id, phoneNumber, lastName, firstName);
		message = new Message();
		message.setPhoneNumber(phoneNumber);
		message.setTextMessage(textMessage);
		samsungGalaxy.addContact(contact);
		samsungGalaxy.sendMessage(phoneNumber, message);
		
		id = huaweiP20.getContacts().getContacts().size() + 1;
		lastName = "AlCincileaPrenume";
		firstName = "AlCincileaNume";
		phoneNumber = "0745555555";
		contact = new Contact(id, phoneNumber, lastName, firstName);
		huaweiP20.addContact(contact);
		huaweiP20.call(phoneNumber);
		
		id = huaweiP20.getContacts().getContacts().size() + 1;
		lastName = "PrenumeSase";
		firstName = "NumeSase";
		phoneNumber = "0746666666";
		textMessage = "Acesta este mesajul sase";
		contact = new Contact(id, phoneNumber, lastName, firstName);
		message = new Message();
		message.setPhoneNumber(phoneNumber);
		message.setTextMessage(textMessage);
		huaweiP20.addContact(contact);
		huaweiP20.sendMessage(phoneNumber, message);
		
		id = huaweiMateSE.getContacts().getContacts().size() + 1;
		lastName = "PrenumeSapte";
		firstName = "NumeSapte";
		phoneNumber = "0747777777";
		textMessage = "Acesta este mesajul sapte";
		contact = new Contact(id, phoneNumber, lastName, firstName);
		message = new Message();
		message.setPhoneNumber(phoneNumber);
		message.setTextMessage(textMessage);
		huaweiMateSE.addContact(contact);
		huaweiMateSE.call(phoneNumber);
		huaweiMateSE.sendMessage(phoneNumber, message);
		
		id = huaweiMateSE.getContacts().getContacts().size() + 1;
		lastName = "PrenumeOpt";
		firstName = "NumeOpt";
		phoneNumber = "0748888888";
		textMessage = "Acesta este mesajul opt";
		contact = new Contact(id, phoneNumber, lastName, firstName);
		message = new Message();
		message.setPhoneNumber(phoneNumber);
		message.setTextMessage(textMessage);
		huaweiMateSE.addContact(contact);
		huaweiMateSE.sendMessage(phoneNumber, message);

		for (Phone phone : phoneList) {
			System.out.println(phone.getClass().getSimpleName() + " ");
			if (phone.getContacts().getContacts().size() != 0) {
				System.out.println("******** lista contacte *********");
				phone.listContacts();
			}
			if (phone.getMessages().getMessages().size() != 0) {
				System.out.println("******** lista mesaje *********");
				phone.listMessages();
			}
			if (phone.getCalls().getCalls().size() != 0) {
				System.out.println("******** vizualizare apeluri *********");
				phone.viewHistory();
			}
		}

	}

}
