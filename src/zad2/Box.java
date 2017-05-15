package zad2;

import java.util.ArrayList;

public class Box {
    private String name;
    private ArrayList<Flower> box = new ArrayList<>();
    
    public Box(Customer name) {
        this.name=name.getName();
    }

    private String show(){
        String tmp="";
        PriceList pl = new PriceList();
        pl = pl.getList();
        double price=0;
        if (box!=null){
            for (int i=0; i<box.size(); i++){
                price = (double)pl.get(box.get(i).getName());
                tmp = tmp+"\n"+box.get(i).toString()+price;
            }
            return tmp;
        }
        else return "-- pusto";
    }

    public ArrayList<Flower> getBox (){

        return box;
    }

    public double counter (String color){

        PriceList pl = new PriceList();
        pl = pl.getList();
        double price=0;
        for (int i=0; i<box.size(); i++){
            if (color == box.get(i).getColor()) {
                price = price + (double) pl.get(box.get(i).getName())*box.get(i).getQuantity();
            }
        }
        return price;
    }

    @Override
    public String toString() {
        return "Pudełko własciciel "+name+show();
    }
}
