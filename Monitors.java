package NewEgg;

public class Monitors extends Products {
	
	// Declare Fields 
	private String screenResolution;
	private String manufacturer;
	private int responseTime;
	private double refreshRate;
	private double screenSize;
	
	// Create Constructor 
	public Monitors(String productName, double productCost, String screenResolution, String manufacturer,
			int responseTime, double refreshRate, double screenSize) {
		super(productName, productCost);
		this.screenResolution = screenResolution;
		this.manufacturer = manufacturer;
		this.responseTime = responseTime;
		this.refreshRate = refreshRate;
		this.screenSize = screenSize;
	}

	// Getter and Setters 
	public String getScreenResolution() {
		return screenResolution;
	}

	public void setScreenResolution(String screenResolution) {
		this.screenResolution = screenResolution;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(int responseTime) {
		this.responseTime = responseTime;
	}

	public double getRefreshRate() {
		return refreshRate;
	}

	public void setRefreshRate(double refreshRate) {
		this.refreshRate = refreshRate;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	
	
	// Name, Cost, ScreenResolution, Manufacturer, ResponseTime, RefreshTime, ScreenSize 

	@Override // Polymorphism in Java
	public String toString() {
		
		return "----------------------------------------" 
		+ "\n" +      "          [ Monitors Details ] " + "\n"
				+ "----------------------------------------" + "\n" 
		+ "  Series: " + getProductName() + "\n" + "\n" 
		+ " Cost: $" + getProductCost() + "\n"
		+ " Screen Resolution: " + getScreenResolution() + "\n" 
		+ " Manufacturer: " + getManufacturer() + "\n" 
		+ " Response Time: " + getResponseTime() + "ms" + "\n" 
		+ " Refresh Time: " + getRefreshRate() + "\n" 
		+ " Screen Size: " + getScreenSize() + "\n" +
		"----------------------------------------" + "\n";

	}

}