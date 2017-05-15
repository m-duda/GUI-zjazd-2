package zad3;

public class ReversibleDouble implements Reversible {
    private double number;

    public ReversibleDouble (double number){
    this.number=number;
    }
    @Override
    public Reversible reverse() {
        if (number != 0.0){
            number=1/number;
        }
        else number =0;
        return null;
    }

    @Override
    public String toString() {
        return ""+number;
    }
}
