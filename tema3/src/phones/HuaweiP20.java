package phones;

public class HuaweiP20 extends Huawei {

	private String imei;
	
	public HuaweiP20(int bateryLife, String color, String material) {
		super(bateryLife, color, material);

	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	
}
