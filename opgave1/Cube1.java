package opgave1;

public class Cube1 extends Ship {
	
	@Override
	public void move() {
		
		super.type = "Cube1";
		super.posX = super.posX + 1;
		super.posY = 0.5 * super.posY + 5;
		notifyObservers();
		
	}

}
