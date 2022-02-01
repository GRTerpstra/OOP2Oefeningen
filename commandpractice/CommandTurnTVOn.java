package commandpractice;

public class CommandTurnTVOn implements Command {

	ReceiverInterfaceElectronicDevice ReceiverInterfaceElectronicDevice;
	
	public CommandTurnTVOn(ReceiverInterfaceElectronicDevice ReceiverInterfaceElectronicDevice) {
		this.ReceiverInterfaceElectronicDevice = ReceiverInterfaceElectronicDevice;
	}
	
	@Override
	public void execute() {
		ReceiverInterfaceElectronicDevice.on();		
	}

}
