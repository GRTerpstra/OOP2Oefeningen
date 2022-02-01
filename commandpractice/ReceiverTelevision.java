package commandpractice;

public class ReceiverTelevision implements ReceiverInterfaceElectronicDevice {

	private int volume = 0;
	
	@Override
	public void on() {
		System.out.println("TV is on.");
		
	}

	@Override
	public void off() {
		System.out.println("TV is off.");
		
	}

	@Override
	public void volumeUp() {
		volume++;
		System.out.println("TV is at volume " + this.volume);
		
	}

	@Override
	public void volumeDown() {
		volume--;
		System.out.println("TV is at volume " + this.volume);
		
	}
	
}
