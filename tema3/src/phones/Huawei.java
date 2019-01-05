package phones;

public abstract class Huawei extends Phone {

private String color;
private String material;

	public Huawei(int bateryLife, String color, String material) {
		super(bateryLife);

		this.color = color;
		this.material = material;
	}
}
