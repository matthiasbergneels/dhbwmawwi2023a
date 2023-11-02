package lecture.chapter3;

public class DataTypeExamples {

    static short numberD;

    public static void main(String[] args) {

        // Deklaration der Variable mit dem Namen "numberA" vom Typ "byte"
        byte numberA;

        // Initialisierung der Variable "numberA" mit dem Wert 2 --> 00000010
        numberA = 2;

        int numberB = 5;

        byte numberC;

        System.out.println(numberA);
        System.out.println(numberB);
        // System.out.println(numberC); --> nicht Initialisiert!
        System.out.println(numberD);

        boolean isTired = true; // false
        boolean isIll = false;
        // isTired = 0; --> nicht in Java


        // Deklaration einer Konstanten
        final double PI = 3.147;

        // PI = 5; --> nicht möglich, da Konstant!

        final double E;
        E = 2.71;
        // E = 5; --> nicht möglich, da Konstant!


        // Boolsche Literale
        isTired = true;
        isTired = false;


        // Ganzzahlenliterale

        // Dezimal-Literal (Basis 10)
        numberA = 10;           // --> Wert: 10
        numberB = 10_000_000;   // --> Wert: 10000000

        // Oktal-Literal (Basis 8) --> Präfix 0
        numberA = 010;          // --> Wert 8
        numberA = 011;          // --> Wert 9

        System.out.println(numberA);

        // Hexadezimal-Literal (Basis 16) --> Präfix 0x
        numberA = 0x11;         // --> Wert: 17
        System.out.println(numberA);
        numberA = 0x1B;         // --> Wert: 27
        System.out.println(numberA);

        final int RGB_RED = 0xFF0000; // --> statt: 16711680;

        System.out.println(RGB_RED);

        // Binär-Literal (Basis 2) --> Präfix 0b
        numberA = 0b110;        // Wert: 6
        System.out.println(numberA);


        // long-Literale --> Suffix l/L
        numberA = 127;

        long numberE = 2_000_000_000; // integer-literal wird long zugewiesen
        numberE = 3_000_000_000L;
        numberE = 4L;

        // Gleitkomma-Literale

        // Double   --> optional Suffix: d/D
        double numberF;

        numberF = 3.14;
        numberF = .14;          // --> Wert: 0.14
        numberF = 3.;           // --> Wert: 3.0
        numberF = 3;            // --> Wert: Ganzzahl / Int-Literal
        numberF = .314e1;       // --> Wert: 3.14 (0.314*10^1)
        numberF = .314e0;       // --> Wert: 3.14 (0.314*10^0)
        numberF = .314e2;       // --> Wert: 3.14 (0.314*10^2 --> 0.314*100 --> 31.4)
        numberF = -.314e-2;     // --> Wert: 3.14 (0.314*10^-2 --> 0.314*0.01 --> 0.00314)
        System.out.println(numberF);

        // Float --> Verpflichtenden Suffix: f/F
        float numberG;

        numberG = 3.14f;
        numberG = .14f;          // --> Wert: 0.14
        numberG = 3.f;           // --> Wert: 3.0
        numberG = 3;            // --> Wert: Ganzzahl / Int-Literal
        numberG = .314e1F;       // --> Wert: 3.14 (0.314*10^1)
        numberG = .314e0F;       // --> Wert: 3.14 (0.314*10^0)
        numberG = .314e2F;       // --> Wert: 3.14 (0.314*10^2 --> 0.314*100 --> 31.4)
        numberG = -.314e-2F;     // --> Wert: 3.14 (0.314*10^-2 --> 0.314*0.01 --> 0.00314)


        // Char-Literale
        char characterA;

        characterA = 'A';
        System.out.println(characterA);
        characterA = '!';
        System.out.println(characterA);
        characterA = 'k';
        System.out.println(characterA);
        characterA = '\u2764';
        System.out.println(characterA);
        characterA = '\u2763';
        System.out.println(characterA);
        characterA = 'u';
        System.out.println(characterA);

        characterA = '\'';
        System.out.println(characterA);


        characterA = 70;                // --> Integer-Literal
        System.out.println(characterA);


        // String-Literal (Zeichenketten-Literal)
        String myText;

        myText = "Hier steht mein erster Text!";
        System.out.println(myText);

        myText = "Das ist ein\n \"großartiger\" Text!\t\u2764";
        System.out.println(myText);

        String htmlText = """
                <html>
                    <head>
                    </head>
                    <body>
                        <h1>"Headline!"</h1>
                        'hier steht \nder Text mit \\!'
                        \u2764
                    </body>
                </html>
                """;

        System.out.println(htmlText);
    }
}
