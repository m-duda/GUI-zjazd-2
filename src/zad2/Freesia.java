package zad2;

public class Freesia extends Flower {
	private int quantity;
       
    @Override
    public String getName() {
        return "frezja";
    }
    
    @Override
    public String getColor() {
        return "żółty";
    }
    
    @Override
    public int getQuantity() {
        return quantity;
    }

    public Freesia(int quantity) {
        this.quantity = quantity;
    }
    
    @Override
    public String toString() {
        return getName()+", kolor: "+getColor()+", ilość "+getQuantity()+", cena ";
    }
}