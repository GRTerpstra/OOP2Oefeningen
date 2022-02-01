package opgave1;

public class Apollo1 extends Ship {

	@Override
	public void move() {
		super.type = "Apollo1";
		super.posX = super.posX * 1.5;
		super.posY = super.posY * 1.5;
		notifyObservers();
	}	

}
