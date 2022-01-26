package CommandIntro;

/*
 *  Step 3 is create concerate class (command class ) and and make the request class
 *  as a reference variable and implements the interface and override the method
 *  and make the body as a concerate method in request class.
 *  CAPSULATE THE REQUEST AS AN OBJECT
 */
public class SellStock implements Order{   
	Stock stock ;
	

	public SellStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public void execute() {
		stock.sell();
		
		
	}

}
/*
 *  make another concerate class (command2 ) cause we have tow concerate method in request class (receiver class)
 *   CAPSULATE THE REQUEST AS AN OBJECT
 */

 class BuyStock implements Order{   
	Stock stock ;
	
	
	public BuyStock(Stock stock) {
		this.stock = stock;
	}
	
	@Override
	public void execute() {
		stock.buy();
		
		
	}
	
}
