package NewEgg;

// Base Class
public class Desktops extends Products {
		
	// Declare Fields 
	private String CPU;
	private String Manufacturer;
	private int Memory;
	
	// Create Constructor 
	public Desktops(String productName, double productCost, String cPU, String manufacturer, int memory) {
		super(productName, productCost);
		CPU = cPU;
		Manufacturer = manufacturer;
		Memory = memory;
	}

	// Getters + Setters 
	public String getCPU() {
		return CPU;
	}

	public void setCPU(String cPU) {
		CPU = cPU;
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
		+ "\n" +      "          [ Desktop Details ] " + "\n" + "----------------------------------------" + "\n"
				+ "  Series: " + getProductName() + "\n" + "\n" +
		 " Cost: $" + getProductCost() + "\n" 
		+ " CPU Type: " + getCPU() + "\n"   
		+ " Manufacturer: " + getManufacturer() + "\n" 
		+ " Max Memory Supported: " + getMemory() + " GB"
		+ "\n" + "----------------------------------------" + "\n";
		
	}

}