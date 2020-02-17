
public class Product {
	String code;
	String description;
	double price;
	public String getCode() {
		return code;
	}
	public Product(String code, String description, double price) {
		super();
		this.code = code;
		this.description = description;
		this.price = price;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [" + (code != null ? "code=" + code + ", " : "")
				+ (description != null ? "description=" + description + ", " : "") + "price=" + price + "]";
	}
	
}
