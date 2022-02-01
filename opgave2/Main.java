package opgave2;

import java.util.ArrayList;
import java.util.Collections;

import opgave1.*;

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

        // Alternatief als opgave 1 niet is gelukt:
        // Deze code maakt twee objecten van ruimteschepen
        // met de namen alternatief1 en alternatief2
        /*
        Ship alternatief1 = new Ship() {
            @Override
            public void move() {
                posX++; posY++; notifyObservers();
            }
        };
        Ship alternatief2 = new Ship() {
            @Override
            public void move() {
                posX+=2; posY*=1.5;
                notifyObservers();
            }
        };
        */

        // Observers maken en koppelen aan observables (ruimteschepen)
        Observer Apollo1Observer = new ShipObserver();
        Observer Apollo2Observer = new ShipObserver();
        Observer Cube1Observer = new ShipObserver();
        Observer Cube21Observer = new ShipObserver();
        
        apollo1.registerObserver(Apollo1Observer);
        apollo2.registerObserver(Apollo2Observer);
        cube1.registerObserver(Cube1Observer);
        cube2.registerObserver(Cube21Observer);

        // Ruimteschepen autonoom verplaatsen
        Thread t1 = new Thread(apollo1);
        Thread t2 = new Thread(apollo2);
        Thread t3 = new Thread(cube1);
        Thread t4 = new Thread(cube2);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Als alternatief1 en alternatief2 worden gebruikt:
        /*
        Thread t1 = new Thread(alternatief1);
        Thread t2 = new Thread(alternatief2);
        t1.start();
        t2.start();
         */

    }
}
