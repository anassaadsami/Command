package UndoCommand;

public class Button {     //invoker class have connect just with interface
	Command command;

	public Button(Command command) {    // this recommended
		this.command = command;
	}
	/*
	 *  there is another way to pass the command by calling non parameterised constructor
	 *  Buttom b = new Buttom();
	 *   ex   b.setCommand(new TVoff);
	 */
	public void setCommand(Command command){       // we use it if we have a bunch of commands
		this.command = command;
	}
	
	public void pressButton() {
		command.execute();
	}
	
	public void undo() {
		command.undo();
	}
	

}
