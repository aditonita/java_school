package phones;

public abstract class Samsung extends Phone {

	private String color;
	private String material;

//	public Samsung(Contacts contacts, Messages messages, Calls calls, int baterieLife, String color, String material) {
	public Samsung(int baterieLife, String color, String material) {
//		super(contacts, messages, calls, baterieLife);
		super(baterieLife);
		this.color = color;
		this.material = material;
	}

}
