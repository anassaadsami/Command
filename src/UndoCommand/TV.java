package UndoCommand;

class TV implements ElectronicDevice {    // Receiver class
	int volume = 0;

	@Override
	public void on() { // for all these methods must we create different classes to encapsulate the
						// methods
		System.out.println("TV is on");

	}

	@Override
	public void off() {
		System.out.println("TV is off");

	}

	@Override
	public void volumeUpp() {
		System.out.println("TV volume is set to " + volume++);

	}

	@Override
	public void volumeDown() {
		System.out.println("TV volume is set to " + volume--);

	}

}
