package zad1;

public class ChoryNaNoge extends Pacjent{
    private String choroba = "noga";
    private String leczenie = "gips";

    public ChoryNaNoge(String name) {
        super(name);
    }

    public String choroba (){
        return choroba;
    }

    public String leczenie (){
        return leczenie;
    }
}
