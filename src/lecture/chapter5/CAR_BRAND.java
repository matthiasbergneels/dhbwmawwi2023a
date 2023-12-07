package lecture.chapter5;

public enum CAR_BRAND {
  MERCEDES("$$$"),
  FIAT("$"),
  BMW("$$$"),
  SMART("$$"),
  LADA("$");

  private String priceTag;

  CAR_BRAND(String priceTag){
    this.priceTag = priceTag;
  }

  public String getPriceTag(){
    return priceTag;
  }

  @Override
  public String toString(){
    return switch(this){
      case MERCEDES -> "Mercedes";
      case BMW -> "BMW";
      case FIAT -> "F.I.A.T";
      case LADA -> "Lada";
      case SMART -> "Smart";
    };
  }
}