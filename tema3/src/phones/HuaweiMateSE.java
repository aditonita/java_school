package phones;

public class HuaweiMateSE extends Huawei {
	
	private String imei;
	
	public HuaweiMateSE(int bateryLife, String color, String material) {
		super(bateryLife, color, material);

	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	
}
