package opgave1;

public class BorgFactory implements ShipFactory {

	@Override
	public Ship makeShip(int type) {
		Ship ship = null;		
		
		if ( type > 2 ) {
			throw new IllegalArgumentException("Invalid shiptype");
		}
		else {
			if(type == 1) {
				ship = new Cube1();
				System.out.println("Make a Cube 1");
			}
			if(type == 2) {
				ship = new Cube2();
				System.out.println("Make a Cube 2");
			}
			return ship;
		}
	}

}
