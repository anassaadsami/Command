package CommandIntro;

import java.util.ArrayList;
import java.util.List;

/*
 *  step 4 create invoker Command class 
 *  this class can access just interface and that's why 
 *  we must have interface Order here 
 */
public class Broker {
	Order order ;
	private List<Order> orderList = new ArrayList<Order>();
	
	public void takeOrder(Order order) {   // Order order = new SellStock(Stock);
		orderList.add(order);              // or  Order order = new BuyStock(Stock);
	}
	public void placeOrders() {
		for(Order order : orderList) {
			/*
			 * here before run Broker class does't know what execute() do 
			 * cause it depends on which concerate class use (command)
			 */
			order.execute();  
		}
		orderList.clear();
	}
		
	

}
