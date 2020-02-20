package NewEgg;

public class GamingChairs {

	// Declare Fields 
	private String name;
	private String color;
	private String type;
	private double price;
	
	// Declare Constructor
	public GamingChairs(String name, String color, String type, double price) {
		super();
		this.color = color;
		this.type = type;
		this.price = price;
		this.name = name;
	}
	
	// Getters + Setters 
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		
		return "----------------------------------------" 
		+ "\n" +      "           [ Chairs Details ] " + "\n" + "----------------------------------------" + "\n"
				+ "  Series: " + getName() + "\n" + "\n" +
		" Cost: $" + getPrice() + "\n" + 
		 " Primary Color: " + getColor() + "\n" 
		+ " Chair Type: " + getType() + "\n" 
		+ "----------------------------------------" + "\n";
		
	}
		
}