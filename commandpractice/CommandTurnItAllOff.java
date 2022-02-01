package commandpractice;

import java.util.List;

public class CommandTurnItAllOff implements Command {

	List<ReceiverInterfaceElectronicDevice> theDevices;
	
	public CommandTurnItAllOff(List<ReceiverInterfaceElectronicDevice> theDevices) {
		
		this.theDevices = theDevices;
		
	}
	
	@Override
	public void execute() {
		for(ReceiverInterfaceElectronicDevice device : theDevices) {
			device.off();
		}		
	}	
	
}
