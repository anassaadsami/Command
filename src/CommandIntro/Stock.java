package CommandIntro;

class Stock {      // second step create a request class (receiver class) which have have the actions
	
	private String name = "abc";
	private int quantity = 10 ;

	public void sell() {
		System.out.println("Stock [name= " + name + ", quantity= " + quantity + "] sold");
	}
	
	public void buy() {
		System.out.println("Stock [name= " + name + ", quantity= " + quantity + "] bought");
	}



}
