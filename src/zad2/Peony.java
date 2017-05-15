package zad2;

public class Peony extends Flower {
    private int quantity;
    
    @Override
    public String getName() {
        return "piwonia";
    }
    
    @Override
    public String getColor() {
        return "czerwony";
    }
    
    @Override
    public int getQuantity() {
        return quantity;
    }

    public Peony(int quantity) {
        this.quantity = quantity;
    }
    
    @Override
    public String toString() {
        return getName()+", kolor: "+getColor()+", ilość "+getQuantity()+", cena ";
    }
}