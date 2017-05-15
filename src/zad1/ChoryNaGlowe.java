package zad1;

public class ChoryNaGlowe extends Pacjent {
    private String choroba = "głowa";
    private String leczenie = "aspiryna";

    public ChoryNaGlowe(String name) {
        super(name);
    }

    public String choroba (){
        return choroba;
    }

    public String leczenie (){
        return leczenie;
    }
}
