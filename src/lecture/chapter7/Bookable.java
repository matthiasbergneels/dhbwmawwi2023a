package lecture.chapter7;

public interface Bookable {

  boolean book(int slots);
  int freeSlots();
  default boolean reserve(int slots){
    return false;
  };
}
