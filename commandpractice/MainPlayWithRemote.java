package commandpractice;

import java.util.ArrayList;
import java.util.List;

public class MainPlayWithRemote {

	public static void main(String[] args) {
		
		ReceiverInterfaceElectronicDevice newDevice = TVRemote.getDevice();		
		
		CommandTurnTVOn onCommand = new CommandTurnTVOn(newDevice);		
		InvokerDeviceButton button = new InvokerDeviceButton(onCommand);
		button.press();
		
		CommandTurnTVOff offCommand = new CommandTurnTVOff(newDevice);	
		button = new InvokerDeviceButton(offCommand);		
		button.press();
		
		CommandTurnTVUp volUpCommand = new CommandTurnTVUp(newDevice);	
		button = new InvokerDeviceButton(volUpCommand);		
		button.press();
		button.press();
		button.press();
		
		CommandTurnTVDown volDownCommand = new CommandTurnTVDown(newDevice);	
		button = new InvokerDeviceButton(volDownCommand);		
		button.press();
		button.press();
		button.press();
		
		ReceiverTelevision theTV = new ReceiverTelevision();
		ReceiverRadio theRadio = new ReceiverRadio();		
		ArrayList<ReceiverInterfaceElectronicDevice> allDevices = new ArrayList<ReceiverInterfaceElectronicDevice>();		
		allDevices.add(theTV);;
		allDevices.add(theRadio);
		
		CommandTurnItAllOff turnOffDevices = new CommandTurnItAllOff(allDevices);		
		button = new InvokerDeviceButton(turnOffDevices);
		button.press();
	}
	
}
