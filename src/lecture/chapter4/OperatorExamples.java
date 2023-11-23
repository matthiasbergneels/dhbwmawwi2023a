package lecture.chapter4;

public class OperatorExamples {

  public static void main(String[] args) {

    // arithmetische Operatoren

    int numberA = 5, numberB = 2;

    int numberC,
        numberD;

    int sum = numberA + numberB;
    System.out.println("Summe 5 + 2: " + sum);

    int modulo = numberA % numberB;
    System.out.println("Modulo 5 % 2: " + modulo);

    int result = numberA / numberB;
    System.out.println("5 / 2 = " + result);

    double doubleResult = numberA / numberB;
    System.out.println("5 / 2 = " + doubleResult);

    double doubleNumberB = numberB;

    doubleResult = numberA / doubleNumberB;
    System.out.println("5 / 2 = " + doubleResult);



    numberC = 10;

    //numberC++;      // numberC = numberC + 1;
    numberC--;      // numberC = numberC - 1;

    System.out.println(numberC);

    numberD = 5;
    System.out.println(numberD);
    System.out.println(numberD++);
    System.out.println(numberD);

    // numberA = 5
    // numberD = 6
    result = numberD-- * numberA + ++numberD;
    System.out.println(result);

    // numberD = ++numberD + ++numberD + numberD++;


    // Zuweisungsoperatoren
    numberA = 5;
    numberB = numberA;

    numberA += numberB;         // ==> numberA = numberA + numberB;
    System.out.println(numberA);


    // Stringverkettung

    String text1 = "Hallo";
    String text2 = "Welt";


    String resultText = numberA + numberB + text1 + " " + text2 + (numberB + numberA);
    System.out.println(resultText);

    resultText = numberA + numberB + text1 + " " + text2 + numberB + numberA;
    System.out.println(resultText);

    resultText = "" + numberA + numberB + text1 + " " + text2 + numberB + numberA;
    System.out.println(resultText);


    // Fragezeichen Operator

    boolean isRaining = false;

    String umbrellaNeededText = isRaining ? "Ja" : "Nein";

    System.out.println("Brauche ich einen Regenschirm? " + umbrellaNeededText);

    boolean goOutside = false;

    boolean packUmbrella = (goOutside && isRaining) ? true : false;

    packUmbrella = goOutside && isRaining;

    System.out.println("Heute brauche ich " + (isRaining ? "einen" : "keinen") +  " Regenschirm!");
    System.out.println("Heute brauche ich " + isRaining +  " Regenschirm!");



  }
}
