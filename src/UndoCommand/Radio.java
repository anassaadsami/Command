package UndoCommand;
/*
 *  now we create another device Radio 
 */
public class Radio implements ElectronicDevice{
	int volume = 0;

	@Override
	public void on() { // for all these methods must we create different classes to encapsulate the
						// methods
		System.out.println("Radio is on");

	}

	@Override
	public void off() {
		System.out.println("Radio is off");

	}

	@Override
	public void volumeUpp() {
		System.out.println("Radio volume is set to " + volume++);

	}

	@Override
	public void volumeDown() {
		System.out.println("Radio volume is set to " + volume--);

	}

}
