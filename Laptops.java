package NewEgg;

public class Laptops extends Products {

	// Declare Fields 
	private String CPU;
	private String Manufacturer;
	private double screenSize;
	private int Memory;
	
	// Create Constructor Using Fields 
	public Laptops(String productName, double productCost, String cpu, String manufacturer, int memory, double screenSize) {
		super(productName, productCost);
		CPU = cpu;
		Manufacturer = manufacturer;
		Memory = memory;
		this.screenSize = screenSize;
	}


	// Getters and Setters 
	public double getScreenSize() {
		return screenSize;
	}


	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}


	// Create Getters And Setters 
	public String getCPU() {
		return CPU;
	}


	public void setCPU(String cpu) {
		CPU = cpu;
	}


	public String getManufacturer() {
		return Manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}


	public int getMemory() {
		return Memory;
	}


	public void setMemory(int memory) {
		Memory = memory;
	}

	
	@Override // Polymorphism in Java
	public String toString() {
		
		return "----------------------------------------" 
		+ "\n" +      "           [ Laptop Details ] " + "\n" + "----------------------------------------" + "\n"
				+ "  Series: " + getProductName() + "\n" + "\n" +
		 " Cost: $" + getProductCost() + "\n" 
		+ " CPU Type: " + getCPU() + "\n"    
		+ " Manufacturer: " + getManufacturer() + "\n" 
		+ " Max Memory Supported: " + getMemory() + " GB" + "\n"
		+ " Screen Size: " + getScreenSize() 
		+ "\n" + "----------------------------------------" + "\n";
		
	}

}