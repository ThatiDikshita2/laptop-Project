

/*@AllArgsConstructor
@Setter
@Getter
@ToString
@NoArgsConstructor */
public class Kettle {
	private int kettleId;
	private String brand;
	private float capacity;	
	private String material;
	private String storage;
	private double price;
	@Override
	public String toString() {
		return "Kettle [kettleId=" + kettleId + ", brand=" + brand + ", capacity=" + capacity + ", material=" + material
				+ ", storage=" + storage + ", price=" + price + "]";
	
	}
	public int getKettleId() {
		return kettleId;
	}
	public void setKettleId(int kettleId) {
		this.kettleId = kettleId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getCapacity() {
		return capacity;
	}
	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}



