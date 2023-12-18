package lecture.excursion.junit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

  static Calculator myTestCalculator;

  @BeforeAll
  static void setupAll(){
    System.out.println("Läuft vor allen Test");
    myTestCalculator = new Calculator();
  }

  @BeforeEach
  void setUp() {
    System.out.println("Läuft vor jedem Test");
  }

  @AfterEach
  void tearDown() {
    System.out.println("Läuft nach jedem Test");
  }

  @AfterAll
  static void tearDownAll(){
    System.out.println("Läuft nach allen Test");
  }

  @Nested
  @DisplayName("Test Cases for add-Method")
  class AddTestCases {

    @RepeatedTest(10)
    @DisplayName("Basic add Test")
    void add() {
      // Arrange
      // nothing to do

      // Act
      double result = myTestCalculator.add(5.0, 10.0);

      // Assert
      Assertions.assertEquals(15.0, result);
    }

    @Test
    @DisplayName("Add Test with Integer-Values")
    void addTwoIntegerValues() {
      double result = myTestCalculator.add(7, 7);

      Assertions.assertEquals(14.0, result);
    }

    @Test
    void addTwoLowVaues() {
      double result = myTestCalculator.add(0.00001, 0.00001);

      Assertions.assertEquals(0.00002, result);
    }
  }

  @Test
  void subtract(){
    double result = myTestCalculator.subtract(5.0, 10.0);

    Assertions.assertEquals(-5.0, result);
  }

  @ParameterizedTest(name = "{0} multiplied with {1} results in {3}")
  @DisplayName("Basic Multiply-Test")
  @CsvSource({
    "10.0, 10.0, 100.0",
    "0.0, 100.0, 0.0",
    "-1.0, 100.0, -100.0",
    "1, 1, 1"
  })
  void multiply(double numberA, double numberB, double expected){
    double result = myTestCalculator.multiply(numberA, numberB);

    Assertions.assertEquals(expected, result);
  }
}