package UndoCommand;

public class VolumeDown implements Command {
	TV tv ;

	public VolumeDown(TV tv) {
	this.tv = tv;
}

	@Override
	public void execute() {
		tv.volumeDown();
		
	}

	@Override
	public void undo() {
		tv.volumeUpp();
		
	}

}
