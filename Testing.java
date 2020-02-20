package NewEgg;

public class Testing {
	
	public static void main(String [] args) { 
		
		
		// Java Singleton Pattern + Composition has-a relationship
		GameSetup gameSetup = new GameSetup();
		System.out.print(gameSetup.getDXRacer_Racing_Series());
		
		// Java Generic Class <T, U>
		InternetSecurity <String, Double> Malware = new InternetSecurity<String, Double>("Malwarebytes Anti-Malware", 39.99); 
		Malware.print(); 
	
		
		// Java Factory Pattern(Singleton Pattern + Polymorphism (Overriding ToString Method) 
		Factory products = Factory.getInstance();

			
	 	// Usage Of Polymorphism : If you comment out the printlns for Factory instance products then it will still print all the products
	 	for (Products item : products.getProductsList()) {
	 		System.out.println(item);
	 	}
		
	}
}