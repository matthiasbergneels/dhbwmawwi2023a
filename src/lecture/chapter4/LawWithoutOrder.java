package lecture.chapter4;

public class LawWithoutOrder {

  public static void main(String[] args) {
    String[] possibleVictims = {"Daniel", "Sebastian", "Robin", "Jonas",
                                "Ricardo", "Lukas", "Jessica", "Kristina",
                                "Kübra", "Fabian", "Jakob", "Thanh Nhi",
                                "Leandro", "Niklas", "Patrick", "Adrian"};

    System.out.println("Freiwillige:");
    System.out.println("1. " + possibleVictims[getRandomNumberForVictimList(possibleVictims.length)]);
    System.out.println("2. " + possibleVictims[getRandomNumberForVictimList(possibleVictims.length)]);

  }

  private static int getRandomNumberForVictimList(int victimCount){
    int randomNumber = 0;

    do{
      randomNumber = (int)(Math.random() * victimCount);
    }while(randomNumber == victimCount);

    return randomNumber;
  }
}
