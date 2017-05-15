/**
 *
 *  @author Duda Michał S14228
 *
 */

package zad4;


public class Main {
  public static void main(String[] args)
  {
    Spiewak s1 = new Spiewak("Carrey"){
        public String piosenka = "oooooooooooo";
        @Override
        public String spiewaj() {
          return piosenka;
        }
    };

    Spiewak s2 = new Spiewak("Houston"){
        public String piosenka = "a4iBBiii";
      @Override
      public String spiewaj() {
        return piosenka;
      }
    };

    Spiewak s3 = new Spiewak("Madonna"){
        public String piosenka = "aAa";
      @Override
      public String spiewaj() {
        return piosenka;
      }
    };

    Spiewak sp[] = {s1, s2, s3};

    for (Spiewak s : sp)
      System.out.println(s);


    System.out.println("\n" + Spiewak.najglosniej(sp));
  }
}
