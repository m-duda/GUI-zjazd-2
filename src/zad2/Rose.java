package zad2;

public class Rose extends Flower {
	private int quantity;
    
    @Override
    public String getName() {
        return "róża";
    }
    
    @Override
    public String getColor() {
        return "czerwony";
    }
    
    @Override
    public int getQuantity() {
        return quantity;
    }

    public Rose(int quantity) {
        this.quantity = quantity;
    }
    
    @Override
    public String toString() {
        return getName()+", kolor: "+getColor()+", ilość "+getQuantity()+", cena ";
    }
}
