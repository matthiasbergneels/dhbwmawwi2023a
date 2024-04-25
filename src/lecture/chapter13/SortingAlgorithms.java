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

    System.out.println("Bubble Sort V1 sortiert: ");
    sorted = bubbleSortV2(toSort.clone());
    printArray(sorted);

    System.out.println("Bubble Sort V1 sortiert: ");
    sorted = bubbleSortV3(toSort.clone());
    printArray(sorted);


  }


  public static int[] bubbleSort(int[] numbers){

    long swapCount = 0;
    long startTime = System.nanoTime();

    for(int i = 0; i < numbers.length; i++){
      for(int j = 0; j < numbers.length - 1; j++){
        if(numbers[j] > numbers[j+1]){
          swap(numbers, j, j+1);
          swapCount++;
        }
      }
    }

    long stopTime = System.nanoTime();

    printRuntimeDuration("Bubble Sort V1", numbers.length, startTime, stopTime, swapCount);

    return numbers;
  }


  public static int[] bubbleSortV2(int[] numbers){

    long swapCount = 0;
    long startTime = System.nanoTime();

    for(int i = numbers.length; i > 0; i--){
      for(int j = 0; j < i-1; j++){
        if(numbers[j] > numbers[j+1]){
          // swap
          swap(numbers, j, j+1);
          swapCount++;
        }
      }
    }

    long stopTime = System.nanoTime();

    printRuntimeDuration("BubbleSort V2", numbers.length, startTime, stopTime, swapCount);

    return numbers;
  }

  public static int[] bubbleSortV3(int[] numbers){

    int j = numbers.length - 1;
    boolean swapped;
    long swapCount = 0;

    long startTime = System.nanoTime();

    do{
      swapped = false;

      for(int i = 0; i < j; i++){
        if(numbers[i] > numbers[i+1]){
          swap(numbers, i, i+1);
          swapped = true;
          swapCount++;
        }
      }
      j--;
    }while(swapped);

    long stopTime = System.nanoTime();

    printRuntimeDuration("BubbleSort V3", numbers.length, startTime, stopTime, swapCount);

    return numbers;
  }





  private static void swap(int[] array, int a, int b) {
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }

  public static void printArray(int[] numbers){
    for(int i = 0; i < numbers.length; i++){
      System.out.print(numbers[i] + ((i == numbers.length-1)?"" : ", "));
    }
    System.out.println();
  }

  private static void printRuntimeDuration(String algorithmName, int elementCount, long startTime, long endTime, long swapCount){
    long durationInNanoSeconds = endTime - startTime;
    long durationInMilliSeconds = (long) (durationInNanoSeconds / 10e5);

    System.out.println("Runtime for " + elementCount + " on " + algorithmName + ": " + durationInNanoSeconds + " ns (" + durationInMilliSeconds + " ms); swapped " + swapCount + " times");
  }
}