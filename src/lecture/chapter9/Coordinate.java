package lecture.chapter9;

public class Coordinate {

  private int x;
  private int y;

  @Override
  public int hashCode() {
    return x + y;
    /*
    Bsp:  x = 3, y = 7, hc = 10
          x = 7, y = 3, hc = 10
          x = 5, y = 5, hc = 10

    TODO:
      wie sehen die Beispiele für return x ^ y;

     */
  }
}
