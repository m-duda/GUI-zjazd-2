package zad3;

public class ReversibleString implements Reversible {
    private String text;
    public ReversibleString (String text){
        this.text = text;
    }

    @Override
    public Reversible reverse() {
        StringBuffer tmpText= new StringBuffer(text);
        tmpText.reverse();
        text=tmpText.toString();
        return null;
    }

    @Override
    public String toString() {
        return text;
    }
}
