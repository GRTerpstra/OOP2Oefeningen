package commandpractice;

public class CommandTurnTVUp implements Command {

	ReceiverInterfaceElectronicDevice ReceiverInterfaceElectronicDevice;
	
	public CommandTurnTVUp(ReceiverInterfaceElectronicDevice ReceiverInterfaceElectronicDevice) {
		this.ReceiverInterfaceElectronicDevice = ReceiverInterfaceElectronicDevice;
	}
	
	@Override
	public void execute() {
		ReceiverInterfaceElectronicDevice.volumeUp();		
	}

}