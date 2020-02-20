package NewEgg;

public class Products {
	
	// Declare Fields 
	private String productName;
	private double productCost;
	
	
	// Create Constructor Using Fields 
	public Products(String productName, double productCost) {
		super();
		this.productName = productName;
		this.productCost = productCost;
	}

	
	// Create Getters And Setters 
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductCost() {
		return productCost;
	}

	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}


	@Override
	public String toString() {
		return "Products [productName=" + productName + ", productCost=" + productCost + ", getProductName()="
				+ getProductName() + ", getProductCost()=" + getProductCost() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}