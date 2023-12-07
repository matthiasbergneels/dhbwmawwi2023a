package lecture.chapter5;

public class CarPoolRun {

  public static void main(String[] args) {

    //System.out.println("Aktuelle Anzahl an Autos: " + Car.getCarCount());

    Car myCar = new Car("weiss", 65, CAR_BRAND.LADA, "e-hybrid");

    System.out.println("Aktuelle Anzahl an Autos: " + Car.getCarCount());
    /*
    myCar.color = "weiss";
    myCar.hp = 65;
    //myCar.brand = "Lada";
    myCar.fuelType = "e-hybrid";
    */

    //myCar.color = "Schnuffel Lila";
    myCar.setColor("Schnuffel Lila");

    System.out.println("Mein Auto:");
    System.out.println("Farbe: " + myCar.getColor());
    System.out.println("Marke: " + myCar.BRAND);
    System.out.println("Leistung: " + myCar.getHp());
    System.out.println("Preis Segment: " + myCar.getPriceTag());

    myCar.licensePlate = "HD-HH 9999";
    System.out.println("Nummernschild: " + myCar.licensePlate);

    Car yourCar = new Car("pink", 300, CAR_BRAND.SMART, "Gas");

    /*
    yourCar.color = "pink";
    yourCar.hp = 300;
    yourCar.brand = "Smart";
    yourCar.fuelType = "Gas";
     */

    System.out.println("Dein Auto:");
    System.out.println("Farbe: " + yourCar.getColor());
    System.out.println("Marke: " + yourCar.BRAND);
    System.out.println("Leistung: " + yourCar.getHp());

    System.out.println("Geschwindigkeit dein Auto: " + yourCar.getCurrentSpeed());
    System.out.println("Geschwindigkeit mein Auto: " + yourCar.getCurrentSpeed());

    //myCar.currentSpeed = 1500;

    myCar.accelerate(1545);
    yourCar.accelerate(500);

    System.out.println("Geschwindigkeit dein Auto: " + yourCar.getCurrentSpeed());
    System.out.println("Geschwindigkeit mein Auto: " + yourCar.getCurrentSpeed());

    Car hisCar = new Car("Schnuffel Lila", 150, CAR_BRAND.FIAT, "Benzin");
    Car herCar = new Car("Schnuffel Lila", 150, null, "Benzin");

    System.out.println("Sein Auto:");
    System.out.println("Farbe: " + hisCar.getColor());
    System.out.println("Marke: " + hisCar.BRAND);
    System.out.println("Leistung: " + hisCar.getHp());

    System.out.println("Aktuelle Anzahl an Autos: " + Car.getCarCount());

    hisCar = null;
    System.gc();
    try {
      Thread.sleep(1000);
    }catch(Exception e){
      System.out.println("Beim warten ist etwas schief gegangen!");
    }
    System.out.println("Aktuelle Anzahl an Autos: " + Car.getCarCount());

    System.out.println();
  }
}
