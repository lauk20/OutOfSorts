import java.util.*;

public class Sorts{
  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    boolean swapped = true;
    for (int i = 0; i < data.length - 1 && swapped; i++){
      swapped = false;
      for (int v = 0; v < data.length - (i + 1); v++){
        //System.out.println(Arrays.toString(data)); //REMOVE WHEN DONE
        if (data[v] > data[v + 1]){
          int holder = data[v + 1];
          data[v + 1] = data[v];
          data[v] = holder;

          swapped = true;
        }
      }
      //System.out.println(); //REMOVE WHEN DONE
    }
  }

  public static void selectionSort(int[] data){
    for (int i = 0; i < data.length - 1; i++){
      int min = i;
      for (int v = i + 1; v < data.length; v++){
        if (data[v] < data[min]){
          min = v;
        }
      }
      int holder = data[i];
      data[i] = data[min];
      data[min] = holder;
    }
  }

  public static void insertionSort(int[] data){
    for (int i = 1; i < data.length; i++){
      int item = data[i];
      boolean go = true;
      for (int v = i - 1; v >= 0 && go; v--){
        if (data[v] > item){
          data[v + 1] = data[v];
          if (v == 0){
            data[0] = item;
          }
        }
        else{
          data[v + 1] = item;
          go = false;
        }
      }
    }
  }
}
