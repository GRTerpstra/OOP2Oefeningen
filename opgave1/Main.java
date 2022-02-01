package opgave1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        // Factories maken	
        ShipFactory factory1 = new StarFleetFactory();
        ShipFactory factory2 = new BorgFactory();

        // Ruimteschepen maken
        Ship apollo1 = factory1.makeShip(1);
        Ship apollo2 = factory1.makeShip(2);
        Ship cube1 = factory2.makeShip(1);
        Ship cube2 = factory2.makeShip(2);
       
        // Ruimteschepen verplaatsen
        ArrayList<Ship> ships = new ArrayList<>();
        Collections.addAll(ships, apollo1, apollo2, cube1, cube2);
        
        for(int x = 0; x < 10; x++) {
	        for(Ship ship : ships) {
	        	ship.move();
	        	System.out.println(ship.getType() + ": " + ship.posX + "," + ship.posY);
	        }
        }

    }
}
