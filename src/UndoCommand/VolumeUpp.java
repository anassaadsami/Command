package UndoCommand;

public class VolumeUpp implements Command {
	TV tv ;

	public VolumeUpp(TV tv) {
	this.tv = tv;
}

	@Override
	public void execute() {
		tv.volumeUpp();
		
	}

	@Override
	public void undo() {
		tv.volumeDown();
		
	}
}
