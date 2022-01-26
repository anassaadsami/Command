package UndoCommand;

public class TVon implements Command{
  TV tv ;

	public TVon(TV tv) {
	this.tv = tv;
}

	@Override
	public void execute() {
		tv.on();
		
	}

	@Override
	public void undo() {
		tv.off();
		
	}

}
