package lecture.chapter4;

public class LoopExamples {

  public static void main(String[] args) {

    int count = 0;

    System.out.println("While Example: ");
    while(count < 10){
      if(count % 2 != 0){
        count++;
        continue;
      }
      System.out.println(count);
      count++;
    }

    count = 0;

    System.out.println("Do-While Example: ");
    do{
      if(count == 6){
        System.out.println("Pfui");
        break;
      }
      System.out.println(count++);
    }while(count < 10);


    System.out.println("For Example: ");
    for(int i = 0; i < 10; i++){
      System.out.println(i);
    }

    System.out.println("For Example - nur gerade: ");
    for(int i = 0; i < 10; i=i+2){
      System.out.println(i);
    }

    System.out.println("Timmmmmmmeeyyyyyyy-For-Schleife");
    count = 0;
    for(;;){
      if(count >= 10){
        break;
      }
      System.out.println(count++);
    }


    System.out.println("For-Schleife - Array Ausgabe:");
    String[] names = {"Klaus", "Robert", "Gabi", "Michael", "Claudia", "Gertrude"};

    for(int i = 0; i < names.length; i++){
      if(names[i].equals("Robert")){
        names[i] = "Idiot";
      }
      System.out.println(names[i]);
    }

    System.out.println("For-Each-Schleife - Array Ausgabe:");
    for(String name : names){
      if(name.equals("Robert")){
        name = "Idiot";
        //System.out.println("Idiot");
        //continue;
      }
      System.out.println(name);
      if(name.equals("Claudia")){
        System.out.println("Gefunden, was wir gesucht haben!");
        break;
      }
    }

    System.out.println("For-Each-Schleife - Array Ausgabe 2:");
    for(String name : names){
      System.out.println(name);
    }

  }
}
