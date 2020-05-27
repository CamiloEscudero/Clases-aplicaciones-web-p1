package unibe.edu.ec.examen;

public class Product {

	 private String name,description;
	 private double price;
	 private int stock;
	 
	 public Product() {
		 
	 }
	 
	 public Product(String name,String description,double price, int stock) {
		
		 this.name = name;
		 this.description= description;
		 this.price=price;
		 this.stock=stock;
	 }
	 
	 public Product(String name,String description) {
     this.name = name;
     this.description = description; 
}
	 public Product(double price, int stock ) {
		 this.price=price;
		 this.stock=stock;
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	 
	 
}
