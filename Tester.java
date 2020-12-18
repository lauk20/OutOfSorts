import java.util.*;

public class Tester{
  public static void main(String[] args){
    if (args[0].equals("test")){
      int[] bubbleSort1 = new int[]{5,1,12,-5,16};
      Sorts.bubbleSort(bubbleSort1);
      System.out.println(Arrays.toString(bubbleSort1));

      bubbleSort1 = new int[]{2,3,4,5,1};
      Sorts.bubbleSort(bubbleSort1);
      System.out.println(Arrays.toString(bubbleSort1));

      bubbleSort1 = new int[]{6,1,2,3,4,5};
      Sorts.bubbleSort(bubbleSort1);
      System.out.println(Arrays.toString(bubbleSort1));

      bubbleSort1 = new int[]{1,1,1,1,5,1,1,1};
      Sorts.bubbleSort(bubbleSort1);
      System.out.println(Arrays.toString(bubbleSort1));

      bubbleSort1 = new int[]{1,2,3,4,5};
      Sorts.bubbleSort(bubbleSort1);
      System.out.println(Arrays.toString(bubbleSort1));

      bubbleSort1 = new int[]{};
      Sorts.bubbleSort(bubbleSort1);
      System.out.println(Arrays.toString(bubbleSort1));

      for (int i = 0; i < 1001; i++){
        int limit = 5;//(int)(Math.random() * 50);
        int[] numbers = new int[limit];
        int[] correct = new int[limit];
        int[] bubbleHere = new int[limit];
        int[] selectHere = new int[limit];
        Random X = new Random(i);
        for (int v = 0; v < limit; v++){
          int addThis = X.nextInt();
          numbers[v] = addThis;
          correct[v] = addThis;
          bubbleHere[v] = addThis;
          selectHere[v] = addThis;
        }
        Arrays.sort(correct);
        //Sorts.bubbleSort(numbers);
        Sorts.insertionSort(numbers);
        Sorts.bubbleSort(bubbleHere);
        Sorts.selectionSort(selectHere);
        if (Arrays.equals(numbers,correct) && Arrays.equals(bubbleHere,correct) && Arrays.equals(selectHere,correct)){
          //System.out.println(i + " PASSED");
          //System.out.println(Arrays.toString(numbers));
        }
        else{
          System.out.println("DID NOT PASS A SORT " + i);
        }
      }
    }
    else{
      int[] randData = new int[Integer.parseInt(args[1])];

      for(int i = 0 ; i < randData.length; i++){
        randData[i] =(int)(Math.random()*10000);
      }

      if(args[0].equals("bubble")){
        Sorts.bubbleSort(randData);
      }
      else{
        if (args[0].equals("selection")){
          Sorts.selectionSort(randData);
        }
        else{
          if (args[0].equals("insertion")){
            Sorts.insertionSort(randData);
          }
        }
      }
    }
  }
}
