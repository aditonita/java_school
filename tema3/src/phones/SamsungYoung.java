package phones;

public class SamsungYoung extends Samsung {

	private String imei;

//	public SamsungYoung(Contacts contacts, Messages messages, Calls calls, int baterieLife, String color) {
	public SamsungYoung(int baterieLife, String color) {
//		super(contacts, messages, calls, baterieLife, color, "PLASTIC");
		super(baterieLife, color, "PLASTIC");

	}

	public String getImei() {
		return this.imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

}
