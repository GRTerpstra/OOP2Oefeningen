package opgave1;

public class StarFleetFactory implements ShipFactory {

	@Override
	public Ship makeShip(int type) {		
		Ship ship = null;		
		if ( type > 2 ) {
			throw new IllegalArgumentException("Invalid shiptype");
		}
		else {
			if(type == 1) {
				ship = new Apollo1();
				System.out.println("Make an Apollo 1");
			}
			if (type == 2) {
				ship = new Apollo2();
				System.out.println("Make an Apollo 2");
			}		
		}
		return ship;
	}

}
