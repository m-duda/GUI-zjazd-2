package zad2;

public class Lilac extends Flower {
	private int quantity;
    
    @Override
    public String getName() {
        return "bez";
    }
    
    @Override
    public String getColor() {
        return "biały";
    }
    
    @Override
    public int getQuantity() {
        return quantity;
    }

    public Lilac(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return getName()+", kolor: "+getColor()+", ilość "+getQuantity()+", cena ";
    }
}