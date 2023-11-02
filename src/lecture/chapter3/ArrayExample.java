package lecture.chapter3;

public class ArrayExample {

  public static void main(String[] args) {

    // Abbilde der Lottozahlen über Variablen
    byte lottoNumberA;
    byte lottoNumberB;
    byte lottoNumberC;
    //
    byte lottoNumberG;

    lottoNumberA = 19;
    lottoNumberB = 37;
    // ...

    // Abbilde der Lottozahlen über ein Array
    byte[] lottoNumbers;
    lottoNumbers = new byte[7];  // Index 0-6

    lottoNumbers[0] = 19;
    lottoNumbers[1] = 37;

    System.out.println("Erste Lottozahl: " + lottoNumbers[0]);

    // Rundenzeiten beim Sport
    double[] sectionTimes = new double[10];

    sectionTimes[0] = 53.4;
    sectionTimes[1] = 50.2;

    System.out.println("Erste Runde: " + sectionTimes[0] + " sec");

    // Farbe von Autos
    String[] carColors = new String[5];

    carColors[0] = "rot";
    carColors[1] = "blau";
    carColors[2] = "silber";

    System.out.println(carColors);
    System.out.println(carColors[0]);
    System.out.println(carColors[1]);
    System.out.println(carColors[2]);

    System.out.println("Es gibt " + carColors.length + " Autofarben");


    // Initialisierung mit Array Literal {}
    String[] predefinedCarColors = {"rot", "blau", "silber",
                                    "schwarz", "pink", "grün",
                                    "grau", "magenta"};

    System.out.println("Es gibt " + predefinedCarColors.length + " vordefinierte Autofarben");

    System.out.println(predefinedCarColors[1]);

    // Noten
    float[] grades;

    String[][] fullNames = new String[5][2];

    fullNames[0][0] = "Matthias";
    fullNames[0][1] = "Berg-Neels";
    fullNames[1][0] = "Adrian";
    fullNames[1][1] = "Lueers";

    System.out.println(fullNames[0][0] + " " + fullNames[0][1]);
    System.out.println(fullNames[1][0] + " " + fullNames[1][1]);
    System.out.println(fullNames[2][0] + " " + fullNames[2][1]);

    String[][] predefinedFullNames = {{"Matthias", "Berg-Neels"}, {"Adrian", "Lueers"}};

    System.out.println(predefinedFullNames[0][0] + " " + predefinedFullNames[0][1]);
    System.out.println(predefinedFullNames[1][0] + " " + predefinedFullNames[1][1]);

    // TicTacToe
    char[][] tictactoe = new char[3][3];

    tictactoe[0][0] = 'X';
    tictactoe[1][1] = 'O';


    // Kapiteltexte

    String[][][] chapterTexts = new String[5][][];

    // Chapter 1
    chapterTexts[0] = new String[10][];

    // Chapter 1 - Sentence 1
    chapterTexts[0][0] = new String[3];

    chapterTexts[0][0][0] = "Ich";
    chapterTexts[0][0][1] = "liebe";
    chapterTexts[0][0][2] = "Java";

    // Chapter 1 - Sentence 2
    chapterTexts[0][1] = new String[5];

    chapterTexts[0][1][0] = "Alle";
    chapterTexts[0][1][1] = "finden";
    chapterTexts[0][1][2] = "Java";
    chapterTexts[0][1][3] = "super";
    chapterTexts[0][1][4] = "dufte!";

    // Chapter 2
    chapterTexts[1] = new String[8][];

    // Chapter 2 - Sentence 1
    chapterTexts[1][0] = new String[15];





  }


}
