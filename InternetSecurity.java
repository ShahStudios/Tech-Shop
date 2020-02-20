package NewEgg;

// Generic class 
public class InternetSecurity <T, U>  {

	T securityBrand;  
    U moneyCurrency;
	
    // Create constructor 
    public InternetSecurity(T securityBrand, U cost) {
		super();
		this.securityBrand = securityBrand;
		this.moneyCurrency = cost;
	}  
	
    // Declare method 
    public void print() 
    { 
    	System.out.println();
    	System.out.println("----------------------------------------");
    	System.out.println("          [ Internet Security ] ");
    	System.out.println("----------------------------------------");
    	System.out.println("  Malwarebytes Anti-Malware 3.0  ");
        System.out.println("\n" + "AntiVirus: " + securityBrand); 
        System.out.println("Cost: $" + moneyCurrency); 
    	System.out.println("----------------------------------------" + "\n");
    } 
    
} 