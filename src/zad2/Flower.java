package zad2;

public abstract class Flower {
	private String color;
	private String name;

    public abstract String getColor();

    public void setColor(String color) {
        this.color = color;
    }

    public abstract String getName();

    public void setName(String name) {
        this.name = name;
    }
    
    public abstract int getQuantity();

    public Flower() {
    }

    @Override
    public String toString() {
        return name+", kolor "+color;
    }
}
