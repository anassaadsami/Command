package TVButton;

public class Client {

	public static void main(String[] args) {
		TV tv = new TV();
		OnTV ontv = new OnTV(tv);
//		OnTV ontv = new OnTV();  // or we can use non parameterised constructor
		OffTV offtv = new OffTV();
		Button button = new Button();
		
		if(tv.isON()) {
//		if(tv.flag) {
			button.setCommand(offtv);
//			button.setCommand(new OffTV());  // the same
			
			
		}else {
			button.setCommand(ontv);
//			button.setCommand(new OnTV());  // the same
		} 
		button.doAction();      // we close and open TV with the same button
		button.doAction();      // we close and open TV with the same button
		button.undoAction();      // we close and open TV with the same button
		
		
				

	}

}
