package commandpractice;

public class TVRemote {

	public static ReceiverInterfaceElectronicDevice getDevice() {
		return new ReceiverTelevision();
	}
	
}
