package lecture.chapter8;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotEnoughFreeSlotsExceptionTest {

  @BeforeEach
  void setUp() {
  }

  @Test
  void notEnoughFreeSlotsConstruction(){
    // Arrange

    // Act
    NotEnoughFreeSlotsException e = new NotEnoughFreeSlotsException(500, 100);

    // Assert
    Assertions.assertEquals("Nicht genug freie Plätze - es wurde versucht 500 zu buchen; freie Plätze: 100", e.getMessage());
    Assertions.assertEquals(100, e.FREE_SLOTS_REMAINING);
  }

  @AfterEach
  void tearDown() {
  }
}