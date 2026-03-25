package cambio.util;

public class CurrencyConverter {

    public static final double IOF = 0.06;
    public static double dollar_Price;
    public static double dollar_Qty;

    public static double exchange_Dollar(){
        return dollar_Price * dollar_Qty + dollar_Price * dollar_Qty * IOF;
    }
}
