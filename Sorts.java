public class Sorts{
  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    boolean swapped = false;

    for (int i = 0; i < data.length - 1 && swapped; i++){
      swapped = false;
      for (int v = 0; v < data.length - (i + 1); v++){
        if (data[v] > data[v + 1]){
          int holder = data[v + 1];
          data[v + 1] = data[v];
          data[v] = holder;

          swapped = true;
        }
      }
    }
  }
}
