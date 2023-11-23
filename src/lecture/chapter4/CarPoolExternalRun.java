package lecture.chapter4;

import lecture.chapter5.CAR_BRAND;
import lecture.chapter5.Car;

public class CarPoolExternalRun {

  public static void main(String[] args) {

    Car myCar = new Car("weiss", 65, CAR_BRAND.LADA, "e-hybrid");

    System.out.println("Mein Auto:");
    System.out.println("Farbe: " + myCar.getColor());
    System.out.println("Marke: " + myCar.BRAND);
    System.out.println("Leistung: " + myCar.getHp());

    myCar.accelerate(50);

    // myCar.licensePlate = "HD-HH 9999";                         --> kein Zugriff, da protected
    //System.out.println("Nummernschild: " + myCar.licensePlate); --> kein Zugriff, da protected

    System.out.println("Mein Auto fährt " + myCar.getCurrentSpeed() + " kmh");

  }

}
