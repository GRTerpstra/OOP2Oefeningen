package commandpractice;

public class CommandTurnTVDown implements Command {

	ReceiverInterfaceElectronicDevice ReceiverInterfaceElectronicDevice;
	
	public CommandTurnTVDown(ReceiverInterfaceElectronicDevice ReceiverInterfaceElectronicDevice) {
		this.ReceiverInterfaceElectronicDevice = ReceiverInterfaceElectronicDevice;
	}
	
	@Override
	public void execute() {
		ReceiverInterfaceElectronicDevice.volumeDown();		
	}

}