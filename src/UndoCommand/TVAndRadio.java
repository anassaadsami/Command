package UndoCommand;

public class TVAndRadio implements Command {
	TV tv ;
	Radio ra ;
	
	public TVAndRadio(TV tv, Radio ra) {
		this.tv = tv;
		this.ra = ra;
	}

	@Override
	public void execute() {
		tv.on();
		ra.on();
		
	}

	@Override
	public void undo() {
		tv.off();
		ra.off();
		
	}
	
}
