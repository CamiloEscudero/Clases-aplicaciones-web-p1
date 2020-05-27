package unibe.edu.ec.examen;

public class Item {
	public Product product; 
	public double discount;
	public double tax;
	
	public Item(Product product, double discount, double tax) {
		this.product = product;
		this.discount = discount;
		this.tax = tax;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getRealDiscount() {
		double discount = this.discount * this.product.getPrice();
		return discount;
	}
	public double getRealTax(double quantity) {
		
	return tax = quantity *	this.tax*this.product.getPrice();
	
	
	
	}
	
}
