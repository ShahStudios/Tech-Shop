package NewEgg;

public class GameSetup {
	
	// Composition has-a relationship
	private GamingChairs DXRacer_Racing_Series;
	
	// Constructor 
	public GameSetup() { 
		DXRacer_Racing_Series = new GamingChairs("DXRacer Racing","Black","Computer Gaming",289.99);
		DXRacer_Racing_Series.setColor("Red");
	}

	// Getter + Setter
	public GamingChairs getDXRacer_Racing_Series() {
		return DXRacer_Racing_Series;
	}

	public void setDXRacer_Racing_Series(GamingChairs dXRacer_Racing_Series) {
		DXRacer_Racing_Series = dXRacer_Racing_Series;
	}

}