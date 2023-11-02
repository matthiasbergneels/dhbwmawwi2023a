package lecture.chapter3;

public class ReferenceDatatypeExamples {

  public static void main(String[] args) {

    String myText = "Hallo!";
    String myText2 = "Hallo!";
    String myText4 = new String("Hallo!");

    String myText3 = "Was anderes!";

    System.out.println("myText " + myText);
    System.out.println("myText2 " + myText2);
    System.out.println("myText3 " + myText3);
    System.out.println("myText4 " + myText4);

    boolean identical = (myText == myText2);
    System.out.println("myText == myText2: " + identical);
    identical = (myText == myText3);
    System.out.println("myText == myText3: " + identical);
    identical = (myText == myText4);
    System.out.println("myText == myText4: " + identical);


    identical = myText.equals(myText2);
    System.out.println("myText inhaltlich myText2: " + identical);
    identical = myText.equals(myText4);
    System.out.println("myText inhaltlich myText4: " + identical);



    String[] myTexts = {"Hallo", "viele", "Wörter"};
    String[] yourTexts = myTexts;

    System.out.println("myTexts[0]: " + myTexts[0]);
    System.out.println("yourTexts[0]: " + yourTexts[0]);

    myTexts[0] = "HAHA!";

    System.out.println("myTexts[0]: " + myTexts[0]);
    System.out.println("yourTexts[0]: " + yourTexts[0]);






  }
}
