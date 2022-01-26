package UndoCommand;

import java.util.ArrayList;
import java.util.Arrays;

public class Client {


	public static void main(String[] args) {
		TV tv = new TV();
		TVon onTV = new TVon(tv);
		TVoff offTV = new TVoff(tv);
		VolumeUpp upp = new VolumeUpp(tv);
		VolumeDown down = new VolumeDown(tv);
		
		// we pass the onTV object to button 
		Button button = new Button(onTV);   // we create just one button and use it 
		button.pressButton();               // for many functions 
		button.undo();
		
		// we pass the offTV object to button 
		button = new Button(offTV);   // 
		button.pressButton();
		button.undo();
		
		// we pass the upp object to button 
		button = new Button(upp);
		button.pressButton();
		button.pressButton();
		button.pressButton();
		button.pressButton();
		button.undo();
		
		// we pass the down object to button 
		button = new Button(down);
		button.pressButton();
		button.undo();
		
		// this is for multiple devices
		Radio ra = new Radio();
		TVAndRadio allDevice = new TVAndRadio(tv, ra);
		button = new Button(allDevice);
		button.pressButton();
		button.undo();
		System.out.println("---------------------");
//		ArrayList<ElectronicDevice> deviceList = new ArrayList<>(Arrays.asList(tv , ra));
//		for (ElectronicDevice item : deviceList) {
//			TVon onTV1 = new TVon(tv);
//			button = new Button(onTV1);
//			button.pressButton();
//			
//		}
				
		

	}

}
