import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.nio.file.Path;

/**
 * Created by Leguar on 3/02/2015.
 */
public class StockFetch {
    Stock stock = YahooFinance.get("BABA");

    private double price = stock.getQuote().getPrice();

    public double getPrice() {
        return price;
    }
}
