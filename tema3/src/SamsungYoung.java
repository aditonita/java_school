import phones.Samsung;

/**
 * 
 */

/**
 * @author banu
 *
 */
public class SamsungYoung extends Samsung {

	/**
	 * @param baterieLife
	 * @param color
	 * @param material
	 */

	private String imei;

	public SamsungYoung(int baterieLife, String color, String material) {
		super(baterieLife, color, material);
		// TODO Auto-generated constructor stub
	}
	
	public String getImei() {
		return this.imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

}
