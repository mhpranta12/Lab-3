
public class Newpro {
	int price;
	String size;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Newpro(int price, String size) {
		super();
		this.price = price;
		this.size = size;
	}
	@Override
	public String toString() {
		return "Newpro [price=" + price + ", " + (size != null ? "size=" + size : "") + "]";
	}
	
}
