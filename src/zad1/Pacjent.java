package zad1;

public class Pacjent {
    private String nazwisko;


    public Pacjent(String name) {
        this.nazwisko = name;
    }
    public String nazwisko (){
       return nazwisko;
    }

    public String choroba (){
        return "nie ustalono";
    }

    public String leczenie (){
        return "nie ustalono";
    }
}

