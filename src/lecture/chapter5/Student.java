package lecture.chapter5;

public class Student {

  private int id;
  private String name;

  public void drink(float amount){
    System.out.println(name + " trinkt " + amount + " l");
  }

  public void drink(float amount, double alcoholPercentage){
    drink(amount);
    System.out.println("und wird " + (alcoholPercentage > 10 ? "schnell" : "langsam") + " betrunken");
  }

  public void drink(float amount, double alcoholPercentage, boolean isPoisened){
    drink(amount, isPoisened);
    System.out.println("und wird " + (alcoholPercentage > 10 ? "schnell" : "langsam") + " betrunken");
  }

  public void drink(float amount, int coffeinInMg){
    drink(amount);
    System.out.println("und wird " + (coffeinInMg > 300 ? "schnell" : "langsam") + " wach");
  }

  public void drink(float amount, int coffeinInMg, boolean isPoisened){
    drink(amount, isPoisened);
    System.out.println("und wird " + (coffeinInMg > 300 ? "schnell" : "langsam") + " wach");
  }



  public void drink(float amount, boolean isPoisened){
    drink(amount);
    if(isPoisened){
      System.out.println("und stirbt!");
    }
  }

  /* --> fiktives Beispiel mit "Optionalen Parametern"
  public void drin(float amount, <optional>double alcoholPercentage, <optional>int coffeinInMg){
    System.out.println(name + " trinkt " + amount + " l");

    if(isSet(alcoholPercentage)){
      System.out.println("und wird " + (alcoholPercentage > 10 ? "schnell" : "langsam") + " betrunken");
    }

    if(isSet(coffeinInMg)){
      System.out.println("und wird " + (coffeinInMg > 300 ? "schnell" : "langsam") + " wach");
    }
  }

   */
}
