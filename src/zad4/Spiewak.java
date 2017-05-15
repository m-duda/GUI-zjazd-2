/**
 *
 *  @author Duda Michał S14228
 *
 */


package zad4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Spiewak {
    private String nazwisko;
    private int id;
    private static int licznik=1;

    public Spiewak(String nazwisko) {
        this.nazwisko = nazwisko;
        id=licznik++;
    }

    public abstract String spiewaj ();

    public static Spiewak najglosniej(Spiewak[] tab){
        int max=0;
        int countTmp=0;
        int count;
        Matcher matcher;
        Pattern p = Pattern.compile("[A-Z]");
        for (int i = 0; i<tab.length; i++) {
            count = 0;
            matcher = p.matcher(tab[i].spiewaj());
            while (matcher.find()) {
                count++;
            }
            if (count > countTmp) {
                countTmp=count;
                max = i;
            }

        }
        return tab[max];

    }

    @Override
    public String toString() {
        return "("+id+") " + nazwisko +": "+spiewaj();
    }
}
