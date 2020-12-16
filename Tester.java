import java.util.*;

public class Tester{
  public static void main(String[] args){
    int[] bubbleSort1 = new int[]{5,1,12,-5,16};
    Sorts.bubbleSort(bubbleSort1);

    bubbleSort1 = new int[]{2,3,4,5,1};
    Sorts.bubbleSort(bubbleSort1);

    bubbleSort1 = new int[]{6,1,2,3,4,5};
    Sorts.bubbleSort(bubbleSort1);

    for (int i = 0; i < 1001; i++){
      int limit = 5;//(int)(Math.random() * 50);
      int[] numbers = new int[limit];
      int[] correct = new int[limit];
      Random X = new Random(i);
      for (int v = 0; v < limit; v++){
        int addThis = X.nextInt();
        numbers[v] = addThis;
        correct[v] = addThis;
      }
      Arrays.sort(correct);
      Sorts.bubbleSort(numbers);
      if (Arrays.equals(numbers,correct)){
        System.out.println(i + " PASSED");
        //System.out.println(Arrays.toString(numbers));
      }
      else{
        System.out.println("DID NOT PASS " + i);
        break;
      }
    }
  }
}
