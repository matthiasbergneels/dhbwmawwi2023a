package lecture.chapter5;

public class Car {

  private String color;
  private int hp;
  private byte seatCount;
  public final CAR_BRAND BRAND;
  private double weight;
  private String fuelType;
  private int currentSpeed;
  protected String licensePlate;

  private static int carCount = 0;
  private static Car[] carRegister;

  static{
    System.out.println("Erste Aufruf der Klasse");
    carCount = 5; //
    carRegister = new Car[100];
  }

  {
    System.out.println("Objekt erzeugt");
    this.weight = 1500;
    this.seatCount = 5;
  }

  public Car(String color, int hp, CAR_BRAND brand, String fuelType){
    this.setColor(color);
    this.hp = hp;

    if(brand != null){
      this.BRAND = brand;
    }else{
      this.BRAND = CAR_BRAND.MERCEDES;
    }

    this.fuelType = fuelType;

    this.currentSpeed = 0;
    carCount++;
    /*
    for(int i = 0; i < carRegister.length; i++){
      if(carRegister[i] == null){
        carRegister[i] = this;
        break;
      }
    }

     */
  }

  public void accelerate(int speedDelta){
    currentSpeed += speedDelta;   // currentSpeed = currentSpeed + speedDelta;
  }

  public void brake(){
    if(currentSpeed >= 10){
      currentSpeed -= 10;
    } else {
      currentSpeed = 0;
    }
  }

  public String getColor(){
    return color;
  }

  public void setColor(String color){
    if(color.equals("weiss") ||
      color.equals("blau") ||
      color.equals("grün") ||
      color.equals("schwarz") ||
      color.equals("pink")){
      this.color = color;
    } else {
      System.out.println("Ungültige Farbe - Auto wird schwarz!");
      this.color = "schwarz";
    }

  }

  public int getHp(){
    return hp;
  }

  public int getCurrentSpeed(){
    return currentSpeed;
  }

  public String getPriceTag(){
    return BRAND.getPriceTag();
  }

  public static int getCarCount(){
    return carCount;
  }

  @Override
  protected void finalize() throws Throwable {
    carCount--;
    System.out.println("Auto kommt in die Schrottpresse " + this.BRAND);
  }
}
