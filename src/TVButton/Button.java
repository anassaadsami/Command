
package TVButton;

public class Button {  // Command invoker class which know just the interface
	Command command;
	
	public void setCommand(Command command) {  //command = new OnTV()   or new OffTV()
		this.command = command;
	}
	/*
	 *  or we can use constructor instead of setCommand(Command command)
	 */
//	public Button(Command command) {
//		super();
//		this.command = command;
//	}
	/*
	 *  this class does'nt know what this method do just when we access the command 
	 */
	public void doAction() {
		command.execute();    
	}
	public void undoAction() {
		command.endo();    
	}
	
}
