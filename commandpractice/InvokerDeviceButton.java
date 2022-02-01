package commandpractice;

public class InvokerDeviceButton {
	
	Command command;
	
	public InvokerDeviceButton(Command command) {
		this.command = command;
	}
	
	public void press() {
		command.execute();
	}
	
}
