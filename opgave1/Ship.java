package opgave1;

import java.util.ArrayList;

import opgave2.Observer;
import opgave2.Subject;

abstract public class Ship implements Runnable, Subject {

    /* In opgave 1 dient deze klasse niet gewijzigd te worden
       In opgave 2b wordt deze klasse aangepast ten behoeve van het observer pattern
     */
	private ArrayList<Observer> shipObservers;
    // de positie (x en y coördinaten) van het ruimteschip
    protected double posX=100, posY=100;
    protected String type;
    
    public Ship() {
		this.shipObservers = new ArrayList<Observer>();
    }

    // methode om één verplaatsing te doen
    public abstract void move();

    // getters

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }
    
    public String getType() {
    	return type;
    }
    
    @Override
	public void registerObserver(Observer o) {
    	shipObservers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		shipObservers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : shipObservers) {
			observer.update(this);
		}
	}

    /* run-methode
       In opgave 1 kan deze methode genegeerd worden.
       In opgave 2 wordt deze methode wel gebruikt maar dient ongewijzigd te blijven. */
    @Override
    public void run() {
        for(int step=0; step>=0; step++) {
            move();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
