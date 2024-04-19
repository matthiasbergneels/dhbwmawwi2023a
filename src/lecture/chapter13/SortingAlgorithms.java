package lecture.chapter13;
public class SortingAlgorithms {

  private static int quickSortSwapCount = 0;

  public static void main(String[] args) {

    int[] toSort = {50, 70, 100, 80, 40, 30, 20, 10 ,60};
    System.out.println("Unsortiert: ");
    printArray(toSort);


    System.out.println("Sortierte Arrays:");
    System.out.println("===================");
    System.out.println("Bubble Sort V1 sortiert: ");
    int[] sorted = bubbleSort(toSort.clone());
    printArray(sorted);


  }


  public static int[] bubbleSort(int[] numbers){

    int swapCount = 0;
    long startTime = System.nanoTime();


    long stopTime = System.nanoTime();

    printRuntimeDuration("Bubble Sort V1", numbers.length, startTime, stopTime, swapCount);

    return numbers;
  }

  private static void swap(int[] array, int a, int b) {
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }

  public static void printArray(int[] numbers){
    for(int number : numbers){
      System.out.print(number + ", ");
    }
    System.out.println();
  }

  private static void printRuntimeDuration(String algorithmName, int elementCount, long startTime, long endTime, int swapCount){
    long durationInNanoSeconds = endTime - startTime;
    long durationInMilliSeconds = (long) (durationInNanoSeconds / 10e5);

    System.out.println("Runtime for " + elementCount + " on " + algorithmName + ": " + durationInNanoSeconds + " ns (" + durationInMilliSeconds + " ms); swapped " + swapCount + " times");
  }
}