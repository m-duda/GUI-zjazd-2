package zad2;

public class Customer {
    private String name;
    private double cash;
    public ShoppingCart sc;
    public String getName() {
        return name;
    }

    public double getCash() {
        return cash;
    }

    public Customer(String name, int cash) {
        this.name = name;
        this.cash = cash;
        this.sc = new ShoppingCart();
    }

    public ShoppingCart getShoppingCart (){
        sc.setCustomerName(name);
        return sc;
    }

    public void get (Flower flower){
        sc.add(flower);
    }


    public ShoppingCart pay () {
        sc.checkPriceList();
        this.cash=sc.checkMoney(cash);
        return sc;
    }

    public void pack (Box box){
        for (Flower flower : sc.getShopingCart()) {
            box.getBox().add(flower);
        }
        sc.getShopingCart().clear();
    }


}
