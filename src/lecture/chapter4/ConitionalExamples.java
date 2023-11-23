package lecture.chapter4;

public class ConitionalExamples {

  public static void main(String[] args) {

    boolean isRaining = false;

    if(isRaining) {
      System.out.println("Ich brauche einen Regenschirm");
      System.out.println("sonst werde ich nass!");
    }

    System.out.println("Das Regen-Ende");


    int numberA = 15, numberB = 10;

    if(numberA > numberB){
      System.out.println("numberA ist größer");
    } else if(numberA == numberB){
      System.out.println("sind gleich groß");
    }else {
      System.out.println("numberB ist größer");
    }

    /*
    if(numberB > numberA){
      System.out.println("numberB ist größer");
    }
     */


    int speed = 85;

    if (speed >= 100) {
      System.out.println("Führerschein weg du Irrer!");
    } else if(speed > 50 && speed < 100){
      System.out.println("zu Schnell");
    } else if (speed <= 50){
      System.out.println("So weiter fahren");
    } else {
      System.out.println("Nicht rückwärts fahren!");
    }


    int grade = 4;

    if(grade == 1){
      System.out.println("Sehr gut");
    } else if (grade == 2){
      System.out.println("Gut");
    } else if (grade == 3){
      System.out.println("Befriedigend");
    } //...
    else {
      System.out.println("ungültige Note");
    }

    System.out.println("Ausgabe durch Switch-Case");

    switch(grade){
      case 1:
        System.out.println("Sehr gut");
        break;
      case 2:
        System.out.println("Gut");
        break;
      case 3:
        System.out.println("Befriedigend");
        break;
      case 4:
        System.out.println("Ausreichend");
        break;
      case 5:
        System.out.println("Mangelhaft");
        break;
      default:
        System.out.println("Ungültige Note");
    }

    // Switch Case ab Java 14
    String gradeText = switch(grade){
      case 1 -> "Sehr gut";
      case 2 -> "Gut";
      case 3 -> "Befriedigend";
      case 4 -> "Ausreichend";
      case 5 -> "Mangelhaft";
      default -> "Ungültige Note";
    };

    System.out.println("Die Note bedeutet: " + gradeText);


  }
}
