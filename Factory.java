package NewEgg;

import java.util.ArrayList;

public class Factory {

	// Create DataStructure: ArrayList (PolyMorphism) 
	ArrayList<Products> productsList = new ArrayList<Products>();
	
	
	// Factory Pattern (Singleton Java)
	public static Factory factory;
	
	// Hinder Other Classes To Create An Object Of This Class + Populate ArrayList
	private Factory() {
		productsList.add(Acer_XR342CK);
		productsList.add(MSI_Gaming_Desktop);
		productsList.add(ASUS_ROG_Strix);
	}

	// Getter + Setters 
	public ArrayList<Products> getProductsList() {
		return productsList;
	}

	public static Factory getInstance() {
		
		if (null == factory) {
			
			factory = new Factory();
		}
		
		return factory;
		
	}
	
	
	// Create Objects
	Laptops ASUS_ROG_Strix = new Laptops("ASUS ROG Strix Scar Edition", 1.299, "Intel Core i7-8750H 2.20 GHz", "ASUS", 32, 17.3);
	Desktops MSI_Gaming_Desktop = new Desktops("Aegis 3 Plus 8RC-233US", 1.099, "Intel Core i7 8th Gen", "MSI", 32);
	Monitors Acer_XR342CK = new Monitors("Acer XR342CK", 779.99, "3440 x 1440", "Acer", 1, 60, 34);
	
	
	// Getters 
	public static Factory getFactory() {
		return factory;
	}

	public Laptops getASUS_ROG_Strix() {
		return ASUS_ROG_Strix;
	}

	public Desktops getMSI_Gaming_Desktop() {
		return MSI_Gaming_Desktop;
	}

	public Monitors getAcer_XR342CK() {
		return Acer_XR342CK;
	}

}