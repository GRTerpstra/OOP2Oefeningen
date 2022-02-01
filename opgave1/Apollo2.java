package opgave1;

public class Apollo2 extends Ship {
	
	@Override
	public void move() {

		super.type = "Apollo2";
		super.posX = super.posX + 1;
		super.posY = super.posY + 1;
		notifyObservers();
		
	}
	
}
