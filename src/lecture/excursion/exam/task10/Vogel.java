package lecture.excursion.exam.task10;

public class Vogel extends Tier{

  private String federFarbe;

  public Vogel(char geschlecht, int gewicht, int groesse, String federFarbe){
    super(geschlecht, gewicht, groesse);
    this.federFarbe = federFarbe;
  }

}
