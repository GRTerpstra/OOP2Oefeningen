package opgave1;

public class Cube2 extends Ship {
	
	@Override
	public void move() {
		
		super.type = "Cube2";
		super.posX = super.posX;
		super.posY = super.posY * 0.8;
		notifyObservers();
		
	}

}
