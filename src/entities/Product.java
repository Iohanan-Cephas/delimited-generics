package entities;

public class Product implements Comparable<Product> {
	private String name;
	private Double price;
	
	public Product(String n, Double p) {
		name = n;
		price = p;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}
	
	@Override
	public int compareTo(Product product) {
		return price.compareTo(product.getPrice());
	}
}
