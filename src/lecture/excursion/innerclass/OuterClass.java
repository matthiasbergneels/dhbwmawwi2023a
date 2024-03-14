package lecture.excursion.innerclass;

public class OuterClass {

  interface Printable {
    public void printMessage(String message);
  }

  private final int id;
  private Printable instancePrintableObject = new Printable() {
    @Override
    public void printMessage(String message) {

    }
  };

  public OuterClass(int id){
    this.id = id;
  }

  public static void main(String[] args) {
    String message = "Message from OuterClass";

    System.out.println("Nachricht von: " + OuterClass.class + " - " + message);

    OuterClass.InnerTopLevelClass innerTopLevelClassObject = new OuterClass.InnerTopLevelClass();
    innerTopLevelClassObject.printMessage(message);

    OuterClass firstOuterClassObject = new OuterClass(4711);
    OuterClass.InnerElementClass innerElementClassObject = firstOuterClassObject.new InnerElementClass();
    innerElementClassObject.printMessage(message);

    OuterClass secondOuterClassObject = new OuterClass(5890);
    OuterClass.InnerElementClass secondInnerElementClassObject = secondOuterClassObject.new InnerElementClass();
    secondInnerElementClassObject.printMessage(message);

    firstOuterClassObject.printMessageFromInnerLocalClass(message);
    firstOuterClassObject.printSecondMessageFromInnerLocalClass(message);
    OuterClass.printStaticMessageFromInnerLocalClass(message);

    firstOuterClassObject.printMessageFromAnonymousInnerClass(message);

    firstOuterClassObject.printMessageFromLambdaFunction(message);
  }

  public void printMessageFromInnerLocalClass(String message){
    class InnerLocalClass {
      public void printMessage(String message){
        System.out.println("Nachricht von: " + this.getClass() + " - " + message + "; OuterClass.id: " + id);
      }
    }
    class SecondInnerLocalClass {
      public void printMessage(String message){
        System.out.println("Nachricht von: " + this.getClass() + " - " + message + "; OuterClass.id: " + id);
      }
    }

    InnerLocalClass innerLocalClassObject = new InnerLocalClass();
    innerLocalClassObject.printMessage(message);

    SecondInnerLocalClass SecondInnerLocalClassObject = new SecondInnerLocalClass();
    SecondInnerLocalClassObject.printMessage(message);
  }

  public static void printStaticMessageFromInnerLocalClass(String message){
    class InnerLocalClass {
      public void printMessage(String message){
        System.out.println("Nachricht von: " + this.getClass() + " - " + message);
      }
    }
    class SecondInnerLocalClass {
      public void printMessage(String message){
        System.out.println("Nachricht von: " + this.getClass() + " - " + message);
      }
    }

    InnerLocalClass innerLocalClassObject = new InnerLocalClass();
    innerLocalClassObject.printMessage(message);

    SecondInnerLocalClass SecondInnerLocalClassObject = new SecondInnerLocalClass();
    SecondInnerLocalClassObject.printMessage(message);
  }

  public void printSecondMessageFromInnerLocalClass(String message){
    class InnerLocalClass {
      public void printMessage(String message){
        System.out.println("Nachricht von: " + this.getClass() + " - " + message + "; OuterClass.id: " + id);
      }
    }
    class SecondInnerLocalClass {
      public void printMessage(String message){
        System.out.println("Nachricht von: " + this.getClass() + " - " + message + "; OuterClass.id: " + id);
      }
    }

    InnerLocalClass innerLocalClassObject = new InnerLocalClass();
    innerLocalClassObject.printMessage(message);

    SecondInnerLocalClass SecondInnerLocalClassObject = new SecondInnerLocalClass();
    SecondInnerLocalClassObject.printMessage(message);
  }

  public void printMessageFromAnonymousInnerClass(String message){
    Printable innerAnonymousClassObject = new Printable() {
      @Override
      public void printMessage(String message) {
        System.out.println("Nachricht von: " + this.getClass() + " - " + message + "; OuterClass.id: " + id);
      }
    };

    innerAnonymousClassObject.printMessage(message);

  }

  public void printMessageFromLambdaFunction(String message){
    Printable lambdaFunction = inputMessage -> System.out.println("Nachricht von: " + this.getClass()
                                                  + " - " + inputMessage + "; OuterClass.id: " + id);
    /*
    Printable secondLambdaFunction = (String inputMessage) -> {
      System.out.println("Nachricht von: " + this.getClass()
                + " - " + inputMessage + "; OuterClass.id: " + id);
    };
     */

    lambdaFunction.printMessage(message);
  }



  public static class InnerTopLevelClass {

    public void printMessage(String message){
      System.out.println("Nachricht von: " + this.getClass() + " - " + message);
    }
  }

  public class InnerElementClass {
    public void printMessage(String message){
      System.out.println("Nachricht von: " + this.getClass() + " - " + message + "; OuterClass.id: " + id);
    }
  }

}
