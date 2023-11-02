package lecture.chapter3;

public class DatatypeConversionExamples {

    public static void main(String[] args) {

        int numberA = 15;
        double numberB;

        numberB = numberA;      // Zuweisung mit impliziten Konvertierung

        System.out.println(numberA);
        System.out.println(numberB);

        numberB = 20.0;

        // numberA = numberB; --> nicht möglich, da Double-Wert potenziell nicht in Integer passt!
        numberA = (int) numberB;    // Zuweisung mit expliter Konvertierung (Type-Cast!)

        System.out.println(numberA);
        System.out.println(numberB);

        numberB = 3.54;

        // numberA = numberB; --> nicht möglich, da Double-Wert potenziell nicht in Integer passt!
        numberA = (int) numberB;    // Zuweisung mit expliter Konvertierung (Type-Cast!)

        System.out.println(numberA);
        System.out.println(numberB);


        byte numberC;
        numberA = 129;

        numberC = (byte) numberA;

        System.out.println(numberA);
        System.out.println(numberC);


        numberA = 2_000_000_000 + 1_000_000_000;
        System.out.println(numberA);

        numberA = (int)3_000_000_000L;
        System.out.println(numberA);

    }
}
