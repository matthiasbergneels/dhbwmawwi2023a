package lecture.excursion.exam.task10;

public class KäfigTest {

  public static void main(String[] args) {

    Käfig haustierKäfig = new Käfig(500.0);

    Vogel meinVogel = new Vogel('w', 50, 100, "rot-grün-gestreift");

    //haustierKäfig.setBewohner(meinVogel);

    System.out.println("Art des Bewohners: " + haustierKäfig.getArtBewohner());
  }
}
