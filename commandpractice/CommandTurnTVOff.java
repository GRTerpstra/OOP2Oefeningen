package commandpractice;

public class CommandTurnTVOff implements Command {

	ReceiverInterfaceElectronicDevice ReceiverInterfaceElectronicDevice;
	
	public CommandTurnTVOff(ReceiverInterfaceElectronicDevice ReceiverInterfaceElectronicDevice) {
		this.ReceiverInterfaceElectronicDevice = ReceiverInterfaceElectronicDevice;
	}
	
	@Override
	public void execute() {
		ReceiverInterfaceElectronicDevice.off();		
	}

}