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
}