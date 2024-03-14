package lecture.chapter7;

import lecture.chapter8.NotEnoughFreeSlotsException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

  @BeforeEach
  void setUp() {
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void notANiceBookingTest() {
    // So testet man keine Ausnahmen!
    // Arrange
    Hotel testHotel = new Hotel(100);

    // Act
      try {
          testHotel.book(400);
      } catch (NotEnoughFreeSlotsException e) {
        // Misshandlung der assertTrue() Methode!!!
        Assertions.assertTrue(true);
        return;
      }

      // Assert
      // Misshandlung der assertTrue() Methode!!!
      Assertions.assertTrue(false, "NotEnoughFreeSlots Exception nicht geworfen");
  }

  @Test
  void niceBookingTest() {
    // Arrange

    // Act

    // Assert
    NotEnoughFreeSlotsException e = Assertions.assertThrows(NotEnoughFreeSlotsException.class, new HotelTestExecutable());

    Assertions.assertEquals("Nicht genug freie Plätze - es wurde versucht 500 zu buchen; freie Plätze: 100", e.getMessage());
    Assertions.assertEquals(100, e.FREE_SLOTS_REMAINING);
  }

  @Test
  void niceBookingNoExceptionTest() {
    // Arrange

    // Act

    // Assert
    Assertions.assertDoesNotThrow(new HotelTestExecutableNoException());

  }

  @Test
  void nicerBookingTest() {
    // Arrange
    int freeSlots = 100;
    Hotel testHotel = new Hotel(freeSlots);

    // Act

    // Assert
    Assertions.assertThrows(NotEnoughFreeSlotsException.class, () -> testHotel.book(freeSlots+1));

  }


}