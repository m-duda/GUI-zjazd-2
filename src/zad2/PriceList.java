package zad2;

import java.util.HashMap;

public class PriceList extends HashMap {
    private static PriceList pl;

    public static PriceList getInstance (){
        pl = new PriceList();
        return pl;
    }

    public PriceList getList(){
        return pl;
    }


}
