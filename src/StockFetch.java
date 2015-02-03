import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.nio.file.Path;

/**
 * Created by Leguar on 3/02/2015.
 */
public class StockFetch {
    public static void main(String[] args) {
        Stock stock = YahooFinance.get("BABA");

        double price = stock.getQuote().getPrice();

        System.out.println(price);
    }
}
