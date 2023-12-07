package lecture.chapter6;

public class OurLittleFarmRun {

  public static void main(String[] args) {

    /* --> mit Abstrakten Klassen nicht möglich
    Animal myAnimal = new Animal(20f, 50f, "Fritz");

    myAnimal.move();
    myAnimal.eat();
    myAnimal.breath();
    //myAnimal.bark();
    System.out.println(myAnimal);

     */

    Dog myDog = new Dog(30f, 55f, "Bello", "Schäferhund");

    myDog.bark();
    myDog.move();
    myDog.eat();
    myDog.eat(500f);
    myDog.breath();
    System.out.println(myDog);

    // Narrowing Cast
    Animal myAnimal = myDog;

    myAnimal.breath();

    Animal[] animalShelter = new Animal[5];

    animalShelter[0] = myDog;
    animalShelter[1] = new Bird(0.15f, 0.10f, "Tweety", true);
    animalShelter[2] = new Dog(15f, 0.50f, "Wuffel", "Bulldogge");
    animalShelter[3] = new Bird(0.15f, 0.10f, "Birdy", true);
    animalShelter[4] = new Dog(15f, 0.50f, "Schnüffler", "Bulldogge");

    // Daily Animal Care Routine
    System.out.println("Daily Animal Care Routine");
    for(Animal currentAnimal : animalShelter){
      currentAnimal.eat();
      currentAnimal.move();
      currentAnimal.breath();

      //currentAnimal.bark();

      if(currentAnimal instanceof Dog){
        // Widening Cast --> erhöht die Sichtbarkeit auf Objekte
        Dog currentDog = (Dog)currentAnimal;
        currentDog.bark();
      }

    }

    Object[] someObjects = new Object[6];
    someObjects[0] = animalShelter[0];
    someObjects[1] = animalShelter[1];
    someObjects[2] = animalShelter[2];
    someObjects[3] = animalShelter[3];
    someObjects[4] = animalShelter[4];
    someObjects[5] = "Hallo Welt!";

    for(Object currentObject : someObjects){
      System.out.println(currentObject);

      // Widening Cast --> erhöht die Sichtbarkeit auf Objekte
      if(currentObject instanceof Animal currentAnimal){
        currentAnimal.move();
      }
    }

  }
}
