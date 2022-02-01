package commandpractice;

public class ReceiverRadio implements ReceiverInterfaceElectronicDevice {

private int volume = 0;
	
	@Override
	public void on() {
		System.out.println("Radio is on.");
		
	}

	@Override
	public void off() {
		System.out.println("Radio is off.");
		
	}

	@Override
	public void volumeUp() {
		volume++;
		System.out.println("Radio is at volume " + this.volume);
		
	}

	@Override
	public void volumeDown() {
		volume--;
		System.out.println("Radio is at volume " + this.volume);
		
	}
	
}
