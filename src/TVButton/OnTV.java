package TVButton;
/*
 *  this class delegate the onTv() in TV class
 *  this called concerate class
 *  this way to encapsulate the method onTv() in receiver class as a object in this class
 */

public class OnTV implements Command {    // command1 
//	TV tv = new TV();
	TV tv ;
	
	public OnTV(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.onTv();
	}

	@Override
	public void endo() {
		tv.offTv();
		
	}
}
/*
 * this way to encapsulate the method offTv() in receiver class as a object in this class
 */
 class OffTV implements Command {   // command2
	TV tv = new TV();
	/*
	 * we can use this way also
	 */
//	TV tv ;
	
//	public OffTV(TV tv) {
//		this.tv = tv;
//	}

	
	@Override
	public void execute() {
		tv.offTv();
	}
	@Override
	public void endo() {
		tv.onTv();
		
	}
}
