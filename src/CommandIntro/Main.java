package CommandIntro;

public class Main {

	public static void main(String[] args) {
		Stock stock = new Stock();
		SellStock sell = new SellStock(stock);
		BuyStock buy = new BuyStock(stock);
		
		Broker broker = new Broker();
		broker.takeOrder(buy);
		broker.takeOrder(sell);
		
		broker.placeOrders();

	}

}
