package Practice;

import java.util.Arrays;

public class ArraysImpl {

  public static void main(String[] args) {
    int[] arr1 = new int[]{5, 3, 2, 1, 7, 9, 8, 3};
    int[] arr2 = new int[]{5, 3, 2, 1, 7, 9, 8, 3};
    int[] intArr = { 10, 20, 15, 22, 35 };
    int[] intArr1 = { 10, 15, 22 };
    int[][] twodarr = new int[5][5];
    Arrays.sort(arr1);
    for (int x : arr1) {
      System.out.print(x + " ");
    }

    System.out.println();

    System.out.println("Integer Array as List: "
        + Arrays.asList(arr1));

    System.out.println(Arrays.binarySearch(arr1, 3));

    System.out.println(Arrays.binarySearch(arr1,4 ,6,7));

    System.out.println(Arrays.compare(arr1, arr2));

    System.out.println(Arrays.compare(intArr, intArr1));

  }
}
