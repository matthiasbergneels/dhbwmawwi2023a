package lecture.chapter7;

import org.junit.jupiter.api.function.Executable;

public class HotelTestExecutable implements Executable {
  @Override
  public void execute() throws Throwable {
    Hotel testHotel = new Hotel(100);
    testHotel.book(500);
  }
}
