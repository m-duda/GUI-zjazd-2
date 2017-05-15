package zad2;

import java.util.ArrayList;

public class ShoppingCart {

    public ArrayList<Flower> sc;
    private String customerName;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ArrayList<Flower> getShopingCart (){
        return sc;
    }

    public void add(Flower flower) {
        if (sc==null){
            sc=new ArrayList<>();
        }
        sc.add(flower);
    }

    public int size (){
        return sc.size();
    }

    private String show(){
        String tmp="";
        PriceList pl = new PriceList();
        pl = pl.getList();
        double price=0;
        if (sc.isEmpty()){
            return " -- pusto";
        }
        else {
            for (int i = 0; i < sc.size(); i++) {
                if (pl.containsKey(sc.get(i).getName())) {
                    price = (double) pl.get(sc.get(i).getName());
                } else price = -1;
                tmp = tmp + "\n" + sc.get(i).toString() + price;
            }
            return tmp;
        }
    }

    public ArrayList<Flower> checkPriceList(){
            PriceList pl = new PriceList();
            pl = pl.getList();
            if (sc!=null) {
                for (int i = 0; i < sc.size(); i++) {
                    if (pl.containsKey(sc.get(i).getName())) {
                    } else {
                        sc.remove(i);
                        i--;
                    }
                }
            }
            return sc;
    }

    public double checkMoney(double cash){
        double sum=sum();
        if (sum>cash) {
            sc.remove(sc.size()-1);
            sum = sum();
        }
        return cash-sum;
    }

    private double sum (){
        double tmp=0;
        PriceList pl = new PriceList();
        pl = pl.getList();
        for (int i = 0; i < sc.size(); i++) {
            tmp = tmp + (double)pl.get(sc.get(i).getName())*sc.get(i).getQuantity();
        }
        return tmp;
    }

    @Override
    public String toString() {
        return "Wózek właściciel "+customerName+show();
    }
}
