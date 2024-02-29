package lecture.chapter8;

public class RuntimeExceptionExamples {

  public static void main(String[] args) {

    double numberA = 50.0;
    double numberB = 0.0;
    double result;

    result = numberA / numberB;

    System.out.println(result);

    String[] text = {"Hallo", "viele", "Ausnahmen"};

    try {
      System.out.println(text[0]);
      System.out.println(text[10]);
      System.out.println(text[2]);
    } catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Index existiert nicht in String-Array");
      System.out.println(e.getMessage());
      //e.printStackTrace();
    }

    for(int i = 0;; i++){
      try{
        System.out.println(text[i]);
      } catch(ArrayIndexOutOfBoundsException e){
        System.out.println(e.getMessage());
        break;
      }
    }

    String simpleText = null;

    try {
      System.out.println(simpleText.length());
    }catch(NullPointerException e){
      System.out.println(e.getMessage());
    }

    System.out.println("Ende");

  }
}
