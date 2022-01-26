package UndoCommand;

public class TVoff implements Command {
	TV tv ;

	public TVoff(TV tv) {
	this.tv = tv;
}

	@Override
	public void execute() {
		tv.off();
		
	}

	@Override
	public void undo() {
		tv.on();
		
	}

}
