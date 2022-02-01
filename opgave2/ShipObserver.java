package opgave2;

import opgave1.Ship;

public class ShipObserver implements Observer {

	private final String name;
	
	public ShipObserver() {
		name = "";
	}
	
	@Override
	public void update(Subject subject) {
		Ship ship = (Ship) subject;
		System.out.println(ship.getType() + ": " + ship.getPosX() + "," + ship.getPosY());
		
		
	}
	
	
}
