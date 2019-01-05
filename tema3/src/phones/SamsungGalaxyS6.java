package phones;

public class SamsungGalaxyS6 extends Samsung {

	private String imei;
	
	public SamsungGalaxyS6(int baterieLife, String color, String material) {
		super(baterieLife, color, material);

	}

	public String getImei() {
		return this.imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}


}
