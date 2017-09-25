package observer;

public class Program {

    public static void main(String[] args) {
        Stock stock = new Stock("orlen", 10D);
        new StockObserver(stock);

        stock.setPrice(10D);
        stock.setPrice(10D);
        stock.setPrice(15D);


    }
}
