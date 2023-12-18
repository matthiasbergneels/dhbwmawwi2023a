package lecture.excursion.exam.task10;

public class Käfig {
  private double ccm;
  private Tier bewohner;

  public Käfig(double ccm){
    this.ccm = ccm;
  }

  public void setBewohner(Tier bewohner){
    this.bewohner = bewohner;
  }

  public String getArtBewohner(){

    // Erwartete / Ausreichende Lösung:
    if(bewohner instanceof Vogel){
      return "Vogel";
    } else {
      return "Hase";
    }

    // Vorbildliche Lösung:
    /*
    if(bewohner instanceof Vogel){
      return "Vogel";
    } else if(bewohner instanceof Hase) {
      return "Hase";
    } else {
      return "nicht bestimmbare Art";
    }
    */


    // Alternative Lösung:
    /*
    if(bewohner != null){
      return bewohner.getClass().getSimpleName();
    } else {
      return "Kein Bewohner";
    }
     */

  }
}
