package zad1;

public class ChoryNaDyspepsje extends Pacjent {
    private String choroba = "dyspepsja";
    private String leczenie = "wegiel";

    public ChoryNaDyspepsje(String name) {
        super(name);
    }
    public String choroba (){
        return choroba;
    }

    public String leczenie (){
        return leczenie;
    }
}
