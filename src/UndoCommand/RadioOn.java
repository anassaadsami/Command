package UndoCommand;

public class RadioOn implements Command {
	Radio ra ;

	public RadioOn(Radio ra) {
	this.ra = ra;
}

	@Override
	public void execute() {
		ra.on();
		
	}

	@Override
	public void undo() {
		ra.off();
		
	}


}

class RadioOff implements Command {
	Radio ra ;
	
	public RadioOff(Radio ra) {
		this.ra = ra;
	}
	
	@Override
	public void execute() {
		ra.on();
		
	}
	
	@Override
	public void undo() {
		ra.off();
		
	}
	
	
}
